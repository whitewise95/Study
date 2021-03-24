package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가운데 숫자 맞추기 게임
 * 
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 		249	: 4
 * 	    123 : 2
 * 		771 : 7
 */

public class IfEx20_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("150~250숫자중 가운데 숫자를 입력해주세요");
		int myNumber = scan.nextInt();
		int ranNumber = ran.nextInt(101)+150;
		if(myNumber == ranNumber%100/10) {
			 System.out.println("정답공개"+": "+ranNumber+" "+ "입력하신 답:"+myNumber+"정답입니다.");
			 
		 }
		else {
			System.out.println("정답공개"+": "+ranNumber+" "+"입력하신 답 :"+myNumber+"틀렸습니다.");
		}
		
		
		scan.close();
		
		
	}

}
