package step5_02.file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

//# 파일 저장하기 : 연습문제2
//풀기시작하고 끝난시간 22:54~23:01
public class FileEx04_문제 {

	public static void main(String[] args) {
		
		// momk/1111/20000
		// megait/2222/30000
		// github/3333/40000
		
		String[] names = {"momk", "megait", "github"};
		String[] pws   = {"1111",   "2222",   "3333"};
		int[]    moneys= { 20000,    30000,    40000};
		
		
		String[] NPM =new String[3];
		
		for (int i = 0; i < NPM.length; i++) {
			 NPM[i]= names[i]+"/";
			 NPM[i]+= pws[i]+"/";
			 NPM[i]+= Integer.toString(moneys[i])+"\n";
		}
		String fileName = "NPM.txt";
		FileWriter fw = null;
		for (int i = 0; i < NPM.length; i++) {
			System.out.println(NPM[i]);
			System.out.println();
		}
		try {
			fw=new FileWriter(fileName);
			fw.write(NPM[0]);
			fw.write(NPM[1]);
			fw.write(NPM[2]);
		
		
		} catch (IOException e) {e.printStackTrace();}
		finally {try {	fw.close();} catch (IOException e) {e.printStackTrace();}
		}
	}
}
