package rushikesh.loop;

class Bank{
	int currentBalance= 10000;
	
	void debit(int amount){
		currentBalance=currentBalance-amount;
	}
	
	void credit(int amount){
		currentBalance=currentBalance+amount;
	}
	
	void showBalance(){
		System.out.println(currentBalance);
	}
	
	public static void main(String[] args){
		Bank bank =new Bank();
		bank.debit(1000);
		bank.credit(500);
		bank.debit(200);
		bank.credit(500);
		bank.showBalance();
	}
}	