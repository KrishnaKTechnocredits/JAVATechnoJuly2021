package avinash.assignment23;

public class Assignment23 {
	int iciciAmount = 4000;
	int hdfcAmount = 5000;
	int bobAmount = 6000;
	int sbiAmount = 9000;
	int iciciDebitCount, hdfcDebitCount, bobDebitCount, sbiDebitCount;
	int iciciCreditCount, hdfcCreditCount, bobCreditCount, sbiCreditCount;

	void bankOperations(String bankName, String operation, int amount) {
		switch (bankName) {
		case "ICICI":
			if (operation.equalsIgnoreCase("Debit")) {
				if (iciciAmount > amount) {
					iciciAmount = iciciAmount - amount;
					iciciDebitCount++;
				} else
					System.out.println("Inadequate ICICI account balance.");
			} else {
				iciciAmount = iciciAmount + amount;
				iciciCreditCount++;
			}
			break;

		case "HDFC":
			if (operation.equalsIgnoreCase("Debit")) {
				if (hdfcAmount > amount) {
					hdfcAmount = hdfcAmount - amount;
					hdfcDebitCount++;
				} else
					System.out.println("Inadequate HDFC account balance.");
			} else {
				hdfcAmount = hdfcAmount + amount;
				hdfcCreditCount++;
			}

			break;
		case "BOB":
			if (operation.equalsIgnoreCase("Debit")) {
				if (hdfcAmount > amount) {
					bobAmount = bobAmount - amount;
					bobDebitCount++;
				} else
					System.out.println("Inadequate BOB account balance.");
			} else {
				bobAmount = bobAmount + amount;
				bobCreditCount++;
			}

			break;

		case "SBI":
			if (operation.equalsIgnoreCase("Debit")) {
				if (sbiAmount > amount) {
					sbiAmount = sbiAmount - amount;
					sbiDebitCount++;
				} else
					System.out.println("Inadequate SBI account balance.");
			} else {
				sbiAmount = sbiAmount + amount;
				sbiCreditCount++;
			}
			break;

		default:
			System.out.println("Invalid bank name");
		}

	}

	void displayTotalBal() {
		int totalBal = iciciAmount + hdfcAmount + bobAmount + sbiAmount;
		System.out.println("The total account balance across 4 banks is Rs." + totalBal);
	}

	void displayTotalCredit() {

		int totalCredit = iciciCreditCount + hdfcCreditCount + bobCreditCount + sbiCreditCount;
		System.out.println("Overall count of credit operations across 4 banks is " + totalCredit);

	}

	void displayTotalDebit() {

		int totalDebit = iciciDebitCount + hdfcDebitCount + bobDebitCount + sbiDebitCount;
		System.out.println("Overall count of debit operations acoss 4 banks is " + totalDebit);
	}

	void displayIndCredOpt() {
		System.out.println("Overall count of credit operations on ICICI bank account is " + iciciCreditCount);
		System.out.println("Overall count of credit operations on HDFC bank account is " + hdfcCreditCount);
		System.out.println("Overall count of credit operations on BOB bank account is " + bobCreditCount);
		System.out.println("Overall count of credit operations on SBI bank account is " + sbiCreditCount);
	}

	void displayIndDebitOpt() {
		System.out.println("Overall count of debit operations on ICICI bank account is " + iciciDebitCount);
		System.out.println("Overall count of debit operations on HDFC bank account is " + hdfcDebitCount);
		System.out.println("Overall count of debit operations on BOB bank account is " + bobDebitCount);
		System.out.println("Overall count of debit operations on SBI bank account is " + sbiDebitCount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment23 assignment23 = new Assignment23();
		assignment23.bankOperations("ICICI", "Debit", 1000);
		assignment23.bankOperations("ICICI", "Credit", 500);
		assignment23.bankOperations("HDFC", "Debit", 750);
		assignment23.bankOperations("HDFC", "Credit", 1000);
		assignment23.bankOperations("SBI", "Debit", 2500);
		assignment23.bankOperations("SBI", "Credit", 500);
		assignment23.bankOperations("BOB", "Credit", 525);
		assignment23.bankOperations("BOB", "Debit", 950);
		assignment23.bankOperations("ICICI", "Debit", 200);
		assignment23.bankOperations("HDFC", "Credit", 750);
		assignment23.displayTotalBal();
		assignment23.displayTotalCredit();
		assignment23.displayIndCredOpt();
		assignment23.displayTotalDebit();
		assignment23.displayIndDebitOpt();

	}

}
