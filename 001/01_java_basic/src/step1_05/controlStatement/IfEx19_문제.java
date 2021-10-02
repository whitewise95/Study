package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # ATM[1단계] : 이체하기
 * 
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */

public class IfEx19_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");
	
		System.out.println("이체할 계좌번호를 입력해주세요");
		int enterAcc = scan.nextInt();
		if(enterAcc == yourAcc) {
			System.out.println("얼마를 이체하시겠습니까?");
			int enterMoney = scan.nextInt();
			if(enterMoney <= myMoney) {
				 System.out.println(enterMoney+"원"+" "+"이체되었습니다.");
				 System.out.println(yourAcc+"계좌의 금액은"+(yourMoney+enterMoney)+"남았습니다.");
				 System.out.println(myAcc+"의"+" "+"계좌에는"+(myMoney-enterMoney)+"남았습니다.");
			 }
			else {
				System.out.println("금액이 부족합니다.");
			}
		}
		else {
			System.out.println("계좌번호가 잘못되었습니다.");
		}
		
	}

}
