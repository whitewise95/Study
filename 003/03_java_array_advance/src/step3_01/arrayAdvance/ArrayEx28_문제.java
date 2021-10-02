package step3_01.arrayAdvance;

import java.util.Random;

/*
 * # 중복숫자 금지[2단계]
 * 
 * 1. arr배열에 1~10 사이의 랜덤 숫자 5개를 저장한다.
 * 2. 단 중복되는 숫자가 없어야 한다.
 */


public class ArrayEx28_문제 {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[5];
		int i =0;
		int j =0;
		int check = 0;
		
		while(i<5) {
			int num = ran.nextInt(10)+1;
			 j =0;
		   check = 1;
		   
		   while(j < i) {
			   if(arr[j]==num) {
				   check = -1;
			   }
			   j++;
			 
			  
		   }
		   if(check==1) {
			   arr[i]=num;
			   i++;
		   }
		   
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]+",");
		}
		System.out.println();
		
		

			
	
		
		
		
	}
	
}
