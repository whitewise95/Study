package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 코인 게임
 * 
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */

public class IfEx14_문제 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("앞:0,뒤:1");
		int my = scan.nextInt();
		int coin = ran.nextInt(2);
		System.out.println("동전은"+coin+"입니다");
		if(coin==my) {
			System.out.println("맞췄습니다");
		}
		if(coin != my) {
			System.out.println("틀렸습니다.");
		}


		scan.close();
		

	}

}
