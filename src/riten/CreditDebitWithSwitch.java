package riten;

class CreditDebitWithSwitch {

	int totalCrediticiciop = 0;
	int totalDebiticiciop = 0;
	int totalDebithdfcop = 0;
	int totalCredithdfcop = 0;
	int totalDebitbobcop = 0;
	int totalCreditbobcop = 0;
	int totalDebitsbicop = 0;
	int totalCreditsbicop = 0;
	static double totalBalace = 0.0;
	static int totalCreditOperation = 0;
	static int totalDebitOperation = 0;
	static double iciciBalance = 100.0;
	static double hdfcBalance = 200.0;
	static double bobBalance = 100.0;
	static double sbiBalance = 450.0;

	void iciciAccount(String paymentType, double debit, double credit) {
		int iciciCreditOperation = 0;
		int iciciDebitOperation = 0;

		switch (paymentType) {
		case "credit":
			iciciBalance = iciciBalance + credit;
			if (totalBalace == 0) {
				totalBalace = iciciBalance;
			} else {
				totalBalace += credit;
			}
			iciciCreditOperation++;
			totalCrediticiciop = totalCrediticiciop + iciciCreditOperation;
			totalCreditOperation += iciciCreditOperation;
			System.out.println("Total balance  after icici account credit: " + totalBalace);
			// System.out.println("Total iciciCreditOperation: "+iciciCreditOperation);
			break;

		case "debit":
			iciciBalance = iciciBalance - debit;
			if (totalBalace == 0) {
				iciciBalance = iciciBalance;
			} else {
				totalBalace = totalBalace - debit;
			}
			iciciDebitOperation++;
			totalDebiticiciop = totalDebiticiciop + iciciDebitOperation;
			totalDebitOperation = totalDebitOperation + iciciDebitOperation;
			System.out.println("Total balance  after icici account debit: " + totalBalace);

			break;

		default:
			System.out.println("Enter correct data");

		}

	}

	void hdfcAccount(String paymentType, double debit, double credit) {
		int hdfcCreditOperation = 0;
		int hdfcDebitOperation = 0;

		switch (paymentType) {
		case "credit":
			hdfcBalance = hdfcBalance + credit;
			if (totalBalace == 0) {
				totalBalace = hdfcBalance;
			} else {
				totalBalace += credit;

			}
			hdfcCreditOperation++;
			totalCredithdfcop += hdfcCreditOperation;
			totalCreditOperation += hdfcCreditOperation;
			System.out.println("Total balance  after hdfc account credit: " + totalBalace);

			break;

		case "debit":
			hdfcBalance = hdfcBalance - debit;
			if (totalBalace == 0) {
				hdfcBalance = hdfcBalance;
			} else {
				totalBalace = totalBalace - debit;
			}
			hdfcDebitOperation++;
			totalDebithdfcop += hdfcDebitOperation;
			totalDebitOperation = totalDebitOperation + hdfcDebitOperation;
			System.out.println("Total balance  after hdfc account debit: " + totalBalace);

			break;

		default:
			System.out.println("Enter correct data");

		}

	}

	void bobAccount(String paymentType, double debit, double credit) {
		int bobCreditOperation = 0;
		int bobDebitOperation = 0;

		switch (paymentType) {
		case "credit":
			bobBalance = bobBalance + credit;
			if (totalBalace == 0) {
				totalBalace = bobBalance;
			} else {
				totalBalace += credit;

			}
			bobCreditOperation++;
			totalCreditbobcop += bobCreditOperation;
			totalCreditOperation += bobCreditOperation;
			System.out.println("Total balance  after bob account credit: " + totalBalace);

			break;

		case "debit":
			bobBalance = bobBalance - debit;
			if (totalBalace == 0) {
				bobBalance = bobBalance;
			} else {
				totalBalace = totalBalace - debit;
			}
			bobDebitOperation++;
			totalDebitbobcop += bobDebitOperation;
			totalDebitOperation = totalDebitOperation + bobDebitOperation;
			System.out.println("Total balance  after bob account debit: " + totalBalace);

			break;

		default:
			System.out.println("Enter correct data");

		}

	}

	void sbiAccount(String paymentType, double debit, double credit) {
		int sbiCreditOperation = 0;
		int sbiDebitOperation = 0;

		switch (paymentType) {
		case "credit":
			sbiBalance = sbiBalance + credit;
			if (totalBalace == 0) {
				totalBalace = sbiBalance;
			} else {
				totalBalace += credit;

			}
			sbiCreditOperation++;
			totalCreditsbicop += sbiCreditOperation;
			totalCreditOperation += sbiCreditOperation;
			System.out.println("Total balance after sbi account credit: " + totalBalace);

			break;

		case "debit":
			sbiBalance = sbiBalance - debit;
			if (totalBalace == 0) {
				sbiBalance = sbiBalance;
			} else {
				totalBalace = totalBalace - debit;
			}
			sbiDebitOperation++;
			totalDebitsbicop += sbiDebitOperation;
			totalDebitOperation = totalDebitOperation + sbiDebitOperation;
			System.out.println("Total balance after sbi account debit: " + totalBalace);

			break;

		default:
			System.out.println("Enter correct data");

		}

	}

	public static void main(String[] args) {
		CreditDebitWithSwitch credeb = new CreditDebitWithSwitch();
		credeb.iciciAccount("credit", 0, 50.0);
		credeb.iciciAccount("credit", 0, 1000.0);
		credeb.iciciAccount("debit", 50, 0);
		credeb.iciciAccount("debit", 200, 0);
		credeb.hdfcAccount("credit", 0, 100.0);
		credeb.hdfcAccount("debit", 50, 0);
		credeb.hdfcAccount("debit", 50, 0);
		credeb.bobAccount("credit", 0, 150.0);
		credeb.bobAccount("debit", 100, 0);
		credeb.sbiAccount("credit", 0, 50);
		System.out.println("Total Credit operation for ICICI Bank is: " + credeb.totalCrediticiciop);
		System.out.println("Total Debit operation for ICICI Bank is: " + credeb.totalDebiticiciop);
		System.out.println("Total Credit operation for HDFC Bank is: " + credeb.totalCredithdfcop);
		System.out.println("Total Debit operation for HDFC Bank is: " + credeb.totalDebithdfcop);
		System.out.println("Total Credit operation for BOB Bank is: " + credeb.totalCreditbobcop);
		System.out.println("Total Debit operation for BOB Bank is: " + credeb.totalDebitbobcop);
		System.out.println("Total Credit operation for SBI Bank is: " + credeb.totalCreditsbicop);
		System.out.println("Total Debit operation for SBI Bank is: " + credeb.totalDebitsbicop);
		System.out.println("Total credit operation: " + totalCreditOperation);
		System.out.println("Total debit operation: " + totalDebitOperation);

	}

}