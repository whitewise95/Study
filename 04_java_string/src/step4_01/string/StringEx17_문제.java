package step4_01.string;

import java.util.Scanner;

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

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();
		char[] arr = new char[text.length()];
		for (int i = 0; i < text.length(); i++) {
			arr[i]=text.charAt(i);
		}
		
		int wordsize = word.length();
		boolean is = false;
		int first = 0;
		int last = 0;
		for (int i = 0; i < arr.length-wordsize+1; i++) {
			int cnt = 0;
			for (int j = 0; j<word.length(); j++) {
				if(arr[i+j]==word.charAt(j)) {
					cnt++;
				}
				
				}
			if(cnt==wordsize) {
				first = i;
				is = true;
			}
			
		}
		if(is) {
			int firstText = first;
			int lastText = first+word.length();
			char[] temp = arr;
			String front = "";
			String back = "";
			System.out.println("바꾸고 싶은 단어를 써주세요 : ");
			String change = scan.next();
			
			for (int i = 0; i < firstText; i++) {
				front += temp[i];
			}
			for (int i = lastText; i <temp.length;  i++) {
				back += temp[i];
			}
			String fullText = front+change+back;
			System.out.println(fullText);
		}
		else {System.out.println(" 그런 단어는 존재 하지않습니다.");}
		
		
		
		
		
		
	}

}
