//Assignment - 8 : 10th Aug'2021

//Create a Banking System which has the following functionality.

//Create two object to perform below scenario.
//1) Method to debit amount
//2) Method to credit amount
//3) Method to printBalance [it will print current balance]
//4) individualTransactionSummary() method should show how many times the individual debit, credit & printBalance method is called .
//Hint : Create 3 non static instance variables.
//Output:
//user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time
//user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

//5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
//Hint : Create 3 static variables will be required.
//Output:
//All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time

//NOTE : You should have setUserDetails method to set username and initial Balance .


package chaitanya;

public class ass8BankStatement {
	
	static int tdebitcount ; 
	static int tcreditcount ; 
	static int tprintbalance;
	int debitcnt ; 
	int creditcnt ; 
	int printbal ; 
	int balance;
	String customername;
	
	void setUserDetails(String custname, int initialbalance) {
		customername = custname;
		balance = initialbalance;
	}
	
	void debitAmount(int debitamount) {
		balance = balance - debitamount;
		debitcnt++;
		tdebitcount++;
	}
	
	void creditAmount(int creditamount) {
		balance = balance + creditamount;
		creditcnt++;
		tcreditcount++;
	}
	
	void printBalance() {
		tprintbalance++;
		printbal++;
		System.out.println(customername + "'s Current balance is: " + balance);
	}
	
	void individualTransactionSummary() {
		System.out.println(customername + "'s transaction summary: Credit - " + creditcnt + " times, Debit - "
				+ debitcnt + " times, print Balance - " + printbal + " times");
	}
	
	static void allTransactionSummary() {
		System.out.println("All transaction summary: Credit - " + tcreditcount + " times, Debit - "
				+ tdebitcount + " times, print Balance - " + tprintbalance + " times");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ass8BankStatement ass8bankstatement_1 = new ass8BankStatement();
		ass8BankStatement ass8bankstatement_2 = new ass8BankStatement();
		ass8bankstatement_1.setUserDetails("Chaitanya",20000);
		ass8bankstatement_1.debitAmount(5000);
		ass8bankstatement_1.creditAmount(15000);
		ass8bankstatement_1.printBalance();
		ass8bankstatement_1.individualTransactionSummary();
		ass8bankstatement_2.setUserDetails("RaviTeja",50000);
		ass8bankstatement_2.debitAmount(45000);
		ass8bankstatement_2.creditAmount(25000);
		ass8bankstatement_2.printBalance();
		ass8bankstatement_2.individualTransactionSummary();
		allTransactionSummary();
	}
}
