package tanmoy_Sarkar;

class Bank{
	int currentBalance = 25000;
	void credit(int amount){
		currentBalance = currentBalance + amount;
	}
	void debit(int amount){
		currentBalance = currentBalance - amount;
	}
	void displayBalance(){
		System.out.println("Your current balance is : " +currentBalance);
	}
	public static void main(String args[]){
		Bank bank = new Bank();
		bank.credit(5000);
		bank.credit(4500);
		bank.debit(9500);
		bank.debit(5000);
		bank.displayBalance();
	}
}