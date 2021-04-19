package step3_01.arrayAdvance;

import java.util.Iterator;
import java.util.Scanner;

// #오목

public class ArrayEx42_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int size = 10;
		int[][] omok = {
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0}
		};
		
		int win = 0;
		int turn = 0;
		//화면 출력
		while(true) {
			System.out.print("  ");
			for (int i = 0; i < omok.length; i++) {
				System.out.print(i+" ");
			}
			System.out.println();
			for (int i = 0; i < omok.length; i++) {
				System.out.print(i+" ");
				for (int j = 0; j < omok.length; j++) {
					System.out.print(omok[i][j]+" ");
				}
				System.out.println();
			}
			
			//승리
			if(win==1) {System.out.println("1p 승");break;}
			if(win==2) {System.out.println("2p 승");break;}
			
			// 게임 진행
			if(turn == 0) {
				System.out.println("0~9 = x의 좌표를 입력해주세요");
				int x = scan.nextInt();
				System.out.println("0~9 = y의 좌표를 입력해주세요");
				int y = scan.nextInt();
				omok[y][x]= 1 ;
				
			}
			else if(turn == 1) {
				System.out.println("0~9 = x의 좌표를 입력해주세요");
				int x = scan.nextInt();
				System.out.println("0~9 = y의 좌표를 입력해주세요");
				int y = scan.nextInt();
				omok[y][x]= 2;
				
			}
			//승리조건 
			
			//가로
			for (int i = 0; i < omok.length; i++) {
				for (int j = 0; j < size-4; j++) {
					if(omok[i][j]==1&&omok[i][j+1]==1&&omok[i][j+2]==1&&omok[i][j+3]==1&&omok[i][j+4]==1) {win=1;}
					if(omok[i][j]==2&&omok[i][j+1]==2&&omok[i][j+2]==2&&omok[i][j+3]==2&&omok[i][j+4]==2) {win=2;}
				}
			}
			//세로검사
			for (int i = 0; i < size-4; i++) {
				for (int j = 0; j <omok.length ; j++) {
					if(omok[i][j]==1&&omok[i+1][j]==1&&omok[i+2][j]==1&&omok[i+3][j]==1&&omok[i+4][j]==1) {win=1;}
					if(omok[i][j]==2&&omok[i+1][j]==2&&omok[i+2][j]==2&&omok[i+3][j]==2&&omok[i+4][j]==2) {win=2;}
				}
			}
			//대각선 검사
			for (int i = 0; i < size-4; i++) {
				for (int j = 0; j <size-4 ; j++) {
					if(omok[i][j]==1&&omok[i+1][j+1]==1&&omok[i+2][j+2]==1&&omok[i+3][j+3]==1&&omok[i+4][j+4]==1) {win=1;}
					if(omok[i][j]==2&&omok[i+1][j+1]==2&&omok[i+2][j+2]==2&&omok[i+3][j+3]==2&&omok[i+4][j+4]==2) {win=2;}
				}
			}
			//역 대각선 감시
			for (int i = 0; i < size-4; i++) {
				for (int j = 9; j >size-6 ; j--) {
					if(omok[i][j]==1&&omok[i+1][j-1]==1&&omok[i+2][j-2]==1&&omok[i+3][j-3]==1&&omok[i+4][j-4]==1) {win=1;}
					if(omok[i][j]==2&&omok[i+1][j-1]==2&&omok[i+2][j-2]==2&&omok[i+3][j-3]==2&&omok[i+4][j-4]==2) {win=2;}
				}
			}
			
			if(turn==0) {turn=1; continue;}
			else if(turn==1) {turn=0;continue;}
			
			
			
		}
		
		
		
		
	
 

	}

}
