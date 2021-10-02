
package step6_02.method;

import java.util.Scanner;

//# 사다리 게임

class LadderGameExam {

	Scanner scan = new Scanner(System.in);

	int[][] ladder = { 
			{ 0, 0, 0, 0, 0 }, 
			{ 1, 2, 0, 1, 2 }, 
			{ 0, 1, 2, 0, 0 }, 
			{ 0, 0, 0, 1, 2 }, 
			{ 0, 1, 2, 0, 0 },
			{ 1, 2, 0, 0, 0 }, 
			{ 0, 0, 0, 1, 2 }, 
			{ 0, 0, 0, 0, 0 } 
	};

	int xIdx = 0;
	int yIdx = 0;
	String menu = "";

	
	
	// 사다리 출력하기
	void showLadder() {
		System.out.println("  1  2  3  4  5");
		for (int i = 0; i < ladder.length; i++) {
			for (int j = 0; j < ladder[i].length; j++) {
				if (ladder[i][j] == 0) {
					if (xIdx == i && yIdx == j) 	System.out.print("  *");
					else 							System.out.print("  │");
				} else if (ladder[i][j] == 1) {
					if (xIdx == i && yIdx == j) 	System.out.print("  * ");
					else 							System.out.print("  ├─");
				} else if (ladder[i][j] == 2) {
					if (xIdx == i && yIdx == j) 	System.out.print(" *");
					else 							System.out.print("─┤");
				}
			}
			System.out.println();
		}
		System.out.println("김밥 우유 치킨 따아 피자");
		System.out.println();
		
		try {
			Thread.sleep(500);  // 0.5초 딜레이 ,  1000 > 1초 , 3000 > 3초 , 100 > 0.1초 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	void goLadder() {
		
		while(true) {
	
			if(ladder[xIdx][yIdx]==0 &&xIdx!=7) {
				xIdx+=1;
			}
			else if(ladder[xIdx][yIdx]==1&&xIdx!=7) {
				yIdx+=1;
				showLadder();
				xIdx+=1;
				showLadder();
			}
			else if(ladder[xIdx][yIdx]==2&&xIdx!=7){
				yIdx-=1;
				showLadder();
				xIdx+=1;
				showLadder();
			}
			else {
				break;
			}
		}	
	}
	
	void showMenu() {
		if(xIdx==7&&yIdx==0) {menu = "김밥";}
		else if(xIdx==7&&yIdx==1) {menu = "우유";}
		else if(xIdx==7&&yIdx==2) {menu = "치킨";}
		else if(xIdx==7&&yIdx==3) {menu = "따아";}
		else if(xIdx==7&&yIdx==4) {menu = "피자";}
		
	}
	
	void run() {
		showLadder();
		goLadder();
		showMenu();
		System.out.println("오늘의 점심메뉴는 " + menu+"입니다.");
	}
}
	


public class MethodEx18_테스트문제풀이 {

	public static void main(String[] args) {
		
		LadderGameExam lg = new LadderGameExam();
		lg.run();
		
	}
}


