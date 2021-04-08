package step5_02.file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

//# 파일 저장하기 : 연습문제2

public class FileEx04_문제 {

	public static void main(String[] args) {
		
		// momk/1111/20000
		// megait/2222/30000
		// github/3333/40000
		
		String[] names = {"momk", "megait", "github"};
		String[] pws   = {"1111",   "2222",   "3333"};
		int[]    moneys= { 20000,    30000,    40000};
		
		String fileName = "fileTest02.txt";
		FileWriter fw = null;
		String data = "";
		String full [][]= new String[3][1];
		String[] sNum=new String[3];
		for (int i = 0; i < 3; i++) {
			 sNum[i] =Integer.toString(moneys[i]);
			 full[i][0] = names[i]+"/"+pws[i]+"/"+sNum[i];
			 data += full[i][0]+"\n";
		}
		try {fw = new FileWriter(fileName);
		 fw.write(data);
	
		} catch (IOException e) {e.printStackTrace();}
		try {fw.close();} catch (IOException e) {e.printStackTrace();}

	}

}
