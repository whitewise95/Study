package step3_01.arrayAdvance;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

// # 소코반

public class ArrayEx43_문제2_풀이 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int size = 7;  //축구장넓이
		int wall = 9;
		
		
		int [][] soccer = new int[size][size];
		int myx = 0; // 내 위치
		int myy = 0;// 내위치
		int ballx = 0; //공 위치
		int bally = 0; // 공 위치
		int goalx = 0; //골대 위치
		int goaly = 0; //골대 위치
		int wallcnt = 0;
		
		
		
		

	
			// 벽설치
			System.out.println("벽을 몇개 설치하십니까?");
			 wallcnt = scan.nextInt();
			 int temp =wallcnt;
		while(true) {
			if(temp != 0 ) {
				int rx = scan.nextInt(size);
				int ry = scan.nextInt(size);
				
				if(soccer[rx][ry]==0) {
					soccer[rx][ry] = wall; 
					temp-=1;
					System.out.println(soccer[rx][ry]);
				}
				
			}
			if(temp == 0 ) {
				break;
			}
			
		}
		
		
		
		
		
	}

}
