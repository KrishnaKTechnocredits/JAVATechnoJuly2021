/* Assignment No - 5  : 5th Aug'2021

Create a class called BankAccount, which has 3 methods.
    a) setDetails() method to set username, password, bankAccountNumber.
    b) updatePassword(String password) method to update password
    c) displayInfo() method will print username, password & bankAccountNumber

Expectations:  call setDetails method then call updatePassword method and change the password. 
Call displayInfo method, it should print username, password (updated password) and bankAccountNumber.
 
NOTE : consider bank account number as Integer [for example : 13164]   */

package arti_K;

class BankAccount{
	
	String userName;
	String password;
	int bankAccount;
	
	void setDetails(String uname, String pwd, int accountNo){
		userName = uname;
		password = pwd;
		bankAccount = accountNo;
		System.out.println("\n--------- Initial Details --------- ");
		System.out.println("Username is : "+userName);
		System.out.println("Password is : "+password);
		System.out.println("Bank Account no is : "+bankAccount);
	}
	
	void updatePassword(String updatedpswrd){
		password = updatedpswrd;
		System.out.println("\nUpdated password is : "+password);
	}
	
	void displayinfo(){
		System.out.println("\n--------- User Details and Updated Password --------- ");
		System.out.println("Username is : "+userName);
		System.out.println("Password is : "+password);
		System.out.println("Bank Account no is : "+bankAccount);
	}
	
	public static void main(String[] args){
		BankAccount bankaccount = new BankAccount();
		bankaccount.setDetails("Aarti","abc#090",152369752);
		bankaccount.updatePassword("xyz@123");
		bankaccount.displayinfo();
	}
}