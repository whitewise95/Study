package step5_02.file;

import java.io.FileWriter;
import java.io.IOException;

//# 파일 저장하기 : 연습문제1


public class FileEx03_문제 {

	public static void main(String[] args) {
		
		// 김철수/20,이만수/30,이영희/40
		
		FileWriter fw = null;
	
		
		String[] names = {"김철수", "이만수", "이영희"};
		int[] ages     = {	   20,     30,     40};
		
		String fileName = "fileTest01.txt";
		
		String[] age= new String[3];
		String data = "";
		for (int i = 0; i < ages.length; i++) {
			age[i] =Integer.toString(ages[i]);
		}
	
		
		
		
		for (int i = 0; i < ages.length; i++) {
				data += names[i]+"/"+ age[i];
				if(i<ages.length-1) {
					data+=",";
				}
			}
		
		
		try {
		   fw =new FileWriter(fileName);
		
		   fw.write(data);
		
		
		
		
		
		
		
		} catch (IOException e) {e.printStackTrace();
		}finally {
			try {fw.close();} catch (IOException e) {e.printStackTrace();}
		}
		
	}

}
