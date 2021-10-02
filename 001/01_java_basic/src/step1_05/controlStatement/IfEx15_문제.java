package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 당첨복권[1단계] 
 * 
 * 30%의 확률로 화면에 '당첨'이라는 글자가 화면에 출력된다.
 * 당첨되지 않은 경우는 '꽝'이라는 글자가 화면에 출력된다.
 */


public class IfEx15_문제 {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("복권을 긁으시겠습니까?"+" yes=1"+" "+"no=2");
		int my = scan.nextInt();
		if(my==1) {
			int lottery = ran.nextInt(4);
			if(3 == lottery) {
				System.out.println("당첨");
				
			}
			if(3 != lottery ) {
				System.out.println("꽝");
			}
		}
		
		if(my!=1) {
			System.out.println("끝");
		}
		
		
		scan.close();
		
		
	}

}
