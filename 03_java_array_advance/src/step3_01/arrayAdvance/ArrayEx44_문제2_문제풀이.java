package step3_01.arrayAdvance;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

//# 빙고 Ver1(플레이어 1명)

public class ArrayEx44_문제2_문제풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int size= 5;
		int binggo = 0;
		int[] mapmini = new int[size*size];
		int[][]map = new int[size][size];
		int add = 0;
		int win =0;
		
		//중복없는 빙고판 임시 빙고판
		for (int i = 0; i < mapmini.length; i++) {
			int number = ran.nextInt(50)+1;
			mapmini[i] = number;
			for (int j = 0; j < i; j++) {
				if(mapmini[i]==mapmini[j]) {
					i--;
				}
			}
		}
		//임시 빙고판 최종빙고판에 대입
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				map[i][j]=mapmini[j]+add;
			}
			add=add+5;
		}
		
		
		
		
		//빙고판 화면출력
		
		while(true) {
			System.out.println("=============빙고=================");
			for (int i = 0; i < 5; i++) {
				System.out.print("\t"+ i);
			}
	
			System.out.println();
			for (int i = 0; i < map.length; i++) {
				System.out.print(i+"\t");
				for (int j = 0; j < map[i].length; j++) {
					System.out.print(map[i][j]+"\t");
				}
				System.out.println();
			}
			if(win==1) {
				System.out.println("빙고");
				break;
			}
			//숫자선택
			System.out.println("x 좌표를 입력해주세요");
			int myx = scan.nextInt();
			System.out.println("y 좌표를 입력해주세요");
			int myy = scan.nextInt();
			
			if(map[myy][myx]!=0) {
				map[myy][myx]=0;
			}
			else if(map[myy][myx]==0) {
				System.out.println("이미 선택되었습니다.");
			}
			
			//승리조건
			//가로
			for (int i = 0; i < size; i++) {
				int cnt = 0;
				for (int j = 0; j < size; j++) {
					if(map[i][j]==0) {
						cnt+=1;
					}
				}
				if(cnt==5) {
					win = 1;
				}
			}
			//세로
			for (int i = 0; i < size; i++) {
				int cnt = 0;
				for (int j = 0; j < size; j++) {
					if(map[j] [i]==0) {
						cnt+=1;
					}
				}
				if(cnt==5) {
					win = 1;
				}
			}
			
			//대각선
			int cnt = 0;
			for (int i = 0; i < size; i++) {
				
				if(map[i][i]==0) {
					cnt++;
				}
				System.out.println("a"+cnt);
				if(cnt==5) {
					win = 1;
				}
			}
			
			// 역 대각선
			cnt =0 ;
			for (int i = 0; i < size; i++) {
				
				if (map[i][(size-1)-i] == 0) {
					cnt+=1;
					System.out.println("b"+cnt);
					}
				if(cnt==5) {
					win = 1;
				}
			}
			
		
	
		}
	
	}

}
