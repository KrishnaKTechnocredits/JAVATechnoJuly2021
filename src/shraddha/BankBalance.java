package shraddha;
class BankBalance{
	int initialBalance = 50000;
	
	public static void main(String[] args){
	BankBalance bb = new BankBalance();
	bb.checkBalance();
	bb.credit(3000);
	bb.debit(5000);
	bb.debit(50000);
	bb.credit(10000);
	bb.debit(004000);	
	}
	
	void credit(int amount){
	int creditBalance = initialBalance+amount;
	System.out.println("After crediting Rs."+amount+" new balance is Rs."+creditBalance);
	}
	
	void debit(int amount){
	int debitBalance = initialBalance-amount;
	System.out.println("After crediting Rs."+amount+" new balance is Rs."+debitBalance);
	}
	
	void checkBalance(){
	System.out.println("Initial Balance is RS."+initialBalance);
	}
}