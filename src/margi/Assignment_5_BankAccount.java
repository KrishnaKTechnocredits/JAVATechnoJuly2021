package margi;

class Assignment_5_BankAccount{
	
	String userName;
	String password;
	int bankAccountNumber;
	
	void setDetails(String uName, String pass, int bankAccNum){
		userName = uName;
		password = pass;
		bankAccountNumber = bankAccNum;
	}
	
	void updatePassword(String uPass){
		password = uPass;
	}
	
	void displayInfo(){
		System.out.println("Username is " + userName);
		System.out.println("Password is " + password);
		System.out.println("Bank Account Number is " + bankAccountNumber);
	}
	
	public static void main(String[] args){
		Assignment_5_BankAccount bankAccount = new Assignment_5_BankAccount();
		bankAccount.setDetails("Margi","123abc",13164);
		bankAccount.updatePassword("789abc");
		bankAccount.displayInfo();
	}
}