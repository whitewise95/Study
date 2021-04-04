package step3_01.arrayAdvance;

import java.util.Iterator;
import java.util.Scanner;

// #오목

public class ArrayEx42_문제2_풀기 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
int size = 10;
int turn = 0;
int win = 0;
int[][] omok = {
		{0,0,0,0,0,0,0,0,0,0,},
		{0,0,0,0,0,0,0,0,0,0,},
		{0,0,0,0,0,0,0,0,0,0,},
		{0,0,0,0,0,0,0,0,0,0,},
		{0,0,0,0,0,0,0,0,0,0,},
		{0,0,0,0,0,0,0,0,0,0,},
		{0,0,0,0,0,0,0,0,0,0,},
		{0,0,0,0,0,0,0,0,0,0,},
		{0,0,0,0,0,0,0,0,0,0,},
		{0,0,0,0,0,0,0,0,0,0,},
};
	
		while(true) {
			//메인화면(오목판)
			System.out.println("========오목=========");
			System.out.print("  ");
			for (int i = 0; i < omok.length; i++) {
				System.out.print(i+" ");
			}
			System.out.println();
			for (int i = 0; i < 10; i++) {
				System.out.print(i+" ");
				for (int j = 0; j < 10; j++) {
					System.out.print(omok[i][j]+" ");
				}
				System.out.println();
			}
			//승리
			System.out.println("승리");
			if(win==1) {
				System.out.println("1p가 승리했습니다.");
				break;
			}
			
			else if(win==2) {
				System.out.println("2p가 승리했습니다.");		
				break;
			}
			
			//진행
			if(turn%2==0) {//1p
				System.out.println("1p차례입니다.");
				System.out.println("x의 좌표를 입력해주세요");
				int x1 = scan.nextInt();
				System.out.println("y의 좌표를 입력해주세요");
				int y1 = scan.nextInt();
				if(omok[y1][x1]==0) {
					omok[y1][x1] = 1;
					turn +=1;
				}

			}
			else if(turn%2!=0) {//2p
				System.out.println("2p차례입니다.");
				System.out.println("x의 좌표를 입력해주세요");
				int x2 = scan.nextInt();
				System.out.println("y의 좌표를 입력해주세요");
				int y2 = scan.nextInt();
				if(omok[y2][x2]==0) {
					omok[y2][x2] = 2;
					turn +=1;
				}
				
				
			}
			
			
			//승리조건
			//가로
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size-4; j++) {
					if(omok[i][j]==1&&omok[i][j+1]==1&&omok[i][j+2]==1&&omok[i][j+3]==1&&omok[i][j+4]==1) {win=1;}
					if(omok[i][j]==2&&omok[i][j+1]==2&&omok[i][j+2]==2&&omok[i][j+3]==2&&omok[i][j+4]==2) {win=2;}
				}
			}
			//세로
			for (int i = 0; i <size-4; i++) {
				for (int j = 0; j < size; j++) {
					if(omok[i][j]==1&&omok[i+1][j]==1&&omok[i+2][j]==1&&omok[i+3][j]==1&&omok[i+4][j]==1) {win=1;}
					if(omok[i][j]==2&&omok[i+1][j]==2&&omok[i+2][j]==2&&omok[i+3][j]==2&&omok[i+4][j]==2) {win=2;}
				}
			}
			//대각선
			for (int i = 0; i <size-4; i++) {
				for (int j = 0; j <size-4; j++) {
					if(omok[i][j]==1&&omok[i+1][j+1]==1&&omok[i+2][j+2]==1&&omok[i+3][j+3]==1&&omok[i+4][j+4]==1) {win=1;}
					if(omok[i][j]==2&&omok[i+1][j+1]==2&&omok[i+2][j+2]==2&&omok[i+3][j+3]==2&&omok[i+4][j+4]==2) {win=2;}
				}
			}
			//역 대각선
			for (int i = 9; i > size-7; i--) {
				for (int j = 0; j < size-4; j++) {
					if(omok[i][j]==1&&omok[i-1][j-1]==1&&omok[i-2][j-2]==1&&omok[i-3][j-3]==1&&omok[i-4][j-4]==1) {win=1;}
					if(omok[i][j]==2&&omok[i+1][j+1]==2&&omok[i+2][j+2]==2&&omok[i+3][j+3]==2&&omok[i+4][j+4]==2) {win=2;}
				}
			}
		
			
			
			
			
			
			
			
			
			
			
			
		}
		scan.close();
		
		
		
	
	}

}
