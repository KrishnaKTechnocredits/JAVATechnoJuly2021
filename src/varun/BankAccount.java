//Assignment-5
package varun;

class BankAccount {
	String username;
	String password;
	int accountNumber;

	void setDetails(String userName, String bnkpwd, int accntNo) {
		username = userName;
		password = bnkpwd;
		accountNumber = accntNo;
	}

	void updatePassword(String updatedPwd) {
		password = updatedPwd;
	}

	void displayInfo() {
		System.out.println("UserName is " + username);
		System.out.println("password is " + password);
		System.out.println("accountNumber is " + accountNumber);
	}

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("vaurnj26", "varun260191", 548457);
		bankAccount.updatePassword("joshi260191");
		bankAccount.displayInfo();
	}
}