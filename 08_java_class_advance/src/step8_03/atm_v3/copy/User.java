package step8_03.atm_v3.copy;

public class User {
	String id;
	String pw;
	int accCnt;
	Account accList[] ;
	
	User(){};
	
	
	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	


	public User(String id, String pw, Account[] accList, int accCnt) {
		this.id = id;
		this.pw = pw;
		this.accCnt = accCnt;
		this.accList =accList;
	}


	void printOneUserAllAccounts() {
		
			if(accCnt==0) {
				System.out.println(id+"\t"+ pw+"\t"+"계좌를 만들어주세요 ");
			}
			else {
				for (int i = 0; i < UserManager.getInstance().userCnt; i++) {
					System.out.println(id+"\t"+ pw+"\t"+accList[i].acc +"\t"+"금액 : "+accList[i].money);
				}
			}
		
		
	}
	
	

}
