//Assignment 5
package indu;

class BankAccDetails
{
	String userNameInstaneVariable ;
	String passwordInstaneVariable;
	int accNumInstaneVariable;
	void setDetails(String userName , String password ,int accNum)
	{
		userNameInstaneVariable = userName;
		passwordInstaneVariable = password;
		accNumInstaneVariable = accNum;
		System.out.println("Username : " +userName);
		System.out.println("Password : " +password);
		System.out.println("Account NUmber : " +accNum);
	}
	
	void updatePassword(String password)
	{
		passwordInstaneVariable  = password;
		System.out.println("====================================");
		System.out.println("Updated Bank Details : ");
		
	}
	
	void displayBankDetails()
	{
		System.out.println("Username : " +userNameInstaneVariable);
		System.out.println("Password : " +passwordInstaneVariable);
		System.out.println("Account NUmber : " +accNumInstaneVariable);
	}
	
	public static void main(String[] args)
	{
		BankAccDetails bankAccDetails = new BankAccDetails();
		bankAccDetails.setDetails("Kiaan Kapoor" , "KIANKAPOOR" , 9955241);
		bankAccDetails.updatePassword("Kian123");
		bankAccDetails.displayBankDetails();
		
	}
}