package trupti;

public class Assignment_8 {
	static int debitCont;
	static int creditCont;
	static int prntBalance;

	int debitCnt;
	int creditCnt;
	int currentBalance;
	int prBalance;
	String customerName;

	void setCustomerName(String custnam) {
		customerName = custnam;
		System.out.println("Account holder name is :" + customerName);
	}

	void initialBalance(int rS) {
		currentBalance = rS;
		System.out.println("Initial Balance is :" + rS);
	}

	void debitAmt(int amt) {
		System.out.println("debit amount is :" + amt);
		currentBalance = currentBalance - amt;
		debitCnt++;
		debitCont++;
	}

	void creditAmt(int amt) {
		System.out.println("credit amount is :" + amt);
		currentBalance = currentBalance + amt;
		creditCnt++;
		creditCont++;
	}

	void printBalance() {
		System.out.println(customerName + " current balance is " + currentBalance);
		prBalance++;
		prntBalance++;

	}

	void individualTransactionSummary() {
		System.out.println(customerName + " Transaction summary:" + "debit count is:" + debitCnt + ", credit count is:"
				+ creditCnt + ", print balance count is: " + prBalance);
	}

	void allTransactionSummary() {
		System.out.println("All Transaction summary:" + "debit count is:" + debitCont + ", credit count is:"
				+ creditCont + ", print balance count is: " + prntBalance);
	}

	public static void main(String[] args) {
		Assignment_8 assignment_8_1 = new Assignment_8();
		assignment_8_1.setCustomerName("Trupti");
		assignment_8_1.initialBalance(30000);
		assignment_8_1.debitAmt(2000);
		assignment_8_1.debitAmt(800);
		assignment_8_1.debitAmt(200);
		assignment_8_1.creditAmt(5000);
		assignment_8_1.printBalance();
		assignment_8_1.individualTransactionSummary();

		System.out.println("--------------------------------");

		Assignment_8 assignment_8_2 = new Assignment_8();
		assignment_8_2.setCustomerName("Mandar");
		assignment_8_2.initialBalance(20000);
		assignment_8_2.debitAmt(1200);
		assignment_8_2.debitAmt(5000);
		assignment_8_2.printBalance();
		assignment_8_2.creditAmt(3000);
		assignment_8_2.creditAmt(1000);
		assignment_8_2.printBalance();
		assignment_8_2.individualTransactionSummary();

		System.out.println("--------------------------------");

		Assignment_8 assignment_8_3 = new Assignment_8();
		assignment_8_3.allTransactionSummary();

	}

}
