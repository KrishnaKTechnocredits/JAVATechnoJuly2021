//Create a class called BankAccount, which has 3 methods.
package shalaka.assignment1to5;
class BankAccount{
	String userName;
	String password;
	int bankAccountNumber;
	
	void setDetails(String newUserName, String newPassword, int newBankAccountNumber){
		userName = newUserName;
		password = newPassword;
		bankAccountNumber = newBankAccountNumber;
	}
	void updatePassword(String newPassword){
		 password = newPassword;
	}
			
	void displayInfo(){
		System.out.println("Username is " + userName);
		System.out.println("User passwrd is "+ password);
		System.out.println("User Bank Account No. is "+ bankAccountNumber);
	}
	public static void main(String [] args){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("shalaka","mayur1234@",121212);
		bankAccount.updatePassword("12345@");
		bankAccount.displayInfo();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	