package vivek;

public class Assignment23 {

	int balanceICICI = 10000, balanceHDFC = 5000, balanceBOB = 2000, balanceSBI = 1000;
	int creditICICI, creditHDFC, creditBOB, creditSBI;
	int debitICICI, debitHDFC, debitBOB, debitSBI;

	void bankWiseTransaction(String bankName, String transaction, int amount) {
		switch (bankName) {
		case "ICICI":
			switch (transaction) {
			case "Credit":
				balanceICICI = balanceICICI + amount;
				creditICICI++;
				break;
			case "Debit":
				balanceICICI = balanceICICI - amount;
				debitICICI++;
				break;
			}
			break;
		case "HDFC":
			switch (transaction) {
			case "Credit":
				balanceHDFC = balanceHDFC + amount;
				creditHDFC++;
				break;
			case "Debit":
				balanceHDFC = balanceHDFC - amount;
				debitHDFC++;
				break;
			}
			break;
		case "BOB":
			switch (transaction) {
			case "Credit":
				balanceBOB = balanceBOB + amount;
				creditBOB++;
				break;
			case "Debit":
				balanceBOB = balanceBOB - amount;
				debitBOB++;
				break;
			}
			break;
		case "SBI":
			switch (transaction) {
			case "Credit":
				balanceSBI = balanceSBI + amount;
				creditSBI++;
				break;
			case "Debit":
				balanceSBI = balanceSBI - amount;
				debitSBI++;
				break;
			}
			break;
		}
	}

	void bankWiseCreditCount() {
		System.out.println("ICICI Bank Credit operation count is " + creditICICI);
		System.out.println("HDFC Bank Credit operation count is " + creditHDFC);
		System.out.println("BOB Bank Credit operation count is " + creditBOB);
		System.out.println("SBI Bank Credit operation count is " + creditSBI);
	}

	void bankWiseDebitCount() {
		System.out.println("ICICI Bank Debit operation count is " + debitICICI);
		System.out.println("HDFC Bank Debit operation count is " + debitHDFC);
		System.out.println("BOB Bank Debit operation count is " + debitBOB);
		System.out.println("SBI Bank Debit operation count is " + debitSBI);
	}

	void totalCreditDebitCount() {
		System.out.println(
				"Total Credit operation in all accouts is " + (creditICICI + creditHDFC + creditBOB + creditSBI));
		System.out
				.println("Total Debit operation in all accounts is " + (debitICICI + debitHDFC + debitBOB + debitSBI));
	}

	void getTotalbalance() {
		System.out
				.println("Total balance in all accounts is " + (balanceICICI + balanceHDFC + balanceBOB + balanceSBI));
	}

	public static void main(String[] args) {
		Assignment23 assignment23 = new Assignment23();
		assignment23.bankWiseTransaction("ICICI", "Credit", 1000);
		assignment23.bankWiseTransaction("ICICI", "Credit", 2000);
		assignment23.bankWiseTransaction("HDFC", "Credit", 1000);
		assignment23.bankWiseTransaction("HDFC", "Credit", 500);
		assignment23.bankWiseTransaction("BOB", "Credit", 100);
		assignment23.bankWiseTransaction("BOB", "Credit", 100);
		assignment23.bankWiseTransaction("BOB", "Credit", 100);
		assignment23.bankWiseTransaction("BOB", "Credit", 100);
		assignment23.bankWiseTransaction("SBI", "Credit", 200);
		assignment23.bankWiseTransaction("SBI", "Credit", 200);
		assignment23.bankWiseTransaction("SBI", "Credit", 200);
		assignment23.bankWiseTransaction("SBI", "Credit", 200);
		assignment23.bankWiseTransaction("ICICI", "Debit", 1500);
		assignment23.bankWiseTransaction("ICICI", "Debit", 1500);
		assignment23.bankWiseTransaction("HDFC", "Debit", 1000);
		assignment23.bankWiseTransaction("HDFC", "Debit", 1000);
		assignment23.bankWiseTransaction("BOB", "Debit", 400);
		assignment23.bankWiseTransaction("BOB", "Debit", 300);
		assignment23.bankWiseTransaction("SBI", "Debit", 200);
		assignment23.bankWiseTransaction("SBI", "Debit", 200);
		assignment23.bankWiseCreditCount();
		assignment23.bankWiseDebitCount();
		assignment23.totalCreditDebitCount();
		assignment23.getTotalbalance();
	}
}
