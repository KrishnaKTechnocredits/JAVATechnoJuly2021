package suruchi;

// Print username, password (updated password) and bankAccountNumber

class BankAccount{
	
	String username;
	String password;
	int bankAccountNumber;
	
	void setDetails(){
		username = "surujoshi";
		password = "surutechno21";
		bankAccountNumber = 1314567;
	}
	
	void updatePassword(String updatePassword){
		password = updatePassword;
	}
	
	void displayInfo(){
		System.out.println("Customer username is: " + username);
		System.out.println("Customer password is: " + password);
		System.out.println("Bank Account No. is: " + bankAccountNumber);
	}
	
	public static void main(String[] a){
		BankAccount bankaccount = new BankAccount();
		bankaccount.setDetails();
		bankaccount.updatePassword("surutechnocredits");
		bankaccount.displayInfo();
	}

}