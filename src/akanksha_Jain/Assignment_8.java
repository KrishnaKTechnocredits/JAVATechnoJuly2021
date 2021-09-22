/*  Assignment - 8 : 10th Aug'2021
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
NOTE : You should have setUserDetails method to set username and initial Balance .
*/

package akanksha_Jain;

public class Assignment_8 {
	static int totalCreditCount, totalDebitCount, totalPrintBalCount;
	int debitCount, creditCount, printBalCount;
	int balance;
	String customerName;
	
	void setUserDetails(String custName, int iniBal) {
		customerName = custName;
		balance = iniBal;
	}
	
	void debitAmount(int debAmt) {
		balance = balance - debAmt; 
		totalDebitCount ++;
		debitCount ++;
	}
	
	void creditAmount(int creditAmt) {
		balance = balance + creditAmt;
		totalCreditCount ++;
		creditCount ++;
	}
	
	void printBalance() {
		totalPrintBalCount ++;
		printBalCount ++;
		System.out.println(customerName + "'s Current balance is: " + balance);
	}

	void individualTransactionSummary() {
		System.out.println(customerName + " transaction summary: Credit - " + creditCount + " times, Debit - " + debitCount + " times, print Balance - " + printBalCount + " time");
	}
	
	static void allTransactionSummary() {
		System.out.println("All transaction summary: Credit - " + totalCreditCount + " times, Debit - " + totalDebitCount + " times, print Balance - " + totalPrintBalCount + " time");
	}
	
	public static void main(String[] args) {
		Assignment_8 assignment_8_1 = new Assignment_8();
		Assignment_8 assignment_8_2 = new Assignment_8();
		assignment_8_1.setUserDetails("Akansha", 20000);
		assignment_8_1.debitAmount(7000);
		assignment_8_1.creditAmount(1000);
		assignment_8_1.creditAmount(2000);
		assignment_8_1.printBalance();
		assignment_8_1.individualTransactionSummary();
		assignment_8_2.setUserDetails("Akash", 10000);
		assignment_8_2.creditAmount(5000);
		assignment_8_2.debitAmount(3000);
		assignment_8_2.creditAmount(2000);
		assignment_8_2.creditAmount(1000);
		assignment_8_2.creditAmount(700);
		assignment_8_2.debitAmount(7700);
		assignment_8_2.creditAmount(1500);
		assignment_8_2.individualTransactionSummary();
		allTransactionSummary();
	}
}
