package riten;

class BankAccount{
	String username;
	String password;
	int bankAccountNumber;
	
	void setDetails(String username1,String password1,int bankAccountNumber1){
		username=username1;
		password=password1;
		bankAccountNumber=bankAccountNumber1;
		System.out.println("User Name: "+username1+"\n"+"Password: "+password1+ "\n"+"Account Number: "+bankAccountNumber1);
	}
	
	void updatePassword(String updated_Password)
	{
		password=updated_Password;
		System.out.println("After Password update");
	}		
	
	void displayInfo()
	{
		System.out.println("User Name:"+username);
		System.out.println("User Password:"+password);
		System.out.println("User Account Number:"+bankAccountNumber);
	}
	
	public static void main(String[] args){
		BankAccount bankAccount=new BankAccount();
		bankAccount.setDetails("Riten","Tetsing123",12345);
		bankAccount.updatePassword("test0000");
		bankAccount.displayInfo();
		
	}
		
	}