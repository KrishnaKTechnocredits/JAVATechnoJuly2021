package precilla;

class BankAccount{
	String userName,password;
	int bankAccountNumber;
	void setDetails()
	{
		userName="Precilla";
		password="******";
		bankAccountNumber=1458796;
	}
	void updatePassword(String newPassword)
	{
		password=newPassword;
	}
	void displayinfo()
	{
		System.out.println("User Name is "+userName);
		System.out.println("Updated Password of the user is "+password);
		System.out.println("Bank account number of the user is "+bankAccountNumber);
	}
	public static void main(String[] args)
	{
		BankAccount bankAccount=new BankAccount();
		bankAccount.setDetails();
		bankAccount.updatePassword("$$$$$$");//Print "$$$$$$" instead of "******"
		bankAccount.displayinfo();
		
	}		
}