package chandani;

class Bank{

	int currentBalance = 1000;
	
	void debit(int amount){
		currentBalance = currentBalance - amount;
		System.out.println("Current Balance after Debit is "+currentBalance);
	}
	
	void credit(int amount){
		currentBalance = currentBalance + amount;
		System.out.println("Current Balance after Credit is "+currentBalance);
	}
	
	void displayBalance(){
		System.out.println("Current balance is "+currentBalance);
	}
	
	public static void main (String[] args){
		Bank bank = new Bank();
		bank.debit(200);
		bank.credit(400);
		bank.credit(400);
		bank.debit(200);
		bank.displayBalance();
	}
}