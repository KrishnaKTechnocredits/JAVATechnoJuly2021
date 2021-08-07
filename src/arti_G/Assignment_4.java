package arti_G;
//BankAccount
class Assignment_4{
	
	String userName;
	String password; 
	int bankAccountNumber;
	
	void setDetails(String userName, String password, int bankAccountNumber){
		System.out.println(userName);
		System.out.println(password);
		System.out.println(bankAccountNumber);
	}

	void updatePassword(String password){
		System.out.println(password);
	}
	void displayInfo(){
		System.out.println(userName);
		System.out.println(password);
		System.out.println(bankAccountNumber);
	}
	
	public static void main(String[] args){
		Assignment_4 assignment_4 = new Assignment_4();
		assignment_4.setDetails("Arti Gahlot", "Qwerty", 87478848);
		assignment_4.updatePassword("Welcome@");
		assignment_4.displayInfo();
	}	 
}

