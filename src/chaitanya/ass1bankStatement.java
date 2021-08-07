//Assignment - 2 : 2nd Aug'21

//*Create a class called Bank having 3 methods and one instance variable.
//- expected operations - debitAmount, creditAmount, displayBalance.
//- variable balance to hold current balance.
//- create only one object and call methods multiple times

package chaitanya;

class ass1bankStatement{
	int currentbalance = 25000 ; 
	
	void debitAmount(int amount){
		currentbalance = currentbalance - amount;
		System.out.println("If " + amount + " is debited, currentBalance is " + currentbalance );
	}
	
	void creditAmount(int amount){
		currentbalance = currentbalance + amount;
		System.out.println("If " + amount + " is credited, currentBalance is " + currentbalance );
	}
	
	void displayBalance(){
		System.out.println("Balance left : " + currentbalance);
	}
	
	public static void main (String[] args){
		ass1bankStatement bankstatement = new ass1bankStatement();
		bankstatement.debitAmount(5000);
		bankstatement.creditAmount(10000);
		bankstatement.debitAmount(12000);
		bankstatement.displayBalance();
	}
		
}
