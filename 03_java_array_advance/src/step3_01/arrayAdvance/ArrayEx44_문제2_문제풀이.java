package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

//# 빙고 Ver1(플레이어 1명)






public class ArrayEx44_문제2_문제풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int max = 5;
		int size = 50;
		int[][] bingo = new int[max][max];
		int [] temp = new int[max*max];
		int win = 0;
		int turn = 0;
		
		
		//빙고판 중복없이
		
		for (int i = 0; i <  max*max; i++) {
			temp[i] = ran.nextInt(size)+1;
			for (int j = 0; j < i; j++) {
				if(temp[i]==temp[j]) {i--;}
			} 
		}
	
		//빙고판 대입
		int k = 0;
		for (int i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				bingo[i][j] = temp[k];
				k++;
			}
		}
		while(true) {
			//화면 출력 
			System.out.print(" ");
			for (int i = 0; i < max; i++) {
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\t");
			}
			System.out.println();
			for (int i = 0; i < bingo.length; i++) {
				System.out.print(i);
				System.out.print(" ");
				for (int j = 0; j < bingo[i].length; j++) {
					System.out.print(bingo[i][j]+"\t");
				}
				System.out.println("\n");
			}
			
			
			//승리
			
			if(win==1) {System.out.println("1p 승");break;}
			
			
			//진행
			System.out.println("x의 좌표를 입력  :  ");
			int x = scan.nextInt();
			System.out.println("y의 좌표를 입력  :  ");
			int y = scan.nextInt();
			
			if(bingo[y][x]!=0) {bingo[y][x]=0;}
			else {System.out.println("이미 입력된 좌표입니다.");}
			
			
			
			// 승패 조건
			
			//가로 스캔
			for (int i = 0; i < bingo.length; i++) {
				for (int j = 0; j < 1; j++) {
					if(bingo[i][j]==0&&bingo[i][j+1]==0&&bingo[i][j+2]==0&&bingo[i][j+3]==0&&bingo[i][j+4]==0) {win=1;}
				}
			}
			
			//세로 스캔
			for (int i = 0; i < 1; i++) {
				for (int j = 0; j < bingo.length; j++) {
					if(bingo[i][j]==0&&bingo[i+1][j]==0&&bingo[i+2][j]==0&&bingo[i+3][j]==0&&bingo[i+4][j]==0) {win=1;}
				}
			}
			//대각선 스캔
					for (int i = 0; i < 1; i++) {
						for (int j = 0; j < 1; j++) {
							if(bingo[i][j]==0&&bingo[i+1][j+1]==0&&bingo[i+2][j+2]==0&&bingo[i+3][j+3]==0&&bingo[i+4][j+4]==0) {win=1;}
						}
					}
			//역대각선 스캔
					for (int i = 0; i < 1; i++) {
						for (int j = 4; j > 3; j--) {
							if(bingo[i][j]==0&&bingo[i+1][j-1]==0&&bingo[i+2][j-2]==0&&bingo[i+3][j-3]==0&&bingo[i+4][j-4]==0) {win=1;}
						}
					}
		}
		
		
		
	}

}
