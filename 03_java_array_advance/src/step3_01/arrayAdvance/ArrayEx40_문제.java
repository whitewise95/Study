package step3_01.arrayAdvance;

import java.util.Arrays;
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
			
			if (sel == 1) {
				if(elementCnt==0) {
					scores  =new int[elementCnt+1];
				}
				else if(elementCnt>0) {
					int[] temp = scores;
					scores = new int[elementCnt+1];
					for (int i = 0; i < temp.length; i++) {
						scores[i] = temp[i];
					}
				}
					System.out.println("값을 입력해주세요");
					int date = scan.nextInt();
					scores[elementCnt] = date;
					elementCnt++;
			}
			else if (sel == 2) {
				if(elementCnt==0) {
					System.out.println("삭제할 인덱스가 없습니다.");
				}
				else if(elementCnt==1) {
					scores = null;
				}
				else if(elementCnt>1) {
					System.out.println("삭제할 인덱스번호를 0~"+(elementCnt-1)+"중 입력해주세요");
					int deta = scan.nextInt();
					int[] temp = scores;
					scores = new int[elementCnt-1];
					for (int i = 0; i <deta; i++) {
						scores[i] = temp[i];
					}
					for (int i = deta; i <elementCnt-1;  i++) {
						scores[i] = temp[i+1];
						elementCnt--;
					}
				}
			
			}
			
			else if (sel == 3) {
				if(elementCnt==0) {
					System.out.println("삭제할 인덱스가 없습니다.");
				}
				else if(elementCnt==1) {
					scores = null;
				}
				else if(elementCnt>1) {
					System.out.println("삭제할 값을 입력해주세요");
					int deta = scan.nextInt();
					for (int i = 0; i < scores.length; i++) {
						if(scores[i]==deta) {
							int temp[] = scores;
							scores = new int[elementCnt-1];
							for (int j = 0; j < i;  j++) {
								scores[j] = temp[j]; 	
							}
							for (int j = i; j <elementCnt; j++) {
								scores[j] = temp[j+1];
								elementCnt--;
							}
						
					
						}
					}
				}
				
			}
			else if (sel == 4) {}
			else if (sel == 0) {
				break;
			}
		
		}



	}

}
