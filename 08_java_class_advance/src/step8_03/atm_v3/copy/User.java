package step8_03.atm_v3.copy;

public class User {
	
	String id;
	String password;
	Account[] accList;
	int accCount;
	
	
	User() {};
	

	
	void printOneUserAllAccounts() {
		if(accCount==0) {
			System.out.print(id+"/t"+password+"/t"+"계좌를 생성해주세요"); 
		}
		else {
			for (int j = 0; j < accList.length; j++) {
					System.out.print(accList[j].number + accList[j].money+"원");
				}
			}
			
		}
	}
	
	

