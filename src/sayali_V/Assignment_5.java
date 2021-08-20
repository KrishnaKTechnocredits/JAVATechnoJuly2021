package sayali_V;

public class Assignment_5 
{
	String UserName,Password;
	int Bankaccnumber;
		
	void setDetails(String username,String password,int bnkaccno)
	{
		UserName= username;
		Password=password;
		Bankaccnumber=bnkaccno;
		System.out.println("username = " + username + " , password = " + password + " ,Bankaccnumber  = " +bnkaccno );
		System.out.println("-------------");
	}
	
	void updatePassword(String updatedpassword)
	{
		Password=updatedpassword;
		System.out.println("updated password is:" +updatedpassword);
		System.out.println("-------------");
	}
	
	void displayInfo()
	{
		System.out.print("Updated details are : username = " +UserName+ ", updatedpassword = " +Password +" , bnkaccno  = " +Bankaccnumber);
	}
	
	public static void main(String args[])
	{
		Assignment_5 bank=new Assignment_5();
		bank.setDetails("abc","abc@", 13164);
		bank.updatePassword("abc@22");
		bank.displayInfo();
	}
}

