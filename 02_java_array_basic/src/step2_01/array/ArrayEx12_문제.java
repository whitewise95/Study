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
		
//		System.out.println("인덱스0~4중 입력해주세요");
//		int answer1 = scan.nextInt();
//		getIndex1 =answer1;
//		cnt++;
//		System.out.println("인덱스0~4중 입력해주세요");
//		int answer2 = scan.nextInt();
//		getIndex2 =answer2;
//		cnt++;
//		if(cnt==2) {
//			arr[temp]=arr[answer1];
//			arr[getIndex1]=arr[answer2];
//			arr[getIndex2]=arr[temp];       //왜 하나만 바뀌는가?
//			
//		}
//		for(int i=0; i<5; i++) {
//			System.out.print("["+arr[i]+"]");
//		}
//	System.out.println();
		
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예    2) 값1 입력 : 10
		//        값2 입력 : 50
		//		  {50, 20, 30, 40, 10}
//		System.out.println("값 하나를 입력해주세요");
//		getValue1 = scan.nextInt();
//	
//		System.out.println("값 하나를 입력해주세요");
//		getValue2= scan.nextInt();
//		for(int i =0; i<5; i++) {
//			if(arr[i]== getValue1) {
//				arr[i]=getValue2;
//			}
//			else if(arr[i]== getValue2) {
//				arr[i]=getValue1;
//			}
//			
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예    3) 학번1 입력 : 1002
		//        학번2 입력 : 1003
		//		 {87, 45, 11, 98, 23}
//		학번1을 입력해주세요
//		스캔
//		학번2를 입력해주세요
//		스캔
//
//		for (i=0  i<5 i++) {
//		        if( 마이학번1 == i) {
//		              temp = score[i];
//
//		        else if (학번2 == i) {
//		              temp2=score[i]
//
//
//		x =score[temp]
//		score[2] = score[temp]
//		score[temp] = x
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		int temp1 = 0;
		int temp2 = 0;
	
		
	   System.out.println("학번을 입력해주세요");
	   int myhakbuns1 = scan.nextInt();
	
	   System.out.println("학번을 입력해주세요");
	   int myhakbuns2 = scan.nextInt();
	   
	   for(int i=0; i<5; i++) {
		       if(myhakbuns1 == hakbuns[i]) {
		    	   temp1 = i;
		       }
		       
		       else if(myhakbuns2 == hakbuns[i]) {
		    	   temp2 = i;
		       }
		       
		       
		      
		       
	   }
	   int x =  scores[temp1];
       scores[temp1] = scores[temp2];
       scores[temp2] = x;
	  
	   System.out.println(Arrays.toString(scores));
	   
		
		
		
		
		
	}
	
}
