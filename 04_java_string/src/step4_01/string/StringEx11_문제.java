package step4_01.string;

import java.util.Iterator;
import java.util.Scanner;

/*
 * # 쇼핑몰 [관리자]
 * 
 * 1. 카테고리와 아이템을 입력받아 아래의 예시와 같이 저장한다.
 * 2. 카테고리는 각 행의 첫번째 열에 저장한다.
 * 3. 아이템은 각 행의 두번째 열에 저장한다.
 *    단, 아이템은 여러개를 추가할 수 있도록 슬러시(/)를 구분자로 연결해준다.
 * 예)
 * {
 * 		{"과일", "사과/포도/"},
 * 		{"과자", "홈런볼/쪼리퐁/"},
 * 		{"음료", "콜라/"},
 * 		{"육류", "소고기/"}
 * 		...
 * 
 * 
 * } 
 */



public class StringEx11_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] items = new String[100][2];
		for(int i=0; i<items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}
		int itemCount = 0;
		
		
		while(true) {
           
			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아 이 템  관리");
			System.out.println("[3]전체품목 출력");
			
			System.out.print(": ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				System.out.println("등록할 카테고리명을 입력해주세요");
				String myName = scan.next();
				items[itemCount][0]=myName+",";
				itemCount++;
			}
			else if (sel == 2) {
				for (int i = 0; i < itemCount; i++) {
					System.out.println("["+i+"]"+items[i][0]);
				}
				System.out.println("카테고리를 선택해주세요 입력: ");
				sel = scan.nextInt();
				System.out.println("아이템 명을 입력해주세요");
				String myItemName = scan.next();
				items[sel][1] += myItemName+"/";
				
			}
			else if (sel == 3) {
				for (int i = 0; i < itemCount; i++) {
					for (int j = 0; j <= 1; j++) {
						System.out.print(items[i][j]);
					}
				}
			}
		}
	}

}
