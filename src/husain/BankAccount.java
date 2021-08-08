package husain;

class BankAccount {

	String username;
	String password;
	int bankAccountNumber;

	void setDetails(String uname, String pwd, int actNum) {

		username = uname;
		password = pwd;
		bankAccountNumber = actNum;
	}

	void updatePassword(String pwd) {

		password = pwd;

	}

	void displayInfo() {
		System.out.println("Username is: " + username);
		System.out.println("Password is: " + password);
		System.out.println("Account Number is: " + bankAccountNumber);
	}

	public static void main(String[] args) {

		BankAccount bank = new BankAccount();
		bank.setDetails("uname1", "password1", 1234567890);
		bank.updatePassword("password2");
		bank.displayInfo();
		System.out.println("***************************************************");
		bank.setDetails("uname2", "password3", 1212121212);
		bank.updatePassword("password4");
		bank.displayInfo();
	}
}