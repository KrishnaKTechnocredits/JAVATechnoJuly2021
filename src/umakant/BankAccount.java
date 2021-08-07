package umakant;
class BankAccount{

	String userName;
	String password;
	int bankAccountNumber;
	
	void setDetails(String userName1,String password1,int bankAccountNumber1){
		userName=userName1;
		password=password1;
		bankAccountNumber=bankAccountNumber1;
	}
	
	void updatePassword(String password1){
		password=password1;
	}
	
	void displayInfo(){
		System.out.println("User Name is "+userName);
		System.out.println("User password is "+password);
		System.out.println("User bank account number is "+bankAccountNumber);
	}
	
	public static void main(String[] args){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("Umakant0402","IntialPassword",123456);
		System.out.println("******User Details Before Password Update***********");
		bankAccount.displayInfo();
		bankAccount.updatePassword("UpdatedPassword");
		System.out.println("******User Details After Password Update***********");
		bankAccount.displayInfo();
	}
}