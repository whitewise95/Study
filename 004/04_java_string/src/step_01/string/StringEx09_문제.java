package step_01.string;

import java.util.Random;
import java.util.Scanner;

/*
 * # 타자연습 게임[1단계]
 * 
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */

public class StringEx09_문제 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		String[] words = {"java", "mysql", "jsp", "spring"};

		for (int i = 0; i < 1000; i++) {
			int ranNum = ran.nextInt(4);
			String temp = words[0];
			words[0] =  words[ranNum];
			words[ranNum]=temp;
		}
		
		for (int i = 0; i < words.length;) {
			System.out.println("입력 : "+words[i]);
			String answer = scan.nextLine();
			if(answer.equals(words[i])) {i++;}
		}
		System.out.println("끝");
		
	}

}
