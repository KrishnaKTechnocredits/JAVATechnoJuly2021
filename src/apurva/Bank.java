package apurva;
class Bank{
	
	int currentBalance = 10000;
	
	void debitAmount(int amount){
		currentBalance = currentBalance - amount;
		System.out.println(" Amount after Debit : " +currentBalance);
	}
	
	void creditAmount(int amount){
		currentBalance = currentBalance + amount;
		System.out.println(" Amount after credit: "+currentBalance);
	}
	
	void displayCurrentBalance(){
		System.out.println(" Current Balance is: "+currentBalance);
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.debitAmount(2000);
		bank.creditAmount(3000);
		bank.displayCurrentBalance();
	}
}