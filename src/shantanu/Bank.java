package shantanu;

class Bank{
	int balance = 10000;
	
	void debitBalance(int amount){
		balance = balance - amount;
	}
	
	void creditBalance(int amount){
		balance = balance + amount;
	}
	
	void displayBalance(){
		System.out.println("Current balance is:"+balance);
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.creditBalance(5000);
		bank.debitBalance(3000);
		bank.debitBalance(1000);
		bank.creditBalance(2500);
		bank.debitBalance(300);
		bank.displayBalance();
	}
}