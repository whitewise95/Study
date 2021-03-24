package step1_05.controlStatement;

import java.util.Scanner;

public class lfEx08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
			System.out.println("#성적입력 :");
			int getGrade = scan.nextInt();
		
			if(getGrade >= 60) {
				if(getGrade == 100) {
					System.out.println("만점");
				}
			
				System.out.println("합격");
			}
			if(getGrade < 60) {
				System.out.println("불합격");
			}
		
		scan.close();
		
	}

}
