package suchita;

class BankAccount{

	int bankAccountNumber ;
	String userName ;
	String pwd = " *****" ;
	
	void setDetails(){
		 bankAccountNumber = 12233;
		 userName = " Jay Prakash ";
		 System.out.println(" Customer bank account number :: " + bankAccountNumber);
		 System.out.println(" Customer user name :: " + userName);
		 System.out.println(" Current Password :: " + pwd);
		
	}
	
	void updatePassword(String pwd1){
		
		pwd = pwd1;
		System.out.println(" Updated Password :: " +pwd);
		
	}
	
	void displayInfo(){
		System.out.println(" \n Customer bank account number :: " + bankAccountNumber);
		System.out.println(" Customer user name :: " + userName);
		;
	}
	
	public static void main(String [] args){
		BankAccount bankaccount = new BankAccount();
		bankaccount.setDetails();
		bankaccount.displayInfo();
		bankaccount.updatePassword("#####");
	}
}