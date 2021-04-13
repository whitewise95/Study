package step6_01.classObject;
/*
 * # ATM[4단계] : 전체 기능구현
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

import java.util.Arrays;
import java.util.Scanner;


class Ex11_1{
	String name = "";
	
	String[] arAcc = new String[5];
	String[] arPw  = new String[5];
	int[] arMoney  = new int[5];
	
	int accCnt = 0;
	int identifier = -1;
	int x=0;
}


public class ClassEx11_문제 {
	public static void main(String[] args) {
		Ex11_1 e = new Ex11_1();
		Scanner scan = new Scanner(System.in);
		

		e.name = "Mega Bank";
		
		while (true) {
			for (int i = 0; i < e.accCnt; i++) {	System.out.println(e.arAcc[i]+"\t"+e.arMoney[i]+"원");}
			
				if(e.identifier==-1) {System.out.println("로그아웃 상태");}
				if(e.identifier==1) {System.out.println(e.arAcc[0]+"님 환영합니다.");}
				if(e.identifier==2) {System.out.println(e.arAcc[1]+"님 환영합니다.");}
				if(e.identifier==3) {System.out.println(e.arAcc[2]+"님 환영합니다.");}
				if(e.identifier==4) {System.out.println(e.arAcc[3]+"님 환영합니다.");}
				if(e.identifier==5) {System.out.println(e.arAcc[4]+"님 환영합니다.");}
			
		
			
			System.out.println("[" + e.name + "]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금하기");
			System.out.println("[6]이체하기");
			System.out.println("[7]잔액조회");
			System.out.println("[0]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {
				System.out.println("사용하실 계좌번호를  입력해주세요");
				e.arAcc[e.accCnt] = scan.next();
				System.out.println("사용하실 계좌번호 비밀번호를  입력해주세요");
				e.arPw[e.accCnt] = scan.next();
				System.out.println("사용할 금액을 입력해주세요");
				e.arMoney[e.accCnt] = scan.nextInt();
				System.out.println("회원 가입 되었습니다.");
				e.accCnt++;
			}
			else if (sel == 2) {
				System.out.println("탈퇴할 계좌번호를 입력해주세요");
				String myAcc = scan.next();
				
				System.out.println("탈퇴할 계좌번호 비밀번호를 입력해주세요");
				String myPw = scan.next();
				String[] temp = new String[5];
				String[] temp2 = new String[5];
				
				for (int i = 0; i <e.arAcc.length; i++) {
					
					temp[i] = e.arAcc[i];
					temp2[i] = e.arPw[i];
					if(myAcc.equals(e.arAcc[i]) && myPw.equals(e.arPw[i]) ) {
						System.out.println("탈퇴되었습니다.");
						e.x=i;
					}
				}
				e.arAcc = new String [5];
				e.arPw = new String [5];
				for (int i = 0; i < e.x; i++) {
					e.arAcc[i] = temp[i];
					e.arPw[i]= temp2[i];
				}
				for (int i = e.x; i < e.arAcc.length-1; i++) {
					e.arAcc[i] = temp[i+1];
					e.arPw[i]= temp2[i+1];
				}
				e.accCnt--;
				System.out.println("e.x : " + e.x);
				System.out.println("arAcc : " + Arrays.toString(e.arAcc));
				System.out.println("arPw : " + Arrays.toString(e.arPw));
			}
			else if (sel == 3) {
				System.out.println("계좌번호를  입력해주세요");
				String myAcc= scan.next();
				for (int i = 0; i < e.arAcc.length; i++) {
					if(myAcc.equals(e.arAcc[i])) {
						System.out.println("비밀번호를  입력해주세요");
						String myPw = scan.next();
						for (int j = 0; j < e.arPw.length; j++) {
							if(myPw.equals(e.arPw[i])) {
								if(i==0) {e.identifier=1;}
								else if(i==1) {e.identifier=2;}
								else if(i==2) {e.identifier=3;}
								else if(i==3) {e.identifier=4;}
								else if(i==4) {e.identifier=5;}
							}
							
						}
					}
					
				}
			
			}
			else if (sel == 4) {
				if(e.identifier==-1) {System.out.println("로그인 후 이용해주세요");}
				else if(e.identifier==1) {System.out.println("로그아웃 되었습니다.");e.identifier=-1;}
				else if(e.identifier==2) {System.out.println("로그아웃 되었습니다.");e.identifier=-1;}
				else if(e.identifier==3) {System.out.println("로그아웃 되었습니다.");e.identifier=-1;}
				else if(e.identifier==4) {System.out.println("로그아웃 되었습니다.");e.identifier=-1;}
				else if(e.identifier==5) {System.out.println("로그아웃 되었습니다.");e.identifier=-1;}
			}
			else if (sel == 5) {
				if(e.identifier>0) {
					System.out.println("입금할 계좌를 입력해주세요");
					String yourAcc = scan.next();
					for (int i = 0; i < e.arAcc.length; i++) {
						if(yourAcc.equals(e.arAcc[i])) {
							System.out.println("얼마를 보내겠습니까?");
						
						}
					}
					
				}
			}
			else if (sel == 6) {}
			else if (sel == 7) {}
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}		
		
	}

}
