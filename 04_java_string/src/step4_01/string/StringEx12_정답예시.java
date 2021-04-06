package step4_01.string;

import java.util.Scanner;

public class StringEx12_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		String[] items = {"사과","바나나","딸기"};
		
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		int count = 0;
		int identifier = -1;
		
		while (true) {
			
			System.out.println("-----------------------------");
			System.out.print("상태 : ");
			if ( identifier == -1 ) 		System.out.println("로그아웃");
			else 							System.out.println(ids[identifier] + "로그인");
			System.out.println("-----------------------------");
			
			
			System.out.println("[MEGA MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.print("ID: ");
				String myId = scan.next();
				
				System.out.print("PW : ");
				String myPw = scan.next();
				
				for ( int i=0; i<ids.length; i ++ ) {
					if (myId.equals(ids[i]) && myPw.equals(pws[i])) { 
						identifier = i;
					}
				}
				
				if (identifier == -1) 	System.out.println("ID와 PW를 확인해주세요.");
				else 					System.out.println(ids[identifier] +"님, 환영합니다.");
			}
			else if (sel == 2) {
				identifier = -1;
				System.out.println("로그아웃 되었습니다.");
			}
			else if (sel == 3) {
				if (identifier == -1) {
					System.out.println("로그인 후 이용 가능합니다."); 
					continue;
				}
				
				while (true) {
					
					System.out.println("상품목록");
					for(int i=0; i<items.length; i++) System.out.println("[" + (i+1) + "] " + items[i]);
					System.out.println("[4]뒤로가기");
					
					System.out.print("상품번호를 선택하세요 : ");
					
					int choice = scan.nextInt();
					
					if ( choice == 4 ) break;
					jang[count][0] = identifier;
					jang[count][1] = choice;
					
					count++;
											
				}
											
			}
			else if (sel == 4) {
				int apple = 0;
				int banana = 0;
				int berry = 0;
				
				for (int i=0; i<count; i++) {
					if		(jang[i][1] == 1) apple++;
					else if (jang[i][1] == 2) banana++;
					else if (jang[i][1] == 3) berry++;
					
				}
				
				System.out.println(items[0] + " : " + apple + "개");
				System.out.println(items[1] + " : " + banana + "개");
				System.out.println(items[2] + " : " + berry + "개");
			}
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
		scan.close();

	}

}
