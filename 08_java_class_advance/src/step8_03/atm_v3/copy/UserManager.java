package step8_03.atm_v3.copy;

import java.util.Scanner;

public class UserManager {
	Scanner scan = new Scanner(System.in);
	private UserManager() {}
	private static UserManager instance = new  UserManager();
	
	public static void setInstance(UserManager instance) {
		UserManager.instance = instance;
	}
	
	
	 User  user [];
	 int userCnt;
	
	 
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
		 
		 
	 }
	 User id_check(User temp) {
		 int check=-1;
		 for (int i = 0; i < userCnt; i++) {
			if(temp.id.equals(user[i].id)){
				check = i;
			}
		}
		 
		return check;
	 }
	 
	 void leavUser() {}
	 
	 void join() {}
	 
	 void joinAfter() {}

	public static UserManager getInstance() {
		return instance;
	}


	
	
	
	

}









