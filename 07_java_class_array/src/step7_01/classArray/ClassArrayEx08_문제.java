package step7_01.classArray;

import java.util.Scanner;

class Subject1{
	String name;
	int score;
}

class Student1{           // 차이~
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

		
		while(true) {
	
				for (int i = 0; i < stdCnt; i++) {
					System.out.println("["+(i+1)+"]"+stdList[i].name);
					if(stdList[i].subjects!=null) {
						for (int j = 0; j <stdList[i].subjects.length; j++) {
							System.out.println(stdList[i].subjects[j].name+" 과목"+stdList[i].subjects[j].score+"점");
						}
					}
				}
			
			
			System.out.println("[1]학생 추가하기");		// 이름 입력받아 추가
			System.out.println("[2]과목 추가하기");		// 이름과 과목 입력받아 추가
			System.out.println("[3]성적 추가하기");		// 이름과 과목 그리고 성적 입력받아 추가
			System.out.println("[4]종료하기");
			int choice = scan.nextInt();
			
			if(choice==1) {
				if(stdCnt<4) {
					System.out.println("추가할 학생 이름을 입력해주세요");
					String temp = scan.next();
					stdList[stdCnt] =  new  Student1();
					stdList[stdCnt].name = temp;
					stdCnt++;
				}
				else {System.out.println("추가할 수 있는 학생 수가 넘었습니다.");}
			}
			else if(choice==2) {
		
				System.out.println("과목을 추가할 학생이름을 입력해주세요");
				String name = scan.next();
				for (int i = 0; i < stdCnt; i++) {
					if(name.equals(stdList[i].name)) {
					
						if(stdList[i].subjects==null) {
							stdList[i].subjects = new Subject1[1];
							stdList[i].subjects[0] =  new Subject1();
							System.out.println("추가할 과목을 입력해주세요");
							String subject = scan.next();
							stdList[i].subjects[0].name = subject;
						}
						else {
							int size= stdList[i].subjects.length;
							Subject1[] temp = stdList[i].subjects;
							stdList[i].subjects = new Subject1[size+1];
							for (int j = 0; j < size+1; j++) {
								stdList[i].subjects[size] =  new Subject1();
							}
							for (int j = 0; j < temp.length; j++) {
								stdList[i].subjects[j]= temp[j];
							}
							System.out.println("추가할 과목을 입력해주세요");
							String subject = scan.next();
							stdList[i].subjects[size].name = subject;
						}
						
					}
					
					else {System.out.println("없는 학생입니다.");}
				}
			}
			else if(choice==3) {
				
				for (int i = 0; i < stdCnt; i++) {
					System.out.println("["+(i+1)+"]"+stdList[i].name+" , ");
				}
				System.out.println();
				System.out.println("점수를 추가할 학생을 입력해주세요");
				int stdListIndex = scan.nextInt();
				stdListIndex= stdListIndex-1;
				int size= stdList[stdListIndex].subjects.length;
				if(size>0) {
					for (int i = 0; i < stdList[stdListIndex].subjects.length; i++) {
						System.out.print("["+(i+1)+"]"+stdList[stdListIndex].subjects[i].name+" , ");
					}
					System.out.println();
					System.out.println("점수를 추가할 과목을 입력해주세요");
					int subjectScoreIndex =scan.nextInt();
					subjectScoreIndex= subjectScoreIndex-1;
					System.out.println("점수를 입력해주세요");
					int score = scan.nextInt();
					stdList[stdListIndex].subjects[subjectScoreIndex].score = score;
				}
				else {System.out.println("이 학생은 과목이 추가되어 있지 않습니다.");}
			}	
			else if(choice==4) {break;}
		}
	}

}
