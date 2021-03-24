package step1_04.inputfunction;

import java.util.Scanner;

//3월18일 17:06~

public class InputEx02_문제 {

	public static void main(String[] args) {
	
		// 문제1) 숫자 2개를 입력받아서 합 출력
		Scanner scan = new Scanner(System.in);
	    System.out.println("한 숫자를 입력해주세요"); 
	    int sum1 = scan.nextInt();
	    System.out.println("두번째 숫자 를 입력해주세요");
	    int sum2 = scan.nextInt();
	    System.out.println("두 숫자의 합은" +(sum1+sum2)+"입니다.");
	    scan.close();
	    
		// 문제2) 숫자 1개를 입력받아서 , 홀수이면 true 출력
	
	    System.out.println("한 숫자를 입력해주세요"); 
	    int number = scan.nextInt();
	    
	    scan.close();
		// 문제3) 성적을 입력받아, 60점 이상이고 100점 이하이면 true 출력
		
	}
	
}
