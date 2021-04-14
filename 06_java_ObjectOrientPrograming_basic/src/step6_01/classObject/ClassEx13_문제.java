package step6_01.classObject;
/* 
 * # 1 to 50[3단계] : 1 to 18
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */

import java.util.Random;
import java.util.Scanner;


class Ex13_1{
	final int SIZE = 9;
	
	int[] front = new int[SIZE];
	int[] back  = new int[SIZE];
}



public class ClassEx13_문제 {
	
	
	
	public static void main(String[] args) {
		Ex13_1 e = new Ex13_1();
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		//생성
		int cnt = 0;
		for (int i = 1; i < 10; i++) {
			 e.front[cnt]=i;
					 cnt++;
		}
		cnt = 0;
		for (int i = 10; i < 19; i++) {
			e.back[cnt] = i;
			cnt++;
		}
		//셔플
		for (int i = 0; i < 1000; i++) {
			int j = ran.nextInt(e.SIZE);
			
			int temp = e.front[j];
			e.front[j] = e.front[0];
			e.front[0] = temp;
		}
		for (int i = 0; i < 1000; i++) {
			int j = ran.nextInt(e.SIZE);
			
			int temp = e.back[j];
			e.back[j] = e.back[0];
			e.back[0] = temp;
		}
		
		
		
		int s = 1;
		
		while(true) {
			int cnt1 = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = cnt1; j < cnt1+3; j++) {
					
					{System.out.print(+e.front[j]);
					System.out.print("\t");
					}
				}
				cnt1+=3;
				System.out.println();
			}
			if(s==19) {
				System.out.println("끝");
				break;
				
			}
			
			
			
			
			System.out.println("idx를 입력해주세요");
			System.out.println(s);
			int x = scan.nextInt();
		
			if(e.front[x]==s||e.back[x]==s) {
				if(s>0&&s<=e.SIZE) {
					e.front[x]= e.back[x];
				}
				else if(s>e.SIZE && s<19) {
					e.front[x]=0;
				}
				s++;
				
			}
		
			
			
		}
		
		
		
		
	}

}
