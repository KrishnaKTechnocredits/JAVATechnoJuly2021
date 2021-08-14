package aniket;

public class BankingSystem {

	int debitCnt;
	int creditCnt;
	int printBalanceCount;
	double currentBalance;
	static int allDebitCnt;
	static int allCreditCnt;
	static int allPrintBalanceCount;
	String customerName;

	void setUserDetails (String custName,double balance) {
		System.out.println(custName + " Bank details :");
		customerName = custName;
		currentBalance=balance;
	}

	void debitamt() {
		debitCnt++;
		allDebitCnt++;
	}

	void creditamt() {
		creditCnt++;
		allCreditCnt++;
	}

	void printBalance() {
		printBalanceCount++;
		allPrintBalanceCount++;
	}

	void individualTransactionSummary() {
		System.out.println(customerName + " transaction summary: " + "Credit - " + creditCnt + "times, Debit - "
				+ debitCnt + " times, printBalance - " + printBalanceCount + " times");
	}

	void allTransactionSummary() {
		System.out.println("All transaction summary: " + "Credit - " + allCreditCnt + "times, Debit - " + allDebitCnt
				+ " times, printBalance - " + allPrintBalanceCount + " times");

	}

	public static void main(String[] args) {
		BankingSystem assignment8_1 = new BankingSystem();
		BankingSystem assignment8_2 = new BankingSystem();
		assignment8_1.setUserDetails("Aniket",10000);
		assignment8_1.debitamt();
		assignment8_1.debitamt();
		assignment8_1.debitamt();
		assignment8_1.creditamt();
		assignment8_1.creditamt();
		assignment8_1.printBalance();
		assignment8_1.printBalance();
		assignment8_1.individualTransactionSummary();

		assignment8_2.setUserDetails("Sushama",20000);
		assignment8_2.debitamt();
		assignment8_2.debitamt();
		assignment8_2.creditamt();
		assignment8_2.printBalance();
		assignment8_2.individualTransactionSummary();

		assignment8_1.allTransactionSummary();

	}

}
