package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 값 교체하기[2단계] 
 */

public class ArrayEx12_문제 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10,20,30,40,50};
		int getIndex1 , getIndex2;
		int getValue1 , getValue2;
		int temp = 0;
		int cnt = 0;
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예    1) 인덱스1 입력 : 1
		//		   인덱스2 입력 : 3
		//		  {10, 40, 30, 20, 50}
//		System.out.println("인덱스값을 입력해주세요");
//		getIndex1 = scan.nextInt();
//		System.out.println("인덱스값을 입력해주세요");
//		getIndex2 = scan.nextInt();
//		temp=arr[getIndex1];
//		arr[getIndex1] = arr[getIndex2];
//		arr[getIndex2] = temp;
//		System.out.println(Arrays.toString(arr));
//		
//		
//		
		
		
		
		
		

		
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예    2) 값1 입력 : 10
		//        값2 입력 : 50
		//		  {50, 20, 30, 40, 10}

//		System.out.println("값을 입력해주세요");
//		getValue1 = scan.nextInt();
//		System.out.println("값을 입력해주세요");
//		getValue2 = scan.nextInt();
//		int x = 0;
//		int y = 0;
//		
//		
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]==getValue1) {
//				x = i;
//			}
//			if(arr[i]==getValue2) {
//				y = i;
//			}
//		}
//		temp = arr[x];
//		arr[x] = arr[y];
//		arr[y]=temp;
//		System.out.println(Arrays.toString(arr));
//		
		
		
		
		
		
		
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예    3) 학번1 입력 : 1002
		//        학번2 입력 : 1003
		//		 {87, 45, 11, 98, 23}
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		int temp1 = 0;
		int temp2 = 0;
		int x= 0;
		int y= 0;
		System.out.println("학번을 입력해주세요");
		getValue1 = scan.nextInt();
		System.out.println("학번을 입력해주세요");
		getValue2 = scan.nextInt();
		
		for (int i = 0; i < scores.length; i++) {
			if(hakbuns[i]==getValue1) {
				temp1 = scores[i];
				x =i;
			}
			else if(hakbuns[i]==getValue2) {
				temp2 = scores[i];
				y = i;
			}
			
		}
		scores[x]= temp2;
		scores[y]= temp1;
		
	
		System.out.println(Arrays.toString( scores ));
		
		       
		    
		
		
		
		
	}
	
}
