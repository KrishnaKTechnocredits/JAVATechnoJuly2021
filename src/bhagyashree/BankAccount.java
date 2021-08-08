//Assignment - 5 : 5th Aug'2021

/*Create a class called BankAccount, which has 3 methods.
    a) setDetails() method to set username, password, bankAccountNumber.
    b) updatePassword(String password) method to update password
    c) displayInfo() method will print username, password & bankAccountNumber

Expectations:  call setDetails method then call updatePassword method and change the password. 
Call displayInfo method, it should print username, password (updated password) and bankAccountNumber.
 
NOTE : consider bank account number as Integer [for example : 13164]*/


package bhagyashree;
class BankAccount
{
	String username;
	String password;
	int bankaccount;
	
	void setDetails(String uname,String pwd,int accno)
	{
		//System.out.println("Username:  "+ username + "Password:   "  + password +    "BankAccountNo:   " + bankaccountno);
		username=uname;
		password=pwd;
		bankaccount=accno;
	}
	
	void updatePassword(String pwd)
	{
		password=pwd;
	}
	
	void displayInfo()
	{
		System.out.println("Username:    "+username);
		System.out.println("Password:    "+password);
		System.out.println("Bankaccount:  "+bankaccount);
	}
	
	public static void main(String[] args)
	{
		BankAccount bank=new BankAccount();
		bank.setDetails("bhagyashree5511","Welcome@123",12345890);
		bank.updatePassword("Abcd@1234");
		bank.displayInfo();
	}
}