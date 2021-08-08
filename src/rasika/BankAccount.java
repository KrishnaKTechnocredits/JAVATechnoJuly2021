package rasika;

class BankAccount{
	
	String userName;
	String password;
	int accountNumber;
	String updatedPassword;
	
	void setDetails(String uname, String pwd, int accnum){
		userName = uname;
		password = pwd;
		accountNumber = accnum;
	}
	void updatePassword(String updatedpwd){
		updatedPassword = updatedpwd;
	}
	void displayInfo(){
		System.out.println("Username is "+userName);
		System.out.println("Password is "+password);
		System.out.println("Bank Account Number is "+accountNumber);
		System.out.println("Updated password is "+updatedPassword);
	}
	
	public static void main(String[] args){
		BankAccount bankaccount = new BankAccount();
		bankaccount.setDetails("Rasika","abc123",112327);
		bankaccount.updatePassword("Leonel Messi");
		bankaccount.displayInfo();
	}
}