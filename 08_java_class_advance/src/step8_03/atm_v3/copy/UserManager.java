package step8_03.atm_v3.copy;

import java.util.Scanner;

public class UserManager {
	Scanner scan = new Scanner(System.in);
	UserManager() {}
	private static UserManager instance = new  UserManager();
	
	public static void setInstance(UserManager instance) {
		UserManager.instance = instance;
	}
	 ATM atm = new  ATM ();
	
	
	 User  user [];
	 int userCnt;
	 int identifier = -1;
	 
	 void allUserPrint() {
		 System.out.println("아이디\t패스워드\t계좌번호");
		 for (int i = 0; i < userCnt; i++) {
			user[i].printOneUserAllAccounts();
		}
	 }
	 
	 void login() {
		 User temp = new  User();
		 System.out.println("아이디를 입력해주세요");
		 temp.id = scan.next();
		 int check =  id_check(temp.id);
		 if(check!=-1) {
			 check = -1;
			 System.out.println("비밀번호를 입력해주세요");
			 temp.pw = scan.next(); 
			 check =  pw_check(temp.pw);
			 if(check!=-1) {
				 System.out.println("로그인되었습니다.");
				 identifier = check;
				 joinAfter();
			 }
			 else {System.out.println("비밀번호가 잘못되었습니다.");}
		 }
		 else {System.out.println("없는 아이디 입니다. ");}
	 }
	 
	 
	 int id_check(String id) {
		 int check=-1;
		 for (int i = 0; i < userCnt; i++) {
			if(id.equals(user[i].id)){
				check = i;
				
			}
		}
		 
		return check;
	 }
	 
	 int pw_check(String pw) {
		 int check=-1;
		 for (int i = 0; i < userCnt; i++) {
			if(pw.equals(user[i].pw)){
				check = i;
			}
		}
		 
		return check;
	 }
	 
	 void leavUser() {}
	 
	 void join() {
		 System.out.println("사용하실 아이디를 입력해주세요");
		 String myId= scan.next();
		 int check =  id_check(myId);
		 if(check==-1) {
			 System.out.println("사용 하실 비밀번호를 입력해주세요");
			 String myPw= scan.next(); 
			 System.out.println("회원가입 되었습니다.");
			 if(userCnt==0) {
				 user = new User[1];
				 user[0] = new User();
				 user[0].id = myId;
				 user[0].pw = myPw;
			 }
			 else {
				 User[] temp = new  User[userCnt];
				 temp= user;
				 user = new User[userCnt+1];
				 for (int i = 0; i < userCnt+1; i++) {
					 user[i] = new User();
				}
				 for (int i = 0; i < userCnt; i++) {
					user[i] = temp[i];
				}
				 user[userCnt].id = myId;
			     user[userCnt].pw = myPw;
			     System.out.println("회원가입 되었습니다.");
			 }
			 userCnt ++;
			 allUserPrint();
		 }
		 else {
			 System.out.println("아이디가 중복됩니다.");
			 return;
			 
		 }
	 }
	 
	 void joinAfter() {
			while (true) {
					
				System.out.println("["+user[identifier].id+"] 님, 로그인]");
				System.out.println("[1]계좌생성 [2]입금하기 [3]출금하기 [4]이체하기 [5]계좌조회 "
				+ "[6]계좌삭제 [7]회원탈퇴 [0]뒤로가기");
				System.out.print("메뉴를 선택하세요 : ");
				int choice = scan.nextInt();
				if(choice==1) { AccountManager.getInstance().userAccAdd();}
				else if(choice==2) {AccountManager.getInstance().deposit();}
				else if(choice==3) {AccountManager.getInstance().withdraw();}
				else if(choice==4) {AccountManager.getInstance().money_Transfer();}
				else if(choice==5) {AccountManager.getInstance().allAccPrint();}
				else if(choice==6) {AccountManager.getInstance().del_Acc();}
				else if(choice==7) {AccountManager.getInstance().del_id();}
				else if(choice==0) {identifier=-1; atm.showMenu();}
			}
			
		
	 }

	public static UserManager getInstance() {
		return instance;
	}


	
	
	
	

}









