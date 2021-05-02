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
		//문제) data에 있는 내용을 잘라서 StudentList에 저장후 출력 하시오.

		StudentList[] stdList;
		String[] temp =data.split("\n");
		int size =Integer.parseInt(temp[0]);
		stdList = new StudentList[size];
		for (int i = 0; i < size; i++) {
			stdList[i] = new StudentList();
		}
		for (int i = 0; i < size; i++) {
			 String[] inPo = temp[i+1].split("/");
			 stdList[i].name = inPo[0];
			 stdList[i].score =Integer.parseInt(inPo[1]);
			 stdList[i].print();
		}
	}

}

