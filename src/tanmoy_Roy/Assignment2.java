package tanmoy_Roy; 
class Assignment2{

	double currentBalance=10000.00;
	
	void credit(double amount){
		currentBalance+=amount;
		System.out.println("Amount Credited :"+amount);
	}
	
	void debit(double amount){
		currentBalance-=amount;
		System.out.println("Amount Debited :"+amount);
	}
	
	void displayInfo(){
		System.out.println("Current Account Balance :"+currentBalance);
	}
	
	public static void main(String[] args){
		Assignment2 bank = new Assignment2();
		bank.credit(1000.00);
		bank.debit(235.96);
		bank.displayInfo();
	
	}
}

