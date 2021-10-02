package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 1 ~ 100까지의 난수를 생성한다.
 * 2. 스캐너를 이용해 정답을 맞추기를 시도하고 정답을 맞출경우 게임은 종료된다.
 * 3. 점수는 100점부터 시작해서 오답을 입력할 때마다 5점씩 차감된다.
 * 4. 게임 종료 후, 점수를 출력한다.
 * 
 */

public class LoopEx07_문제 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int answer = 0;
		int score = 100;
		
	    int randomNumber = ran.nextInt(100)-1;
	    while(answer != randomNumber ) {
	     System.out.println("랜덤의 숫자를 맞춰주세요");
	     System.out.println(randomNumber);
	     answer = scan.nextInt();
	     if(answer != randomNumber) {
	    	  score = score -5;
	      }
	    }
		if(answer == randomNumber) {
			System.out.println("정답입니다.");
			System.out.println("score :"+score+"점");
		}
	}

}
