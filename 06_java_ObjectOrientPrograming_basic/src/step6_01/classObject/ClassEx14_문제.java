package step6_01.classObject;

import java.util.Iterator;
import java.util.Scanner;

/*
 * # 사다리 게임
 * 1. 0을 만나면 아래로 내려간다.
 * 2. 1일 때에는 좌우를 검사해 1인 쪽으로 이동 후 아래로 내려간다.
 * 3. x의 위치를 입력받고 사다리를 표현한다.
 * 		x = 0	x = 4
 * 		x = 1	x = 2
 * 		x = 2	x = 1
 * 		x = 3	x = 3
 * 		x = 4	x = 0
 */


class Ex14_1{
	int ladder[][]= {
			{0,0,0,0,0},
			{1,1,0,1,1},
			{0,1,1,0,0},
			{0,0,1,1,0},
			{1,1,0,0,0},
			{0,1,1,0,0},
			{1,1,0,0,0},
			{0,0,0,1,1},
			{0,0,0,0,0}};
	
	int x = 0; int y = 0;
	String[] menu = {"죠스떡볶이", "CU편의점", "마라탕", "김밥천국", "명인만두"};
}


public class ClassEx14_문제 {
	
	public static void main(String[] args) {
		
		Ex14_1 e = new Ex14_1();
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i < 6; i++) {
			System.out.print(" "+i+" ");
		}
		System.out.println();
		for (int i = 0; i < e.ladder.length; i++) {
			for (int j = 0; j < e.ladder[i].length; j++) {
				if(e.ladder[i][j]==0){System.out.print(" │ ");}
				else if(j!=0&&e.ladder[i][j]==1&&e.ladder[i][j-1]==1) {System.out.print("─┤ ");}
				else if(e.ladder.length-1!=0&&e.ladder[i][j]==1&&e.ladder[i][j+1]==1) {System.out.print(" ├─");}
			}
			System.out.println();
		}
		
		System.out.println("몇번을 선택하시겠습니까?");
		int number = scan.nextInt();
	}
}
