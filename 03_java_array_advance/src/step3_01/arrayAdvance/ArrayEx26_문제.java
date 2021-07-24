package step3_01.arrayAdvance;

import java.util.Random;
import java.util.Scanner;

/* 
 * # 1 to 50[3단계] : 1 to 18
 * 
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */


public class ArrayEx26_문제 {

	public static void main(String[] args) {		final int SIZE = 9;
		Scanner scan = new Scanner(System.in);
		Random ran = new Random(); 
		int[] front = new int[SIZE];
		int[] back  = new int[SIZE];
		int cnt = 1;
		
		for (int i = 0; i < front.length; i++) {
			front[i] = i+1;
		}
		for (int i = 0; i < 9; i++) {
			back[i] = i+10;
		}
		
		for (int i = 0; i < 1000; i++) {
			int x =ran.nextInt(8)+1;
			int temp = front[0];
			front[0] =  front[x];
			front[x] = temp;
			int temp2 = back[0];
			back[0] =  back[x];
			back[x] = temp2;
		}
		
		

		
		
		
		
		while(true) {
			for (int i = 0; i < front.length; i++) {
				System.out.print(front[i]+",");
			}
			System.out.println();
			int index = scan.nextInt();
			if(cnt<10) {
				if(cnt==front[index-1]) {
					front[index-1] = back[index-1];
					cnt++;
				}
				
			}
			else if(cnt>=10){
				if(cnt==front[index-1]) {
					front[index-1] = 0;
					cnt++;
				}
			}
			
			if(cnt==19) {
				System.out.println("수고하셨습니다.");
				break;
			}
		}
		
		
		
		
	}
	
}
