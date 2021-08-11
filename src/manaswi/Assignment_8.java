package manaswi;

public class Assignment_8 
{
	static int totalCreditCount, totalDebitCount,totalPrintBalCount;
	int debitCount, creditCount, printBalCount;
	int balance;
	String customerName;
	
	void setUserDetails(String custName, int iniBal) 
	{
		customerName = custName;
		balance = iniBal;
	}
	
	void debitAmount(int debitAmt)
	{
		balance = balance - debitAmt; 
		totalDebitCount ++;
		debitCount ++;
	}
	
	void creditAmount(int creditAmt) 
	{
		balance = balance + creditAmt;
		totalCreditCount ++;
		creditCount ++;
	}
	
	void printBalance() 
	{
		totalPrintBalCount ++;
		printBalCount ++;
		System.out.println(customerName + " Current balance is: " + balance);
	}

	void individualTransactionSummary() 
	{
		System.out.println(customerName + " transaction summary: Credit - " + creditCount + " times, Debit - " + debitCount + " times, print Balance - " + printBalCount + " time");
	}
	
	static void allTransactionSummary()
	{
		System.out.println("All transaction summary: Credit - " + totalCreditCount + " times, Debit - " + totalDebitCount + " times, print Balance - " + totalPrintBalCount + " time");
	}
	
	public static void main(String[] args)
	{
		Assignment_8 assignment_8_1 = new Assignment_8();
		Assignment_8 assignment_8_2 = new Assignment_8();
		assignment_8_1.setUserDetails("Manaswi", 10000);
		assignment_8_1.debitAmount(5000);
		assignment_8_1.creditAmount(500);
		assignment_8_1.creditAmount(1000);
		assignment_8_1.printBalance();
		assignment_8_1.individualTransactionSummary();
		assignment_8_2.setUserDetails("Manas", 15000);
		assignment_8_2.creditAmount(10000);
		assignment_8_2.debitAmount(5000);
		assignment_8_2.creditAmount(3000);
		assignment_8_2.creditAmount(500);
		assignment_8_2.creditAmount(200);
		assignment_8_2.debitAmount(800);
		assignment_8_2.creditAmount(1200);
		assignment_8_2.individualTransactionSummary();
		allTransactionSummary();
	}
}