/*Create a class called BankAccount, which has 3 methods.
    a) setDetails() method to set username, password, bankAccountNumber.
    b) updatePassword(String password) method to update password
    c) displayInfo() method will print username, password & bankAccountNumber

Expectations:  call setDetails method then call updatePassword method and change the password. 
Call displayInfo method, it should print username, password (updated password) and bankAccountNumber.
 
NOTE : consider bank account number as Integer [for example : 13164]
*/
package amol_Pawar;
class BankAccount{
	String username;
	String password;
	int accountNumber;
	
	void setDetail(String bankUsername,String bankPassword,int bankAccountNumber){
		username=bankUsername;
		password=bankPassword;
		accountNumber=bankAccountNumber;		
	}
	
	void updatePassword(String bankPassword){
		password=bankPassword;
	}
	
	void displayInfo(){
		System.out.println("Username is : "+username);
		System.out.println("Password is : "+password);
		System.out.println("AccountNumber is : "+accountNumber);
	}
	public static void main(String args[]){
		BankAccount bankaccount =new BankAccount();
		bankaccount.setDetail("ampawar","Password@1234",13164);
		System.out.println("-------- User Details before password Update  ---------");
		bankaccount.displayInfo();
		bankaccount.updatePassword("MyNewPassword");
		System.out.println("-------- User Details after password Update  ---------");
		bankaccount.displayInfo();
	}
}