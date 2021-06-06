package step1_05.controlStatement;

import java.util.Scanner;

/*
 * 
 * 18:54~18:58
 * # 최대값 구하기[1단계]
 * 
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */


public class IfEx12_문제 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("첫번째 정수 하나를 입력해주세요 :");
		int temp1=scan.nextInt();
		System.out.println("두번째정수 하나를 입력해주세요 :");
		int temp2=scan.nextInt();
		System.out.println("세번째 정수 하나를 입력해주세요 :");
		int temp3=scan.nextInt();
		
		int text = temp1;
		
		if(text < temp1) text = temp1;
		if(text < temp2) text = temp2;
		if(text < temp3) text = temp3;
		
		System.out.println("최대값 : "+text);
		

	}

}
