package husain.Assignment23;

public class SwitchBanks {

	int iciciAmount = 5000;
	int hdfcAmount = 6000;
	int bobAmount = 7000;
	int sbiAmount = 8000;
	int iciciDebitCount, hdfcDebitCount, bobDebitCount, sbiDebitCount;
	int iciciCreditCount, hdfcCreditCount, bobCreditCount, sbiCreditCount;

	void bankOperations(String bankName, String operation, int amount) {

		switch (bankName) {
		case "ICICI":
			if (operation.equalsIgnoreCase("Debit")) {
				if (iciciAmount > amount) {
					iciciAmount = iciciAmount - amount;
					iciciDebitCount++;
				}

				else
					System.out.println("Inadequate ICICI account balance.");
			}

			else {
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
		SwitchBanks bank = new SwitchBanks();
		bank.bankOperations("ICICI", "Debit", 1000);
		bank.bankOperations("ICICI", "Credit", 500);
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
