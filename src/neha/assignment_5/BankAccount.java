//assignment 5, 5th August 2021
package neha.assignment_5;
class BankAccount{
	String username;
	String password;
	int accountNumber;
	void setDetails(String user,String pass,int bankNo){
		username=user;
		password=pass;
		accountNumber=bankNo;
	}
	void updatePassword(String newPassword){
		password=newPassword;
	}
	void displayInfo(){
		System.out.println("\r\nCustomer confidential details are: ");
		System.out.println("Username: "+username);
		System.out.println("Password: "+password);
		System.out.println("Account Number: "+accountNumber);
	}
	public static void main(String[] args){
		BankAccount bankAccount=new BankAccount();
		//Customer 1
		bankAccount.setDetails("Parth Joshi","P@ssword123",51459);
		bankAccount.displayInfo();
		bankAccount.updatePassword("Skycar@789");
		bankAccount.displayInfo();
		//Customer 2
		bankAccount.setDetails("Aarchi Deshpande","Park@Pune01",30678);
		bankAccount.displayInfo();
		bankAccount.updatePassword("Milleni@m423");
		bankAccount.displayInfo();
		
	}
}