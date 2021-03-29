package step2_01.array;

import java.util.Scanner;

/*
 * # 학생성적관리 프로그램[2단계] : 학생검색
 */

public class ArrayEx05_문제 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
//		// 인덱스      0   1   2   3   4
//		int[] arr = {87, 11, 45, 98, 23};
//		
//		// 문제1) 인덱스를 입력받아 성적 출력
//		// 정답1) 인덱스 입력 : 1	성적 : 11점
//		System.out.println("인덱스를 입력해주세여");
//		int number = scan.nextInt();
//		if(number == 0) System.out.println(arr[0]);
//		if(number == 1) System.out.println(arr[1]);
//		if(number == 2) System.out.println(arr[2]);
//		if(number == 3) System.out.println(arr[3]);
//		if(number == 4) System.out.println(arr[4]);
//		
//		
//	
//		
//		
//		// 문제2) 성적을 입력받아 인덱스 출력
//		// 정답2) 성적 입력 : 11		인덱스 : 1
//		
//		System.out.println("성적를 입력해주세여");
//		int score = scan.nextInt();
//		for(int i=0; i<5; i++) {
//			if(arr[i]==score) {
//				System.out.println("인덱스"+i);
//			}
//		}
//		
//		
//		
//		
//		
//		
//		
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003	성적 : 45점
		
		System.out.println("학번을 입력해주세요");
		int hakbun = scan.nextInt();
	    for(int i=0; i<5; i++) {
	    	if(hakbuns[i]==hakbun) {
	    		System.out.println(scores[i]);
	    		
	    	}
	    }
		
		
		
		
		
	    
		
		
		
		
		
		
		

	}
	
}
