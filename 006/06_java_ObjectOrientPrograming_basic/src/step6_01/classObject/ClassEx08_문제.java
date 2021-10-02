package step6_01.classObject;

import java.util.Scanner;

/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */

//2:22~40
class Ex08_1{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
	
}



public class ClassEx08_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ex08_1 e = new Ex08_1();
		int point = 0;
			
		while(true) {
			System.out.print("[");
			for (int i = 0; i < e.game.length; i++) {
				if(e.game[i]==2) {point = i;}
				System.out.print(e.game[i]);
				if(i!=e.game.length-1) System.out.print(",");
			}
			System.out.print("}");
			System.out.println();
			System.out.println("[1] 왼족 [2] 오른쪽 : ");
			int sel = scan.nextInt();
			if(sel==1) {
				if(point==0) {
					e.game[8] = 2;
					e.game[0] = 0;
					point = 8;
					continue;
				}
				else if(e.game[point-1]==1) {
					System.out.println("벽을 부시겠습니까? [3]예 ");
					sel =scan.nextInt();
					if(sel==3) {
						e.game[point-1] = 2;
						e.game[point] = 0;
						point--;
						continue;
					}
					else {continue;}
				}
				
				e.game[point-1] = 2;
				e.game[point] = 0;
				point--;
			}
			else if(sel==2) {
				if(point==8) {
					e.game[0] = 2;
					e.game[8] = 0;
					point = 0;
					continue;
					
				}
				else if(e.game[point+1]==1) {
					System.out.println("벽을 부시겠습니까? [3]예 ");
					sel =scan.nextInt();
					if(sel==3) {
						e.game[point+1] = 2;
						e.game[point] = 0;
						point--;
						continue;
					}
					else {continue;}
				}
				e.game[point+1] = 2;
				e.game[point] = 0;
				point++;
			}
		}
	}
}
