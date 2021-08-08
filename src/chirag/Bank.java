package chirag;

class Bank{
	int currentBalance=100000;

	void debit(int debitAmount){
		currentBalance=currentBalance - debitAmount;
		System.out.println("Debit amount:Rs "+debitAmount);
	
	}
	void credit(int creditAmount){
		currentBalance=currentBalance + creditAmount;
		System.out.println("Credit amount:Rs "+creditAmount);
	}
	void displayValue(){
		System.out.println("Your current account balance is :Rs "+currentBalance);
		
	}
	public static void main(String[]args){
	
		Bank bank=new Bank();
		bank.displayValue();
		bank.debit(1000);
		bank.displayValue();
		bank.credit(5000);
		bank.displayValue();
		bank.debit(6000);
		bank.displayValue();
		bank.credit(3000);
		bank.displayValue();
		bank.debit(8000);
		bank.displayValue();
		bank.credit(12000);
		bank.displayValue();
	}
}
