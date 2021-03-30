package step2_01.array;

import java.util.Arrays;
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
		   for(int i=0; i<7; i++) {
				System.out.print("["+seat[i]+"]");
		   }	
			System.out.println();
			System.out.println("1. 좌석예매");
			System.out.println("2. 종료");
			int choice = scan.nextInt();
			if(choice==1) {
				
				System.out.println("좌석을 선택해주세요");
				int seatChoice = scan.nextInt();
				getSeat = seatChoice-1;
			
				if(seat[getSeat]=='X') {
					seat[getSeat] = 'o';
					price += 12000;
					System.out.println("예매되었습니다.");
				}
				if(getSeat<0 || getSeat>7) {
					System.out.println("1~7중에 선택해주세요");
					
				}
				else if(seat[getSeat]=='o') {
					System.out.println("예매된 좌석입니다.");
				}
				
			}
			if(choice==2) {
				System.out.println("총판매금액 : "+price);
			}
			
	   }	
		
		
		
	}
	
}

