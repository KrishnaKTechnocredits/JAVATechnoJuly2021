package anuja;

class Bank{

	double bal=5000.00;
	
	void creditAmount(){
		bal++;
	}
	
	void debitAmount(){
		bal--;
	}
	
	void displayBalance(){
		System.out.println("Balance is "+bal);
	}
	
	public static void main(String args[]){
		Bank bank =new Bank();
		bank.creditAmount();
		bank.debitAmount();
		bank.displayBalance();
		bank.debitAmount();
		bank.displayBalance();
		bank.debitAmount();
		bank.displayBalance();
		bank.creditAmount();
		bank.displayBalance();
		bank.creditAmount();
		bank.displayBalance();
		bank.creditAmount();
		bank.displayBalance();
		
	}
}
