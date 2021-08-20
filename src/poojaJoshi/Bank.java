//Assignment 2
//Create a class called bank,delare variable as current balance=10000
//make methods as debit,credit,display balance
//print result as total balance
package poojaJoshi;

class Bank{
	int currentBalance=10000;
	
	void debit(int value){
		currentBalance = currentBalance - value;
	}
	
	void credit (int value){
		currentBalance = currentBalance + value;
	}
	
	void displayBalance(){
		System.out.println("the total balance is " +currentBalance);
	}
	
	public static void main (String[] args){
		Bank bank=new Bank();
		bank.debit(1000);//9000
		bank.debit(2000);//7000
		bank.credit(1000);//8000
		bank.debit(3000);//5000
		bank.displayBalance();
	}

}





