package step7_01.classArray;

import java.util.Iterator;

// 문자열(1단계)[문제]


class StudentList{

	String name;
	int score;
	
	void print() {
		System.out.println(this.name + " : " + this.score);
	}
	
}



public class ClassArrayEx11_문제 {

	public static void main(String[] args) {
		
		String data = "3\n"; 				// studentList의 크기
		data +="김영희/30\n";				// 이름/성적
		data += "이만수/40\n";
		data += "이철민/60";
		

		// StudentList[];
		//문제) data에 있는 내용을 잘라서 StudentList에 저장후 출력 하시오.
		
	
		String temp[] = data.split("\n");
		int size =Integer.parseInt(temp[0]);
		StudentList[] stdList= new StudentList[size];
	
		for (int i = 1; i < stdList.length+1; i++) {
			stdList[i-1] = new StudentList();
			String []temp2 = temp[i].split("/");
			stdList[i-1].name = temp2[0];
			stdList[i-1].score =Integer.parseInt(temp2[1]);
			stdList[i-1].print();
			
		}
				
		
	}

}

