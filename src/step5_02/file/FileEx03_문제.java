package step5_02.file;

import java.io.FileWriter;
import java.io.IOException;

//# 파일 저장하기 : 연습문제1

//문제 풀기 시작 시간 : 22:15 ~ 끝난시간 22:28
public class FileEx03_문제 {

	public static void main(String[] args) {
		
		// 김철수/20,이만수/30,이영희/40
		
		String[] names = {"김철수", "이만수", "이영희"};
		int[] ages     = {	   20,     30,     40};
	
		String name_Age = new String();
		
		for (int i = 0; i < names.length; i++) {
			name_Age += names[i];
			name_Age += "/";
			name_Age += Integer.toString(ages[i]);
			if(i!=names.length-1) {
				name_Age += ",";
			}
		}
		System.out.println(name_Age );
		String fileName = "name_Age.txt";
		FileWriter fw = null;
		

		try {
			
			fw = new FileWriter(fileName);
		   	fw.write(name_Age);
			
			
			
			
			
		} catch (IOException e) {e.printStackTrace();}
		finally {try {fw.close();} catch (IOException e) {e.printStackTrace();}
		}
	}
}
