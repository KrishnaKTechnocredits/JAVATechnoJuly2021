package laxman;

//Assignment 5 bankAccountinfo, update passwrd,Ac info with new details 
	
class BankAccount{
		String username = "Soumya";
		String password = "Soma1234" ;
		int bankAccountNumber = 123456789;
		

	void setDetails(){
		System.out.println(username);
		System.out.println(password);
		System.out.println(bankAccountNumber);
	
	}
	void updatePassword(String password1){
		password = password1;
		System.out.println("----------updated password--------------");
		System.out.println(password);
	}
	void displayInfo(){
		System.out.println("-----------------");
		System.out.println(username);
		System.out.println(password);
		System.out.println(bankAccountNumber);
	}
	
	public static void main(String[]args){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails();
		bankAccount.updatePassword("laxman1234");
		bankAccount.displayInfo();
	}
}	