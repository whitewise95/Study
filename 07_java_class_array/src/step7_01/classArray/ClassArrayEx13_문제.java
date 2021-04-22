package step7_01.classArray;

import java.util.Scanner;


class StudentEx{
	
	String id = "";
	String pw = "";
	
	void set_data(String id , String  pw) {
		this.id = id; 
		this.pw = pw;
	}
	
	
	void print_data() {
		System.out.println("이름 : " + id + " 비밀번호 : " + pw);
	}
	
}

class Manager{
	
	StudentEx [] list = null;
	int stdCnt = 0;
	
	void add_StudentEx(StudentEx st) {
		if(stdCnt==0) {
			list = new StudentEx[stdCnt+1];
		}
		if(stdCnt>0) {
			StudentEx[] temp = list;
			for (int i = 0; i < stdCnt; i++) {
				temp[i] = list[i];
			}
			list = new StudentEx[stdCnt+1];
			for (int i = 0; i < temp.length; i++) {
				list[i] = temp[i];
			}
		}
		list[stdCnt] = st;
		stdCnt++;
		
	}
	
	StudentEx remove_StudentEx (int index) {
		StudentEx del_st = list[index];
		if(stdCnt==1) {
			list = null;
		}
		else if(stdCnt>1) {
			StudentEx[] temp = list;
			list=new StudentEx[stdCnt-1];
			for (int i = 0; i < index; i++) {
				list[i].id = temp[i].id;
				list[i].pw = temp[i].pw;
			}
			for (int i = index; i < list.length; i++) {
				list[i].id = temp[i+1].id;
				list[i].pw = temp[i+1].pw;
			}
		}
			stdCnt--;
			return del_st;
		}
	
	int check_id(StudentEx st) {
		int check = -1;
		for (int i = 0; i < stdCnt; i++) {
			if(list[i].id.equals(st.id)) {
				check = i;
				break;
			}
		}
		return check;
		
	}
	
	void print_StudentEx() {
		for (int i = 0; i < list.length; i++) {
			System.out.println("["+(i+1)+"]"+list[i].id);
		}
	}	
	
	String out_data() {}
	
	void sort_data() {}
	
	void load_StudentEx (StudentEx [] temp , int count) {}
	
}


public class ClassArrayEx13_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		 Manager manager = new Manager();
		
		while (true) {
			
			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드 7.종료");
			int sel = scan.nextInt();
			
			
//			  [1] 가입하기 : ID 중복검사 구현
//			  [2] 탈퇴하기 : ID를 입력받아 탈퇴
//			  [3] 정렬하기 : 이름을 국어사전 순으로 정렬
//			  [4] 출력하기 : 데이터들을 화면에 출력
//			  [5] 저장하기 : 아래와 같은 형식으로 저장
//			  [6] 불러오기 : 파일에 저장된 내용을 불러오기
//			  [7] 종료하기 : 반복문을 종료
//			  
//			  			예) 
//			  			2				// 회원 수
//			 			qwer,1234		// id,pw	
//			 			abcd,1111		// id, pw
			
			
			if		(sel == 1) {
				System.out.println("사용 하실 아이디를 입력해주세요");
				StudentEx temp = new StudentEx();
				temp.id = scan.next();
				int check = manager.check_id(temp);
				if(check==-1) {
					System.out.println("사용 하실 비밀번호를 입력해주세요");
					temp.pw = scan.next();
					manager.add_StudentEx(temp);
					System.out.println("회원가입을 축하드립니다.");
				}
				else {System.out.println("중복된 아이디 입니다.");}
			}
			
		
			else if (sel == 2) {
				manager.print_StudentEx();
				StudentEx temp = new StudentEx();
				System.out.println("삭제할 아이디를 입력해주세요");
				int id= scan.nextInt();
				id = manager.check_id(temp)
				
			}
			else if (sel == 3) {}
			else if (sel == 4) {}
			else if (sel == 5) {}
			else if (sel == 6) {}
			else if (sel == 7) { 
				break; 
			}
			
		}

	}

}
