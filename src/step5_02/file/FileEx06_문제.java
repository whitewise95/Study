package step5_02.file;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

//# 파일 컨트롤러[1단계] : 벡터

//23:24 ~ 23: 54분
public class FileEx06_문제 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vector = null;
		int elementCnt = 0;
		
		String fileName = "vector.txt";
		String[] data = null;
		String LastData ="";
		FileWriter fw = null;
		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		
		while (true) {
			for (int i = 0; i < elementCnt; i++) {
				System.out.println(data[i]+", ");
				
			}
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가하기");
			System.out.println("[2]삭제하기");
			System.out.println("[3]저장하기");
			System.out.println("[4]로드하기");
			System.out.println("[5]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
		
			if(sel==1) {
				System.out.println("추가할 단어를 입력해주세요");
				String temp = scan.next();
				if(data==null) {
					data= new String[1];
					data[0] = temp;
				}
				else {
					String[] inpo = data;
					data=new String[elementCnt+1];
					for (int i = 0; i < inpo.length; i++) {
						data[i]= inpo[i];
					}
					data[elementCnt] = temp;
				}
				elementCnt++;
				
			}
			else if(sel==2) {
				if(elementCnt==0) {System.out.println("데이터를 추가후 이용해주세요");}
				else if(elementCnt==1) {data=null;}
				else {
					for (int i = 0; i < data.length; i++) {
						System.out.println("["+(i+1)+"]"+data[i]);
					}
					System.out.println("삭제할 데이터의 번호를 입력해주세요");
					int index =scan.nextInt();
					index=index-1;
					String[] inpo = data;
					data=new String[elementCnt-1];
					for (int i = 0; i < index; i++) {
						data[i]= inpo[i];
					}
					for (int i = index; i < inpo.length-1; i++) {
						data[i]= inpo[i+1];
					}
					elementCnt--;
					
				}
			}
			else if(sel==3) {
				 try {
					fw = new FileWriter(fileName);
					LastData += elementCnt+"\n";
					for (int i = 0; i < elementCnt; i++) {
						LastData +=data[i]+"\n";
					}
					fw.write(LastData);
					
				} catch (IOException e) {e.printStackTrace();}
				finally {try {fw.close();} catch (IOException e) {e.printStackTrace();}
				}	
			}
			else if(sel==4) {
				if(file.exists()) {
					try {
						fr = new FileReader(fileName);
						br = new BufferedReader(fr);
						elementCnt =Integer.parseInt(br.readLine());
						data = new String[elementCnt];
						for (int i = 0; i < elementCnt; i++) {
							
							data[i]= br.readLine();
						}
					} catch (IOException e) {e.printStackTrace();}
					finally {try {br.close();} catch (IOException e) {e.printStackTrace();}
						finally {try {fr.close();	} catch (IOException e) {e.printStackTrace();}
						}
					}
				}
			}
			else if(sel==5) {break;}
			
		}
	}
}
