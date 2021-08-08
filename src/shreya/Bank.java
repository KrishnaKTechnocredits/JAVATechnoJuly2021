package shreya;

//Create a class called Bank having 3 methods and one instance variable.
class Bank{
	int currentBalance = 10000;
	
	void debitAmount(int amount){
		currentBalance = currentBalance - amount;
		
		System.out.println("Amount debited from an account is " +amount);
	}
	
	void creditAmount(int amount){
		currentBalance = currentBalance + amount;
		System.out.println("Amount credited in an account is " +amount);
	}
	
	void displayBalance(){
		System.out.println("Your current balance  is " +currentBalance);
	}
	
	public static void main(String[] args){
		Bank bank=new Bank();
		bank.displayBalance();
		bank.debitAmount(2000);
		bank.displayBalance();
		bank.creditAmount(1000);
		bank.displayBalance();
		bank.debitAmount(5000);
		bank.displayBalance();
		bank.debitAmount(500);
		bank.displayBalance();
	}
}