package arti_G;
//User Details
class Assignmnet_5{
	
	String uName;
	String pass;
	int bankAccountNo;
	
	void setDetails(String userName, String password, int bankAccountNumber){
		uName = userName;
		pass = password;
		bankAccountNo = bankAccountNumber;
	}

	void updatePassword(String password){
		pass = password;
	}
	
	void displayInfo(){
		System.out.println("Username is "+ uName);
		System.out.println("Updated password is "+ pass);
		System.out.println("Bank Account Number is "+ bankAccountNo);
	}
	
	public static void main(String[] args){
		Assignmnet_5 assignmnet_5 = new Assignmnet_5();
		assignmnet_5.setDetails("Arti Gahlot", "Qwerty", 874788789);
		assignmnet_5.updatePassword("Welcome@");
		assignmnet_5.displayInfo();
	}	 
}

