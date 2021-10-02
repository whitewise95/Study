package step1_05.controlStatement;

import java.util.Scanner;

/*
 *     16:58~16:10
 * 
 * # 구구단 게임[1단계]
 * 
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */


public class IfEx06_문제 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int letter1 = 0;
		int letter2 = 0;
		
		
		System.out.println("첫번째 정수 하나를 입력해주세요");
		letter1 = scan.nextInt();
		
		System.out.println("두번째 정수 하나를 입력해주세요");
		letter2 = scan.nextInt();
		
		System.out.println( "두개의 숫자들의 곱셈한 답을 입력해주세요");
		int me = scan.nextInt();
		
		if(me == letter2 * letter1) {
			System.out.println("정답입니다.");
		}
		if(me != letter2 * letter1) {
			System.out.println("땡");
		}
		
		scan.close();
		

	}

}
