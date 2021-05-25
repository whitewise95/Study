package step6_02.method;

import java.util.Scanner;

/*
 * # 숫자 이동하기 : 클래스 + 메서드
 * 1. 숫자 8은 캐릭터이다.
 * 2. 숫자 1을 입력하면, 캐릭터가 왼쪽으로 이동한다.
 * 3. 숫자 2를 입력하면, 캐릭터가 오른쪽으로이동한다.
 * 4. 좌우 끝에 도달했을 때 에러가 발생하지 않도록 예외처리를 해준다.
 */

class NumberGame{
	
	Scanner scan = new Scanner(System.in);

	int[] game = {0,0,0,0,8,0,0};
	
	
	void Screen() {
		for (int i = 0; i < game.length; i++) {
			System.out.print(game[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
	
	
	void move() {
		System.out.println("[1]왼쪽   [2]오른쪽");
		int answer = scan.nextInt();
		if(answer==1) {left();}
		if(answer==2) {light();}
	}
	
	void light(){
		for (int i = 0; i < game.length; i++) {
			if(game[i]==8) {
				if(i==6) {
					int temp = game[i];
					game[i]=0;
					game[0]=temp;
					
				}
				else if(game[i+1]==0) {
					int temp = game[i];
					game[i]=game[i+1];
					game[i+1]=temp;
					break;
				}
			}
		}
	}
	void left(){
		for (int i = 0; i < game.length; i++) {
			if(game[i]==8) {
				if(i==0) {
					int temp = game[i];
					game[i] = 0;
					game[6] =temp;
					break;
				}
				else if(game[i-1]==0) {
					int temp = game[i];
					game[i]=game[i-1];
					game[i-1]=temp;
					break;
				}
			}
		}
	}
	
	void run() {
		while(true) {
			Screen();
			move();
		}
		
	}
	

	
}

public class MethodEx14_테스트문제_문제풀이 {

	public static void main(String[] args) {
		
		NumberGame g = new NumberGame();
		g.run();
		

	}

}
