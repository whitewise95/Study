package step6_02.method;

import java.util.Arrays;
import java.util.Random;

/*
 * # OMR카드 : 클래스 + 메서드
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표 = {O, X, O, X, X}
 * 성적   = 40점
 */


class	OMR {
	Random ran = new Random();
	int[] answer= {1,3,4,2,5};
	int[] hgd = new int[5];
	int score = 0;


	void answer(){
		System.out.print("answer	:	");
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]+", ");
		}
		System.out.println();
		
	}
	void hgd(){
		System.out.print("hgd	:	 ");
		for (int i = 0; i <	hgd.length; i++) {
			hgd[i] = ran.nextInt(5)+1;
			System.out.print(hgd[i]+", ");
		}
		System.out.println();
	}
	
	void comparison() {
		System.out.print("정오표	:	 " );
		for (int i = 0; i < answer.length; i++) {
			if(hgd[i]==answer[i]) {
				System.out.print("o, ");
				score+=20;
			}
			else if(hgd[i]!=answer[i]) {
				System.out.print("x, ");
			}
		}
		System.out.println();
		
	}
	
	void score() {
		System.out.println("스코어	:	"+score+"점" );
	}
	
	
	void run() {
		answer();
		hgd();
		comparison();
		score();
		
	}
	
	

}

public class MethodEx12_테스트문제_문제풀이 {

	public static void main(String[] args) {
		
		OMR sm = new OMR();
		sm.run();

	}

}
