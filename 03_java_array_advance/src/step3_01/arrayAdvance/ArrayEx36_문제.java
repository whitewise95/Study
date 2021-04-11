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

		
		
		
		
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		
//		 System.out.println("10~90 값 하나를 입력해주세요");
//			int x = scan.nextInt();
//			int xx=0;
//			int yy=0;
//			
//			for (int i = 0; i < arr.length; i++) {
//				for (int j = 0; j < arr[i].length; j++) {
//					if(arr[i][j]== x) {
//						xx=i;
//						yy=j;	
//					}
//				}
//			}
//			System.out.println("인덱스1 : "+xx);
//			System.out.println("인덱스2 : "+yy);
//	

		
		
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		
//				
//				int temp = arr[0][0];
//				int xx=0;
//				int yy=0;
//				
//				for (int i = 0; i < arr.length; i++) {
//					for (int j = 0; j < arr[i].length; j++) {
//						if(arr[i][j]>temp) {
//							xx=i;
//							yy=j;	
//						}
//					}
//				}
//				System.out.println("인덱스1 : "+xx);
//				System.out.println("인덱스2 : "+yy);
//		

		
		
		
		
		// 문제 4) 값 2개를 입력받아 값 교체

	    int temp1 =0;
	    int temp2 =0;
	    
	    int x =  0;
	    int y =  0;
	    int xx =  0;
	    int yy =  0;
	
	    System.out.println("10~90 값 하나를 입력해주세요");
		int answer1 = scan.nextInt();
		
		System.out.println("10~90 값 하나를 입력해주세요");
		int answer2 = scan.nextInt();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(answer1==arr[i][j]) {
					x=i;
					y=j;
				}
				if(answer2==arr[i][j]) {
					xx=i;
					yy=j;
				}
			}
		}
		
		temp1=arr[x][y];
		arr[x][y]=arr[xx][yy];
		arr[xx][yy] =temp1;
		for (int i = 0; i < arr.length; i++) {
		
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
			
		
		
		

	}

}
