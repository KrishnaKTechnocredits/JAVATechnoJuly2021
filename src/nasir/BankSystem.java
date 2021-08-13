/*Assignment - 8 : 10th Aug'2021

Create a Banking System which has the following functionality.

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

package nasir;

public class BankSystem {
	int creditCount;
	int debitCount;
	int printBalanceCount;
	int balance;
	static int totalCreditCount;
	static int totalDebitCount;
	static int totalPrintBalanceCount;
	String user;

	public void setUserDetails(String usernmane, int intialBalance) {
		user = usernmane;
		balance = intialBalance;

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
		System.out.println(user + " transaction summary: debit- " + debitCount + " credit- " + creditCount
				+ " printBalance- " + printBalanceCount + " times");

	}

	public static void overallTransactionSummary() {
		System.out.println("Overall transaction summary: debit- " + totalDebitCount + " credit- " + totalCreditCount
				+ " printBalance- " + totalPrintBalanceCount + " times");

	}

	public static void main(String[] args) {
		BankSystem bankSystem = new BankSystem();
		bankSystem.setUserDetails("Nasir", 80000);
		bankSystem.debitAmount(5000);
		bankSystem.creditAmount(4000);
		bankSystem.creditAmount(4000);
		bankSystem.printBalance();
		bankSystem.individualTransactionSummary();
		BankSystem bankSystem_1 = new BankSystem();
		bankSystem_1.setUserDetails("harry", 80000);
		bankSystem_1.debitAmount(3000);
		bankSystem_1.creditAmount(2000);
		bankSystem_1.creditAmount(1000);
		bankSystem_1.creditAmount(5000);
		bankSystem_1.printBalance();
		bankSystem_1.individualTransactionSummary();
		overallTransactionSummary();

	}

}
