package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Scanner;

/*
 *	# 관리비
*/

public class ArrayEx38_문제여귀까쮜 {

	public static void main(String[] args) {
		
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
			{1000, 2100, 1300},	
			{4100, 2000, 1000},	
			{3000, 1600,  800}
		};
			
		// 문제 1) 각층별 관리비 합 출력
		// 정답 1) 4400, 7100, 5400
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i==0) {
					sum1 += pay[i][j]; 
				}
				if(i==1) {
					sum2 += pay[i][j]; 
				}
				if(i==2) {
					sum3 += pay[i][j]; 
				}
			}
		}
		System.out.println("1층 : "+sum1);
		System.out.println("2층 : "+sum2);
		System.out.println("3층 : "+sum3);
		
		
		
		
		// 문제 2) 호를 입력하면 관리비 출력
		// 예    2) 입력 : 202	관리비 출력 : 2000
		Scanner scan = new Scanner(System.in);
		
		
//		while(true) {
//			System.out.println("호를 입력해주세요");
//			int myapt = scan.nextInt();
//			
//			for (int i = 0; i < apt.length; i++) {
//				for (int j = 0; j < apt[i].length; j++) {
//					if(myapt==apt[i][j]) {
//						System.out.println(pay[i][j]+"원");
//					}
//				}
//			}
//			
//		}
//		
		
		
		
		
		
		
		
		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		

		
		int x= 0;
		int y= 0;
		int xx = 0;
		int yy= 0;
		int temp = pay[0][0];
		 
		 for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if(temp<pay[i][j]){
					temp = pay[i][j];
					x=i;
					y=j;
					 System.out.println("가장많이 나온집"+(apt[x][y]));
					
				}
			}
		}
	
		 for (int i = 0; i < pay.length; i++) {
				for (int j = 0; j < pay[i].length; j++) {
					 if(temp>pay[i][j]){
							xx=i;
							yy=j;
							
						}
				}
		 }
		 System.out.println("가장적게 나온집"+(apt[xx][yy]));
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		// 문제 4) 호 2개를 입력하면 관리비 교체
		

		 
		 
		 
		 
		
		

	}

}
