package step1_05.controlStatement;

import java.util.Random;

/*
 * 19:11~19:23
 * # 369게임[1단계]
 * 
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 * 	1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 * 		33	 : 짝짝
 * 		16	 : 짝
 * 		 7	 : 7
 */

public class IfEx21_문제 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int ranNum = ran.nextInt(50)+1;
		int cnt = 0;
	
		if(ranNum>10) {
			int temp = ranNum/10;
			if(temp==3) {
				cnt++;
				temp =ranNum-(temp*10);
				if(temp%3==0) {
					cnt++;
				}
			}
		}
		else if(ranNum<10) {
			if(ranNum%3==0) cnt++;
		}
		if(cnt==2) System.out.println(ranNum+" : "+"짝짝");
		else if(cnt==1) System.out.println(ranNum+" : "+"짝");
		else System.out.println(ranNum+" : "+ranNum);
		
	}

}
