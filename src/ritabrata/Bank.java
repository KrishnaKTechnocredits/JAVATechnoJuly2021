package ritabrata;
class Bank{
	int currentBalance= 10000;
	
	void debit(int dr){
		currentBalance= currentBalance- dr;
	}
	
	void credit(int cr){
		currentBalance= currentBalance+ cr;
	}
	
	void displayBalance(){
		System.out.println("Current balance in account is: "+ currentBalance);
	}
	
	public static void main (String[] args){
		Bank bank= new Bank();
		bank.debit(3100);
		bank.credit(100000);
		bank.displayBalance();
		bank.credit(11);
		bank.debit(33552);
		bank.displayBalance();
		bank.debit(33556);
		bank.credit(55);
		bank.displayBalance();
	}
}