package step3_01.arrayAdvance;

import java.util.Scanner;

/*
 * # ATM[4단계] : 전체 기능구현
 * 
 * 1. 회원가입
 * . id와 pw를 입력받아 가입
 * . 가입 시 돈 1000원 부여
 * . id 중복체크
 * 2. 회원탈퇴
 * . 로그인시에만 이용가능
 * 3. 로그인
 * . id와 pw를 입력받아 로그인
 * . 로그아웃 상태에서만 이용가능
 * 4. 로그아웃
 * . 로그인시에만 이용가능
 * 5. 입금
 * . 로그인시에만 이용가능
 * 6. 이체
 * . 로그인시에만 이용가능
 * 7. 잔액조회
 * . 로그인시에만 이용가능
 */


public class ArrayEx30_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int MAX = 5;
		
		String[] arId = new String[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX];
		
		int usrCnt = 0;
		int identifier = -1;
		
		String menu = "=== 메가IT ATM ===\n";
		menu += "1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n";
		menu += "5.입금\n6.이체\n7.잔액조회\n0.종료";
		
		while(true) {
			for (int i = 0; i < usrCnt; i++) {
				System.out.print(arId[i]+",");
				System.out.print(arPw[i]);
				System.out.println();
			}
			
			System.out.println(menu);
			
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(usrCnt==0) {
					System.out.println("[메세지]사용하실 아이디를 입력해주세요 : ");
					String yourId = scan.next();
					System.out.println("[메세지]사용 하실 비밀번호를 숫자로만 입력해주세요");
					int yourPw = scan.nextInt();
					arId[usrCnt] = yourId;
					arPw[usrCnt] = yourPw;
					arMoney[usrCnt]=1000;
					usrCnt++;
					
				}
				else if(usrCnt==5){
					System.out.println("[메세지]만들 수 있는 계정이 없습니다.!");
				}
				else if(usrCnt>0){
					int check = -1;
					System.out.println("[메세지]사용하실 아이디를 입력해주세요 : ");
					String yourId = scan.next();
					for (int i = 0; i <usrCnt; i++) {
						if(arId[i].equals(yourId)) {
							check = 1;
						}
					}
					if(check == -1) {
						System.out.println("[메세지]사용 하실 비밀번호를 숫자로만 입력해주세요");
						int yourPw = scan.nextInt();
						arId[usrCnt] = yourId;
						arPw[usrCnt] = yourPw;
						arMoney[usrCnt]=1000;
						usrCnt++;
					}
					else {
						System.out.println("[메세지]이미 가입된 아이디입니다.");
					}
				}
	
			}
			else if(sel == 2) {
				if(usrCnt==0 || identifier ==-1) {
					System.out.println("[메세지] 회원가입 하거나 로그인후  이용가능합니다.");
				}
				else {
					String[] idTemp = arId;
					int[] pwTemp = arPw;
					arId = new String[MAX];
					arPw = new int[MAX];
					for (int i = 0; i < identifier; i++) {
						arId[i] =   idTemp[i];
						arPw[i] =   pwTemp[i];
					}
					for (int i = identifier; i < usrCnt-1; i++) {
						arId[i] =   idTemp[i+1];
						arPw[i] =   pwTemp[i+1];
					}
					identifier =-1;
					usrCnt--;
				}
			}
			else if(sel == 3) {
				if(identifier==-1) {
					System.out.println("[메세지]아이디를 입력주세요");
					String yourId = scan.next();
					System.out.println("[메세지]비밀번호를 입력주세요");
					int yourPw = scan.nextInt();
					for (int i = 0; i < usrCnt; i++) {
						if(arId[i].equals(yourId) && arPw[i] == yourPw) {
							System.out.println("[메세지]로그인되었습니다.");
							identifier = i;
						}
					}
					if(identifier ==-1) {
						System.out.println("정보가 틀렸습니다.");
					}
				
				}
				else {
					System.out.println("[메세지]로그아웃 후 이용 가능합니다.");
				}
			}
			else if (sel == 4) {
				if (identifier == -1) {
					System.out.println("[메세지]로그인 후 이용가능합니다.");
				}
				else {
					identifier = -1;
					System.out.println("[메세지]로그아웃 되었습니다.");
				}
			}
			else if (sel == 5) {
				if (identifier == -1) {
					System.out.println("[메세지]로그인 후 이용가능합니다.");
				}
				else {
					System.out.print("[입금]입금할 금액을 입력하세요 : ");
					int money = scan.nextInt();
					
					arMoney[identifier] += money;
					System.out.println("[메세지]입금을 완료하였습니다.");
				}
			}
			else if (sel == 6) {
				
				if (identifier == -1) {
					System.out.println("[메세지]로그인 후 이용가능합니다.");
				}
				else {
					System.out.println("[이체]계좌번호를 입력하세요 : ");
					int account = scan.nextInt();
					
					int check = -1;
					for (int i=0; i<usrCnt; i++) {
						if (arId[i].equals(account)) {
							check = i;
						}
					}
					
					if (check == -1) {
						System.out.println("[메세지]계좌번호를 확인해주세요.");
						continue;
					}
					
					System.out.print("[이체]이체할 금액을 입력하세요 : ");
					int money = scan.nextInt();
					
					if (arMoney[identifier] >= money) {
						arMoney[identifier] -= money;
						arMoney[check] += money;
						System.out.println("[메세지]이체를 완료하였습니다.");
					}
					else {
						System.out.println("[메세지]잔액이 부족합니다.");
					}
				}
			}
			else if (sel == 7) {
				if (identifier == -1) {
					System.out.println("[메세지]로그인 후 이용가능합니다.");
				}
				else {
					System.out.println("고객님의 잔액은 " + arMoney[identifier] + "원 입니다.");
				}
			}
			else if (sel == 0) {
				break;
			}
		}


	}

}
