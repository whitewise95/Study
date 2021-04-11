package step2_01.array;

import java.util.Arrays;
import java.util.Iterator;

/*
 * # 4의 배수만 저장
 * 
 * - arr 배열에서 4의 배수의 개수를 계산하여 temp 배열을 생성한뒤에 
 *   arr배열의 요소들을 temp로 옮겨담자.
 * 

 * 
 */
//
//int  cnt =0;
//
//for (i = 0 i<5 i++) {
//      if(arr[i]%4==0){
//          cnt++;
//
//
//for (i = 0 i<5 i++) {
//    arr[i] = temp[i];
//
//
//보여줘

public class ArrayEx13_문제 {

	public static void main(String[] args) {
		
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		int cnt =0;
		int newCnt = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%4==0) {
				cnt++;
			}
			System.out.println(Arrays.toString(temp));
	
		}
		temp = new int[cnt];
		
		for (int i = 0; i <  arr.length; i++) {
			if(arr[i]%4==0) {
				System.out.println(Arrays.toString(temp));
				temp[newCnt] =arr[i];
				newCnt++;
			}
			System.out.println(Arrays.toString(temp));
		}
		System.out.println(Arrays.toString(temp));
		
	}
	
}
