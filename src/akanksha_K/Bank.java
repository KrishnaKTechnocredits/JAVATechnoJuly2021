package akanksha_K;

class Bank{
	int currentBal=10000;

	void debit(int amt){
	     currentBal=currentBal-amt;
	     System.out.println("Debited amount is= "+ currentBal);
	}

	void credit(int amt){
	     currentBal=currentBal+amt;
	     System.out.println("Credited amount is= "+ currentBal);
	}

	void displayBalance(){
    	System.out.println("Current amount is= "+ currentBal);
	}
   
	public static void main(String[] a){
        Bank bank = new Bank();
        bank.displayBalance();
        bank.debit(250);
        bank.credit(2000);
        bank.debit(1000);
        bank.credit(5000);
        bank.displayBalance();
	}
}