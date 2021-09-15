package neha.assignment_23;

public class BankOperations {
	int iciciBalance = 20000; // initial customer balance for ICICI
	int hdfcBalance = 5000; // initial customer balance for HDFC
	int bobBalance = 2000; // initial customer balance for Bank of Baroda
	int sbiBalance = 10000; // initial customer balance for SBI
	int debitICICI = 0;
	int debitHDFC = 0;
	int debitBOB = 0;
	int debitSBI = 0;
	int creditICICI = 0;
	int creditHDFC = 0;
	int creditBOB = 0;
	int creditSBI = 0;

	// to show total balance [ICICI balance + HDFC balance + BOB balance + SBI
	// Balance]
	void showTotalBalanceForBanks() {
		System.out.println("********************************************************");
		System.out
				.println("Total Balance for the customer - " + (iciciBalance + hdfcBalance + bobBalance + sbiBalance));
	}

	// to show total credit, debit operations
	void showTotalCreditDebitOperations() {
		System.out.println("********************************************************");
		System.out.println("Total credit operations - " + (creditICICI + creditHDFC + creditBOB + creditSBI));
		System.out.println("Total debit operations - " + (debitICICI + debitHDFC + debitBOB + debitSBI));
	}

	// to show individual bank credit operations
	void showIndividualCreditOperations(String bankCode) {
		System.out.println("------------------------------------------------------------");
		switch (bankCode) {
		case "icici01":
			System.out.println("ICICI Bank credit operation - " + creditICICI);
			break;
		case "hdfc02":
			System.out.println("HDFC Bank credit operation - " + creditHDFC);
			break;
		case "bob03":
			System.out.println("Bank of Baroda Bank credit operation - " + creditBOB);
			break;
		case "sbi04":
			System.out.println("SBI Bank credit operation - " + creditSBI);
			break;
		default:
			System.out.println("Invalid bank code");

		}
	}

	// to show individual bank debit operations
	void showIndividualDebitOperations(String bankCode) {
		System.out.println("---------------------------------------------------------------");
		switch (bankCode) {
		case "icici01":
			System.out.println("ICICI Bank debit operation - " + debitICICI);
			break;
		case "hdfc02":
			System.out.println("HDFC Bank debit operation - " + debitHDFC);
			break;
		case "bob03":
			System.out.println("Bank of Baroda Bank debit operation - " + debitBOB);
			break;
		case "sbi04":
			System.out.println("SBI Bank debit operation - " + debitSBI);
			break;
		default:
			System.out.println("Invalid bank code");

		}
	}

	// debit amount for any bank as provided by user
	void debitAmount(String bankCode, int dAmount) {
		switch (bankCode) {
		case "icici01":
			iciciBalance -= dAmount;
			debitICICI++;
			break;
		case "hdfc02":
			hdfcBalance -= dAmount;
			debitHDFC++;
			break;
		case "bob03":
			bobBalance -= dAmount;
			debitBOB++;
			break;
		case "sbi04":
			sbiBalance -= dAmount;
			debitSBI++;
			break;
		default:
			System.out.println("Invalid bank code");

		}
	}

	// credit amount for any bank as provided by user
	void creditAmount(String bankCode, int cAmount) {
		switch (bankCode) {
		case "icici01":
			iciciBalance += cAmount;
			creditICICI++;
			break;
		case "hdfc02":
			hdfcBalance += cAmount;
			creditHDFC++;
			break;
		case "bob03":
			bobBalance += cAmount;
			creditBOB++;
			break;
		case "sbi04":
			sbiBalance += cAmount;
			creditSBI++;
			break;
		default:
			System.out.println("Invalid bank code");

		}
	}

	public static void main(String[] args) {
		BankOperations customer1 = new BankOperations();
		// check total balance
		customer1.showTotalBalanceForBanks();
		// debit operations across banks
		customer1.debitAmount("icici01", 1000);
		customer1.debitAmount("hdfc02", 2000);
		customer1.debitAmount("bob03", 1000);
		customer1.debitAmount("sbi04", 3000);
		customer1.debitAmount("icici01", 1000);
		customer1.debitAmount("sbi04", 500);
		customer1.debitAmount("sbi04", 500);
		customer1.debitAmount("hdfc02", 1000);
		// credit operations across banks
		customer1.creditAmount("icici01", 1000);
		customer1.creditAmount("hdfc02", 2000);
		customer1.creditAmount("bob03", 1000);
		customer1.creditAmount("sbi04", 3000);
		customer1.creditAmount("hdfc02", 1000);
		customer1.creditAmount("bob03", 3000);
		customer1.creditAmount("bob03", 1000);
		customer1.creditAmount("sbi04", 1500);
		customer1.creditAmount("sbi04", 1500);
		// check total debit and credit operations across banks for customer
		customer1.showTotalCreditDebitOperations();
		// check individual bank credit operations
		customer1.showIndividualCreditOperations("icici01");
		customer1.showIndividualCreditOperations("hdfc02");
		customer1.showIndividualCreditOperations("bob03");
		customer1.showIndividualCreditOperations("sbi04");
		// check individual bank debit operations
		customer1.showIndividualDebitOperations("icici01");
		customer1.showIndividualDebitOperations("hdfc02");
		customer1.showIndividualDebitOperations("bob03");
		customer1.showIndividualDebitOperations("sbi04");
		// show total balance
		customer1.showTotalBalanceForBanks();
	}
}
