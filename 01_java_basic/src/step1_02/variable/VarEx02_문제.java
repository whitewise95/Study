package step1_02.variable;

// 산술 연산자 하고 와서 진행
public class VarEx02_문제 {

	public static void main(String[] args) {
		
		//예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력 
		
		int cash = 1000;
		int snack = 200;
		int change = cash - snack;
		System.out.println("잔돈 = " + change + "원");
		
		//문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		int monthPay = 100;
		int year = 12;
		double tax = 0.9;
		System.out.println("연봉(세후)="+ (monthPay * year)*tax +"원"  );
	   
		//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
		int exam1 = 30;
		int exam2 = 50;
		int exam3 = 4;
		System.out.println("평균 ="+(exam1+exam2+exam3)/3+"점");
				
		//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		int length = 3;
		int breadth = 6;
		System.out.println("삼각형넓이="+(length*breadth/2));
		//문제4) 100초를 1분 40초로 출력
		int min = 100;
		int sec = 60;
		System.out.println((min/sec)+"분"+(min%sec)+"초");
		
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		int big = 800;
		int small = 500;
		System.out.println("500원개수 :"+(big/small)+"개" + "100원 개수 :"+(big%small/100)+"개");
		//정답5) 500원(1개), 100원(3개) 


	}

}
