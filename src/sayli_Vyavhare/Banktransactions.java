package sayli_Vyavhare;

class Banktransactions{
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
	
	public static void main (String[] args){
		Banktransactions banktransactions=new Banktransactions();
		banktransactions.debit(200);
		banktransactions.credit(1000);
		banktransactions.debit(400);
		banktransactions.displayDetails();
	}
}