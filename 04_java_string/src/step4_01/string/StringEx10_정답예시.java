package step4_01.string;

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

public class StringEx10_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String start = "자전거";
		
		while (true) {
			
			int size = start.length();
			System.out.println("제시어 : " + start);
			
			System.out.print("입력 : ");
			String myWord = scan.next();
			
			if (myWord.equals("quit")) {
				System.out.println("- 종료 - ");
				break;
			}
			
			if (start.charAt(size - 1) == myWord.charAt(0)) {
				start = myWord;
			}
		}

		scan.close();
		
	}

}
