package step6_02.method;

import java.util.Random;
import java.util.Scanner;

class MySpeedGame {

	Scanner scan = new Scanner(System.in);
	Random ran = new Random();

	int[][] front = new int[3][3];
	int[][] back = new int[3][3];

	int num = 1;
	int cnt =0;
	
	void readyTime() {
		int x =1;
		for (int i = 0; i < front.length; i++) {
			for (int j = 0; j < front[i].length; j++) {
				front[i][j]=x;
				x++;
			}
		}
		for (int i = 0; i < back.length; i++) {
			for (int j = 0; j < back[i].length; j++) {
				 back[i][j]=x;
				 x++;
			}
		}
	}
	
	
	void  shuffle() {
		
		for (int i = 0; i < 1000; i++) {
			int x= ran.nextInt(3);
			int y= ran.nextInt(3);
			int temp = front[0][0];
			front[0][0] = front[x][y];
			front[x][y] = temp;
		}
	}
	
	void screen() {
		for (int i = 0; i < front.length; i++) {
			for (int j = 0; j < front.length; j++) {
				System.out.print(front[i][j]+", ");
			}
			System.out.println();
		}
	}


	void gameStart(){
		
		System.out.println("x의 좌표");
		int x =scan.nextInt();
		System.out.println("y의 좌표");
		int y =scan.nextInt();
		if(front[y][x]==num) {
			if(num<=9) {
				front[y][x]=back[y][x];
			}
			else {front[y][x]=back[y][x];
			front[y][x]=0;}
			num++;
			cnt++;
		}
		
	}

	void run() {
		readyTime();
		shuffle();
		while(true) {
			screen();
			gameStart();
			if(cnt==18) {System.out.println("수고하셨습니다.");break;}
		}
	}
	
}


public class MethodEx17_테스트문제_문제풀이 {

	public static void main(String[] args) {
		
		MySpeedGame sg = new MySpeedGame();
		sg.run();

	}

}
