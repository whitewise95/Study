package step4_01.string;

import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

/*
 * # 단어 교체하기(replace)
 * 
 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
 * 2. 교체해주는 기능을 구현한다.
 * 예)
 * 		Life is too short.
 * 		변경하고 싶은 단어입력 : Life
 * 		바꿀 단어입력 : Time
 * 
 * 		Time is too short.
 */


public class StringEx17_문제 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x = 0;
		int y = 0;
		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();
		char[] cText = new char[text.length()];
		int size = word.length();
		boolean that = false;
		for (int i = 0; i < cText.length; i++) {
			cText[i] = text.charAt(i);
		}
		for (int i = 0; i < cText.length-size+1; i++) {
			int cnt =0;
			for (int j = 0; j < size; j++) {
				if(cText[i+j]==word.charAt(j)) {
					x=i;
					y=j;
					cnt++;
				}
			}
			if(cnt==size) {that=true;}
		}
		if(true) {
			System.out.println("변경할 단어를 입력해주세요");
			String change =scan.next();
			char[] cChange = new char[change.length()];
			for (int i = 0; i < cChange.length; i++) {
				cChange[i]=change.charAt(i);
			}
			int j = 0;
			for (int i = x; i < change.length(); x++) {
				cText[i]=cChange[j];
				j++;
				System.out.println(j);
				System.out.print(cText[i]);
			}
			System.out.println();
			for (int i = 0; i < cText.length; i++) {
				System.out.print(cText[i]);
			}
			
		}
	}

}
