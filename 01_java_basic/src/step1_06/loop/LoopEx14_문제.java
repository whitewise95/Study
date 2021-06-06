package step1_06.loop;

import java.util.Scanner;

/*
 * 
 *   
 * # 최대값 구하기[2단계]
 * 
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 * 
 */

public class LoopEx14_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i = 1;
		int answer1 = 0;
		int answer2 = 0;
		int answer3 = 0;
		
		
		while(i <4) {
			
			if(i==1) {
				System.out.println("정수를 입력해주세요");
				 answer1 = scan.nextInt();
				i++;
			}
			
			else if(i==2) {
				System.out.println("정수를 입력해주세요");
				answer2 = scan.nextInt();
				i++;
			}
			
			else if(i==3) {
				System.out.println("정수를 입력해주세요");
				answer3 = scan.nextInt();
				i++;
			}
		
		}
		
		
		if(answer1<=answer2) {
			answer1 =answer2;
			
		}
		
		if(answer1<=answer3) {
			answer1 =answer3;
		}
		
		System.out.println("최대값:"+answer1);
	}

}