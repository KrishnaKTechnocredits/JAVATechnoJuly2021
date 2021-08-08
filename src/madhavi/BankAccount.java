package madhavi;

class BankAccount{
	String username;
	String password;
	int bankAccountNumber;
	//method to set username, password, bankAccountNumber.
	void setDetails(String uname,String pwd,int bankAccountNo){
		username = uname;
		password = pwd;
		bankAccountNumber = bankAccountNo;
		System.out.println("Username:" +username + "\n" + "Old Password:" +password + "\n" + "BankAccountNumber:" +bankAccountNumber);
	}
	//method to update password
	void updatePassword(String pwd){
		password = pwd;
		System.out.println("Updated password is:" +password);
	}
	//method to displayInfo
	void displayInfo(){
		System.out.println("Username:" +username);
		System.out.println("New Password:" +password);
		System.out.println("Account Number:" +bankAccountNumber);
	}
	public static void main(String[] args){
		BankAccount bankaccount = new BankAccount();
	    System.out.println("(A)Bank Details before updating password:");
		bankaccount.setDetails("User123","User@123",1011011011);
		System.out.println("--------------------------------------");
		bankaccount.updatePassword("Bank@123");
		System.out.println("--------------------------------------");
		System.out.println("(B)Bank Details After updated password:");
		bankaccount.displayInfo();	
	}	
}