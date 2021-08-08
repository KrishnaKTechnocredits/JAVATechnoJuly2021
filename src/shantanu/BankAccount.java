package shantanu;

class BankAccount{
	String username,password;
	int bankAccountNumber;
	
	void setDetails(String uname, String pwd, int accNo){
		username = uname;
		password = pwd;
		bankAccountNumber = accNo;
	}
	
	void updatePassword(String pwd){
		password = pwd;
	}
	
	void displayInfo(){
		System.out.println("User name: " + username);
		System.out.println("Password: " + password);
		System.out.println("Account Number: " + bankAccountNumber);
	}
	
	public static void main(String[] args){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("Sghanekar","pwd123",1243);
		System.out.println("----Details before update----");
		bankAccount.displayInfo();
		bankAccount.updatePassword("pwd987");
		System.out.println("----Details after update----");
		bankAccount.displayInfo();
	}
}