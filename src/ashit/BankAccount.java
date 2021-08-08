package ashit;
class BankAccount{
	
	String username;
	String password;
	int bankAccountNumber;
	
	void setDetails(){
		username="Amit";
		password="Qwerty@123";
		bankAccountNumber=1234567890;
	}
	
	void updatePassword(String password_changed){
		password=password_changed;
	}	
		
	void displayInfo(){
		System.out.println("Customer username is  " +username);
		System.out.println("Customer bankAccountNumber is  "+bankAccountNumber);
		System.out.println("Customer changed password is  " +password);
	}
	
	public static void main (String[] args){
		BankAccount bankaccount = new BankAccount();
		bankaccount.setDetails();
		bankaccount.updatePassword("zorro@789");
		bankaccount.displayInfo();
	}
	
}