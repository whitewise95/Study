package step6_02.method;

import java.util.Scanner;


// 2:32~ 2:40
/*
 * # 숫자 이동하기 : 클래스 + 메서드
 * 1. 숫자 8은 캐릭터이다.
 * 2. 숫자 1을 입력하면, 캐릭터가 왼쪽으로 이동한다.
 * 3. 숫자 2를 입력하면, 캐릭터가 오른쪽으로이동한다.
 * 4. 좌우 끝에 도달했을 때 에러가 발생하지 않도록 예외처리를 해준다.
 */

class NewNumberGame{
	
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
	
	int place() {
		int x =0;
		for (int i = 0; i < game.length; i++) {
			if(game[i]==8) {
				x = i;
			}
		}
		return x;
	}
	
	void left() {
		int person = place();
		if(person==0) {
			game[6]=8;
			game[0]=0;
		}
		else {
		game[person] = 0;
		game[person-1] =8;
		}
		
	}
	
	
	void light() {
		int person = place();
		if(person==6) {
			game[0]=8;
			game[6]=0;
		}
		else {
		game[person] = 0;
		game[person+1] =8;
		}
	}
	
}

public class MethodEx14_테스트문제_noFor문 {

	public static void main(String[] args) {
	
		NewNumberGame game =new NewNumberGame();
		while(true) {
		game.Screen();
		game.move();
		}

	}

}
