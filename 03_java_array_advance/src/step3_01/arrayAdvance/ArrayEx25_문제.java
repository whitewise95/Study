package step3_01.arrayAdvance;

import java.util.Scanner;

/*
 * 
 * # 최대값 구하기[3단계]
 * 
 * 1. 가장 큰 값을 찾아 입력한다.
 * 2. 정답이면 해당 값을 0으로 변경한다.
 * 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
 * 예)
 * 11, 87, 42, 100, 24
 * 입력 : 100
 * 
 * 11, 87, 42, 0, 24
 * 입력 : 87
 * 
 * 11, 0, 42, 0, 24
 * 
 */


public class ArrayEx25_문제 {

	public static void main(String[] args) {
		
		int[] arr = {11, 87, 42, 100, 24};
		Scanner scan = new Scanner(System.in);
		
		int temp = 0;
		
		
		while(true){
			int cnt=0;
			int maxNum = 0;
			for (int i = 0; i < arr.length; i++) {
				if(maxNum < arr[i]) {
					maxNum = arr[i];
					temp = i;
				}
				System.out.print(arr[i]+",");
				
			}
			System.out.println();
			System.out.println("제일 큰 값은? : ");
			int x = scan.nextInt();
			if(x == maxNum) {
				arr[temp] = 0;
			}
			
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] < 1) {
					cnt++;
				}
			}
			if(cnt==5) {
				System.out.println("종료");
				break;
			}
			
		
			
		}
		
		
	
	}
}
