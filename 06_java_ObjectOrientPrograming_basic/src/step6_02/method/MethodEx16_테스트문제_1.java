package step6_02.method;

import java.util.Scanner;

//# 틱택토

class game{
	
	Scanner scan = new Scanner(System.in);
	
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;		
	
	void screen() {
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				if(game[i][j].equals(null)) {System.out.println("[ ]");}	
				else if(game[i][j].equals("X")) {System.out.println("[X]");}	
				else if(game[i][j].equals("O")) {System.out.println("[O]");}	
			}
		}	
	}
	void start() {
		if(turn==0) {
			System.out.println("x의 좌표 : ");
			int x =scan.nextInt();
			System.out.println("y의 좌표 : ");
			int y =scan.nextInt();
		}
		else if(turn==1) {
			System.out.println("x의 좌표 : ");
			int x =scan.nextInt();
			System.out.println("y의 좌표 : ");
			int y =scan.nextInt();
		}
		
	}
	

	
}


public class MethodEx16_테스트문제_1 {

	public static void main(String[] args) {
		
		game tic = new game();
		

	}

	int cnt = 0;

}
