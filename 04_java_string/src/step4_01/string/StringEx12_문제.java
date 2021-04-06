package step4_01.string;

import java.util.Scanner;

/*
 * # 쇼핑몰 [장바구니]
 * 1. 로그인 후 쇼핑 메뉴를 선택하면, 다음과 같이 상품목록을 보여준다.
 * 	1) 사과
 *  2) 바나나
 *  3) 딸기
 * 2. 번호를 선택해 상품을 장바구니에 담을 수 있다.
 * 3. 로그인 회원의 인덱스 번호는 각 행의 첫번째 열에 저장한다.
 * 4. 해당 회원이 구매한 상품의 인덱스 번호는 각 행의 두번째 열에 저장한다.
 * 예)
 * {
 * 		{0, 1},				qwer회원 			> 사과구매
 * 		{1, 2},				javaking회원 		> 바나나구매
 * 		{2, 1},				abcd회원			> 사과구매
 * 		{0, 3},				qwer회원			> 딸기구매
 * 		...
 * }
 */



public class StringEx12_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		
		int count = 0;
		
		String[] items = {"사과", "바나나", "딸기"};
		
		int identifier = -1;
		
		while(true) {
			
			System.out.println("[MEGA MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {
				if(identifier == -1) {
					System.out.println("아이디를 입력해주세요");
					String myId =scan.next();
					System.out.println("비밀번호를 입력해주세요");
					String myPw=scan.next();
					for (int i = 0; i < items.length; i++) {   //아이디 비교
						if(myId.equals(ids[i]) && myPw.equals(pws[i])) {
							System.out.println("로그인되었습니다.");
							if(myId.equals(ids[0]) && myPw.equals(pws[0])) {identifier=1111;}
							else if(myId.equals(ids[1]) && myPw.equals(pws[1])) {identifier=2222;}
							else if(myId.equals(ids[2]) && myPw.equals(pws[2])) {identifier=3333;}
						}
						else {System.out.println("잘못된 아이디나 비밀번호 입니다.");}       //잘못된 비밀번호나 아이디
					}
				}
				else {System.out.println("이미 로그인 되었습니다.");}          //이미 로그인 되었을때
			}
			else if (sel == 2) {
				if(identifier!=-1) {
					System.out.println("로그아웃되었습니다.");            //로그아웃
					identifier = -1;   
				}
				else {System.out.println("로그인이 안되었거나, 잘못된 경로 입니다.");}  // 로그인이 안되었을때
				
			}
			else if (sel == 3) { 
				for (int i = 0; i < items.length; i++) {
					System.out.println("["+i+"]+"+items[i]);
				}
				System.out.println("장바구니에 담을 아이템을 선택해주세요");
				String itemNum = scan.next();
				jang[0][0]=identifier;
				jang[0][1]=
				
				
			}
			else if (sel == 4) {}
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}



	}

}
