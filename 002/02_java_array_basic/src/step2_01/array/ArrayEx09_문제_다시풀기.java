package step2_01.array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/* 15:27~
 * 
 * # 영화관 좌석예매
 * 
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * [X] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 1
 * [X] [O] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 
 * [X] [O] [X] [O] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 *
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 이미 예매가 완료 되었습니다.
 * 
 * [X] [O] [X] [O] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (2번 입력)
 * ----------------------
 * 매출액 : 24000원
 * 
 */


public class ArrayEx09_문제_다시풀기 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char seat[] = {'X','X','X','X','X','X','X'};
	   int  price = 0;
	   int getSeat = 0;
	
	   
	   
	   while(true) {
		   System.out.println("=======메가씨네마======");
		   for (int i = 0; i < seat.length; i++) {
			   System.out.print("["+seat[i]+"]");
		}
		   System.out.println();
		   System.out.println("========메뉴==========");
		   System.out.println("[1] 예매하기");
		   System.out.println("[2] 종료하기");
		   System.out.println("선택 : ");
		   
		   int answer = scan.nextInt();
		   
		   if(answer==1) {
			   System.out.println("좌석을 0~6중 선택해주세요 : ");
			   int answer1 = scan.nextInt();
			   if(seat[answer1] == 'X') {
				   System.out.println("예매되었습니다.");
				   seat[answer1] = 'ㅇ';
				   price += 12000;
			   }
			   else if(seat[answer] == 'ㅇ') {
				   System.out.println("이미 예매된 좌석입니다.");
				   continue;
			   }
		   }
		   else if(answer==2) {
			   System.out.println("--------------");
			   System.out.println("매출액"+price+"원");
			   break;
		   }
		   
		   
		   
	   }
   
	   

		
	}
	
}

