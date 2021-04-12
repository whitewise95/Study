package step5_02.file;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//# 파일 컨트롤러[1단계] : 벡터

public class FileEx06_문제 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vector = null;
		int elementCnt = 0;
		
		String fileName = "vector.txt";
		
		while (true) {
			for (int i = 0; i < elementCnt; i++) {
				System.out.println(vector[i]+", ");
				
			}
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가하기");
			System.out.println("[2]삭제하기");
			System.out.println("[3]저장하기");
			System.out.println("[4]로드하기");
			System.out.println("[5]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
		
			if (sel == 1) {
				if(elementCnt==0) {
					vector =new int[elementCnt+1];
				
				}
				else if(elementCnt>0) {
					int[] temp = vector;
					vector =new int[elementCnt+1];
					
					for (int i = 0; i < elementCnt; i++) {
						vector[i]=temp[i];
					}
					temp=null;
				}
				System.out.println("추가 하실 데이터를 입력해주세요");
				int data= scan.nextInt();
				
				vector[elementCnt]=data;
				elementCnt++;
			}
				
			else if (sel == 2) {
				int[] copy = vector;
				vector = new int[elementCnt-1];
				elementCnt--;
				System.out.println("삭제할 데이터인덱스를 입력해주세요");
				int temp = scan.nextInt();
				for (int i = 0; i < temp; i++) {
					 vector[i]=copy[i];
				}
				for (int i = temp; i < vector.length; i++) {
					vector[i]=copy[i+1];
				}
			}
			else if (sel == 3) {
				FileWriter fw =null;
				String data = "";
				try {fw = new FileWriter("vector.txt");
				for (int i = 0; i < vector.length; i++) {
				 data += vector[i]+"\n";
				 System.out.println();
				}
				fw.write(data);
				} catch (IOException e) {e.printStackTrace();
				} finally {try {fw.close();} catch (IOException e) {e.printStackTrace();}
				}
				
			}
			else if (sel == 4) {
				File file = new File ("vector.txt");
				String data = "";
				
				
				
				if(file.exists()) {
				FileReader fr = null;
				BufferedReader br = null;
				
				try {
					fr =new FileReader(file);
					br= new BufferedReader(fr);
					
				
					while (true) {
						String line = br.readLine();
						if (line == null) {
							break;
						}
						data += line;
						data += "\n";
					}
					data =data.substring(0,data.length()-1);
					String[] temp =data.split("\n");
					elementCnt = temp.length;
					
					vector = new int[elementCnt];
					
					for (int i = 0; i < elementCnt; i++) {
						vector[i] =Integer.parseInt(temp[i]);
					}
					
					
					
					
					
					
				} catch (Exception e) {e.printStackTrace();}finally {try {br.close();
					} catch (IOException e) {e.printStackTrace();}finally {try {fr.close();} catch (IOException e) {e.printStackTrace();
							}
						}
					}	
				}
			}
			else if (sel == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
	}
}
