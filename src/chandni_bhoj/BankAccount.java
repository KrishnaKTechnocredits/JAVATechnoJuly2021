package chandni_bhoj;

class BankAccount {

	void setDetails (String username, String password, int bankAccountNumber) {
		System.out.println ("Username" + "-" + username);
		System.out.println ("Password" + "-" + password);
		System.out.println ("Account number" + "-" + bankAccountNumber);
	}

	void updatePassword (String password) {
		System.out.println ("Updated password" + "-" + password);
	}
	
	void displayInfo (String username, String password, int bankAccountNumber) {
		System.out.println ("Username" + "-" + username);
		System.out.println ("Password" + "-" + password);
		System.out.println ("Account number" + "-" + bankAccountNumber);
	}
			
	public static void main (String [] args) {
		BankAccount bankaccount = new BankAccount ();
		bankaccount.setDetails("Kiran Ahuja", "stage@20", 25564);
		bankaccount.updatePassword("stage@30");
		bankaccount.displayInfo("Kiran Ahuja", "stage@30", 25564 );
	
			
	}
	
}