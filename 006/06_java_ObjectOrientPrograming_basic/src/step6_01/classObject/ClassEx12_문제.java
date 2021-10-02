package step6_01.classObject;
/* 
 * # 틱택토
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */

import java.util.Scanner;


class Ex12_1{
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;		
}



public class ClassEx12_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ex12_1 e = new Ex12_1();
		for (int i = 0; i < e.game.length; i++) {
			for (int j = 0; j < e.game[i].length; j++) {
				e.game[i][j]="[ ]";
			}
		}
		while(true) {
			System.out.println("=== 틱택토 ===");
			for (int i = 0; i < e.game.length; i++) {
				for (int j = 0; j < e.game[i].length; j++) {
					
					System.out.print(e.game[i][j]);
				}
				System.out.println();
			}
			System.out.println(e.win);
			if(e.win==1) {
				System.out.println("1p 승");
				break;
			}
			else if(e.win==2) {
				System.out.println("2p 승");
				break;
			}
			if(e.turn==0) {
				System.out.println("1p 차례");
				System.out.println("X좌표 : ");
				int x = scan.nextInt();
				if(x<3&&0<=x) {
					System.out.println("Y좌표 : ");
					int y = scan.nextInt();
					if(y<3&&0<=y) {
						if(e.game[x][y].equals("[ ]")) {
							e.game[x][y]="[X]";
						}
						else {continue;}
					}
				}
			}
			if(e.turn==2) {
				System.out.println("2p 차례");
				System.out.println("X좌표 : ");
				int x = scan.nextInt();
				if(x<3&&0<=x) {
					System.out.println("Y좌표 : ");
					int y = scan.nextInt();
					if(y<3&&0<=y) {
						if(e.game[x][y].equals("[ ]")) {
							e.game[x][y]="[O]";
						}
						else {continue;}
					}
				}
			}
			//세로
			for (int i = 0; i < e.game.length; i++) { 
				for (int j = 0; j < 1; j++) {
					if(e.game[i][j].equals("[X]")&&e.game[i][j+1].equals("[X]")&&e.game[i][j+2].equals("[X]")) {;e.win=1;}
					else if(e.game[i][j].equals("[O]")&&e.game[i][j+1].equals("[O]")&&e.game[i][j+2].equals("[O]"))  {;e.win=2;}
				}
			}
			//가로
			for (int i = 0; i <1; i++) {
				for (int j = 0; j < e.game.length; j++) {
					if(e.game[i][j].equals("[X]")&&e.game[i+1][j].equals("[X]")&&e.game[i+2][j].equals("[X]"))  {;e.win=1;}
					else if(e.game[i][j].equals("[O]")&&e.game[i+1][j].equals("[O]")&&e.game[i+2][j].equals("[O]")){;e.win=2;}
				}
			}
			//대각선
			for (int i = 0; i < 1; i++) {
				for (int j = 0; j < 1; j++) {
					if(e.game[i][j].equals("[X]")&&e.game[i+1][j+1].equals("[X]")&&e.game[i+2][j+2].equals("[X]")) {;e.win=1;}
					else if(e.game[i][j].equals("[O]")&&e.game[i+1][j+1].equals("[O]")&&e.game[i+2][j+2].equals("[O]")) {;e.win=2;}
				
				}
			}
			for (int i = 2; i < 3; i++) {
				for (int j = 0; j < 1; j++) {
					if(e.game[i][j].equals("[X]")&&e.game[i-1][j+1].equals("[X]")&&e.game[i-2][j+2].equals("[X]")) {;e.win=1;}
					else if(e.game[i][j].equals("[O]")&&e.game[i-1][j+1].equals("[O]")&&e.game[i-2][j+2].equals("[O]")) {;e.win=2;}
				
				}
			}
			if(e.turn==0) {e.turn=2;}
			else if(e.turn==2) {e.turn=0;}
		}
	}
}
