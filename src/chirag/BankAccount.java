package chirag;

//Assignment 5

public class BankAccount {
	String userName;
	String password;
	int bankAccountNumber;
	
	void setDetails(String setUserName,String setPassword,int setBankAccountNumber) {
		userName=setUserName;
		password=setPassword;
		bankAccountNumber=setBankAccountNumber;
		System.out.println("User Name :-"+setUserName);
		System.out.println("Password :-"+setPassword);
		System.out.println("Bank Account Number :-"+setBankAccountNumber);
	}
	void updatePassword(String setPassowrd) {
		password=setPassowrd;
		System.out.println("----------------------");
		System.out.println("Update Bank Details");
		System.out.println("----------------------");
	}
	void displayInfo() {
		System.out.println("User Name :-"+userName+"\n"+"Password :-"+password+"\n"+"Bank Account Number :-"+bankAccountNumber);
		
	}
	public static void main(String[] args) {
		BankAccount bankAccount=new BankAccount();
		bankAccount.setDetails("Chirag","5665**87",443355);
		bankAccount.updatePassword("937583");
		bankAccount.displayInfo();
	}
	}
