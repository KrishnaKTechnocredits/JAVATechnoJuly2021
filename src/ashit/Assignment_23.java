package ashit;

public class Assignment_23 {
	
		int sbiAmt = 20000;
		int hdfcAmt = 20000;
		int iciciAmt = 40000;
		int bobAmt = 40000;
		int iciciDebitCount, hdfcDebitCount, bobDebitCount, sbiDebitCount;
		int iciciCreditCount, hdfcCreditCount, bobCreditCount, sbiCreditCount;

		void bankTransfers(String bankName, String operation, int amount) {
			switch (bankName) {
			case "ICICI":
				if (operation.equalsIgnoreCase("Debit")) {
					if (iciciAmt > amount) {
						iciciAmt = iciciAmt - amount;
						iciciDebitCount++;
					}

					else
						System.out.println("Inadequate ICICI Account Balance.");
				}

				else {
					iciciAmt = iciciAmt + amount;
					iciciCreditCount++;
				}
				break;

			case "HDFC":
				if (operation.equalsIgnoreCase("Debit")) {
					if (hdfcAmt > amount) {
						hdfcAmt = hdfcAmt - amount;
						hdfcDebitCount++;
					} else
						System.out.println("Inadequate HDFC Account Balance.");
				} else {
					hdfcAmt = hdfcAmt + amount;
					hdfcCreditCount++;
				}
				break;

			case "BOB":
				if (operation.equalsIgnoreCase("Debit")) {
					if (hdfcAmt > amount) {
						bobAmt = bobAmt - amount;
						bobDebitCount++;
					} else
						System.out.println("Inadequate BOB Account Balance.");
				} else {
					bobAmt = bobAmt + amount;
					bobCreditCount++;
				}
				break;

			case "SBI":
				if (operation.equalsIgnoreCase("Debit")) {
					if (sbiAmt > amount) {
						sbiAmt = sbiAmt - amount;
						sbiDebitCount++;
					} else
						System.out.println("Inadequate SBI Account Balance.");
				} else {
					sbiAmt = sbiAmt + amount;
					sbiCreditCount++;
				}
				break;
			default:
				System.out.println("Invalid Bank Name");
			}
		}

		void printTotalBal() {
			int totalBal = iciciAmt + hdfcAmt + bobAmt + sbiAmt;
			System.out.println("Total Account Balance in All Banks is Rs." + totalBal);
		}

		void printTotalCredit() {
			int totalCredit = iciciCreditCount + hdfcCreditCount + bobCreditCount + sbiCreditCount;
			System.out.println("Overall Count of Credits in All Banks is " + totalCredit);
		}

		void printTotalDebit() {
			int totalDebit = iciciDebitCount + hdfcDebitCount + bobDebitCount + sbiDebitCount;
			System.out.println("Overall Count of Debits in All Banks is " + totalDebit);
		}

		void printIndCredOpt() {
			System.out.println("Overall Count of Credits in ICICI Bank Account is " + iciciCreditCount);
			System.out.println("Overall Count of Credits in HDFC Bank Account is " + hdfcCreditCount);
			System.out.println("Overall Count of Credits in BoB Bank Account is " + bobCreditCount);
			System.out.println("Overall Count of Credits in SBI Bank Account is " + sbiCreditCount);
		}

		void displayIndDebitOpt() {
			System.out.println("Overall Count of Debits in ICICI Bank Account is " + iciciDebitCount);
			System.out.println("Overall Count of Debits in HDFC Bank Account is " + hdfcDebitCount);
			System.out.println("Overall Count of Debits in BoB Bank Account is " + bobDebitCount);
			System.out.println("Overall Count of Debits in SBI Bank Account is " + sbiDebitCount);
		}

		public static void main(String[] args) {
			Assignment_23 bank = new Assignment_23();
			bank.bankTransfers("ICICI", "Debit", 2000);
			bank.bankTransfers("HDFC", "Credit", 3000);
			bank.bankTransfers("SBI", "Debit", 4000);
			bank.bankTransfers("BOB", "Credit", 7000);
			bank.bankTransfers("HDFC", "Credit", 10000);
			bank.printTotalBal();
			bank.printTotalCredit();
			bank.printIndCredOpt();
			bank.printTotalDebit();
			bank.displayIndDebitOpt();
		}
	}

