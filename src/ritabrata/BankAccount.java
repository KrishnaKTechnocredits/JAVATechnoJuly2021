package ritabrata;
class BankAccount{
	String username;
	String password;
	int accNumber;
	void setDetails(){
		username= "Ritabrata";
		password= "QwertY1";
		accNumber= 123456;
		System.out.println("Username: " + username);
		System.out.println("Existing Password: "+ password);
		System.out.println("Account number: " + accNumber);
	}
	void updatePassword(String newPassword){
		password= newPassword;
		System.out.println("New Account Details:");
	}
	void displayInfo(){
		System.out.println("Username: " + username);
		System.out.println("Updated Password: " + password);
		System.out.println("Account Number: " + accNumber);
	}
	public static void main(String[] args){
		BankAccount bankAccount= new BankAccount();
		bankAccount.setDetails();
		bankAccount.updatePassword("Rita9852");
		bankAccount.displayInfo();
	}
}