package step1_06.loop;


/*
 *  # 반복문 for
 * 
 * 1. 반복문의 조건 3가지 
 * 		1) 초기식 2) 조건식 3) 증감식
 * 
 * 2. [ 형식 ]
 * 
 * for (초기식;조건식;증감식) {
 * 		조건식이 참일때 반복할 명령어;
 * }
 * 
 * 3. for문의 실행순서
 *  1) 초기식
 *  2) 조건식  3) 명령어  4) 증감식 
 *  조건이 false가 될때까지 2)3)4) 반복 
 * 
 * 
 * */



public class LoopEx17 {

	public static void main(String[] args) {
 
		int x = 1; //초기식
		while (x<=5) {//조건식
			System.out.println(x);
			x++; // 증감식]
		}
		
		System.out.println();
		
		
		for (int y = 1; y <= 5; y++) {// 초기식,조건식,증감식
			System.out.println(y);
		}
		
		//for + [ctrl + space ] ; for문 생성 단축키
	}

}
