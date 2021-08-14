/*Create a Banking System which has the following functionality.

Create two object to perform below scenario.
1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times the individual debit, credit & printBalance method is called .
Hint : Create 3 non static instance variables.
Output:
user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time
user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
Hint : Create 3 static variables will be required.
Output:
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time

NOTE : You should have setUserDetails method to set username and initial Balance .*/


package sushant;


public class StaticNonstaticAssignment_8 {
	int creditCount;
	int debitCount;
	int printBalanceCount;
	int balance;
	static int totalCreditCount;
	static int totalDebitCount;
	static int totalPrintBalanceCount;
	String user;

	public void setUserDetails(String usernmane, int firstBalance) {
		user = usernmane;
		balance = firstBalance;

	}

	public void debitAmount(int debit) {
		balance = balance - debit;
		debitCount++;
		totalDebitCount++;

	}

	public void creditAmount(int credit) {

		balance = balance + credit;
		creditCount++;
		totalCreditCount++;

	}

	public void printBalance() {
		System.out.println(user + " current balance " + balance);
		printBalanceCount++;
		totalPrintBalanceCount++;

	}

	public void individualTransactionSummary() {
		System.out.println(user + " transaction summary: debit: " + debitCount + " credit: " + creditCount
				+ " printBalance: " + printBalanceCount + " times");

	}

	public static void overallTransactionSummary() {
		System.out.println("Overall transaction summary: debit: " + totalDebitCount + " credit: " + totalCreditCount
				+ " printBalance: " + totalPrintBalanceCount + " times");

	}

	public static void main(String[] args) {
		StaticNonstaticAssignment_8 staticNonstaticAssignment_8 = new StaticNonstaticAssignment_8();
		staticNonstaticAssignment_8.setUserDetails("Sushant", 50000);
		staticNonstaticAssignment_8.debitAmount(20000);
		staticNonstaticAssignment_8.creditAmount(4000);
		staticNonstaticAssignment_8.printBalance();
		staticNonstaticAssignment_8.individualTransactionSummary();
		
		StaticNonstaticAssignment_8 staticNonstaticAssignment_8_1 = new StaticNonstaticAssignment_8();
		staticNonstaticAssignment_8_1.setUserDetails("Virat", 60000);
		staticNonstaticAssignment_8_1.debitAmount(3000);
		staticNonstaticAssignment_8_1.creditAmount(2000);
		staticNonstaticAssignment_8_1.creditAmount(1000);
		staticNonstaticAssignment_8_1.printBalance();
		staticNonstaticAssignment_8_1.individualTransactionSummary();
		overallTransactionSummary();

		
	}

}
