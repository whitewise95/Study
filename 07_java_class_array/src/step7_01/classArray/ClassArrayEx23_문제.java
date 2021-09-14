package step7_01.classArray;

import java.util.ArrayList;
import java.util.Scanner;


class StudentVO {
	String id;
	String pw;
	
	
	void set_data(String id , String  pw) {
		this.id = id; 
		this.pw = pw;
	}
	
	void print_data() {
		System.out.println("이름 : " + id + " 비밀번호 : " + pw);
	}
	
	
}

class StudentManager {
	
	ArrayList<StudentVO> studentList = new ArrayList<StudentVO>();
	int stdCnt = 0;
	
	
	
	void std_add(StudentVO temp){
		 studentList.add(temp);
	}
	
	void std_remove(int index) {
		studentList.remove(index);
	}
	
	
	
	
	int check_list(String id) {
		int check = -1;
		for (int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).id.equals(id)) {
				check=i;
			}
		}
		return check;
	}
	

	void std_print(){
		for (int i = 0; i <studentList.size(); i++) {
			studentList.get(i).print_data();
			
		}
	}
	
	void sort_data() {
		
	}
	
	
}



public class ClassArrayEx23_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		StudentManager manager = new StudentManager();
		
		while (true) {
			
			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드 7.종료");
			int sel = scan.nextInt();
			
			if 		(sel == 1) {
				StudentVO temp = new StudentVO();
				System.out.println("사용하실 ID를 입력해주세요 ");
				temp.id = scan.next();
				int check = manager.check_list(temp.id);
				
				if(check == -1) {
					System.out.println("사용하실 비밀번호를 입력해주세요");
					temp.pw = scan.next();
					manager.std_add(temp);
					System.out.println("가입되었습니다.");
				}
				else {
					System.out.println("중복된 아이딥니다.");
				}
			} 
			else if (sel == 2) {
				StudentVO temp = new StudentVO();
				manager.std_print();
				System.out.println("탈퇴할 아이디를 입력해주세요 : ");
				temp.id = scan.next();
				int check = manager.check_list(temp.id);
				if(check !=-1) {
					manager.std_remove(check);
					System.out.println(temp.id+"님 탈퇴되었습니다.");
				}
				else {System.out.println("없는 아이디입니다.");}
			}
			else if (sel == 3) {
				
				
			}
			else if (sel == 4) {
				manager.std_print();
			}
			else if (sel == 5) {}
			else if (sel == 6) {}
			else if (sel == 7) {}
			
		}

	}

}
