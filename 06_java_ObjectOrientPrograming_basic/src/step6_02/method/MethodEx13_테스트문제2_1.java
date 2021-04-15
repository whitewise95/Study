 package step6_02.method;

import java.util.Scanner;

/*
 * # 영화관 좌석예매 : 클래스 + 메서드
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */

class movie{
	
	int[] seat = new int[5];
	Scanner scan =new Scanner(System.in);
	int tot = 0;
	
	void seat() {
		for (int i = 0; i < seat.length; i++) {
			if(seat[i]==0) {System.out.print("o, ");}
			else if(seat[i]==1) {System.out.print("x, ");}
		}
		System.out.println();
	}
	void purchase(){
		System.out.println("좌석 index를 입력해주세요");
		int choice = scan.nextInt();
		if(seat[choice-1]==0) {seat[choice-1] = 1; tot+=12000;}
		else if(seat[choice-1]==1) {System.out.println("이미 예매된 좌석입니다.");}
		}
	
	void result() {
		System.out.println("--------------------");
		System.out.println("매출액 : "+tot+"원");
		
		
	}
	
	void choice() {
		System.out.println("[1] 예매하기");
		System.out.println("[2] 종료하기");
		System.out.println("선택 : " );
		int choice = scan.nextInt();
		if(choice==1) {purchase();}
		else if(choice==2) {result();}
	}
	

	
	void run() {
		while(true) {
			seat();
			choice();
			
		}
		
		
		
		
	}
	
	
	
	}



public class MethodEx13_테스트문제2_1 {

	public static void main(String[] args) {

		movie megabox = new movie();
		megabox.run();
		
	}

}
