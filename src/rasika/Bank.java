package rasika;

class Bank{

	int currentBalance = 10000;
	
	void credit(int amount){
	currentBalance = currentBalance + amount;
	}
	
	void debit(int amount){
	currentBalance = currentBalance - amount;
	}
	
	void creditBalance(){
	System.out.println(currentBalance);
	}
	
	public static void main(String[] args){
	
		Bank bank = new Bank();
		bank.credit(5000);
		bank.creditBalance();
		bank.credit(2000);
		bank.creditBalance();
		bank.debit(5000);
		bank.creditBalance();
		bank.debit(1000);
		bank.creditBalance();
	}
}