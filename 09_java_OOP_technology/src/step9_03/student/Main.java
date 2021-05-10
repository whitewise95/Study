package step9_03.student;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Controller controller = new Controller();	
			
		while (true) {
			
			System.out.print("[1]추가 [2]수정 [3]삭제 [4]출력 [5]전체출력 [6]종료 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				
				System.out.print("번호를 입력하세요 : ");
				int num = scan.nextInt();
				
				System.out.print("이름을 입력하세요 : ");
				String name = scan.next();
				
				StudentInsert stInsert = controller.getInsert();
				stInsert.insert(new StudentVO(id , num , name));
				
			}
			else if (selectMenu == 2) {
				System.out.println("수정이 필요한 아이디를 입력해주세요");
				String id = scan.next();
				StudentInsert stInsert = controller.getInsert();
				boolean isTrue=stInsert.checkId(id);
				if(isTrue==false) {
					System.out.print("변경할 번호를 입력하세요 : ");
					int num = scan.nextInt();
					
					System.out.print("변경할 이름을 입력하세요 : ");
					String name = scan.next();
					stInsert.change(new StudentVO(id , num , name));
				}
				else {System.out.println("없는 id 입니다.");}
				
				
			}
			else if (selectMenu == 3) {
				System.out.println("삭제할 아이디를 입력해주세요");
				String id = scan.next();
				StudentInsert stInsert = controller.getInsert();
				stInsert.del_Id(id);
				
			}
			else if (selectMenu == 4) {
				
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				
				StudentSelect stSelect = controller.getSelect();
				StudentVO st = stSelect.select(id);
				
				if (st != null) st.printOneInfo();
			
			}
			else if (selectMenu == 5) {
				
				StudentSelectAll stAll = controller.getSelectAll();
				stAll.printAll();
			
			}
			else if (selectMenu == 6) {
				
				System.out.println("종료");
				scan.close();
				break;
			
			}
			
		}
		
	}

}
