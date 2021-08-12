package sayali_V;

public class Bank {
int currentBalance=2000;
	
	void debit(int x){
		currentBalance=currentBalance-x;
		System.out.println("After debit balance is:"+currentBalance);
	}
	
	void credit(int y){
		currentBalance=currentBalance+y;
		System.out.println("After credit balance is:"+currentBalance);
	}
	void displayDetails(){
		System.out.println("Current balance after all transactions is:"+currentBalance);	
	}
	
	public static void main(String args[]){
		Bank bank=new Bank();
		bank.debit(200);
		bank.credit(2000);
		bank.debit(200);
		bank.displayDetails();
	}
}
