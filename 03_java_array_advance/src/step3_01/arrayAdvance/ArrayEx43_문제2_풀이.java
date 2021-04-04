package step3_01.arrayAdvance;


import java.util.Random;
import java.util.Scanner;

// # 소코반

public class ArrayEx43_문제2_풀이 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int size =6;
		int wall = 1;
		int coal = 5;
		int my = 4;
		int ball = 2;
		
		int [][] map = new int[size][size];
		
		int wallx  = 0;
		int wally  = 0;
		int coalx  = 0;
		int coaly  = 0;
		int ballx  = 0;
		int bally = 0;
		int myx = 0;
		int myy = 0;
		int answer = 0;
		int cnt = 0;
		
		//자신의 위치
		System.out.println("자신의 위치 x좌표를 입력해주세요");
		myx = scan.nextInt();
		System.out.println("자신의 위치 y좌표를 입력해주세요");
		myy = scan.nextInt();
		if(map[myy][myx]==0) {
			map[myy][myx]=my;
		}
				
		//벽 생성
		System.out.println("벽을 몇개 만들십니까?");
		answer = scan.nextInt();
		if(answer>0) {
			while(answer>0) {
				wallx =ran.nextInt(4)+1;
				wally =ran.nextInt(4)+1;
					if(map[wally][wallx]==0) {
						map[wally][wallx]=wall;
						answer--;
					}
			}
		}
		// 골대 위치 랜덤
		while(cnt<1) {
			coalx=ran.nextInt(4)+1;
			coaly=ran.nextInt(4)+1;
			if(map[coaly][coalx]==0) {
				map[coaly][coalx]=coal;
				cnt++;
			}
		}
		//공 위치 정하기 랜덤
		while(cnt<2) {
			ballx=ran.nextInt(5)+1;
			bally=ran.nextInt(5)+1;
			if(map[bally][ballx]==0) {
				map[bally][ballx]=ball;
				cnt++;
			}
		}
		
		//전체화면
		while(true) {
			System.out.println("-----------------------");
			//화면 보여주기 
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					
					if(map[i][j] == my) System.out.print("옷");
					else if(map[i][j] == coal) System.out.print("G ");
					else if(map[i][j] == wall) System.out.print("! ");
					else if(map[i][j] == ball) System.out.print("* ");
					else System.out.print(map[i][j]+" ");
				
				}
				System.out.println();
			}
			
			System.out.println("-----------------------");
			//사람움질길  좌표
			System.out.println("상(8) 하(2) 좌(4) 우(6)");
			int x  = myx;
			int y = myy;
			int myanswer = scan.nextInt();
			if (myanswer == 8) {y--;}
			else if (myanswer == 2) {y++;}
			else if (myanswer == 4) {x--;}
			else if (myanswer == 6) {x++;}
			
			//예외처리
			if(map[y][x]==wall) {continue;}  // 벽만났을때
			if (size <= x || x < 0) continue;
			if (size <= y || y < 0) continue;
			
			
			//공만났을때
			if(map[y][x]==ball) {
				int xx = ballx;
				int yy = bally;
				if (myanswer == 8) {yy--;}
				else if (myanswer == 2) {yy++;}
				else if (myanswer == 4) {xx--;}
				else if (myanswer == 6) {xx++;}
			
				//예외처리
				if(map[yy][xx]==wall) {continue;}  // 공이 벽만났을때
				if (size <= xx || xx < 0) continue;
				if (size <= yy || yy < 0) continue;
				
				
				//승리
				if(map[yy][xx]==coal) {
					System.out.println("골");
					break;
				}
				//공 이동시키기
				map[bally][ballx] = 0;
				map[yy][xx]=ball;
				bally=yy;
				ballx=xx;
				
				
				
			}
			//플레이어 이동시키기
			 map[myy][myx]=0;
			 map[y][x]=my;
 			 myx = x;
			 myy = y;
			
		}
		
		
		
		
		
		
	}

}
