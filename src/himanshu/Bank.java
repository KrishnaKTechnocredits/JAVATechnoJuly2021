// Create class Bank
// one instance variable
// two methods with parameters 

package himanshu;

class Bank{
		int currentBalance = 10000;
	
	void debitAmount(int debitValue){
		currentBalance = currentBalance - debitValue;	
	}
	
	void creditAmount(int creditValue){
		currentBalance = currentBalance + creditValue;
	}
	
	void displayValue(){
		System.out.println("Current Balance of my account is :" + currentBalance);
	}

    public static void main(String [] args){
		Bank bank = new Bank();
		bank.debitAmount(5000);  // Remaining Balance 5000
		bank.displayValue();
		bank.creditAmount(1000);  // Current Balance 6000
		bank.debitAmount(500);    //  Debit Value 500
		bank.displayValue();    // Current Balance 5500
	}


}