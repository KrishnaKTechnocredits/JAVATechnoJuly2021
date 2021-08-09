/*8Assignment - 5 : 5th Aug'2021

Create a class called BankAccount, which has 3 methods.
    a) setDetails() method to set username, password, bankAccountNumber.
    b) updatePassword(String password) method to update password
    c) displayInfo() method will print username, password & bankAccountNumber

Expectations:  call setDetails method then call updatePassword method and change the password. 
Call displayInfo method, it should print username, password (updated password) and bankAccountNumber.
 
NOTE : consider bank account number as Integer [for example : 13164] */
package harshada;
class BankAccount{
	String userName, password;
	int bankAccountNumber;
	
	void setDetails( String p, String q, int r){
		userName=p;
		password=q;
		bankAccountNumber=r;
	}
	
	void updatePassword(String updatedpw){
		password=updatedpw;
	}
	 void displayInfo(){
	  System.out.println(" \n Bank Username = " +userName);
	  System.out.println(" Bank Password = " + password);
	  System.out.println(" Account Number = " + bankAccountNumber);
	 }
	 
	 public static void main( String[] a){
	 
		BankAccount bankAccount=new BankAccount();
		bankAccount.setDetails("Charlie Harper", "CH@123", 123456);
		bankAccount.updatePassword("CharlieHarper@123");
		bankAccount.displayInfo();
	 }
}
	  
	
	