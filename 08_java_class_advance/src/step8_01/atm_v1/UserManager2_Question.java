package step8_01.atm_v1;


import java.util.Scanner;

public class UserManager2_Question {
	
	Scanner scan = new Scanner(System.in);
	User[] user = null;
	int userCount = 0;
	
	void printAllUser() {
		for(int i = 0; i < userCount; i++) {
			user[i].printAccount();
		}
	}
	
	
	
	void addUser() {
		System.out.println("[메세지] 사용하실 아이디를 입력해주세요");
		String name = scan.next();
		if(userCount==0) {
			user = new User[1];
			user[0] = new User();
			user[0].id = name ;
			System.out.println(name+"님 가입되었습니다.");
		}
		else {
			
		int check = -1;
		for (int i = 0; i < user.length; i++) {
			if(name.equals(user[i].id)) {
				check = i;
			}
		}
		if(check==-1) {
			User[] temp = user;
			user = new User[userCount+1];
			for (int i = 0; i < userCount+1; i++) {
				user[i] = new User();
			}
			for (int i = 0; i < temp.length; i++) {
				user[i] = temp[i];
			}
			user[userCount].id=name;
			System.out.println(name+"님 가입되었습니다.");
		}
		else {System.out.println("이미 중복된 아이디입니다.");}
		}
		userCount++;
	}
		
	
	
	
	
	User getUser(int idx) {
		
		return user[idx];
	}
	
	
	
	
	int logUser() {
		return 5;
	}
	
	
	
	void leave() {
	}
	
}
