package trupti;

class BankAccount {

	String userName, password;
	int bankAccountNumber;

	void setDetails(String userName1, String password1, int bankAccountNumber1) {
		userName = userName1;
		password = password1;
		bankAccountNumber = bankAccountNumber1;
	}

	void updatePassword(String Password) {
		password = Password;

	}

	void displayInfo() {
		System.out.println("Username name is: " + userName);
		System.out.println("bank Account no is: " + bankAccountNumber);
		System.out.println("New password is: " + password);

	}

	public static void main(String[] args) {
		BankAccount bankaccount = new BankAccount();
		bankaccount.setDetails("Trupti K", "qwerty@9876", 13579);
		bankaccount.updatePassword("12345@qwerty");
		bankaccount.displayInfo();
	}

}
