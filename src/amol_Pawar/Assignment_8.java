package amol_Pawar;

public class Assignment_8 {

	int currentBalance;
	int creditCount = 0;
	int debitCount = 0;
	int printBalanceCount = 0;
	String userName;
	static int cCount = 0;
	static int dCount = 0;
	static int printCount = 0;

	void setUserDetails(String uName, int initialBal) {
		currentBalance = initialBal;
		userName = uName;

	}

	void debitOpration(int debitAmt) {
		currentBalance = currentBalance - debitAmt;
		debitCount++;
		dCount++;
	}

	void creditOpration(int creditAmt) {
		currentBalance = currentBalance + creditAmt;
		creditCount++;
		cCount++;
	}

	void printBalance() {
		System.out.println("Current balance of " + userName + " is " + currentBalance);
		printBalanceCount++;
		printCount++;

	}

	void individualTransactionSummary() {
		System.out.println(userName + " has debited money " + debitCount + " times");
		System.out.println(userName + " has credited money " + creditCount + " times");
		System.out.println(userName + " has print his balance " + printBalanceCount + " times");
	}

	static void allTransactionSummary() {
		System.out.println("Total debit opartion for all customers are :" + dCount);
		System.out.println("Total credit opartion for all customers are :" + cCount);
		System.out.println("Total print opartion for all customers are :" + printCount);

	}

	public static void main(String[] args) {
		Assignment_8 assignment_8 = new Assignment_8();
		System.out.println("------Debited Money-------");
		assignment_8.setUserDetails("Amol", 10000);
		assignment_8.debitOpration(1000);
		assignment_8.debitOpration(100);
		assignment_8.printBalance();
		assignment_8.individualTransactionSummary();
		System.out.println("------Credited Money-------");
		assignment_8.creditOpration(500);
		assignment_8.printBalance();
		assignment_8.individualTransactionSummary();
		Assignment_8 assignment_8_1 = new Assignment_8();
		System.out.println("------Debited Money by new user-------");
		assignment_8_1.setUserDetails("Raju", 1000);
		assignment_8_1.debitOpration(100);
		assignment_8_1.printBalance();
		assignment_8_1.individualTransactionSummary();
		System.out.println("------Opration by all users-------");
		allTransactionSummary();
	}
}
