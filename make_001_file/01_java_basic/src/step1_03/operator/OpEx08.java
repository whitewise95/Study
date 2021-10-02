package step1_03.operator;

/*
 * 
 * 삼항 연산자 
 * 
 * [ 형식 ]
 * 
 *  조건식 ? 참일때의 결과값 : 거짓일때의 결과값
 * 
 * 
 * */




public class OpEx08 {

	public static void main(String[] args) {

	   	 // int a = 100; 2항
	   			 // x++ 단일항
		int totalgrade = 60;
		System.out.println(totalgrade >= 60 ? "합격" : "불합격");
		System.out.println(totalgrade < 60 ? "합격" : "불합격");
		
		
		char result = totalgrade >= 60 ? 'P' : 'F';
		System.out.println(result);
		
	}

}
