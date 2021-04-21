package step7_01.classArray;

import java.util.Scanner;

class Subject1{
	String name;
	int score;
}

class Student1{
	Subject1[] subjects;
	String name;
}



public class ClassArrayEx08_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// # 학생 추가 삭제 컨트롤러
		//   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
		//   김철수 : 과목3개 수학 50 국어50 영어 60 
		//   이만수 : 과목2개 수학 20 국어 30 
		//   이영희 : 과목1개 수학 100
		
		Student1 [] stdList = new Student1[3];
		int stdCnt = 0;	// 학생 수
		
		while (true) {
			for (int i = 0; i < stdCnt; i++) {
				System.out.println("["+(i+1)+"]"+stdList[i].name+"학생");
			}
			System.out.println();
			
			
			
			System.out.println("[1]학생 추가하기");		// 이름 입력받아 추가
			System.out.println("[2]과목 추가하기");		// 이름과 과목 입력받아 추가
			System.out.println("[3]성적 추가하기");		// 이름과 과목 그리고 성적 입력받아 추가
			System.out.println("[4]종료하기");
			int choice = scan.nextInt();
			
			if		(choice == 1) {
				System.out.print("이름 입력 : ");
				String name = scan.next();
				
				stdList[stdCnt] = new Student1();
				stdList[stdCnt].name = name;
				stdCnt++;
			}
		
			else if (choice == 2) {
				for (int i = 0; i < stdCnt; i++) {
					System.out.print("["+(i+1)+"]"+stdList[i].name+", ");
				}
				System.out.println();
				System.out.println("학생을 선택해주세요 : ");
				int sel =scan.nextInt();
				System.out.println("과목을 입력해주세요 : ");
				String subject  =scan.next();
				if(stdList[sel-1].subjects==null) {
					stdList[sel-1].subjects = new Subject1[1];
					stdList[sel-1].subjects[0] = new Subject1();
					stdList[sel-1].subjects[0].name = subject;
				}
				else if(stdList[sel-1].subjects!=null){
					int size = stdList[sel-1].subjects.length;
					String[] temp = new String[size];
					for (int i = 0; i < temp.length; i++) {
						temp[i] = stdList[sel-1].subjects[i].name;
					}
					stdList[sel-1].subjects = new Subject1[size+1];
					for (int i = 0; i < stdList[sel-1].subjects.length; i++) {
					stdList[sel-1].subjects[i] = new Subject1();
					}
					for (int i = 0; i < temp.length; i++) {
						stdList[sel-1].subjects[i].name=temp[i];
					}
					stdList[sel-1].subjects[size].name = subject;
				}
				
				
			}
			else if (choice == 3) {
				for (int i = 0; i < stdCnt; i++) {
					System.out.print("["+(i+1)+"]"+stdList[i].name+", ");
				}
				System.out.println("학생을 선택해주세요");
				for (int i = 0; i < stdList.length; i++) {
					for (int j = 0; j < stdList[i].subjects[j].name.length(); i++) {
						System.out.println("["+i+"]"+stdList[i].subjects[j].name);
						System.out.println("과목을 선택해주세요");
						
					}
				}
			}
			
		}


	}

}
