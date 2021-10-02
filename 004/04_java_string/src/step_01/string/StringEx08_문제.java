package step_01.string;

import java.util.Arrays;

public class StringEx08_문제 {

	public static void main(String[] args) {
		
		// 문제) 이름과 성적을 하나의 문자열로 연결
		// 정답) "김철수/87,이만수/42,이영희/95"
		
		String[] name = {"김철수", "이만수", "이영희"};
		int[] score = {87, 42, 95};
		String[] strScore = new String[3];
		String[] tot = new String[3];
		
		for (int i = 0; i < 3; i++) {
			strScore[i] =Integer.toString(score[i]); 
			
		}
		for (int i = 0; i < 3; i++) {
			tot[i] = name[i];
			tot[i] += "/";
			tot[i] +=  strScore[i];
			tot[i] += ",";
		}
		for (int i = 0; i < tot.length; i++) {
			System.out.print(tot[i]);
		}
		 
		

	}

}
