package akshay;

class BankAccount{
	String username;
	String password;
	int bankAccountNumber;
	
	void setDetails(){
		username = "Akshay";
		password = "Akshay123";
		bankAccountNumber = 123456;
	}
	
	void updatePassword(String newPassword){
		password = newPassword;
	}
	
	void displayInfo(){
		System.out.println(username);
		System.out.println(password);
		System.out.println(bankAccountNumber);
	}
	
	public static void main(String[] args){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails();
		bankAccount.updatePassword("Akshay007");
		bankAccount.displayInfo();
	}
	
}