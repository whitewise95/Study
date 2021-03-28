package step1_06.loop;

import java.util.Scanner;

/*
 * # 소수찾기[2단계]
 * 
 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
 * 예)
 * 입력 : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 * 
 */

public class LoopEx23_정답예시 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int getPrimeNumber = scan.nextInt();
		int pnCnt = 0;
		
		for (int i=2; i<=getPrimeNumber; i++) {  // i는2인데 정답과같을때까지 돈다
			
			pnCnt = 0;
			for (int j=1; j<=i; j++) {          //j=1 j는i와같아질때까지 돈다
				if (i%j == 0) pnCnt++;           //i나누기j의 나머지가0이면 카운트1
			}
			
			if (pnCnt ==2) {
				System.out.print(i +" ");
			}
	
		}
		scan.close();
		
	}
	
}
