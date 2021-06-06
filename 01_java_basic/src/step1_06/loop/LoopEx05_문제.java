package step1_06.loop;

import java.util.Scanner;

/*
 *  17시~17:40
 * 
 * # 영수증 출력[2단계]
 * 1. 5번 주문을 받는다.
 * 2. 주문이 끝난 후, 돈을 입력받는다.
 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
 * 
 * 예)
 * 메뉴 선택 : 1
 * 메뉴 선택 : 1
 * 메뉴 선택 : 2
 * 메뉴 선택 : 2
 * 메뉴 선택 : 3
 * 총 금액 = 31300원
 * 현금 입력 : 32000
 * === 롯데리아 영수증 ===
 * 1. 불고기 버거 : 2개
 * 2. 새우    버거 : 2개
 * 3. 콜         라 : 1개
 * 4. 총   금   액 : 31300원
 * 5. 잔         돈 : 700원
 */


public class LoopEx05_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
				
		int sum = 0;
		int i = 1;
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		int count1 = 0;
	    int count2 = 0;
		int count3 = 0;
		
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		
		while(i<6) {
		System.out.println("메뉴를 선택해주세요");
		int mymenu = scan.nextInt();
		if(1==mymenu) {
			count1 = count1 +1;
			 sum = sum+price1;
		}
		if(2==mymenu) {
			 count2 = count2 +1;
			 sum = sum+price2;
		}
		if(3==mymenu) {
			 count2 = count2 +1;
			 sum = sum+price3;
		}	
		i++; 
		}
		System.out.println("현금은 입력해주세요");
		int myMoney = scan.nextInt();
		 if(myMoney>=sum) {
		
			 System.out.println("불고기버거"+count1+"개");
			 System.out.println("새우  버거"+count2+"개");
			 System.out.println("콜      라"+count3+"개");		
			 System.out.println("총  금  액"+sum+"원");
			 System.out.println("잔      돈"+(myMoney-sum)+"원");
		 }
		 else {
			 System.out.println("현금이 부족합니다.");
		 }
		
		
		
	
		
		
		
		 scan.close();	
	}

}
