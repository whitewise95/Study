package step7_01.classArray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
		if(stdCnt == 0) {
			list = new StudentEx[1];
		}
		else {
			StudentEx[] temp = list;
			list = new StudentEx[stdCnt+1];
			for (int i = 0; i < stdCnt; i++) {
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
		else {
		
			StudentEx[] temp = list;
			list = new StudentEx[stdCnt-1];
			for (int i = 0; i <  index; i++) {
				list[i] = temp[i];
			}
			for (int i = index; i < stdCnt-1; i++) {
				list[i] = temp[i+1];
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
		for (int i = 0; i < stdCnt; i++) {
			list[i].print_data();
		}
	}
	
	String out_data() {
	 String data = "";
	 data += stdCnt;
	 data += "\n";
	 
	 for (int i = 0; i < stdCnt; i++) {
		data += list[i].id;
		data += ",";
		data += list[i].pw;
		if(stdCnt-1 !=i) {
			data+= "\n";
		}
		
				}
		return data;
		
		
	}
	
	void sort_data() {
		for (int i = 0; i < stdCnt; i++) {
			for (int j = 0; j < stdCnt; j++) {
				if(list[i].id.compareTo(list[j].id)>0) {
					StudentEx temp= list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
		
		
	}
	
	void load_StudentEx (StudentEx [] temp , int count) {
		stdCnt = count;
		
		list = new StudentEx [stdCnt];
		for (int i = 0; i < stdCnt; i++) {
			list[i] = new StudentEx();
			list[i].set_data(temp[i].id, temp[i].pw); 
			
		}
	}
	
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
			
		
			if(sel == 1) {
				StudentEx temp = new StudentEx();
				System.out.println("사용 하실 아이디를 입력해주세요 : ");
				temp.id = scan.next();
				int check = manager.check_id(temp);
				if(check==-1) {
					System.out.println("사용하실 비밀번호를 입력해주세요");
					temp.pw = scan.next();
					manager.add_StudentEx(temp);
					System.out.println(temp.id+"님 가입을 축하드립니다.");
				}
				else {
					System.out.println("중복된 아이디 입니다.");
				}
				}
			else if(sel == 2) {
				StudentEx temp = new StudentEx();
				manager.print_StudentEx();
				System.out.println("탈퇴할 아이디를 입력해주세요 :");
				temp.id = scan.next();
				int check =manager.check_id(temp);
				if(check != -1) {
					StudentEx del_st = manager.remove_StudentEx(check);
					 System.out.println(del_st.id+"탈퇴되었습니다.");
				}
				else {
					System.out.println("잘못된 아이디입니다.");
				}
			}
			else if(sel == 3) {
				manager.sort_data();
				manager.print_StudentEx();
			
			}
			else if(sel == 4) {
				manager.print_StudentEx();
			}
			else if(sel == 5) {
				File fileName = new File("id,pw2");
				FileWriter fw = null;
				
				try {fw = new FileWriter(fileName);
					String date = manager.out_data();
					fw.write(date);
					System.out.println(date);
				
				
				} catch (IOException e) {e.printStackTrace();}
				finally {try {
					fw.close();
				} catch (IOException e) {e.printStackTrace();}
				}
				
				
				
			}
			else if(sel == 6) {
				FileReader fr = null;
				BufferedReader br = null;
				
				File file = new File("id,pw2");
				try {
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					try {
						String data = br.readLine();
						int cnt =Integer.parseInt(data);
						StudentEx [] temp = new StudentEx [cnt];
						for (int i = 0; i < cnt; i++) {
							temp[i] =new StudentEx();
							data = br.readLine();
							String[] spilt =data.split(",");
							temp[i].id = spilt[0];
							temp[i].pw = spilt[1];
						}
						manager.load_StudentEx(temp, cnt);
						
						
						
						
						
						
					
					} catch (IOException e) {e.printStackTrace();}
					
					
					
					
				} catch (IOException e) {e.printStackTrace();}
				finally {
					try {br.close();} catch (IOException e) {e.printStackTrace();}
					try {fr.close();} catch (IOException e1) {e1.printStackTrace();}
						
				}
			}
			else if(sel == 7) {}
			
			
		}
	}

}
