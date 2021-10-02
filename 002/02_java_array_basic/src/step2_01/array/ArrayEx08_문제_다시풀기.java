package step2_01.array;

import java.util.Random;

/*
 * # OMR카드
 * 
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 
 * 예)
 * answer  = {1, 3, 4, 2, 5}
 * hgd     = {1, 1, 4, 4, 3}
 * 정오표  = {O, X, O, X, X}
 * 성적    = 40점
 */


public class ArrayEx08_문제_다시풀기 {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] answer = {1, 3, 4, 2, 5};
		int[] hgd = new int[5];
		int score = 0;
		char[] x = new char[5];

		for (int i = 0; i < hgd.length; i++) {
			hgd[i]= ran.nextInt(5)+1;
			
		}
		for (int i = 0; i < hgd.length; i++) {
			if(answer[i]==hgd[i]) {
				x[i]= 'o';
				score+=20;
			}
			else if(answer[i]!=hgd[i]){
				x[i]='x';
			}
		}
		System.out.print("답안지 ="+"{");
		for (int i = 0; i < hgd.length; i++) {
			System.out.print(hgd[i]+", ");
		}
		System.out.print("}");
		System.out.println();
		System.out.print("내정답 ="+"{");
		for (int i = 0; i < x.length; i++) {
			System.out.print(answer[i]+", ");
			
		}
		System.out.print("}");	
		System.out.println();
		System.out.print("정오표 ="+"{");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+", ");
			
		}	
		System.out.print("}");
		System.out.println();
		System.out.println("점수 : "+score);
		
		

		
		
	}
	
}
