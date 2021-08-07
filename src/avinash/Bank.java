package avinash;

class Bank{
	
	int current_Balance = 25000;
	
	void debit_Balance(int debtamt){
		current_Balance = current_Balance - debtamt;	
	}
	
	void credit_Balance(int credamt){
		current_Balance = current_Balance + credamt;
	}
	
	void display(){
		System.out.println("current balance is:"+current_Balance);
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.debit_Balance(15000);
		bank.credit_Balance(12000);
		bank.debit_Balance(1000);
		bank.credit_Balance(10000);
		bank.display();
	}
}