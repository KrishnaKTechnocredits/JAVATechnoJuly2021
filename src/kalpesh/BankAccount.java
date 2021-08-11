package kalpesh;

public class BankAccount {
	String userName;
	String password;
	int accountNumber;

	void setDetails(String uName, String pass, int accNum) {
		userName = uName;
		password = pass;
		accountNumber = accNum;
	}

	void updatePassword(String newPasword) {
		password = newPasword;
	}

	void displayInfo() {
		System.out.println("Username is : " + userName);
		System.out.println("Account Number is :" + accountNumber);
		System.out.println("New Password is:  " + password);
	}

	public static void main(String[] args) {
		BankAccount bankaccount = new BankAccount();
		bankaccount.setDetails("Kalpesh", "Kp@123", 123456);
		bankaccount.updatePassword("Kp@007");
		bankaccount.displayInfo();

	}

}
