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

class game {
	int size=4;
	int[][] game= { 	{1,2,3,4},
						{5,6,7,8},
						{9,10,0,12},
						{13,14,11,15}
										};
	int[] temp= new int[5]; 	

	int cnt =0;
	
	int xx = 0;
	int yy =0;
}




public class ArrayEx47_테스트문제_다시풀기 {

	public static void main(String[] args) {
		game e = new game();
		Scanner scan = new Scanner(System.in);
	
	
		while(true) {
			for (int i = 0; i < e.game.length; i++) {
				for (int j = 0; j < e.game.length; j++) {
					if(e.game[i][j]==0) {e.xx=j; e.yy=i;}
					System.out.print(e.game[i][j]+",");
				}
				System.out.println();
			}
			
			System.out.println("[8]상 [2]하 [4]좌 [6]우 :");
			int answer = scan.nextInt();
			if(answer==8) {
				for (int i = 0; i < e.game.length; i++) {
					for (int j = 0; j < e.game[i].length; j++) {
						if(e.game[i][j]==0) {
							int temp = e.game[i-1][j];
							e.game[i-1][j] = e.game[i][j];
							e.game[i][j]=temp;
							e.temp[e.cnt]=8;
							e.cnt++;
							break;
						}
					}
				}
			}
			if(answer==2) {	
				int x = 0;
				for (int i = 0; i < e.game.length; i++) {
					for (int j = 0; j < e.game[i].length; j++) {
						if(e.game[i][j]==0) {
							int temp = e.game[i+1][j];
							e.game[i+1][j] = e.game[i][j];
							e.game[i][j]=temp;
							e.temp[e.cnt]=2;
							e.cnt++;
							x = 1;
							break;
						}
					}
				if(x==1) {break;}
				}
			}
			if(answer==4) {
				for (int i = 0; i < e.game.length; i++) {
					for (int j = 0; j < e.game[i].length; j++) {
						if(e.game[i][j]==0) {
							int temp = e.game[i][j-1];
							e.game[i][j-1] = e.game[i][j];
							e.game[i][j]=temp;
							e.temp[e.cnt]=4;
							e.cnt++;
							break;
						}
					}
				}
			}
			if(answer==6) {
				for (int i = 0; i < e.game.length; i++) {
					for (int j = 0; j < e.game[i].length; j++) {
						if(e.game[i][j]==0) {
							int temp = e.game[i][j+1];
							e.game[i][j+1] = e.game[i][j];
							e.game[i][j]=temp;
							e.temp[e.cnt]=6;
							e.cnt++;
							break;
						}
					}
				}
			}
			if(e.cnt==5){
				while(e.cnt>-1) {
					for (int i = 0; i < e.game.length; i++) {
						for (int j = 0; j < e.game.length; j++) {
							System.out.print(e.game[i][j]+",");
						}
						System.out.println();
					}
					
					if(e.temp[e.cnt-1]==8) {
						int x= 0;
						for (int i = 0; i <e.game.length; i++) {
							for (int j = 0; j < e.game[i].length; j++) {
								if(e.game[i][j]==0) {
									int temp = e.game[i+1][j];
									e.game[i+1][j] = e.game[i][j];
									e.game[i][j]=temp;
									x=1;
								}
								if(x==1) {break;}
							}
							if(x==1) {break;}
						}
					}
							
					else if(e.temp[e.cnt-1]==2) {
						for (int i = 0; i <e.game.length; i++) {
							for (int j = 0; j < e.game[i].length; j++) {
								if(e.game[i][j]==0) {
									int temp = e.game[i-1][j];
										e.game[i-1][j] = e.game[i][j];
										e.game[i][j]=temp;
									
										}
									}
								}
							}
							else if(e.temp[e.cnt-1]==4) {
								int x =0;
								for (int i = 0; i <e.game.length; i++) {
									for (int j = 0; j < e.game[i].length; j++) {
										if(e.game[i][j]==0) {
											int temp = e.game[i][j+1];
												e.game[i][j+1] = e.game[i][j];
												e.game[i][j]=temp;
												x =1;
												break;
												}
											}
										if(x==1) {break;}
										}
									}
							else if(e.temp[e.cnt-1]==6) {
								for (int i = 0; i <e.game.length; i++) {
									for (int j = 0; j < e.game[i].length; j++) {
										if(e.game[i][j]==0) {
											int temp = e.game[i][j-1];
												e.game[i][j-1] = e.game[i][j];
												e.game[i][j]=temp;
												
												}
											}
										}
									}
					e.cnt--;
							
						if(e.cnt==0) {e.cnt=-1;}	
						}
					e.cnt=0;
					}
				}
		
		
		


}
}
