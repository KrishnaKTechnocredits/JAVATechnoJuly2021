package manaswi;

class BankAccount
{
	void setDetails(String username,String password,int accountnumber)
	{
		System.out.println("User name is :"+username);
		System.out.println("User password is:"+password);
		System.out.println("User password is:"+ accountnumber);
	}
	void updatePassword(String password)
	{
		System.out.println("Updated password is :"+password);
	}
	void displayInfo(String username,String password,int accountnumber)
	{
		System.out.println("User name is :"+username);
		System.out.println("User password is:"+password);
		System.out.println("User password is:"+accountnumber);
	}
	public static void main(String []args)
	{
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("Diva Patil","Diva@123",121314);
		bankAccount.updatePassword("Pdiva@321");
		bankAccount.displayInfo("Diva Patil","Pdiva@321",121314);
	}
}