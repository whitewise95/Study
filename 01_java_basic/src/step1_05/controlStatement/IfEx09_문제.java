package step1_05.controlStatement;

import java.util.Scanner;

/*
 * 
 *    16:40~17:10
 * # 놀이기구 이용제한
 * 
 * 1. 키를 입력받는다.
 * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
 * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다.
 * 4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.
 *    예) 부모님과 함께 오셨나요?(yes:1, no:0)
 */


public class IfEx09_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int yes = 1;
		int no  = 0;
			
		System.out.println("키를 입력해주세요");
		int myheight = scan.nextInt();
		 if(120<=myheight) {
			 System.out.println("놀이기구를 이용할 수 있습니다.");
		 }
					
		 if(120>myheight) { 
			 System.out.println("부모님과 함께 오셨나요? yes:1 no:0");
		     int Parents = scan.nextInt();
			 if (Parents == 1)System.out.println("입장가능하십니다.");
			 if(Parents ==0 )System.out.println("입장이 불가능하세요");
			 
		scan.close();
	
		
			  
			 
		 }
			
		
	
	}

}
