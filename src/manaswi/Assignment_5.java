package manaswi;

public class Assignment_5
{
	String username;
      String password;
      int bankAccountNo;

	
	void setDetails(String user, String pass, int bankAccount){
	     username= user;
         password= pass;
         bankAccountNo= bankAccount;
	}

	void updatePassword(String pass){
	     password= pass;
	}

	void displayInfo()
	{
	     System.out.println("username - "+username);
	     System.out.println("password - "+password);
	     System.out.println("Bank Account Number is- "+bankAccountNo);
	}

	public static void main(String[] args)
	{
	     Assignment_5 bankAccount =new Assignment_5();
	     bankAccount.setDetails("Manaswi Humbe","Man@10",435671);
	     bankAccount.displayInfo();
	     System.out.println("Updated password is- ");
	     bankAccount.updatePassword("ManH@20");
	     bankAccount.displayInfo();
	}
}