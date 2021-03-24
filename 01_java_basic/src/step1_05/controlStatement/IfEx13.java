package step1_05.controlStatement;



/*
 * 랜덤 라이브러리 ( if와 관련 x)
 * 
 * 
 * */


import java.util.Random;

public class IfEx13 {

	public static void main(String[] args) {
		
		
		
		Random ran = new Random();
		int rNum1 = ran.nextInt(10);  // 1~9 사이에 랜덤으로 나온다  
		System.out.println(rNum1);
		
		// 100~ 200 사이의 랜덤 값
		int rNm2 = ran.nextInt(101) + 100;
		System.out.println(rNm2);
		
		int rNum3 = ran.nextInt(7)-3;
		System.out.println(rNum3);
		
		
		//  scan.nextInt()
		//  scan.nextInt(범위) < 이래야 랜덤으로 돌아감
		
	}

}
