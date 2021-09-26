//Assignment 2.1 - Day 3  BANK CLASS
package deepak.deepakkankhar;
class Bank{

	double currentBalance=10000.0;
	
	void debit(double debitAmount){
		currentBalance = currentBalance-debitAmount;
	}

	void credit(double creditAmount){
		currentBalance = currentBalance+creditAmount;
	}
	
	void displayBalance(){
		System.out.println("Current Balance is: "+currentBalance);
	}
	
	public static void main(String[] a){
		Bank bank=new Bank();
		bank.credit(1200.00);
		bank.displayBalance();
		bank.debit(5000.00);
		bank.displayBalance();
	}

}