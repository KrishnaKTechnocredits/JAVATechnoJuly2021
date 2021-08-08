package umakant;
class Bank{

	int currentBalance = 10000;
	
	void debitValue(int amount){
		currentBalance = currentBalance - amount;
	}
	
	void creditValue(int amount){
		currentBalance = currentBalance + amount;
	}
	
	void displayValue(){
		System.out.println("Currennt account balance is "+currentBalance);
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.debitValue(1000);
		bank.creditValue(2000);
		bank.creditValue(3000);
		bank.debitValue(4000);
		bank.displayValue();
	}
}