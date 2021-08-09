package dattaraj;

class Bank_OPS{
	
	double balance = 15000;
	
	void bal_info(){
		System.out.println("You have balance :" +balance);
	}
	
	void credit_info(double creditAmount){
		balance += creditAmount;
		System.out.println("You have deposit " +creditAmount +" to your account." + "\n" +
            "Balance is now: " +balance);
	}
	
	void debit_info(double debitAmount){
		if(balance < debitAmount) {
			System.out.println("You don't have enough funds.");
		} else {
			balance -= debitAmount;
			System.out.println("You have withdrawal " +debitAmount + " from your account." + "\n" +
						"Balance is now: " +balance);
		}
	}
	
	public static void main(String[] args){
		Bank_OPS bank = new Bank_OPS();
		bank.bal_info();
		bank.credit_info(2000);
		bank.debit_info(10000);
		bank.credit_info(1000);
		bank.debit_info(100000);
		bank.debit_info(400);
	}
	
}