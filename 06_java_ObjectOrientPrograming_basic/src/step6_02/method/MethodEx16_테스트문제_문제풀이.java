package step6_02.method;

import java.util.Scanner;

//# 틱택토

class game{
	
	Scanner scan = new Scanner(System.in);
	
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;
	int x = 0;
	int y = 0;
	void start() {
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game.length; j++) {
				game[i][j]="";
			}
		} 
	}
	
	
	
	
	void screen() {
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				if(game[i][j].equals("")) {System.out.print("[ ]");}	
				else if(game[i][j].equals("X")) {System.out.print("[X]");}	
				else if(game[i][j].equals("O")) {System.out.print("[O]");}	
			}
			System.out.println();
		}	
	}
	void inGame() {
			if(turn==0) {
				System.out.println("1p 차례입니다.");
				System.out.println("x의 좌표 : ");
				 x =scan.nextInt();
				System.out.println("y의 좌표 : ");
				 y =scan.nextInt();
				 if(game[y][x].equals("")) game[y][x]="X";
			}
			else if(turn==1) {
				System.out.println("2p 차례입니다.");
				System.out.println("x의 좌표 : ");
				x =scan.nextInt();
				System.out.println("y의 좌표 : ");
				y =scan.nextInt();
				if(game[y][x].equals("")){ game[y][x]="O";}
			}
			if(turn==0) {turn=1;}
			else if(turn==1) {turn=0;}
	}
	
	void win() { // 세로검사
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < 1; j++) {
				if(game[i][j]=="X"&&game[i][j+1]=="X"&&game[i][j+2]=="X") {win=1;}
				else if(game[i][j]=="O"&&game[i][j+1]=="O"&&game[i][j+2]=="O") {win=2;}
			}
		}
		for (int i = 0; i < 1; i++) {//가로검사
			for (int j = 0; j < game.length; j++) {
				if(game[i][j]=="X"&&game[i+1][j]=="X"&&game[i+2][j]=="X") {win=1;}
				else if(game[i][j]=="O"&&game[i+1][j]=="O"&&game[i+2][j]=="O") {win=2;}
				
			}
		}
		for (int i = 0; i < 1; i++) {//대각선 검사
			for (int j = 0; j < 1; j++) {
				if(game[i][j]=="X"&&game[i+1][j+1]=="X"&&game[i+2][j+2]=="X") {win=1;}
				else if(game[i][j]=="O"&&game[i+1][j+1]=="O"&&game[i+2][j+2]=="O") {win=2;}
			}
		}
		for (int i = 2; i > 1; i--) {//역대각선 검사
			for (int j = 0; j < 1; j++) {
				if(game[i][j]=="X"&&game[i-1][j+1]=="X"&&game[i-2][j+2]=="X") {win=1;}
				else if(game[i][j]=="O"&&game[i-1][j+1]=="O"&&game[i-2][j+2]=="O") {win=2;}
			}
		}
	}
	void gameStart() {
		start();
		while(true) {
			screen();
			inGame();
			win(); 
			if(win==1) {System.out.println("1p가 승리했습니다.");break;}
			else if(win==2) {System.out.println("2p가 승리했습니다.");break;}
		}
		
	}
	

	
}


public class MethodEx16_테스트문제_문제풀이 {

	public static void main(String[] args) {
		
		game tic = new game();
		
	
			tic.gameStart();
			
		

	}
}
