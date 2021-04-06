package step4_01.string;

import java.util.Arrays;

public class StringEx08_문제 {

	public static void main(String[] args) {
		
		// 문제) 이름과 성적을 하나의 문자열로 연결
		// 정답) "김철수/87,이만수/42,이영희/95"
		
		String[] name = {"김철수", "이만수", "이영희"};
		int[] score = {87, 42, 95};
		String [] sScore = new 	String[3];
		String str = "";
				
		for (int i = 0; i < sScore.length; i++) {
			 str +=name[i];
			 str += "/";
			 str += score[i]+"";
			 if(i<name.length-1) {
				 str+= "," ;
			 }
		}
		System.out.println(str);
			
		
		
	
		

	}

}
