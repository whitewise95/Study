package step6_01.classObject;

import java.util.Scanner;

/*
 * # 학생성적 관리 프로그램[3단계] : 클래스 + 변수
 * 1. 학번을 입력하면, 해당 학생의 성적이 출력된다.
 * 2. 단, 없는 학번 입력에 관한 예외상황을 반드시 처리해야 한다.
 * 3. 1등과 꼴등 학생의 정보를 확인할 수 있다.
 */


class Ex05_1{
	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}



public class ClassEx05_문제 {

	public static void main(String[] args) {

		Ex05_1 e = new Ex05_1();
		Scanner scan = new Scanner(System.in);

		//Ex05 mega = new Ex05();
		//mega.name = "메가IT 고등학교";
		
		while (true) {
			
			// 메뉴 출력
			//System.out.println("=== " + mega.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			
			// 메뉴 선택
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			
			if		(choice == 1) {
				for (int i = 0; i < e.arScore.length; i++) {
					System.out.println(e.arScore[i]);
				}
			}
			else if (choice == 2) {
				int max = e.arScore[0];
				for (int i = 0; i < e.arScore.length; i++) {
				  if( max < e.arScore[i]) {
					  max = e.arScore[i];
				  }
				}
				System.out.println("전교1등 : "+max);
			}
			else if (choice == 3) {
				int lowScore =e.arScore[0];
				for (int i = 0; i < e.arScore.length; i++) {
					  if( lowScore > e.arScore[i]) {
						  lowScore=e.arScore[i];
					  }
				}
				System.out.println("전교 꼴등 : "+lowScore);
			}
			else if (choice == 4) {
				int check = -1;
				System.out.println("학번을 입력해주세요");
				choice = scan.nextInt();
				for (int i = 0; i < e.arHakbun.length; i++) {
					if(choice==e.arHakbun[i]) {
						check=1;
					}
					else if(choice!=e.arHakbun[i]) {
						
					}
				}
				if(check==1) {
					for (int i = 0; i < e.arHakbun.length; i++) {
						if(choice==e.arHakbun[i]) {
							System.out.println(e.arScore[i]);
						}
					}
				}
				else if(check==-1) {
					System.out.println("없는 학번입니다.");
				}
				
			}
			else if (choice == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
