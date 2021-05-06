package step8_03.atm_v3.copy;

import java.util.Scanner;



public class ATM {
	Scanner scan = new Scanner(System.in);
	
	ATM() {
		
		boolean isLoad = FileManager.getInstance().loadData();
		// 테스트 데이터 생성
		if (!isLoad) {
			UserManager.getInstance().
			FileManager.getInstance().saveData();
		}
		
	}
	void showMenu() {
		while(true){
			System.out.println("[MEGA ATM]");
			System.out.println("[1]회원가입\n[2]로그인\n[0]종료");
			System.out.print("메뉴를 선택하세요 : ");
			int choice = scan.nextInt();
			if(choice==1) { join();}
			else if(choice==2) {login();}
			else if(choice==0) {break;}
		}
	}

	void login() {
		UserManager.getInstance().login();
	}
	
	void join() {
		UserManager.getInstance().join();
	}
	
	
	
	
}







