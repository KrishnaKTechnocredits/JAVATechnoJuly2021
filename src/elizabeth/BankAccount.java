//Create a class called BankAccount, which has 3 methods.
//a) setDetails() method to set username, password, bankAccountNumber.
//b) updatePassword(String password) method to update password
//c) displayInfo() method will print username, password & bankAccountNumber

//Expectations:  call setDetails method then call updatePassword method and change the password. 
//Call displayInfo method, it should print username, password (updated password) and bankAccountNumber.
 
//NOTE : consider bank account number as Integer [for example : 13164]
package elizabeth;

class BankAccount{
	
	String username;
	String password;
	int bankAccountNumber;
	
	void setDetails(String uname, String password1, int bankAccountNumber1){
		username=uname;
		password=password1;
		bankAccountNumber= bankAccountNumber1;
	}
	
	void updatePassword(String updatePassword){
		password=updatePassword;
	}
	
	void displayInfo(){
		System.out.println("Username: " +username);
		System.out.println("Password: " +password);
		System.out.println("BankAccountNumber: " +bankAccountNumber);
	}
	
	public static void main(String[] args){
		BankAccount bankaccount= new BankAccount();
		bankaccount.setDetails("Elizabeth","Welcome10!",12345);
		bankaccount.updatePassword("Hello10!");
		bankaccount.displayInfo();
	}
	
}