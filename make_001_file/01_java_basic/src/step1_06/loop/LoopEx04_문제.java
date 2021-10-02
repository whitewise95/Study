package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 * 
 */


public class LoopEx04_문제 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int score = 0;
		int i = 1;
		
		
		while(i < 6) {
			int x =ran.nextInt(8)+2;
			int y =ran.nextInt(6)+4;
			System.out.println(x+"x"+y+"="+"?");
			int answer = scan.nextInt();
			if(x*y==answer) {
				System.out.println("정답입니다. 20점 회득하셨습니다.");
				score =score+20;
				
			
			
			}
		   i++;
			
			
			
			
		}
	
		System.out.println("총점수는:"+score+"점");		
	
		scan.close();
	}

}
