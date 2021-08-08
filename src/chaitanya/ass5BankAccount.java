//Assignment - 5 : 5th Aug'2021

//Create a class called BankAccount, which has 3 methods.
  //  a) setDetails() method to set username, password, bankAccountNumber.
   // b) updatePassword(String password) method to update password
    // c) displayInfo() method will print username, password & bankAccountNumber

//Expectations:  call setDetails method then call updatePassword method and change the password. 
//Call displayInfo method, it should print username, password (updated password) and bankAccountNumber.
 
//NOTE : consider bank account number as Integer [for example : 13164]
package chaitanya;

class ass5BankAccount{
	
	String username , password ;
	int bankacctnum;
	
	void setDetails(){
		
		username = "Test1234";
		password = "********";
		bankacctnum = 123456;
		System.out.println("Username :" + username + "\n" + "Password :" + password + "\n" + "Bank Account Number :" + bankacctnum);
	}
	
	void updatePassword(String upassword){
		password = upassword ;
		System.out.println("Updated Password Successfully");
	}
	
	void displayInfo(){
		System.out.println("Username :" + username + "\n" + "Password :" + password + "\n" + "Bank Account Number :" + bankacctnum);
	}
	
	public static void main(String[] args){
		ass5BankAccount ass5bankaccount = new ass5BankAccount();
		ass5bankaccount.setDetails();
		ass5bankaccount.updatePassword("&&&&&&&");
		ass5bankaccount.displayInfo();
	}
}