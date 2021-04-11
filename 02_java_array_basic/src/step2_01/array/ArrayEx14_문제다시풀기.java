package step2_01.array;

import java.util.Scanner;

/*
 * # 숫자이동[1단계]
 * 
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 
 * @) 정답을 보지않고 소스를 동작시켜 본뒤에 내용을 이해하고 코드를 작성할 것
 * 
 */

public class ArrayEx14_문제다시풀기 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		int player = 0;
		
		while(true) {
			for (int i = 0; i < game.length; i++) {
				if(game[i]==0)System.out.print("-");
				if(game[i]==2)System.out.print("옷");
			}
			System.out.println();
			System.out.println("[1]왼쪽"+" "+"[2]오른쪽");
			int move = scan.nextInt();
			if(move==1) {
				for (int i = 0; i < game.length; i++) {
					if(game[i]==2) {
						if(i==0) {
							continue;
						}
							player = game[i];
							game[i-1]=player;
							game[i]=0;
							System.out.println(game[i]);
							continue;
						
					}
				}
			}
			if(move==2) {
				for (int i = 0; i < game.length; i++) {
					if(game[i]==2) {
						if(i==6) {
							continue;
						}
							player = game[i];
							game[i+1]=player;
							game[i]=0;
							continue;
						
					}
				}
			}
		}
				
	}
	
}
