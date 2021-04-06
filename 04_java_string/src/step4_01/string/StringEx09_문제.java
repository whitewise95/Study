package step4_01.string;

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
		for (int i = 0; i <1000; i++) {
			int r = ran.nextInt(words.length);
			String temp = words[0];
			words[0]=words[r]; 
			words[0]=temp;
		}
		int i= 0;
		while(i<5) {
			
				System.out.println("문제 "+(i+1)+" : "+words[i]);
				System.out.println("입력 : ");
				String myanswer = scan.next();
				if(myanswer.equals(words[i])) {
					i++;
				}
			break;
		
		}
		
	}

}
