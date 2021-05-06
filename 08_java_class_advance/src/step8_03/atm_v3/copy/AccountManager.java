package step8_03.atm_v3.copy;


public class AccountManager {

	private AccountManager() {}
	private static AccountManager instance = new AccountManager();
	public static AccountManager getInstance() {
		return instance;
	}
	
	UserManager userManager = UserManager.getInstance();
	
	void createAccount() {
		
		
		
	}
	
	
	int showAccList(String msg) {
		return 0;
		

		
	}
	
	
	void income() {
	
	}
	
	
	void outcome() {
	
	}
	
	
	int checkAcc(String transAccount) {
		return 0;
		
	
	}
	
	
	int getAccIndex(int transUserIndex, String transAccount) {
		return transUserIndex;
		
	
		
	}
	
	
	void transfer() {
		
	
	}
	
	
	void lookupAcc() {
	
	}

	
	void deleteAcc() {
		
	
	}
		
		
	
	
	
	
}
