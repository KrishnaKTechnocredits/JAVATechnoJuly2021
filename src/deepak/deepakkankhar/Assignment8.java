//Assignment 8 DATE: 08/11/2021
package deepak.deepakkankhar;

import javax.naming.InitialContext;

public class Assignment8 {
	int debitCnt;
	int creditCnt;
	int printBalanceCnt;
	String name;
	double Balance;
	
	static int debitCnt1;
	static int creditCnt1;
	static int printBalanceCnt1;
	
	void setUserDetails(String name1, double initialBal1) {
		name=name1;
		Balance=initialBal1;
	}
	
	void debit(double debitAmt) {
		debitCnt++;
		debitCnt1++;
		Balance=Balance-debitAmt;
	}
	
	void credit(double creditAmt) {
		creditCnt++;
		creditCnt1++;
		Balance=Balance+creditAmt;	
	}
	
	void printBalance() {
		printBalanceCnt++;
		printBalanceCnt1++;
	}
	
	void individualTransactionSummary() {
		
		System.out.println("Customer Name: "+name);
		System.out.println("Transaction Summary");
		System.out.println("Credit: "+creditCnt+" times");
		System.out.println("Debit: "+debitCnt+" times");
		System.out.println("Print Balance: "+printBalanceCnt+" times");
		System.out.println("Balance Amount: "+Balance);
		System.out.println("");
	}
	
	static void allTransactionsSummary() {
		
		System.out.println("All Transaction Summary");
		System.out.println("Credit: "+creditCnt1+" times");
		System.out.println("Debit: "+debitCnt1+" times");
		System.out.println("Print Balance: "+printBalanceCnt1+" times");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment8 user1=new Assignment8();
		Assignment8 user2=new Assignment8();
				
		user1.setUserDetails("Sachin", 10000.00);
		user2.setUserDetails("Virender", 5000.00);
		
		user1.credit(1000.0);
		user1.credit(1000.0);
		user1.debit(500.0);
		user1.printBalance();
		user1.individualTransactionSummary();
				
		user2.credit(500.0);
		user2.credit(500.0);
		user2.credit(500.0);
		user2.credit(500.0);
		user2.credit(500.0);
		user2.debit(200.0);
		user2.debit(200.0);
		user2.individualTransactionSummary();
		allTransactionsSummary();
	}
}
