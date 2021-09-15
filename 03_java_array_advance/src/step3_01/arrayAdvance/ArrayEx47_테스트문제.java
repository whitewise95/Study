package step3_01.arrayAdvance;

import java.util.Scanner;

/*
문제1) 숫자 0이 플레이어이다. 
	    
	    1) left 2)right 3)up 4)down 5)되감기
		번호를 입력받고 해당위치로 이동 ==> 이동할때 값을 서로 교환한다. 
		 예) 1 ==> 
		
	    {1,2,3,4},
		{5,6,7,8},
		{9,10,11,12},
		{13,14,0,15}		
		 
		
문제2) 심화  ==> 한칸한칸이동할때마다 yx 에 배열에 이동한경로를 저장했다가 
 	5번입력시 ==> 왔던길로 되돌아가기 한다.
 	
*/

public class ArrayEx47_테스트문제 {

	public static void main(String[] args) {
		
		int game[][] = {
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,0}
				};
		int x = 0;
		int y = 0;
		int yx [][] = new int[10000][2];
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			for (int i = 0; i < game.length; i++) {
				for (int j = 0; j < game[i].length; j++) {
					System.out.print(game[i][j]);
					if(j != game[i].length-1) {
						System.out.print(",");
					}
				}
				System.out.println();
			}
			System.out.println("4) left 6)right 8)up 2)down 5)되감기");
			int sel = scan.nextInt();
			if(sel == 4) {
				for (int i = 0; i < game.length; i++) {
					for (int j = 0; j < game[i].length; j++) {
						if(game[i][j]==0) {
							x=j;
							y=i;
						}
					}
				}
				if(x>0) {
					int temp = game[y][x-1];
					game[y][x-1] = game[y][x];
					game[y][x] = temp;
				}
				else {
					continue;
				}
			}
			else if(sel == 6) {
				for (int i = 0; i < game.length; i++) {
					for (int j = 0; j < game[i].length; j++) {
						if(game[i][j]==0) {
							x=j;
							y=i;
						}
					}
				}
				if(x<3) {
					int temp = game[y][x+1];
					game[y][x+1] = game[y][x];
					game[y][x] = temp;
				}
				else {
					continue;
				}
			}
			else if(sel == 8) {
				for (int i = 0; i < game.length; i++) {
					for (int j = 0; j < game[i].length; j++) {
						if(game[i][j]==0) {
							x=j;
							y=i;
						}
					}
				}
				if(y>0) {
					int temp = game[y-1][x];
					game[y-1][x] = game[y][x];
					game[y][x] = temp;
				}
				else {
					continue;
				}
			}
			else if(sel == 2) {
				for (int i = 0; i < game.length; i++) {
					for (int j = 0; j < game[i].length; j++) {
						if(game[i][j]==0) {
							x=j;
							y=i;
						}
					}
				}
				if(y<3 ) {
					int temp = game[y+1][x];
					game[y+1][x] = game[y][x];
					game[y][x] = temp;
				}
				else {
					continue;
				}
			}
			else if(sel == 5) {}
			else {
				
			}
			System.out.println("=========================================");
			System.out.println("=========================================");
			
		
		}
	}

}
