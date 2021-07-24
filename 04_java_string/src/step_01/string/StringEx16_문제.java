package step_01.string;

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
		String str = scan.next();
		
		char[] Ctext = new char[text.length()];
		for (int i = 0; i < Ctext.length; i++) {
			Ctext[i]=text.charAt(i);
		}
		boolean that = false;
		int strSize = str.length();
		for (int i = 0; i < Ctext.length-strSize+1; i++) {
			int cnt = 0;
			
			for (int j = 0; j < strSize; j++) {
				if(Ctext[i+j]==str.charAt(j)) {
					cnt++;
				}
			}
			if(cnt==strSize) {that =true;}
			
		}
	if(that) {System.out.println("true");}
	else {System.out.println("false");}
		
		
	}
}
