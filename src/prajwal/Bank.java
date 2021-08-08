package prajwal;

class Bank{
	int currentBalance= 2000;
	
	void debit(int debitAmount){
		currentBalance = currentBalance - debitAmount;
		System.out.println("Current Balance " +currentBalance);
    }
	
	void credit(int creditAmount){
		currentBalance = currentBalance + creditAmount;
		System.out.println("Current Balance " +currentBalance);
    }
	
	void display(){
		System.out.println(" Current Balance " +currentBalance);
    }
	
	public static void main (String [] a){
		Bank bank = new Bank();
		bank.debit(600);
		bank.credit(500);
		bank.display();
		bank.debit(900);
		bank.credit(2000);
		bank.display();
	}
		
	
}