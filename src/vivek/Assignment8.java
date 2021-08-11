package vivek;

public class Assignment8 {
	
	int debitcnt=0;
	int creditcnt=0;
	int print=0;
	static int debitAllcnt=0;
	static int creditAllcnt=0;
	static int printAllcnt=0;
	String customerName;
	int acctBalance;
	
	void setCustomerName(String name , int balance) {
		customerName=name;
		acctBalance=balance;
	}
	
	void debitAmount(int amount) {
		acctBalance=acctBalance-amount;
		debitcnt++ ;
		debitAllcnt++ ;
	}
	
	void creditAmount(int amount) {
		acctBalance=acctBalance+amount;
		creditcnt++ ;
		creditAllcnt++ ;
	}
	
	void printBalance() {
		System.out.println(customerName + " account balance is Rs " +acctBalance);
		print++ ;
		printAllcnt++ ; 
	}
	
	void individualTransactionSummary() {
		System.out.println(customerName +" transaction summary : " + "Credit - " + creditcnt +" times, " + "Debit - " + debitcnt + " times, " + "Print - " + print +" times");
	}
	
	void allTransactionSummary() {
		System.out.println("All transaction summary : " + "Credit - " + creditAllcnt +" times, " + "Debit - " + debitAllcnt + " times, " + "Print - " + printAllcnt +" times");
	}

	
	public static void main(String[] args) {
		Assignment8 assignment8_1 = new Assignment8();
		assignment8_1.setCustomerName("Vivek Patil", 1000);
		assignment8_1.debitAmount(100);
		assignment8_1.debitAmount(500);
		assignment8_1.creditAmount(300);
		assignment8_1.printBalance();
		assignment8_1.individualTransactionSummary();
		System.out.println();
		
		Assignment8 assignment8_2 = new Assignment8();
		assignment8_2.setCustomerName("Test user", 500);
		assignment8_2.debitAmount(100);
		assignment8_2.creditAmount(200);
		assignment8_2.printBalance();
		assignment8_2.individualTransactionSummary();
		System.out.println();
		
		assignment8_2.allTransactionSummary();
	}
}
