//Create bank class with Debit,Credit and displayBalance methods.
package swati;

class Bank{
	int currentBalance=10000;
	
	void debit(int debitAmount){
		currentBalance=currentBalance-debitAmount;
		System.out.println("Debit Amount:" + debitAmount);
	}
	
	void credit(int creditAmount){
		currentBalance=currentBalance+creditAmount;
		System.out.println("Credit Amount:" + creditAmount);
	}
	
	void displayBalance(){
		System.out.println("Current Balance:" + currentBalance);
	}
	
	public static void main(String[] a){
		Bank bank=new Bank();
		bank.debit(500);
		bank.displayBalance();
		bank.credit(200);
		bank.displayBalance();
		bank.credit(1000);
		bank.displayBalance();
	}
}