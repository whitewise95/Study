package step8_03.atm_v3.copy;

import java.util.Random;
import java.util.Scanner;



public class AccountManager {
	
	private  AccountManager () {}
	private  static AccountManager instance = new  AccountManager();
	public static AccountManager getInstance() {
		return instance;
	}
	UserManager userManager = UserManager.getInstance();
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	User userList = userManager.user[userManager.identifier];
	
	void  userAccAdd() {
		
		if(userList.accCnt==3) {System.out.println("계좌 생성제한횟수가 넘었습니다." );return;}
		else {
			if(userList.accCnt==0) {
				userList.accList = new Account[1];
				userList.accList[0] = new Account();
		}	
			else if(userList.accCnt>0) {
				Account[] temp= userList.accList;
				userList.accList = new Account[userList.accCnt+1];
				for (int i = 0; i < userList.accCnt+1; i++) {
					userList.accList[i] = new Account();
				}
				for (int i = 0; i < temp.length; i++) {
					userList.accList[i] = temp[i];
				}
			}
			String makeAccount = ran.nextInt(90000000) + 10000001 +"";
			userList.accList[userList.accCnt].acc = makeAccount;
			userList.accList[userList.accCnt].money = 0;
			userList.accCnt++;
		}
	}
	
	void money_Transfer() {
		allAccPrint();
		Account temp = new Account();
		System.out.println("이체시킬 계좌를 입력해주세요");
		temp.acc = scan.next();
		int check = acc_Check(temp.acc);
		if(check!=-1) {
			System.out.println("이체할 계좌번호를 입력해주세요");
			temp.acc = scan.next();
			int check1 = acc_Check(temp.acc);
			if(check1!=-1) {
				System.out.println("이체할 금액을 입력해주세요");
				int myMoney  = scan.nextInt();
				if(userList.accList[check].money >=myMoney) {
					userList.accList[check].money = userList.accList[check].money-myMoney;
					userList.accList[check1].money =  userList.accList[check1].money+myMoney;
				}
				else {System.out.println("금액이 부족합니다.");return;}
			}
			else {System.out.println("없는 계좌번호 입니다.");return;}
		}
		else {System.out.println("없는 계좌번호 입니다.");return;}
	}
	
	int acc_Check(String acc) {
		int check = -1;
		for (int i = 0; i < userList.accCnt; i++) {
			if(userList.accList[i].acc.equals(acc)) {
				check = i;
			}
		}
		return check;
	}
	
	void allAccPrint() {
		System.out.println("계좌번호/t금액");
		for (int i = 0; i <userList.accCnt; i++) {
			System.out.println(userList.accList[i].acc+"/t"+userList.accList[i].money);
		}
		
	}
	
	void deposit() {
		allAccPrint();
		Account temp = new Account();
		System.out.println("입금할 계좌를 입력해주세요");
		temp.acc = scan.next();
		int check = acc_Check(temp.acc);
		if(check!=-1) {
			System.out.println("이체할 금액을 입력해주세요");
			userList.accList[check].money =  scan.nextInt();
		}
		else {System.out.println("없는 계좌 입니다.");return;}
	
	}
	
	void withdraw() {
		allAccPrint();
		Account temp = new Account();
		System.out.println("출금할 계좌를 입력해주세요");
		temp.acc = scan.next();
		int check = acc_Check(temp.acc);
		if(check!=-1) {
			System.out.println("출금할 금액을 입력해주세요");
			temp.money =  scan.nextInt();
			if(temp.money<=userList.accList[check].money) {
				System.out.println("출금되었습니다.");
				userList.accList[check].money= userList.accList[check].money-temp.money ;
			}
			else {System.out.println("금액이 부족합니다.");}
		}
		else {System.out.println("없는 계좌 입니다.");return;}

	}
	
	void del_Acc() {
		allAccPrint();
		System.out.println("삭제시킬 계좌를 입력해주세요");
		String del_Acc = scan.next();
		int check = acc_Check(del_Acc);
		if(check!=-1) {
			if(userList.accCnt==1) {
				userList.accList = null;
			}
			else {
				Account[] temp = userList.accList;
				userList.accList =new Account[userList.accCnt-1];
				for (int i = 0; i < userList.accCnt-1; i++) {
					userList.accList[i] =new Account();
				}
				for (int i = 0; i < check; i++) {
					userList.accList[i] =temp[i];
				}
				for (int i = check; i < temp.length-1; i++) {
					userList.accList[i] =temp[i+1];
				}
			}
			userList.accCnt--;
			System.out.println("계좌가 삭제되었습니다.");
		}
		else {System.out.println("계좌가 없습니다.");}
	}
	
	
	void del_id() {
		ATM atm = new ATM();
		if(userManager.userCnt==1) {
			userManager.user = null;
		}
		else {
			User[] temp =userManager.user;
			userManager.user = new User[userManager.userCnt-1];
			for (int i = 0; i < userManager.userCnt-1; i++) {
				userManager.user[i] = new User();
			}
			for (int i = 0; i <userManager.identifier ; i++) {
				userManager.user[i] = temp [i];
			}
			for (int i = userManager.identifier; i <temp.length-1 ; i++) {
				userManager.user[i] = temp [i+1];
			}
		}
		userManager.userCnt--;
		userManager.identifier = -1;
		atm.showMenu();
	}



	
	

}
