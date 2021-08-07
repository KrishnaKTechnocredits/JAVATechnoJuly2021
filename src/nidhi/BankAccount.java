package nidhi;

class BankAccount{
	String username;
	String password;
	int bankAccountNumber;
	
	
	void setDetails(){
		username = "Nidhi_Chauhan";
		password = "Quest123$";
		bankAccountNumber = 746272;
	}
	
	void updatePassword(String passwd){
		password = passwd;
	}
	
	void displayInfo(){
		System.out.println(username);
		System.out.println(password);
		System.out.println(bankAccountNumber);
		
	}
	
	public static void main(String[] ar){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails();
		bankAccount.updatePassword("Fast2021@");
		bankAccount.displayInfo();
		
	
	}
}