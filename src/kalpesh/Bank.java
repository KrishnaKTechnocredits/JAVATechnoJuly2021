package kalpesh;

class Bank{
	
	int currentBalance = 20000;
	
	void debit (int amount){
		currentBalance = currentBalance - amount;
		System.out.println ("Amount Debited Is - "+currentBalance);
	}
	
	void credit (int amount){
		currentBalance = currentBalance + amount;
		System.out.println("Amount Credited Is - " +currentBalance);
	}
	
	void displayInfo (){
		System.out.println("Available Balance Is - " +currentBalance);
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.debit(2500);
		bank.credit(5000);
		bank.displayInfo();
	}

}