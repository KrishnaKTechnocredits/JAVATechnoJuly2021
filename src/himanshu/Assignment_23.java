package himanshu;

public class Assignment_23 {
	
		int iciciBalance = 5000;
		int iciciCreditCount;
		int iciciDebitCount;

		int bobBalance = 10000;
		int bobCreditCount;
		int bobDebitCount;

		int hdfcBalance = 15000;
		int hdfcCreditCount;
		int hdfcDebitCount;

		int sbiBalance = 20000;
		int sbiCreditCount;
		int sbiDebitCount;

		void bankDetailsAndTransactionType(String bank, String transaction,
				int amount) {
			switch (bank)
	 {

			case "ICICI":
				switch (transaction) {
				case "Debit":
					iciciBalance = iciciBalance - amount;
					iciciDebitCount++;
					break;
				case "Credit":
					iciciBalance = iciciBalance + amount;
					iciciCreditCount++;
					break;
				}
				break;

			case "BOI":
				switch (transaction) {
				case "Debit":
					bobBalance = bobBalance - amount;
					bobCreditCount++;
					break;
				case "Credit":
					bobBalance = bobBalance + amount;
					bobDebitCount++;
					break;
				}
				break;

			case "HDFC":
				switch (transaction) {
				case "Debit":
					hdfcBalance = hdfcBalance - amount;
					hdfcDebitCount++;
					break;
				case "Credit":
					hdfcBalance = hdfcBalance + amount;
					hdfcCreditCount++;
					break;
				}
				break;

			case "SBI":
				switch (transaction) {
				case "Debit":
					sbiBalance = sbiBalance - amount;
					sbiDebitCount++;
					break;
				case "Credit":
					sbiBalance = sbiBalance + amount;
					sbiCreditCount++;
					break;
				}
				break;

			}
		}

		void totalBalance() {
			System.out.println("Total balance from the all four accounts are "
					+ (iciciBalance + bobBalance + hdfcBalance + sbiBalance));
		}

		void totalTransactionDetails() {
			System.out.println("Total transactions from all four accounts are "
					+ (iciciCreditCount + bobCreditCount + hdfcCreditCount
							+ sbiCreditCount + iciciDebitCount + bobDebitCount
							+ hdfcDebitCount + sbiDebitCount));
		}

		void indiVidualCreditTransactionDetails() {
			System.out.println("Total credit transaction count of ICICI is "
					+ iciciCreditCount);
			System.out.println("Total credit  transaction count of BOB is "
					+ bobCreditCount);
			System.out.println("Total credit  transaction count of HDFC is "
					+ hdfcCreditCount);
			System.out.println("Total credit  transaction count of SBI is "
					+ sbiCreditCount);
		}

		void indiVidualDebitTransactionDetails() {
			System.out.println("Total debit transaction count of ICICI is "
					+ iciciDebitCount);
			System.out.println("Total debit transaction count of BOB is "
					+ bobDebitCount);
			System.out.println("Total debit transaction count of HDFC is "
					+ hdfcDebitCount);
			System.out.println("Total debit transaction count of SBI is "
					+ sbiDebitCount);
		}

		public static void main(String[] args) {
			Assignment_23 ass23 = new Assignment_23();
			ass23.totalBalance();
			ass23.bankDetailsAndTransactionType("ICICI", "Credit", 5000);
			ass23.bankDetailsAndTransactionType("BOB", "Credit", 2000);
			ass23.bankDetailsAndTransactionType("HDFC", "Credit", 3000);
			ass23.bankDetailsAndTransactionType("SBI", "Debit", 10000);
			ass23.totalBalance();
			ass23.indiVidualDebitTransactionDetails();
			ass23.indiVidualCreditTransactionDetails();
			ass23.bankDetailsAndTransactionType("ICICI", "Credit", 4500);
			ass23.indiVidualCreditTransactionDetails();
			ass23.totalBalance();
		}
	}

