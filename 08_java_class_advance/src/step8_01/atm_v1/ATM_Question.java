package step8_01.atm_v1;
import java.util.Random;
import java.util.Scanner;

public class ATM_Question {
	
	Scanner scan = new Scanner(System.in);
	Random ran   = new Random();
	UserManager userManager = new UserManager();
	int identifier = -1;
	
	void printMainMenu() {
				
		while (true) {
			
			System.out.println("\n[ MEGA ATM ]");
			System.out.print("[1.로그인] [2.로그아웃] [3.회원가입] [4.회원탈퇴] [0.종료] : ");
			int sel = scan.nextInt();
			
			if      (sel == 1) 	    login();
			else if (sel == 2) 		logout();
			else if (sel == 3) 		join();
			else if (sel == 4) 		leave();
			else if (sel == 0) {
				System.out.println("[메	시지] 프로그램을 종료합니다.");
				break;
			}
			
		}
		
	}
	
	
	
	void login() {
		
		identifier = userManager.logUser();
		
		if (identifier != -1) {
			printAccountMenu();
		}
		else {
			System.out.println("[메세지] 로그인실패.");
		}
		
	}
	
	
	
	void join() {	
		
		userManager.addUser();
		
	}
	
	
	
	void logout() {
		
		if (identifier == -1) {
			System.out.println("[메시지] 로그인을 하신 후 이용하실 수 있습니다.");
		}
		else {
			identifier = -1;
			System.out.println("[메시지] 로그아웃 되었습니다.");
		}
		
	}
	
	
	
	void leave() {
		
		userManager.leave();
		
	}
	
	
	
	void printAccountMenu() {
		
		while (true) {
			System.out.print("[1.계좌생성] [2.계좌삭제] [3.조회] [0.로그아웃] : ");
			int sel = scan.nextInt();
			String addAcc  =Integer.toString(ran.nextInt(99999)+1);
			if 		(sel == 1) {
				if(userManager.user[identifier].accCount==0) {
					userManager.user[identifier].acc = new Account[1];
					userManager.user[identifier].acc[0] = new Account();
					userManager.user[identifier].acc[0].number = addAcc;
					userManager.user[identifier].accCount ++;
				}
				else {
					Account[] temp= userManager.user[identifier].acc;
					userManager.user[identifier].acc = new Account[userManager.user[identifier].accCount+1];
					for (int i = 0; i < userManager.user[identifier].accCount+1; i++) {
						userManager.user[identifier].acc[i]=new Account();
					}
					for (int i = 0; i < temp.length; i++) {
						userManager.user[identifier].acc[i] = temp[i];
					}
					userManager.user[identifier].acc[userManager.user[identifier].accCount].number=addAcc;
					userManager.user[identifier].accCount ++;
					}
			} 
		
			else if (sel == 2) {
				if(userManager.user[identifier].accCount>0) {
					System.out.println("삭제하실 계좌번호를 입력해주세요");
					String removeAcc  =scan.next();
					Account[] tempAcc = userManager.user[identifier].acc;
					int check = -1;
					for (int i = 0; i < tempAcc.length; i++) {
						if(tempAcc[i].equals(removeAcc)) {
							check= i;
						}
					}
					if(check>-1) {
						userManager.user[identifier].acc = new Account[userManager.user[identifier].accCount-1];
						for (int i = 0; i < userManager.user[identifier].accCount-1; i++) {
							userManager.user[identifier].acc[i]=new Account();
						}
						for (int i = 0; i < check; i++) {
							userManager.user[identifier].acc[i] = tempAcc[i];
						}
						for (int i = check; i <tempAcc.length ; i++) {
							userManager.user[identifier].acc[i] = tempAcc[i+1];
						}
						userManager.user[identifier].accCount--;
					}
					else {System.out.println("잘못된 계좌번호입니다.");}
				}	
				else {System.out.println("있는 계좌가 없습니다.");}
			} 	
			else if (sel == 3) {
				userManager.user[identifier].printAccount();
				
			}  	 
			else if (sel == 0) {
				login();
			} 	
		}
		
	}	
}
