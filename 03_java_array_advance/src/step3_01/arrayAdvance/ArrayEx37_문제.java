package step3_01.arrayAdvance;


/*
 *	# 2차원배열 기본문제[3단계]
*/

public class ArrayEx37_문제 {

	public static void main(String[] args) {
		
		int[][] arr = {
			{101, 102, 103, 104},
			{201, 202, 203, 204},
			{301, 302, 303, 304}
		}; 
		
		int[] garo = new int[3];
		int[] sero = new int[4];
		
		// 문제 1) 가로 합 출력
		// 정답 1) 410, 810, 1210
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i <3; i++) {
			for (int j = 0; j < 4; j++) {
				
				if(i==0) {
					sum += arr[i][j];
				}
				if(i==1) {
					sum1+= arr[i][j];
				
				}
				if(i==2) {
					sum2 += arr[i][j];
				}
			}
		}
		System.out.println(sum+" "+sum1+" "+sum2+" ");
		
		System.out.println();
		
		
		
		// 문제 2) 세로 합 출력
		// 정답 2) 603, 606, 609, 612
		
		int sum3 = 0;
		int sum4 = 0;
		int sum5 = 0;
		int sum6 = 0;
	    for (int i = 0; i < 4; i++) {
	    	for (int j = 0; j < 3; j++) {
	    		if(i==0) {
	    			sum3 += arr[j][i];
	    		}
	    		if(i==1) {
	    			sum4 += arr[j][i];
	    		}
	    		if(i==2) {
	    			sum5 += arr[j][i];
	    		}
	    		if(i==3) {
	    			sum6 += arr[j][i];
	    		}
			}
			
		}
			
		
		System.out.println(sum3+" "+sum4+" "+sum5+" "+sum6+" ");
		
		
		



	}

}
