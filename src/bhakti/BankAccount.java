//Create a class called BankAccount, which has 3 methods.
package bhakti;
class BankAccount{
	String uName;
	int accountNo;
	String pass;
		
	void setDetails( String username, String password,  int bankAccountNumber){
		uName=username;
		pass= password;
		accountNo=bankAccountNumber;
	}
	
	void updatePassword(String NewPassword){
		pass= NewPassword;
	}
	
	void displayInfo(){
		System.out.println ("User details are ");
		System.out.println ("Name: " +uName);
		System.out.println ("Password: " +pass);
		System.out.println ("AccountNo: " +accountNo);
		 
	}
	
	public static void main (String [] xyz){
		BankAccount bankAccount= new BankAccount();
		bankAccount.setDetails("Bhakti Kakade", "password@12", 3434444);
		bankAccount.updatePassword("Welcome12");
		bankAccount.displayInfo();
	}
}