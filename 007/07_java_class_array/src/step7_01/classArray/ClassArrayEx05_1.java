package step7_01.classArray;

import java.util.Scanner;

 class user0 {
	 
	 String name;
	 int money;
	 
 }




public class ClassArrayEx05_1 {
	
	public static void main(String[] args) {
		int max = 100;
		user0[] e = new user0[100];
		Scanner scan = new Scanner(System.in);
		int cnt =0;
		for (int i = 0; i < e.length; i++) {
			e[i] = new user0();
		}
		while (true) {
			
			System.out.println("1.회원가입");
			System.out.println("2.탈퇴");
			System.out.println("3.출력");
			System.out.println("4.종료");
			int sel = scan.nextInt();
			
			if(sel==1) {
				System.out.println("이름을 입력해주세요(id)");
				e[cnt].name = scan.next();
				System.out.println("입금할 금액을 입력해주세요");
				e[cnt].money = scan.nextInt();
				cnt++;
			}
			if(sel==2) {
				System.out.println("탈퇴할 이름을 입력해주세요(id)");
				String name = scan.next();
				for (int i = 0; i < cnt; i++) {
					if(e[i].name.equals(name)) {
						e[i].name=e[i+1].name;
						e[i].money=e[i+1].money;
						cnt--;
					}
				}
			}
			if(sel==3) {
				for (int i = 0; i < cnt; i++) {
					System.out.print("이름 : "+e[i].name);
					System.out.print("금액 : "+e[i].money);
					System.out.println();
					System.out.println("=========================");
				}
				
			}
			if(sel==4) {break;}
			
			
		}
	}
}
