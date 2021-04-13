package step6_01.classObject;
/*
 * # 영수증 출력하기 : 클래스 + 변수
 * 1. 햄버거 주문을 받아 영수증을 출력한다.
 * 2. 출력내용은 각 메뉴의 주문 수량과 총 금액 및 잔돈을 표시한다.
 * 
 * 	맘스터치
 *----------------------
 *ITEM	QTY	AMT
 *치즈버거	1	2500
 *불고기버거	1	3800
 *감자튀김	1	1500
 *콜      라	1	1000
 *----------------------
 *합계금액		8800
 *받은금액		10000
 *----------------------
 *잔       돈		1200
 */

import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.Engineering;

class Ex10_1 {
	String name = "";		// 가게 이름
	
	int[] arPrice   = {    2500,       3800,     1500,  1000};
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜      라"};
	
	int[] arCount = new int[4];
	
	int total = 0;
}





public class ClassEx10_문제 {

	public static void main(String[] args) {
		Ex10_1 e = new Ex10_1();
		Scanner scan = new Scanner(System.in);
		e.name = "롯데리아";
		for (int i = 0; i < e.arCount.length; i++) {
			e.arCount[i]=0;
		}
		
		while(true) {
			System.out.println("========="+e.name+"==========");
			System.out.println();
			for (int i = 0; i < e.arMenu.length; i++) {
				System.out.print("["+(i+1)+"]"+e.arMenu[i]+", "+e.arPrice[i]+"원");
				System.out.println();
			}
			System.out.println("[5] 주문하기" );
			System.out.println("메뉴선택 : ");
			System.out.println();
			int answer = scan.nextInt();
			if(answer==1) {e.arCount[0]++; e.total+=e.arPrice[0];}
			if(answer==2) {e.arCount[1]++; e.total+=e.arPrice[1];}
			if(answer==3) {e.arCount[2]++; e.total+=e.arPrice[2];}
			if(answer==4) {e.arCount[3]++; e.total+=e.arPrice[3];}
			if(answer==5) {
				System.out.println("========="+e.name+"==========");
				System.out.println();
			
				
						if(e.arCount[0]>0) {System.out.print(e.arMenu[0]+": "+e.arCount[0]+"개");
											
											 System.out.print(" "+e.arCount[0]*e.arPrice[0]+"원");}
						
						if(e.arCount[1]>0) {System.out.print(e.arMenu[1]+": "+e.arCount[1]+"개");
											
											System.out.print(" "+e.arCount[1]*e.arPrice[1]+"원");}
						
						if(e.arCount[2]>0) {System.out.print(e.arMenu[2]+": "+e.arCount[2]+"개");
											
											System.out.print(" "+e.arCount[2]*e.arPrice[2]+"원");}
						
						if(e.arCount[3]>0) {System.out.print(e.arMenu[3]+": "+e.arCount[3]+"개");
											
											System.out.print(" "+e.arCount[3]*e.arPrice[3]+"원");}
						
				
					System.out.println();
				
			
				System.out.println("==========================");
				System.out.println("총금액 : " +e.total);
				
				
			}
		
		}	
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
