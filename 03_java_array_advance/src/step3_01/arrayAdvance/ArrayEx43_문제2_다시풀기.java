package step3_01.arrayAdvance;



import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;



// # 소코반
//골대랜덤  , 선수정하기 , 벽랜덤 갯수는 정하기, 공,

public class ArrayEx43_문제2_다시풀기 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan =new Scanner(System.in);
		int size = 10;
		int[][] game = new int[size][size];
		int wallX = 0 ; 
		int wallY = 0 ;
		int bollX = 0;
		int bollY = 0;
		int playX = 0;
		int playY = 0;
		int winX = 0;
		int winY = 0;
		
	
		// 벽 생성
		System.out.println("0~3벽을 몇개 만들겠습니까?");
		int answer = scan.nextInt();
		if(answer>0) {
			for (int i = 0; i < answer; ) {
			wallX = ran.nextInt(7)+2;
			wallY = ran.nextInt(7)+2;
			if(game[wallY][wallX]==0) {game[wallY][wallX]=1; i++;}
			}
		}
		System.out.println(1);
		
		//골대 생성
		while(true) {
			System.out.println(1);
			winX = ran.nextInt(10);
			winY = ran.nextInt(10);
			if(game[wallY][wallX]==0) {game[wallY][wallX]=2; break;}
		}
		
		//선수 랜덤
		while(true) {
			playX = ran.nextInt(10);
			playY = ran.nextInt(10);
			if(game[wallY][wallX]==0) {game[wallY][wallX]=8;}
		}
		//공랜덤
		while(true) {
			bollX = ran.nextInt(7)+2;
			bollY = ran.nextInt(7)+2;
			if(game[wallY][wallX]==0) {game[wallY][wallX]=4;}
		}
		System.out.println(2);
		while(true) {
			for (int i = 0; i < game.length; i++) {
				for (int j = 0; j < game.length; j++) {
					if(game[i][j]==1) {System.out.print("i ");}
					else if(game[i][j]==2) {System.out.print("G");}
					else if(game[i][j]==9) {System.out.print("옷");}
					else if(game[i][j]==4) {System.out.print("*");}
					else System.out.print(game[i][j]+" ");
					System.out.print(" ");
				}
				System.out.println();			
			}
				System.out.println("[8]상, [2]하, [4]좌, [6]우 입력: ");
				int move = scan.nextInt();
				if(move==8) {
					for (int i = 0; i < game.length; i++) {
						for (int j = 0; j < game.length; j++) {
							if(game[i][j]==9) {
								if(game[i+1][j]==0) {
									game[i+1][j] = 9;
									game[i][j]=0;
								}
								else if(game[i+1][j]==4) {
									game[i+2][j]=4;
									game[i+1][j] =9;
									game[i][j]=0;
								}
							}
						} 
					}
				}
				else if(move==2) {}
				else if(move==4) {}
				else if(move==6) {}
			
			
			
		}
		
		
	
		
		
	}

}
