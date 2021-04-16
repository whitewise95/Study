package step6_02.method;

import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 메서드
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */

class cardGame{
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	int[] front =	 {1,1,2,2,3,3,4,4,5,5,};
	int[] back 	= 	{0,0,0,0,0,0,0,0,0,0,};
	int idx1 = 0;
	int idx2 = 0;
	int screencnt = 0;
	
	void Shuffle() {
		for (int i = 0; i < 1000; i++) {
			int ranNum = ran.nextInt(10);
			int temp = front[ranNum];
			front[ranNum] =front[0];
			front[0]=temp;
		}
	}
	
	
	
	void screen() {
		int cnt =0;
		for (int i = 0; i < front.length; i++) {
				System.out.print(front[i]+", ");
		}
		System.out.println();
	}
	
	void choice() {
		System.out.println("인덱스를 입력해주세요");
		idx1 = scan.nextInt();
		System.out.println("인덱스를 입력해주세요");
		idx2= scan.nextInt();
		if(front[idx1]==front[idx2]) {
			front[idx1]= 0;
			front[idx2]= 0;
			back[idx1] = 1;
			back[idx2] = 1;
		}
	}
	
	void win() {
		int cnt = 0;
		for (int i = 0; i < back.length; i++) {
			if(back[i]==1) {
				cnt++;
			}
			if(cnt==10) { System.out.println("win"); screencnt=1;}
		}
		
	}
	
	void run() {
		Shuffle();
		while(true) {
		win();
		if(screencnt==1) {break;}
		screen();
		choice();
		}
	}
	

}
	
	

public class MethodEx15_테스트문제_1 {

	public static void main(String[] args) {

		cardGame g = new cardGame();
		g.run();
	}

}
