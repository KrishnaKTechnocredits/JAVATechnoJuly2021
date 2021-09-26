/* Create a class called BankAccount, which has 3 methods.
    a) setDetails() method to set username, password, bankAccountNumber.
    b) updatePassword(String password) method to update password
    c) displayInfo() method will print username, password & bankAccountNumber

Expectations:  call setDetails method then call updatePassword method and change the password. 
Call displayInfo method, it should print username, password (updated password) and bankAccountNumber.
 
NOTE : consider bank account number as Integer [for example : 13164] */

package poojaJoshi;

class BankAccount{
	
	String username;
	String password;
	int bankAccountNumber;
	

		void setDetails(){
			username= "pjoshi";
			password="newpass2!";
			bankAccountNumber=9823257;
		}
		
		void updatePassword(String newpwd){
			password=newpwd;
		}
		
		void displayInfo(){
			System.out.println("Userid is " +username);
			System.out.println("Password is " +password);
			System.out.println("Account number is" +bankAccountNumber);
		}
		
		public static void main (String[] args){
			BankAccount bankaccount = new BankAccount();
			bankaccount.setDetails();
			bankaccount.updatePassword("abc@1234#");
			bankaccount.displayInfo();
		}
}