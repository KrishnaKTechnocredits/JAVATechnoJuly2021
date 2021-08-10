package tarang;




class BankAccount{	
		String username = "tarang1162";
		String password = "LUCY@2019";
		int bankAccountNumber = 44123456;
	
	void SetDeatils()
	{
		System.out.println(username);
		System.out.println(password);
		System.out.println(bankAccountNumber);
	}
	void updatePassword(String password1)
	{
		password=password1;
				System.out.println("--Updated Password--");
				System.out.println(password);

	}
	void displayInfo()
	{
		System.out.println("--------");
		System.out.println(username);
		System.out.println(password);
		System.out.println(bankAccountNumber);
	}
		public static void main(String[] args) 
	{
			BankAccount bankaccount = new BankAccount();
			bankaccount.SetDeatils();
			bankaccount.updatePassword("Lucy@2022");
			bankaccount.displayInfo();
	}
}