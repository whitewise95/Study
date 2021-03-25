package step1_06.loop;

import java.util.Scanner;

/*
 * # 베스킨라빈스31
 *  3:30~50
 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.
 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
 * 3. br이 31을 넘으면 게임은 종료된다.
 * 4. 승리자를 출력한다.
 * 
 * 예) 
 * 1턴 : p1(2)	br(2)
 * 2턴 : p2(1)	br(3)
 * 3턴 : p1(3)	br(6)
 * ...
 */


public class LoopEx11_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int p1 = 0;
		int p2 = 0;
		
		int br = 0;
		int turn = 0;
     
		while(br < 31){
			System.out.println("p1.1~3의 정수를 입력주세요");
			p1 = scan.nextInt();
			if(p1<=3) {
				br=br + p1;	
				turn= 2;
				System.out.println("합:"+br);
			}
			else {System.out.println("잘못입력하셨습니다.");}
			
			
				System.out.println("P2.1~3의 정수를 입력해주세요");
				p2 = scan.nextInt();
				if(p2<=3) {
					br=br + p2;	
					turn=1;
					System.out.println("합:"+br);
				}
				else {System.out.println("잘못입력하셨습니다.");}
			}
		
      	
		System.out.println("승자는 P"+turn+"입니다.");
}
}

