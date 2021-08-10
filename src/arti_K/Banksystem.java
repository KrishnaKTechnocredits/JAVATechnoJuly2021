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

NOTE : You should have setUserDetails method to set username and initial Balance .  */

package arti_K;

public class Banksystem {
	
	int debitcnt;
	int creditcnt;
	int printBalancecnt;
	String userName;
	double bankBalance;
	static int totaldebitCount;
	static int totalcreditCount;
	static int totalprintBalCount;


	void setUserDetails(String name, double balance){
		userName = name;
		bankBalance = balance;
	}

	void debitAmount(int amt){
		bankBalance = bankBalance - amt;
		debitcnt++;
		totaldebitCount++;
	}

	void creditAmount(int amt){
		bankBalance = bankBalance + amt;
		creditcnt++;
		totalcreditCount++;
	}

	void printBalance(){
		System.out.println(userName+"'s Current Balance is : "+bankBalance);
		printBalancecnt++;
		totalprintBalCount++;
	}
	
	void individualTransactionSummary() {
		System.out.println(userName+" transaction summary --> Credit :"+ creditcnt +" times, Debit : "+ debitcnt +" times, PrintBalance : "+ printBalancecnt +" times.");
	}

	void allTransactionSummary(){
		System.out.println("All transaction summary --> Credit :"+ totalcreditCount +" times, Debit : "+ totaldebitCount +" times, PrintBalance : "+ totalprintBalCount +" times.");
	}
	
	public static void main(String[] args) {
		Banksystem banksystem = new Banksystem();
		Banksystem banksystem1 = new Banksystem();
		
		System.out.println("\n------- 1st User deatails :-----------");
		banksystem.setUserDetails("Krishna", 50000);
		banksystem.creditAmount(4000);
		banksystem.creditAmount(5000);
		banksystem.debitAmount(6000);
		banksystem.printBalance();
		banksystem.individualTransactionSummary();
		
		System.out.println("\n------- 2nd User deatails :-----------");
		banksystem1.setUserDetails("Harsh", 20000);
		banksystem1.creditAmount(2000);
		banksystem1.creditAmount(4000);
		banksystem1.creditAmount(5000);
		banksystem1.creditAmount(7000);
		banksystem1.creditAmount(9000);
		banksystem1.debitAmount(3000);
		banksystem1.debitAmount(2000);
		banksystem1.individualTransactionSummary();
		
		System.out.println("\n------- Overall Transaction Summary :-----------");
		banksystem.allTransactionSummary();
	}
}
