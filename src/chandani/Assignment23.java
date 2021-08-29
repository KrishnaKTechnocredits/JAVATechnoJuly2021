package chandani;

public class Assignment23{

	int iciciAmt = 9000;
	int hdfcAmt = 6000;
	int bobAmt = 8000;
	int sbiAmt = 10000;
	int iciciDebitCount, hdfcDebitCount, bobDebitCount, sbiDebitCount;
	int iciciCreditCount, hdfcCreditCount, bobCreditCount, sbiCreditCount;

	void bankOperations(String bankName, String operation, int amount) {

		switch (bankName) {
		case "ICICI":
			if (operation == "Debit") {
				if (iciciAmt > amount) {
					iciciAmt = iciciAmt - amount;
					iciciDebitCount++;
				}
				else
					System.out.println("Inadequate ICICI account balance.");
			}
			else {
				iciciAmt = iciciAmt + amount;
				iciciCreditCount++;
			}
			break;

		case "HDFC":
			if (operation.equals ("Debit")) {
				if (hdfcAmt > amount) {
					hdfcAmt = hdfcAmt - amount;
					hdfcDebitCount++;
				} else
					System.out.println("Inadequate HDFC account balance.");
			} else {
				hdfcAmt = hdfcAmt + amount;
				hdfcCreditCount++;
			}
			break;

		case "BOB":
			if (operation.equalsIgnoreCase("Debit")) {
				if (bobAmt > amount) {
					bobAmt = bobAmt - amount;
					bobDebitCount++;
				} else
					System.out.println("Inadequate BOB account balance.");
			} else {
				bobAmt = bobAmt + amount;
				bobCreditCount++;
			}

			break;

		case "SBI":
			if (operation == "Debit") {
				if (sbiAmt > amount) {
					sbiAmt = sbiAmt - amount;
					sbiDebitCount++;
				} else
					System.out.println("Inadequate SBI account balance.");
			} else {
				sbiAmt = sbiAmt + amount;
				sbiCreditCount++;
			}
			break;

		default:
			System.out.println("Invalid bank name");
		}

	}

	void displayTotalBal() {
		int totalBal = iciciAmt + hdfcAmt + bobAmt + sbiAmt;
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
		Assignment23 bank = new Assignment23();
		bank.bankOperations("ICICI", "Debit", 1000);
		bank.bankOperations("HDFC", "Credit", 500);
		bank.bankOperations("HDFC", "Debit", 750);
		bank.bankOperations("HDFC", "Credit", 1000);
		bank.bankOperations("SBI", "Debit", 2500);
		bank.bankOperations("SBI", "Credit", 500);
		bank.bankOperations("BOB", "Credit", 525);
		bank.bankOperations("BOB", "Debit", 950);
		bank.bankOperations("ICICI", "Debit", 200);
		bank.bankOperations("HDFC", "Credit", 750);
		bank.displayTotalBal();
		bank.displayTotalCredit();
		bank.displayIndCredOpt();
		bank.displayTotalDebit();
		bank.displayIndDebitOpt();
	}

}