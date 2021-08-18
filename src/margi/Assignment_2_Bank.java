package margi;

class Assignment_2_Bank{
	int currentBalance = 10000;
	
	void Debit(int amount){
		currentBalance = currentBalance - amount;
	}
	
	void Credit(int amount){
		currentBalance = currentBalance + amount;
	}
	
	void displayBalance(){
		System.out.println("Current Balance is " + currentBalance);
	}
	
	public static void main(String[] a){
		Assignment_2_Bank bank = new Assignment_2_Bank();
		bank.Debit(2000);
		bank.Debit(1500);
		bank.Credit(4000);
		bank.Debit(3500);
		bank.displayBalance();
	}
}