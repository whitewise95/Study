package step1_02.variable;

// 산술 연산자 하고 와서 진행
public class VarEx02_문제 {
	//문제 풀기 시작시간 18:10 ~ 끝난시간 18:18 

	public static void main(String[] args) {
		
		//예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력 
			int my = 1000;
			int you = 200;
		
			System.out.println("내돈 : "+my+"원" );
			System.out.println("과자 : "+you+"원" );
			System.out.println("구매후 : "+(my-you)+"원" );
		//문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
			int salary = 100;
			int beforeTax = salary * 12;
			int tax = beforeTax / 10;
			int afterTax = beforeTax - tax;
			System.out.println("세후연봉 = " + afterTax + "원");
			
			
		//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
			int score1 = 30;
			int score2 = 50;
			int score3 = 4;
			int averageScore = (score1+score2+score3)/3;
			System.out.println("평균 : "+averageScore);
			
			
		//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
			int TriangleWidth = 3*6/2;
			System.out.println("삼각형넓이 : "+TriangleWidth);
		
		//문제4) 100초를 1분 40초로 출력
			int m = 100/60;
			int s = 100%60;
			System.out.println(m+"분 "+s+"초");
		
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
			int big = 800/500;
			int small = 8%5;
			
			System.out.println("500원 개수 : "+big+" 100원 개수 : "+small);
			
			



	}

}
