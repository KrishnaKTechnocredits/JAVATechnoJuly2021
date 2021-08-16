package sameer;

public class Assignment_8 {
	int cCount, dCount, printBalance;
	int cBalance;
	static int creditCount, debitCount, printCount;
	String userName;
	void setUserDetails(String uName, int initBalance){
		userName = uName;
		cBalance = initBalance;
	}
	void debAmount(int debtAmt ) {
		cBalance = cBalance - debtAmt;
		dCount++;
		debitCount++;
	}
	void credAmount (int creAmt) {
		cBalance = cBalance + creAmt;
		cCount++;
		creditCount++;
		
	}
	void printBalance() {
		System.out.println ("Current Balance of user " + userName + " Is " + cBalance);
		printBalance++;
		printCount++;
	}
	void individualTranasactionSummary() {
		System.out.println ("Ammount Debited from " + userName + " Account IS :" + dCount);
		System.out.println ("Ammount Credited from " + userName + " Account IS :" +  cCount);
		System.out.println ("Balance Amount Printed for " + userName + " Account IS :" + printBalance);
		
	}
	static void allTransactionSummary() {
		System.out.println("Total debit transaction for customer is :" + debitCount);
		System.out.println("Total credit transaction for customer is :" + creditCount);
		System.out.println("Total transactions printed for customers are :" + printCount);
	}
	public static void main (String [] args) {
		Assignment_8 assignment_8 = new Assignment_8();
		assignment_8.setUserDetails("Sameer", 25000);
		assignment_8.debAmount(1200);
		assignment_8.credAmount(2000);
		assignment_8.credAmount(1000);
		assignment_8.printBalance();
		assignment_8.individualTranasactionSummary();
		Assignment_8 assignment_8_1 = new Assignment_8();
		assignment_8_1.setUserDetails("Anvi", 55000);
		assignment_8_1.credAmount(1000);
		assignment_8_1.debAmount(800);
		assignment_8_1.credAmount(1000);
		assignment_8_1.credAmount(700);
		assignment_8_1.credAmount(100);
		assignment_8_1.debAmount(6800);
		assignment_8_1.credAmount(1000);
		assignment_8_1.individualTranasactionSummary();
		allTransactionSummary();
	}
}
