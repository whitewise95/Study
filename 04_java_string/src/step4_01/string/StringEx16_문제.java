package step4_01.string;

import java.util.Scanner;

/*
 * # 단어 검색
 * 
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */

public class StringEx16_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();
		char[] cText = new char[text.length()];
		
		for (int i = 0; i < cText.length; i++) {
			cText[i]=text.charAt(i);
		}
		int textsize = word.length();
		boolean isSame = false;
		for (int i = 0; i < cText.length-textsize+1; i++) {
			int cnt =0;
			for (int j = 0; j < textsize; j++) {
				if(cText[i+j]==word.charAt(j)) {
					cnt++;
				}
				
			}
			if(cnt==textsize) {
				isSame=true;
			}
		}
		
		if(isSame) {System.out.println("일치");}
		else {System.out.println("불일치");}
		
		
		
		
		
		
		
		
		
		
		
	}
}
