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
		int size = 0;
		String[] temp2 = new String[2];

		// StudentList[];
		//문제) data에 있는 내용을 잘라서 StudentList에 저장후 출력 하시오.
		
		String[] temp =data.split("\n");
		size =Integer.parseInt(temp[0]);
		StudentList[] stdList = new StudentList[size];
		for (int i = 0; i < stdList.length; i++) {
			stdList[i] = new StudentList();
		}	
	
		for (int i = 0; i < stdList.length; i++) {
				temp2 = temp[i+1].split("/");	
				 stdList[i].name = temp2[0];
				 stdList[i].score =Integer.parseInt(temp2[1]);
				 stdList[i].print();
				 
		}
	for (int i = 0; i < stdList.length; i++) {
		
	}

		
	}

}

