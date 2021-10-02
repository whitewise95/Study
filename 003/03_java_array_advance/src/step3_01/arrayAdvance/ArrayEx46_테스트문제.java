package step3_01.arrayAdvance;

import java.util.Random;

/*
 * # 1부터 5사이의 랜덤 숫자를 2개씩 arr 배열에 저장하기
 * 예) 1 3 2 1 4 4 5 2 3 5
 * 
 *  - 1부터 5까지 숫자를 2개씩 넣고 셔플로 이용해서 섞지 말것
 * 
 */

public class ArrayEx46_테스트문제 {

	public static void main(String[] args) {

		Random ran = new Random();
		int arr[] = new int[10]; 
		int temp[] = new int[10]; 
		
		int i= 0;
	
		
		
		while(i<10) {
			int j= 0;
			int check = 1;
			int cnt = 0;
			int num = ran.nextInt(5)+1;
			
			

			while(j<i){
				if(arr[j]==num) {
					cnt++;
				}
				if(cnt==2) {
					check = -1;
				}
				j++;
			}
			if(check == 1) {
				arr[i]=num;
						i++;
			}
			
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+",");
		}
		System.out.println();
		
	}

}
