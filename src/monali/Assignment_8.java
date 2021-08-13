package monali;

class Assignment_8 {

	int debitCnt;
	int creditCnt;
	int printBalanceCnt;
	int initialBalance;
	String customerName;
	static int debitCntAllUsers;
	static int creditCntAllUsers;
	static int printBalanceCntAllUsers;

	void setUserDetails(String custName, int iniBalance) {
		initialBalance = iniBalance;
		customerName = custName;
	}

	void debitAmt(int debit) {
		initialBalance = initialBalance - debit;
		debitCnt++;
		debitCntAllUsers++;
	}

	void creditAmt(int credit) {
		initialBalance = initialBalance + credit;
		creditCnt++;
		creditCntAllUsers++;
	}

	void printBalance() {
		System.out.println("Current Balance of User --> " + customerName + " in account =" + initialBalance);
		printBalanceCnt++;
		printBalanceCntAllUsers++;
	}

	void individualTransactionSummary() {
		System.out.println(customerName + " transaction summary : " + "Credit - " + creditCnt + " times " + "Debit - "
				+ debitCnt + " times " + " and PrintBalance - " + printBalanceCnt + " times ");
	}

	static void allTransactionSummary() {
		System.out.println("All transaction summary : Credit - " + creditCntAllUsers + " Debit - " + debitCntAllUsers
				+ " Print Balance - " + printBalanceCntAllUsers);
	}

	public static void main(String[] args) {
		Assignment_8 assignment_8_1 = new Assignment_8();
		assignment_8_1.setUserDetails("Monali", 10000);
		Assignment_8 assignment_8_2 = new Assignment_8();
		assignment_8_2.setUserDetails("Devendra", 20000);
		assignment_8_1.debitAmt(1000);
		assignment_8_1.debitAmt(2000);
		assignment_8_1.creditAmt(5000);
		assignment_8_2.debitAmt(4000);
		assignment_8_2.creditAmt(1000);
		assignment_8_2.creditAmt(2000);
		assignment_8_2.creditAmt(1000);
		assignment_8_2.printBalance();
		assignment_8_1.individualTransactionSummary();
		assignment_8_2.individualTransactionSummary();
		allTransactionSummary();

	}

}
