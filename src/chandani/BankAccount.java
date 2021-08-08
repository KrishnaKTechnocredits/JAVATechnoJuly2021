package chandani;

class BankAccount{
	
	String username;
	String password;
	int bankAccountNumber;
	
	void setDetails(String uname, String pwd, int actNumb){
		username = uname;
		password = pwd;
		bankAccountNumber = actNumb;
	}
	
	void updatePassword(String updatedpassword){
		password = updatedpassword;
	}
	
	void displayInfo() {
		System.out.println("Username is " + username);
		System.out.println("Bank Account Number is " + bankAccountNumber);
		System.out.println("Updated password is " + password);
	}
	
	public static void main(String[] args){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("CHANDNI","TECHNOCREDITS",453365);
		bankAccount.updatePassword("AutomationClass");
		bankAccount.displayInfo();
	}
}