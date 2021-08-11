package aniket;

public class Assignment_8 {
	
	int debitCnt;
	int creditCnt;
	int printBalanceCount;
	static int AlldebitCnt;
	static int AllcreditCnt;
	static int AllprintBalanceCount;
	String customerName;
	
	void setCustomerName(String custName) {
		customerName=custName;		
	}
	
	void debitamt() {
		debitCnt++;
		AlldebitCnt++;		
	}
	
	void creditamt() {
		creditCnt++;
		AllcreditCnt++;
	}
	
	void printBalance() {
		printBalanceCount++;
		AllprintBalanceCount++;	
	}
	
	void individualTransactionSummary() {
		System.out.println(customerName + " transaction summary: " + "Credit - " + creditCnt + 
				"times, Debit - " +  debitCnt + " times, printBalance - " + printBalanceCount +" times");	
	}
	
	void allTransactionSummary() {
		System.out.println("All transaction summary: " + "Credit - " + AllcreditCnt + 
				"times, Debit - " +  AlldebitCnt + " times, printBalance - " + AllprintBalanceCount +" times");
		
	}
	
	public static void main(String[] args) {
		Assignment_8 assignment8_1 = new Assignment_8();
		Assignment_8 assignment8_2 = new Assignment_8();
		assignment8_1.setCustomerName("User1");
		assignment8_1.debitamt();
		assignment8_1.debitamt();
		assignment8_1.debitamt();
		assignment8_1.creditamt();
		assignment8_1.creditamt();
		assignment8_1.printBalance();
		assignment8_1.printBalance();
		assignment8_1.individualTransactionSummary();
		
		assignment8_2.setCustomerName("User2");
		assignment8_2.debitamt();
		assignment8_2.debitamt();
		assignment8_2.creditamt();
		assignment8_2.printBalance();
		assignment8_2.individualTransactionSummary();
		
		assignment8_1.allTransactionSummary();

	}

}
