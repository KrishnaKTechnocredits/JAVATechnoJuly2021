package sushant;

class BankAccount{
	String username;
	String password;
	String bankAccountNumber;

	void setDetails(String username1 , String password1 , String bankAccountNumber1){
		username = username1;
		password = password1;
		bankAccountNumber = bankAccountNumber1;
	}
	
	void updatePassword(String password1){
		password = password1;
	}
	
	void displayInfo(){
		System.out.println("Username is: "+username);
		System.out.println("password is: "+password);
		System.out.println("Bank Account number is: "+bankAccountNumber);
	}
	
	public static void main(String[] args){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("Sushant" , "Sushant@3689" , "361989");
		bankAccount.updatePassword("Sushant@3689");
		bankAccount.displayInfo();
	}
}