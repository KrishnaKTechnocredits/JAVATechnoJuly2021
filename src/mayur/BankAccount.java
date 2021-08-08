/*Assignment - 5 : 5th Aug'2021

Create a class called BankAccount, which has 3 methods.
    a) setDetails() method to set username, password, bankAccountNumber.
    b) updatePassword(String password) method to update password
    c) displayInfo() method will print username, password & bankAccountNumber

Expectations:  call setDetails method then call updatePassword method and change the password. 
Call displayInfo method, it should print username, password (updated password) and bankAccountNumber.
 
NOTE : consider bank account number as Integer [for example : 13164]*/

package mayur;
class BankAccount{
	String username = "Mayur Shende";
	String password = "112233";
	int bankAccountNumber = 1234567890;
	 
	void setDetails(){
		System.out.println("-----Set Details -----");
		System.out.println("username is:"+username);
		System.out.println("password is:"+password);
		System.out.println("bankAccountNumber is :"+bankAccountNumber);
	}
	void updatePassword(String password1){
		System.out.println("-----Update password-----");
		password = password1;
		System.out.println("Password Updated :"+password);
	}
	void displayInfo(){
		System.out.println("--------Display Info--------");
		System.out.println("username is:"+username);
		System.out.println("user password is:"+password);
		System.out.println("bankAccountNumber is :"+bankAccountNumber);
	}
	public static void main(String[] args){
		BankAccount bankaccount = new BankAccount();
		bankaccount.setDetails();
		bankaccount.updatePassword("AA11BB22");
		bankaccount.displayInfo();
	}
}