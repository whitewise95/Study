package step1_06.loop;

import java.util.Scanner;

/*
 * 
 * 17시24분
 * 
 * 
 * # ATM[2단계]
 * 
 * identfier 변수가 -1 이면 로그아웃 상태이고
 * 				   1 이면 dbAcc1유저가 로그인한 상태이며
 * 				   2 이면 dbACcc2유저가 로그인한 상태이다.
 * 
 * 
 * 1. 로그인
 *  - dbAcc1유저 및 dbAcc2유저가 로그인 후 다시 로그인을 누를경우 '현재 000 유저님 로그인중' 출력
 * 	- 로그아웃 상태에서만 이용 가능
 * 		> 로그인 되었습니다. '000 유저님 환영합니다.' 출력
 * 2. 로그아웃
 *  - 로그 아웃 상태에서 진행시 '로그인 이후 이용해주세요' 출력
 * 	- 로그인 후 이용가능 ' 로그아웃 되었습니다.' 출력
 * 
 */

public class LoopEx08_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
	
		
		
		int identifier = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		boolean isRun = true;
		
		
		while (isRun) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				if(identifier == -1) {
					System.out.println("계좌번호를 입력해주세요");
					int myAcc = scan.nextInt();
					System.out.println("비밀번호를 입력해주세요");
					int myPw = scan.nextInt();
					if(dbAcc1 == myAcc && myPw == dbPw1 )  {
						identifier = 1;
						System.out.println("Acc1님 환영합니다.");	
					}
				
					if(dbAcc2 == myAcc && myPw == dbPw2) {
						identifier = 2;
						System.out.println("2222님 환영합니다.");
					}
					else {
						System.out.println("틀렸습니다. 다시한번확인해주세요");
					}
					}
				if(identifier == 1) {
					System.out.println("Acc1님께서 로그아웃해야 사용가능합니다.");
				}
				if(identifier == 2) {
					System.out.println("Acc2님께서 로그아웃해야 사용가능합니다.");
				}
		
			 	}
			
			
			else if (selectMenu == 2) {
				if(identifier == 1 ) {
					selectMenu = -1;
					System.out.println("로그아웃되었습니다.");
				}
				else if(identifier == 2 ) {
					selectMenu = -1;
					System.out.println("로그아웃되었습니다.");
				}
				else {
					System.out.println("로그인 후에 이용해주세요");
				}
			}
			else if (identifier == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}

		scan.close();
	}
	}


