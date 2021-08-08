package aniket;
class BankAccount{
	String instanceUserName;
	String instancePassword;
	int instanceBankAccountNumber;
	
	void setDetails(String userName,String password,int bankAccountNumber){
		instanceUserName=userName;
		instancePassword=password;
		instanceBankAccountNumber=bankAccountNumber;
		System.out.println("username is "+ userName);
		System.out.println("password is "+ password);
		System.out.println("bankaccountnumber is "+ bankAccountNumber);
		
	}
	
	void updatePassword(String password){
		instancePassword=password;
		System.out.println("Password updated Successfully");
		
	}
	
	void displayBankinfo(){
		System.out.println("username is "+ instanceUserName);
		System.out.println("password is "+ instancePassword);
		System.out.println("bankaccountnumber is "+ instanceBankAccountNumber);
		
	}
	
	public static void main(String[] args){
		BankAccount bankaccount= new BankAccount();
		bankaccount.setDetails("Aniket","abcd",1234567890);
		bankaccount.updatePassword("ab0811");
		bankaccount.displayBankinfo();
		
	}

}