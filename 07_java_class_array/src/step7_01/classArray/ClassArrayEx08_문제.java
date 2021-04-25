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
				System.out.println(stdList[i].name);
				if(stdList[i].subjects!=null) {
					for (int j = 0; j < stdList[i].subjects.length; j++) {
					System.out.println(stdList[i].subjects[j].name+"과목 :"+stdList[i].subjects[j].score+"점");
					}
				}
				System.out.println("====================");
			}
			
			System.out.println("[1]학생 추가하기");		// 이름 입력받아 추가
			System.out.println("[2]과목 추가하기");		// 이름과 과목 입력받아 추가
			System.out.println("[3]성적 추가하기");		// 이름과 과목 그리고 성적 입력받아 추가
			System.out.println("[4]종료하기");
			int choice = scan.nextInt();
			
			if(choice==1) {
				if(stdCnt<4) {
					stdList[stdCnt]= new Student1();
					System.out.println("이름을 입력해주세요 : ");
					stdList[stdCnt].name = scan.next();
					System.out.println("추가되었습니다.");
				
					stdCnt++;
				}
				else {System.out.println("리스트가 가득 찼습니다.");}
			}
			else if(choice==2){
				if(stdCnt>0) {
					for (int i = 0; i < stdCnt; i++) {
						System.out.println("["+(i+1)+"]"+stdList[i].name);
					}
					System.out.println("학생의 번호를 입력해주세요");
					int index = scan.nextInt();
					index -=1;
					if(stdList[index].subjects==null) {
						stdList[index].subjects = new Subject1[1];
						stdList[index].subjects[0] = new Subject1();
						System.out.println("추가하실 과목을 입력해주세요 :");
						stdList[index].subjects[0].name = scan.next();
					}
					else {
						int size = stdList[index].subjects.length;
						Subject1[] temp = stdList[index].subjects;
						stdList[index].subjects = new Subject1[size+1];
						
						for (int i = 0; i <	stdList[index].subjects.length; i++) {
							stdList[index].subjects[i] = new Subject1();
						}
						
						for (int i = 0; i < temp.length; i++) {
							stdList[index].subjects[i] = temp[i];
						}
						System.out.println("추가하실 과목을 입력해주세요 :");
						stdList[index].subjects[size].name = scan.next();
					}
				}
				
			}
			else if(choice==3){
				if(stdCnt<4) {
					for (int i = 0; i < stdCnt; i++) {
						System.out.println("["+(i+1)+"]"+stdList[i].name);
					}
					System.out.println("학생의 번호를 입력해주세요");
					int index = scan.nextInt();
					index -=1;
					if(stdList[index].subjects!=null) {
						for (int j = 0; j < stdList[index].subjects.length; j++) {
							System.out.println("["+(j+1)+"]"+stdList[index].subjects[j].name);
							}
						System.out.println("추가하실 과목을 입력해주세요 :");
						int subject = scan.nextInt();
						subject -= 1;
						System.out.println("점수를 입력해주세요");
						stdList[index].subjects[subject].score = scan.nextInt();
					}
				}
			}
				
				
			
			else if(choice==4){}
			
			
			
		
	}


	}

}
