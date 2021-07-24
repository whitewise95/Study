package step_01.string;

import java.util.Scanner;

/*
 * # 끝말잇기 게임
 * 
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * 제시어 : 미술
 * 입력 : quit
 * 
 * - 종료 -
 * 
 */

public class StringEx10_문제_다시풀기 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String a = "자전거";
		int temp = a.length();
		while(true) {
		System.out.println("제시어 : "+a);
		System.out.println("입력 : ");
		String answer = scan.nextLine();
		int answerTemp = answer.length();
		if(answer.equals("종료")) {System.out.println("-종료-");break;}
		else if(answer.charAt(0)==a.charAt(temp-1)) {a=answer;}
		}
	}

}
