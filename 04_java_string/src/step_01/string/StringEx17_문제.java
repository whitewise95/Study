package step_01.string;

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
			arr[i] = text.charAt(i);
		}
		int startIndex = 0;
		int wordSize  = word.length();
		boolean isCheck = false;
		
		
		
	
		for (int i = 0; i < arr.length-wordSize+1; i++) {
			
			int checkCnt = 0;
			
			for (int j = 0; j < wordSize; j++) {
				if(arr[i+j] == word.charAt(j)) {
					checkCnt ++;
				}
			}
			if(checkCnt == wordSize) {
				startIndex = i;
				isCheck = true;
			}
		}
		System.out.print("변경할 단어를 입력하세요 : ");
		word = scan.nextLine();
		
		if(isCheck) {
			char temp[] = arr;
			String first = "";
			String last = "";
			for (int i = 0; i < startIndex; i++) {
				first += temp[i];
				
			}
			for (int i = startIndex+wordSize ; i < temp.length; i++) {
				last += temp[i];
			}
			
			System.out.println(first + word + last);
		}
		else {
			System.out.println("그런단어는 존재하지 않습니다.");
		}
		 scan.close();
		
		
	
	}

}
