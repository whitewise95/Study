package step3_01.arrayAdvance;

import java.util.Arrays;
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
		Scanner scan = new Scanner(System.in);
		
		int size = 5;
		int game[][] = {
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,0}
				};
		int[][] game2 ={
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,0}
		};
		
		int x = 0;
		int y = 0;
		int memory = 0;
		int cnt=0;
		int temp =0 ;
		int yx [][] = new int[10000][2];
		int answer2 = 0;
		int b =0;

		while(true) {//화면 송출
			//5회 입력후 되돌리기
			if(cnt==5) {
				for (int i = 0; i < game.length; i++) {
					for (int j = 0; j < game[i].length; j++) {
						game[i][j]=game2[i][j];
					}
				}
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("5회 이동해서 원래 자리로 돌아갑니다.");
			}
			
			System.out.println();
			System.out.println("=========================");
			
			for (int i = 0; i < game.length; i++) {
				for (int j = 0; j < game[i].length; j++) {
					System.out.print(game[i][j]+"\t");
					if(game[i][j]==0) {
						x=j;
						y=i;
					}
					
				}
				System.out.println();
			}
			System.out.println("=========================");
		
			
		
			
			
			//조작
			System.out.println("상(8)하(2)좌(4)우(6) 입력: ");
			int answer = scan.nextInt();
			
			if(answer==8) {
				memory = game[y-1][x];
				y--;
				yx[0+cnt][0] = answer;
				cnt++;
			}
			if(answer==2) {
				memory = game[y+1][x];
				y++;
				yx[0+cnt][0] = answer;
				cnt++;
			}
			if(answer==4) {
				memory = game[y][x-1];
			x--;
			yx[0+cnt][0] = answer;
			cnt++;
			
			}
			if(answer==6) {
				memory = game[y][x+1];
			x++;
			yx[0+cnt][0] = answer;
			cnt++;
			}
			if(answer==5) {
				cnt--;
				if(yx[0+cnt][0]==8) {
					
					memory = game[y+1][x];
					y++;
				}
				if(yx[0+cnt][0]==2) {
					
					memory = game[y-1][x];
					y--;
					
				}
				if(yx[0+cnt][0]==4) {
					
					memory = game[y][x+1];
				x++;
				
				}
				if(yx[0+cnt][0]==6) {
					
					memory = game[y][x-1];
				x--;
				}
				
				
			}
			
			
			//캐릭터 움지기기
			for (int i = 0; i <game.length;  i++) {
				for (int j = 0; j <game[i].length; j++) {
					if(game[i][j]==0) {
						temp = memory;
						memory = game[i][j];
						game[i][j]=temp;
						game[y][x] = 0;
					}
				}
			}
			if(cnt==5) {
				b=1;
			}
		
			
		
		
		
		
		
		
	
	}

}
}
