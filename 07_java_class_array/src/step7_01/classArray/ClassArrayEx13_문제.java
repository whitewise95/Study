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
			list = new StudentEx[stdCnt+1];
			list[stdCnt] = st;
		}
		else {
			StudentEx[] temp = list;
			list = new StudentEx[stdCnt+1];
			for (int i = 0; i < temp.length; i++) {
				list[i] = temp[i];
			}
			list[stdCnt] = st;
		}
		stdCnt++;
	}
	
	StudentEx remove_StudentEx (int index) {
		if(stdCnt==1) {
			list = null;
		}
		else {
			StudentEx[] temp = list;
			list = new StudentEx[stdCnt-1];
			for (int i = 0; i < index; i++) {
				list[i] = temp[i];
			}
			for (int i = index; i < temp.length-1; i++) {
				list[i] = temp[i+1];
			}
		}
		stdCnt--;
		return null;
	}

	
	int check_id(StudentEx st) {
		int check = -1;
		for (int i = 0; i < stdCnt; i++) {
			if(st.id.equals(list[i].id)) {
				check= i;
			}
		}
		return check;
	}
	
	void print_StudentEx() {
		for (int i = 0; i < list.length; i++) {
			System.out.println("["+(i+1)+"]"+list[i].id);
		}
	}
	
	String out_data() {
		String data = "";
		data +=stdCnt;
		data += "\n";
		for (int i = 0; i < list.length; i++) {
			data += list[i].id;
			data += ",";
			data += list[i].pw+"\n";
		}
		
		
		
		
		return data;
	}
	
	void sort_data() {
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if(list[i].id.compareTo(list[j].id)>0) {
					StudentEx temp = list[i];
					list[i] = list[j];
					list[j]=  temp;
				}
			}
		}
		
		
	}
	
	void load_StudentEx (StudentEx [] temp , int count) {
		list = new StudentEx[count];
		stdCnt = count;
	 for (int i = 0; i < count; i++) {
		list[i]= new StudentEx();
		list[i] = temp[i];
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
			
		
		if(sel==1) {
			StudentEx temp =new StudentEx();
			System.out.println("가입하실 아이디를 입력해주세요");
			temp.id = scan.next();
			int check = -1;
			check= manager.check_id(temp);
			if(check == -1) {
				System.out.println("가입하실 비밀번호를 입력해주세요");
				temp.pw = scan.next();
				manager.add_StudentEx(temp);
				System.out.println("가입되었습니다.");
			}
			else {System.out.println("이미 사용중인 아이디입니다.");}
		}
		
		
		else if(sel==2) {
			if(manager.stdCnt>0) {
				StudentEx temp =new StudentEx();
				System.out.println("탈퇴하실 아이디를 입력해주세요");
				temp.id = scan.next();
				int check = -1;
				check= manager.check_id(temp);
				if(check != -1) {
					 manager.remove_StudentEx(check);
					 System.out.println("탈퇴되었습니다.");
				}
			}
			else {System.out.println("가입 후에 이용해주세요");}
		}
		else if(sel==3) {
			if(manager.stdCnt>0) {
				manager.sort_data();
				manager.print_StudentEx();
			}
			else {System.out.println("가입 후에 이용해주세요");}
		}
		else if(sel==4) {
			manager.print_StudentEx();
		}
		else if(sel==5) {
			FileWriter fw = null ;
			String data = manager.out_data();
			try {
				fw = new FileWriter("id,pw");
				fw.write(data);
				System.out.println(data);
			} 
			catch (IOException e) {e.printStackTrace();}
			finally{try {fw.close();} catch (IOException e) {e.printStackTrace();}
			  }
		}
		else if(sel==6) {
			File fw = new File("id,pw");
			FileReader fr = null;
			BufferedReader br = null;
			try {
				
			 fr = new FileReader(fw);
			 br = new BufferedReader(fr);
			 
			 String Line = br.readLine();
			 int sel1 =Integer.parseInt(Line);
			 
		
			 StudentEx[] temp1 = new StudentEx[sel1];
			 for (int i = 0; i < sel1; i++) {
				 String temp = br.readLine();
				 String[] inPo = temp.split(",");
				 temp1[i] = new StudentEx();
				 temp1[i].id = inPo[0];
				 temp1[i].pw = inPo[1];
				 
			}
			 
			 manager.load_StudentEx(temp1, sel1);
			 manager.print_StudentEx();
			} catch (IOException e) {	e.printStackTrace();}
			 finally {try {br.close();} catch (IOException e) {e.printStackTrace();}
			 finally {try {fr.close();} catch (IOException e) {e.printStackTrace();}}}
			
		}
		else if(sel==7) {}
		}
	}

}
