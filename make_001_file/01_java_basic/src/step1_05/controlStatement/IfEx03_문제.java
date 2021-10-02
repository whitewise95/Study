package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 가위(0)바위(1)보(2) 게임[1단계]
 * 
 * 1. com은 바위(1)만 낼 수 있다.
 * 2. me는 0~2 사이의 숫자를 입력받는다.
 * 3. com과 me를 비교해,
 * 		1) 비겼다.
 * 		2) 내가 이겼다.
 * 		3) 내가 졌다.			를 출력한다.
 */

// 3월19일 15:21분~15:30

public class IfEx03_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int com = 1;
		System.out.println("가위(0)바위(1)보(2)" + "숫자를 입력하세요"+" "+"기회는 한번");
		int me = scan.nextInt();
        
		
        if (com == me) System.out.println("비겼다");
        if (com > me) System.out.println("내가 졌다");
        if (com < me) System.out.println("내가 이겼다");
        
        
        scan.close();
	}

}
