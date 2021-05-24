package _99_codingtest_sample.copy;
/*
 * # 스네이크 게임
 * 1. 10x10 배열을 0으로 채운다.
 * 2. 스네이크는 1234로 표시한다.
 * 3. 상하좌우로 이동이 가능하며, 꼬리가 따라온다.
 * 4. 자기몸하고 부딪히면, 사망한다.
 * 5. 꼬리는 최대 8개까지 증가할 수 있다.
 */

import java.util.Scanner;

public class snake01 {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in); 
		
		final int SIZE = 10;
		int[][] map = new int[SIZE][SIZE];
		
		int[] y = new int[4];	// 0 0 0 0
		int[] x = new int[4];	// 0 1 2 3
		int[] snake = new int[4];
		
		for (int i=0; i<4; i++) {
			x[i] = i;			
			map[y[i]][x[i]] = i+1;
			snake[i] = map[y[i]][x[i]];
		}
		while(true) {
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
			System.out.println("상:8   하:2   좌:4   우:6");
			int nX = 0;
			int nY = 0;
			int sel = scan.nextInt();
			if(sel==8) {
				nY =y[0]-1;
				nX =x[0];
			}
			else if(sel==2) {
				nY =y[0]+1;
				nX =x[0];
			}
			else if(sel==4) {
				nY =y[0];
				nX =x[0]-1;
			}
			else if(sel==6) {
				nY =y[0];
				nX =x[0]+1;
			}
			
			if(nY<0 || nX<0) {continue;}
			else if(nX>=SIZE || nY>=SIZE) {continue;}
			else if(map[nY][nX]!=0) {continue;}
			
			//꼬리 이동
			int tailY= y[y.length-1];
			int tailX= x[x.length-1];
			map[tailY][tailX]=0;
			//몸통이동
			for (int i = snake.length-1; i > 0; i--) {
				y[i] =y[i-1];
				x[i] =x[i-1];
			}
			
			//머리이동
			x[0] = nX;
			y[0] = nY;	
			
			
			//뱀그리기
			for (int i = 0; i <	snake.length; i++) {
				map[y[i]][x[i]] = i+1;
			}
			
		}
		
		
		
		
		
		
	}
	
}
