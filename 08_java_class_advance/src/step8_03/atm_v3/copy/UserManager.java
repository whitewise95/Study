package step8_03.atm_v3.copy;

public class UserManager {
	private UserManager() {};
	private static UserManager instance = new UserManager();

	public static UserManager getInstance() {
		return instance;
	}
	public static void setInstance(UserManager instance) {
		UserManager.instance = instance;
	}
	int userCount = 0;
	User userList[];
	int identifier =-1;
	
	
	void printAllUserInfo() {
		System.out.println("아이디"+"\t"+"비밀번호"+"\t"+"계좌번호");
		for (int i=0; i<userCount; i++) {
			userList[i].printOneUserAllAccounts();
		}
		System.out.println("--------------------------");
		
	}
	
	
	void setDummy() {
		
		userCount = 5;
		userList = new User[userCount];
		for (int i=0; i<userCount; i++) {
			userList[i] = new User();
		}
				
		String[] a = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"};
		String[] b = {"l", "b", "c", "m", "e", "f", "g", "n", "i", "p", "k"};
		String[] c = {"s", "t", "u", "w", "v", "o", "x", "n", "q", "p", "r"};
		
		for (int i=0; i<userCount; i++) {
			String id = "";
			int rNum = ATM.ran.nextInt(a.length);
			id += a[rNum];
			rNum = ATM.ran.nextInt(b.length);
			id += b[rNum];
			rNum = ATM.ran.nextInt(c.length);
			id += c[rNum];
			
			userList[i].id = id;
		}
		
		String[] d = {"1", "8", "9", "4"};
		String[] e = {"2", "7", "0", "6"};
		String[] f = {"5", "3", "2", "7"};
		
		for (int i=0; i<userCount; i++) {
			String pw = "";
			int rNum = ATM.ran.nextInt(d.length);
			pw += d[rNum];
			rNum = ATM.ran.nextInt(e.length);
			pw += d[rNum];
			rNum = ATM.ran.nextInt(f.length);
			pw += d[rNum];
			
			userList[i].password = pw;
		}
		
		System.out.println("[메세지]더미 파일이 추가되었습니다.\n");
		
	}

	
	int checkId(String id) {
		return identifier;
		

	}
	
	
	void joinUser() {
		
	
		
	}
	
	
	void leaveUser() {
		
	
	}
	
	
	void loginUser() {
		
	
		
	}
	
	
	void logoutUser() {
	
	}
	
	
	void afterloginMenu() {
		
		while (true) {
			
			System.out.println("[" + userList[identifier].id + "님, 로그인]");
			System.out.println("[1]계좌생성 [2]입금하기 [3]출금하기 [4]이체하기 [5]계좌조회 "
					+ "[6]계좌삭제 [7]회원탈퇴 [0]뒤로가기");
			System.out.print("메뉴를 선택하세요 : ");
			int choice = ATM.scan.nextInt();
			
			if (choice == 1)  {
				AccountManager.getInstance().createAccount(); 
			}
			else if (choice == 2) {
				AccountManager.getInstance().income(); 
			}
			else if (choice == 3) {
				AccountManager.getInstance().outcome();
			}
			else if (choice == 4) {
				AccountManager.getInstance().transfer(); 
			}
			else if (choice == 5) {
				AccountManager.getInstance().lookupAcc(); 
			}
			else if (choice == 6) {
				AccountManager.getInstance().deleteAcc(); 
			}
			else if (choice == 7) {
				leaveUser();
				break;
			}
			else if (choice == 0) {
				logoutUser();
				break; 
			}
			
		}
		
	}


}









