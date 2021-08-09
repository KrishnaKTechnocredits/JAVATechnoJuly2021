package rushikesh.loop;

class BankAccount{
	String username;
	String password;
	int bankAccountNumber;
	void setDetails(String setUsername,String setPassword,int setBankAccountNumber){
		username = setUsername;
		password = setPassword;
		bankAccountNumber = setBankAccountNumber;
		System.out.println("Your Username is "+username);
		System.out.println("Your Password is "+password);
		System.out.println("Your Bank Account Number is "+bankAccountNumber);
		System.out.println("-------------------");
	}
	void updatePassword(String newPassword){
		password = newPassword;
		System.out.println("Your New Password is "+password);
		System.out.println("-------------------");
	}
	
	void displayInfo(){
		System.out.println("Username is "+username);
		System.out.println("Password is "+password);
		System.out.println("Bank Account number is "+bankAccountNumber);
	}
	
	public static void main(String[] args){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("Rushikesh","rushikesh@3010",5454115);
		bankAccount.updatePassword("rushikesh@301012");
		bankAccount.displayInfo();
	}	
}		