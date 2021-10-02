package step8_03.atm_v3.copy;

import java.util.Random;
import java.util.Scanner;

public class AccountManager {

	private AccountManager() {}
	private static AccountManager instance = new AccountManager();
	public static AccountManager getInstance() {
		return instance;
	}
	
	UserManager userManager = UserManager.getInstance();
	Scanner scan =new Scanner(System.in);
	
	void createAccount() {
		Random ran = new Random();
		if(UserManager.getInstance().userList[UserManager.getInstance().identifier].accCount==0) {
			UserManager.getInstance().userList[UserManager.getInstance().identifier].accList = new  Account[1];
			UserManager.getInstance().userList[UserManager.getInstance().identifier].accList[0] = new  Account();
			UserManager.getInstance().userList[UserManager.getInstance().identifier].accList[0].number = Integer.toString(ran.nextInt(900001)+1);
		}
		if(UserManager.getInstance().userList[UserManager.getInstance().identifier].accCount>0) {
			Account[] temp= UserManager.getInstance().userList[UserManager.getInstance().identifier].accList;
			UserManager.getInstance().userList[UserManager.getInstance().identifier].accList = new  Account[UserManager.getInstance().userList[UserManager.getInstance().identifier].accCount+1];
			for (int i = 0; i < UserManager.getInstance().userList[UserManager.getInstance().identifier].accCount+1; i++) {
				UserManager.getInstance().userList[UserManager.getInstance().identifier].accList[i] = new  Account();
			}
			for (int i = 0; i < UserManager.getInstance().userList[UserManager.getInstance().identifier].accCount; i++) {
				UserManager.getInstance().userList[UserManager.getInstance().identifier].accList[i] = temp[i];
			}
			UserManager.getInstance().userList[UserManager.getInstance().identifier].accList[UserManager.getInstance().userList[UserManager.getInstance().identifier].accCount].number= Integer.toString(ran.nextInt(900001)+1);
			
			
		}
		UserManager.getInstance().userList[UserManager.getInstance().identifier].accCount++;
		System.out.println("계좌가 생성되었습니다.");
		
	}
	
	
	int showAccList(String msg) {
		return 0;
		

		
	}
	
	
	void income() {
		lookupAcc();
		System.out.println("계좌를 선택해주세요");
		int sel = scan.nextInt();
		sel=sel-1;
		System.out.println("얼마를 입금하시겠습니까?");
		int money = scan.nextInt();
		UserManager.getInstance().userList[UserManager.getInstance().identifier].accList[sel].money+=money;
	}
	
	
	void outcome() {
		System.out.println("자신의 계좌를 선택해주세요");
		int sel1 = scan.nextInt();
		sel1=sel1-1;
		System.out.println("얼마를 출금하시겠습니까?");
		int money = scan.nextInt();
		
		UserManager.getInstance().userList[UserManager.getInstance().identifier].accList[sel1].money-=money;
	
	}
	
	
	int checkAcc(String transAccount) {
		return 0;
		
	
	}
	
	
	int getAccIndex(int transUserIndex, String transAccount) {
		return transUserIndex;
		
	
		
	}
	
	
	void transfer() {
		lookupAcc();
		System.out.println("자신의 계좌를 선택해주세요");
		int sel1 = scan.nextInt();
		sel1=sel1-1;
		System.out.println("이체할 계좌를 선택해주세요");
		int sel2 = scan.nextInt();
		sel2=sel2-1;
		System.out.println("얼마를 보내시겠습니까?");
		int money = scan.nextInt();
		
		UserManager.getInstance().userList[UserManager.getInstance().identifier].accList[sel1].money-=money;
		UserManager.getInstance().userList[UserManager.getInstance().identifier].accList[sel2].money+=money;
		
	}
	
	
	void lookupAcc() {
		for (int i = 0; i < UserManager.getInstance().userList[UserManager.getInstance().identifier].accCount; i++) {
			System.out.println("["+(i+1)+"]"+UserManager.getInstance().userList[UserManager.getInstance().identifier].accList[i].number);
		}
		
		
	}

	
	void deleteAcc() {
		
		
		
	}
		
		
	
	
	
	
}
