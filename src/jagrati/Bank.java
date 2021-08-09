package jagrati;

public class Bank{
	
	int currentBalance = 10000;
	
	void debit(int amount){
		currentBalance = currentBalance - amount;
		System.out.println("Debited amount is " + currentBalance);
	}
	 void credit(int amount){
		 currentBalance = currentBalance + amount;
		 System.out.println("Credited amount is "+ currentBalance);
	 }
	 
	 void display(){
		 System.out.println("Total amount is "+ currentBalance);
	 }
	 public static void main(String[] a){
		 Bank bank = new Bank();
		 bank.debit(5000);
		 bank.credit(5000);
		 bank.debit(1000);
		 bank.credit(20000);
		 bank.display();
	 }

}