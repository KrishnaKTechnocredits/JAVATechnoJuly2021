package indrani;
class BankAccount{
    
    String username;
	String password;
	int bankAccountNumber;
	
	void setDetails(String name,String pword,int acnumber){
		 username = name;
		 password = pword;
		 bankAccountNumber = acnumber;
		 System.out.println( "User details are as follows : ");
		 System.out.println( "Name of the customer : "+username);
		 System.out.println( "Password is : "+password);
		 System.out.println( "Account number is : "+bankAccountNumber);
	}
	void updatePassword(String newPassword){
	     password = newPassword;
    }
    void displayInfo(){
		 System.out.println( "User details after updation are as follows : ");
		 System.out.println( "Name of the customer : "+username);
		 System.out.println( "Password is : "+password);
		 System.out.println( "Account number is : "+bankAccountNumber);
	}
	public static void main(String [] args){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("Indrani Banerjee","abc@123",12345678);
		bankAccount.updatePassword("Welcome123");
		bankAccount.displayInfo();
	}
}
	
		 
	 