package step3_01.arrayAdvance;


import java.util.Arrays;
import java.util.Scanner;

/*
 *	# 2차원배열 기본문제[2단계]
*/

public class ArrayEx36_문제 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		Scanner scan = new Scanner(System.in);
//		
//		
//		System.out.println("인덱스를 입력해주세요");
//		int index1 = scan.nextInt();
//		
//		System.out.println("인덱스를 입력해주세요");
//		int index2 = scan.nextInt();
//		
//		System.out.println(arr[index1][index2]);
//		
//		
//		System.out.println();
		
		
		
		
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		
//		
//		System.out.println("10~90의 값을 입력해주세요");
//		int answer = scan.nextInt();
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				if(arr[i][j]==answer) {
//					System.out.println("인덱스1 : "+i+" "+"인덱스2 : "+j);
//					
//				}
//				
//			}
//			
//		}
		
		
		
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		
//	    int max = arr[0][0];
//	    int x  =  0;
//	    int y  =  0;
//	    
//	    for(int i=0; i<3; i++) {
//	    	for (int j = 0; j<3; j++) {
//				 if (max <arr[i][j]) {
//					x=i;
//					y=j;
//				 }
//			}
//	    }
//	    System.out.println("인덱스 1 : "+x);
//	    System.out.println("인덱스 2 : "+y);
//	   
//		
		
		
		
		
		// 문제 4) 값 2개를 입력받아 값 교체

	    
	    System.out.println("10~90 값 하나를 입력해주세요");
		int answer1 = scan.nextInt();
		
		System.out.println("10~90 값 하나를 입력해주세요");
		int answer2 = scan.nextInt();
		
		int x = 0;
		int y = 0;
		
		int x1 = 0;
		int y1 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == answer1) {
					x=i;
					y=j;
				}
				if (arr[i][j] == answer2) {
					x1 =i ;
					y1 =j;
				}
			}
		}
		int temp = arr[x][y];
		arr[x][y] = arr[x1][y1];
		arr[x1][y1]= temp ;	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print("["+arr[i][j]+"]");
			}
		}



	}

}
