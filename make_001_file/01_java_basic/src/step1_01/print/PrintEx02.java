package step1_01.print;

public class PrintEx02 {

	public static void main(String[] args) {

		// 자료형에(data type)에 알맞는 출력
		
		//1-1) 정수 : 소수점이 없는 수
		System.out.println(7);
		
		//1-2) 실수 : 소수점이 있는 수
		System.out.println(3.141592);
		
		//1-3) 문자 : 단일문자 ( 홑따옴표 , 싱글쿼터 , 싱글쿼테이션 )
		System.out.println('@');
		
		//1-4) 문자열 : 글자 ( 쌍따옴표, 더블쿼터 , 더블쿼테이션 )
		System.out.println("WEB CLASS");
		
		//1-5) 불리언 : 참 or 거짓
		System.out.println(true);
			
		System.out.println();
		
		
		// 2. 복수의 데이터 출력 ( , 가 아닌  + 를 사용한다. )
		
		//System.out.println(1,3,5); error
		System.out.println(1 + 3 + 5);
		System.out.println(1 + "" + 3 + "" + 5);
		System.out.println(1 + " " + 3 + " " + 5);
		System.out.println(1 + " , " + 3 + " , " + 5);
		
		// 2-1) 문자열 + 문자열 = 문자열
		System.out.println("3" + "7");
		
		// 2-2) 숫자 + 숫자     = 숫자
		System.out.println(3 + 7);
		
		// 2-3) 문자열 + 숫자   = 문자열
		System.out.println("3" + 7);
		
		// 2-4) 숫자 + 문자열   = 문자열
		System.out.println(3 + "7");
		
		System.out.println("더하기 =" + 3 + 7);
		System.out.println("더하기 =" + (3 + 7));
		
	}

}
