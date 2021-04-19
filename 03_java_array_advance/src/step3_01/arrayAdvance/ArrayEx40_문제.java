package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/*
 * 
 * # 배열 컨트롤러[2단계] : 벡터(Vector)
 * 
 * 1. 추가
 * . 값을 입력받아 순차적으로 추가
 * 2. 삭제(인덱스)
 * . 인덱스를 입력받아 해당 위치의 값 삭제
 * 3. 삭제(값)
 * . 값을 입력받아 삭제
 * . 없는 값 입력 시 예외처리
 * 4. 삽입
 * . 인덱스와 값을 입력받아 삽입
 * 
 */



public class ArrayEx40_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] scores = null;
		int elementCnt = 0;
		
		while(true) {
			
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(값)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택 : ");
			System.out.println(Arrays.toString(scores));
			
			
			int sel = scan.nextInt();
			if(sel==1) {
				int[] temp = new int[elementCnt+1];
				if( elementCnt==0) {
					scores = new int[elementCnt+1];
				}
				for (int i = 0; i < scores.length; i++) {
					temp[i] = scores[i];
				}
				scores = new int[elementCnt+1];
				for (int i = 0; i < temp.length; i++) {
					scores[i]=temp[i];
				}
				System.out.println("추가할 아이디를 입력해주세요");
				int yourId = scan.nextInt();
				scores[elementCnt] = yourId;
				elementCnt++;
			}
			
			else if(sel==2) {
				if(elementCnt!=0) {
					System.out.println("삭제할 인덱스 번호를 입력해주세요");
					for (int i = 0; i < scores.length; i++) {
						System.out.print("["+i+"]"+scores[i]+", ");
					}
					System.out.println();
					int index = scan.nextInt();
					if(index<=elementCnt) {
						int[] temp = new int[elementCnt];
						for (int i = 0; i < scores.length; i++) {
							temp[i] = scores[i];
						}
						scores = new int[elementCnt-1];
						for (int i = 0; i < index; i++) {
							scores[i]=temp[i];
						}
						for (int i =index; i < scores.length; i++) {
							scores[i]=temp[i+1];
						}
						elementCnt--;
					}
				}
			}
			else if(sel==3) {
				int x = 0;
				System.out.println("삭제할 값을 입력해주세요");
				for (int i = 0; i < scores.length; i++) {
					System.out.print(scores[i]+", ");
				}
				System.out.println();
				int id = scan.nextInt();
				for (int i = 0; i < scores.length; i++) {
					if(id==scores[i]) {
						x= i;
					}
				}
					int[] temp = new int[elementCnt];
					for (int i = 0; i < scores.length; i++) {
						temp[i] = scores[i];
					}
					scores = new int[elementCnt-1];
					for (int i = 0; i < x; i++) {
						scores[i]=temp[i];
					}
					for (int i =x; i < scores.length; i++) {
						scores[i]=temp[i+1];
					}
					elementCnt--;
				}
			
			else if(sel==4) {
				int x = 0;
				System.out.println("삽입할 인덱스를 입력해주세요");
				int index = scan.nextInt();
				System.out.println("삽입할 아이디를 입력해주세요");
				int id = scan.nextInt();
				if(index<=elementCnt) {
					int[] temp = new int[elementCnt];
					for (int i = 0; i < scores.length; i++) {
						temp[i] = scores[i];
					}
					scores = new int[elementCnt+1];
					System.out.println("1 : "+Arrays.toString(scores));
					for (int i = 0; i < index; i++) {
						scores[i]=temp[i];
						
					}
					System.out.println("2 : "+Arrays.toString(scores));
					scores[index]=id;
					for (int i =index+1; i < elementCnt+1; i++) {
						scores[i]=temp[i-1];
					}
					elementCnt++;
				}
				
				
				
			}
			else if(sel==0) {}
		
		}
	}

}
