package step4_01.string;

import java.util.Scanner;

/*
 * # 문자열 비교
 * 
 * 예)
 * 코끼리
 * 입력 = 티라노사우루스
 * 출력 = false
 */

public class StringEx14_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean is = false;
		String name = "코끼리";

		System.out.print("동물 이름을 입력하세요 : ");			// ex) 티라노사우루스
		String myName = scan.next();
		
	
		
		if(name.length()==myName.length()) {
			for (int i = 0; i < name.length(); i++) {
				if(name.charAt(i)!=myName.charAt(i)) {
					is= false;
				}
				else {is = true;}
			}
		}
		

		if(is) {System.out.println("정답입니다");}
		else {System.out.println("뿔일치");}
	}

}
