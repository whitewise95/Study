package step7_01.classArray;

import java.util.Scanner;

class Subject1{
	String name;
	int score;
}

class Student1{        
	Subject1[] subjects;  
	String name;
	int subjectsCnt;
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
				System.out.println("추가할 학생의 이름을 입력해주세요  : ");
				String name = scan.next();
				if(stdCnt==0) {
					stdList[0] = new Student1();
					stdList[0].name = name;
					stdCnt++;
				}
				
				else if(stdCnt==3) {
					System.out.println("학생목록 공간이 부족합니다. 학생목록을 삭제 해주세요");
				}
				else {
					stdList[stdCnt] = new Student1();
					stdList[stdCnt].name = name;
					stdCnt++;
				}
				
			}
			else if(choice==2) {
				if(stdCnt==0) {
					System.out.println("학생목록을 먼저 추가 해주세요");
				}
				else {
					for (int i = 0; i < stdCnt; i++) {
						System.out.println("["+(i+1)+"]"+stdList[i].name);
					}
					int index= scan.nextInt();
					index= index-1;
					System.out.println("과목을 입력해주세요");
					String Subject= scan.next();
					if(stdList[index].subjectsCnt==0) {
						stdList[index].subjects = new Subject1[1];
						stdList[index].subjects[0]  = new Subject1();
						stdList[index].subjects[0].name=Subject;
						stdList[index].subjectsCnt++;
					}
					else {
						Subject1[] temp = stdList[index].subjects;
						stdList[index].subjects = new Subject1[stdList[index].subjectsCnt+1];
						for (int i = 0; i < stdList[index].subjectsCnt+1; i++) {
							stdList[index].subjects[i]  = new Subject1();
						}
						for (int i = 0; i < stdList[index].subjectsCnt; i++) {
							stdList[index].subjects[i]=temp[i];
						}
						stdList[index].subjects[stdList[index].subjectsCnt].name=Subject;
						stdList[index].subjectsCnt++;
					}
				}	
			}
			else if(choice==3) {
				if(stdCnt==0) {
					System.out.println("학생목록을 먼저 추가 해주세요");
				}
				else {
					System.out.println("학생을 선택해주세요");
					for (int i = 0; i < stdCnt; i++) {
						System.out.println("["+(i+1)+"]"+stdList[i].name);
					}
					int index= scan.nextInt();
					index= index-1;
					if(stdList[index].subjectsCnt==0) {
						System.out.println("과목을 먼저 추가해주세요 ");
					}
					else {
						for (int j = 0; j <stdList[index].subjects.length; j++) {
							System.out.println("["+(j+1)+"]"+stdList[index].subjects[j].name);
						}	
						System.out.println("과목을 선택해주세요");
						int Subject= scan.nextInt();
						Subject= Subject -1;
						System.out.println("점수를 입력해주세요");
						int score = scan.nextInt();
						stdList[index].subjects[Subject].score=score;
					}
				}
			}
			else if(choice==4) {System.out.println("종료합니다."); break;}
			
		}
	}

}
