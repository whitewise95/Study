package step5_02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

//# 파일 로드하기 : 연습문제

//23:03~ 23:20
public class FileEx05_문제 {

	public static void main(String[] args)  {
		
		
		// 4번 연습문제에서 작성된 테스트파일을 읽어들여와 아래 배열에 저장하시오.
		
		String[] names = new String[3];			// momk , megait , github
		String[] pws   = new String[3];			// 1111 , 2222   , 3333
		int[] moneys   = new int[3];			// 20000, 30000 , 40000
		
		String fileName = "NPM.txt";
		File file = new File(fileName);
		FileReader fr =null;
		BufferedReader br = null;
	
		if(file.exists()) {
			
			String[] NPM = new String[3];
			
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				NPM[0] =br.readLine();
				NPM[1] =br.readLine();
				NPM[2] =br.readLine();
				
				for (int i = 0; i < NPM.length; i++) {
					String[] temp = NPM[i].split("/");
					names[i] = temp[0]+",";
					pws[i] = temp[1]+",";
				    moneys[i]=Integer.parseInt(temp[2]);
				}
				for (int i = 0; i < NPM.length; i++) {
					System.out.print(names[i]+".");
				}
				System.out.println();
				for (int i = 0; i < NPM.length; i++) {
					System.out.print(pws[i]+".");
				}
				System.out.println();
				for (int i = 0; i < NPM.length; i++) {
					System.out.print(moneys[i]+".");
				}
				
				
				
			} catch (IOException e) {	e.printStackTrace();}
			finally {try {br.close();} catch (IOException e) {e.printStackTrace();}
				finally {try {	fr.close();} catch (IOException e) {e.printStackTrace();}
				}
			}
		}
	}

}
