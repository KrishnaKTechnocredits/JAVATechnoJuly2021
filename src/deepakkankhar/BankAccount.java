//Assingment 5
package deepakkankhar;
class BankAccount{
	String userName;
	String password;
	int bankAccountNumber;
		
	void setDetails(String userName1, String password1, int bankAccountNumber1){
		userName=userName1;
		password=password1;
		bankAccountNumber=bankAccountNumber1;
	}
	
	void updatePassword(String password1){
		password=password1;
	}
	
	void displayInfo(){
		System.out.println(userName);
		System.out.println(password);
		System.out.println(bankAccountNumber);
		
	}
	
	public static void main(String[] a){
		BankAccount bankAccount=new BankAccount();
		bankAccount.setDetails("Sachin Tendulkar","$password$",98765);
		System.out.println("Before Bank Details Update");
		bankAccount.displayInfo();
		System.out.println("==========================");
		System.out.println("After Bank Details Update");
		bankAccount.updatePassword("$NewPassword$");
		bankAccount.displayInfo();
	}
}