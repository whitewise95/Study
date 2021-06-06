package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*   19:02~ 19:~09
 * # 홀짝 게임
 * 
 * 1. 1~100사이의 랜덤 숫자를 저장한다.
 * 2. 저장된 랜덤 숫자를 보여주고,
 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
 * 
 */

public class IfEx16_문제 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		boolean istrue = false;
		
		
		while(true) {
			int temp1 = ran.nextInt(100)+1;
			System.out.println(temp1);
			System.out.println("1: 홀  ,  2: 짝");
			int sel = scan.nextInt();
			if(sel == 1){
				if(temp1%2!=0) {istrue = true;}
			}
			else if(sel == 2) {
				if(temp1%2==0) {istrue = true;}
			}
			else {
				System.out.println("잘못눌렀습니다.");
				continue;
				
			}
			if(istrue) {
				System.out.println("정답입니다.");
				break;
			}
			else System.out.println("틀렸습니다.");
		}
	}
}