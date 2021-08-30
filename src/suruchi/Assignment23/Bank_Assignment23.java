package suruchi.Assignment23;

public class Bank_Assignment23 {

	String fname;
	int balanceICICI = 10000, balanceHDFC = 10000, balanceBOB = 10000, balanceSBI = 10000;
	int countCreditICICI, countCreditHDFC, countCreditBOB, countCreditSBI;
	int countDebitICICI, countDebitHDFC, countDebitBOB, countDebitSBI;

	void setUserDetails(String firstName) {
		fname = firstName;
	}

	void individualBankOperations(String bank, String bankOperation, int amount) {
		switch (bank) {
		case "ICICI":
			switch (bankOperation) {
			case "Debit":
				if (balanceICICI > amount) {
					balanceICICI -= amount;
					countDebitICICI++;
				}
				break;

			case "Credit":
				if (balanceICICI >= 0) {
					balanceICICI += amount;
					countCreditICICI++;
				}
				break;
			}
			break;

		case "HDFC":
			switch (bankOperation) {
			case "Debit":
				if (balanceHDFC > amount) {
					balanceHDFC -= amount;
					countDebitHDFC++;
				}
				break;

			case "Credit":
				if (balanceHDFC >= 0) {
					balanceHDFC += amount;
					countCreditHDFC++;
				}
				break;
			}
			break;

		case "BOB":
			switch (bankOperation) {
			case "Debit":
				if (balanceBOB > amount) {
					balanceBOB -= amount;
					countDebitBOB++;
				}
				break;

			case "Credit":
				if (balanceBOB >= 0) {
					balanceBOB += amount;
					countCreditBOB++;
				}
				break;
			}
			break;

		case "SBI":
			switch (bankOperation) {
			case "Debit":
				if (balanceSBI > amount) {
					balanceSBI -= amount;
					countDebitSBI++;
				}
				break;

			case "Credit":
				if (balanceSBI >= 0) {
					balanceSBI += amount;
					countCreditSBI++;
				}
				break;
			}
			break;

		default:
			System.out.println("You are not registered with this bank");
		}
	}

	void totalIndividualTransactions() {
		System.out.println(fname + " has debited amount "
				+ (countDebitICICI + countDebitHDFC + countDebitBOB + countDebitSBI) + " times");
		System.out.println(fname + " has credited amount "
				+ (countCreditICICI + countCreditHDFC + countCreditBOB + countCreditSBI) + " times");
	}

	void totalIndividualDebitOperations() {
		System.out.println("Debit transactions by " + fname + ":");
		System.out.println(countDebitICICI + " time/s from ICICI bank");
		System.out.println(countDebitHDFC + " time/s from HDFC bank");
		System.out.println(countDebitBOB + " time/s from BOB bank");
		System.out.println(countDebitSBI + " time/s from ICICI bank");
	}

	void totalIndividualCreditOperations() {
		System.out.println("Credit transactions by " + fname + ":");
		System.out.println(countCreditICICI + " time/s in ICICI bank");
		System.out.println(countCreditHDFC + " time/s in HDFC bank");
		System.out.println(countCreditBOB + " time/s in BOB bank");
		System.out.println(countCreditSBI + " time/s in SBI bank");
	}

	void totalBalance() {
		System.out.println("Total balance in " + fname + "'s account is: "
				+ (balanceICICI + balanceHDFC + balanceBOB + balanceSBI));
	}

	public static void main(String[] args) {
		Bank_Assignment23 bank_Assignment23 = new Bank_Assignment23();

		bank_Assignment23.setUserDetails("Suruchi");
		bank_Assignment23.individualBankOperations("ICICI", "Debit", 300);
		bank_Assignment23.individualBankOperations("ICICI", "Debit", 400);
		bank_Assignment23.individualBankOperations("ICICI", "Credit", 700);
		bank_Assignment23.individualBankOperations("HDFC", "Debit", 300);
		bank_Assignment23.individualBankOperations("HDFC", "Credit", 600);
		bank_Assignment23.individualBankOperations("HDFC", "Debit", 2000);
		bank_Assignment23.individualBankOperations("BOB", "Credit", 9000);
		bank_Assignment23.individualBankOperations("BOB", "Debit", 3000);
		bank_Assignment23.individualBankOperations("BOB", "Credit", 300);
		bank_Assignment23.individualBankOperations("SBI", "Credit", 2000);
		bank_Assignment23.individualBankOperations("SBI", "Debit", 4000);
		bank_Assignment23.individualBankOperations("SBI", "Credit", 3000);
		bank_Assignment23.individualBankOperations("ICICI", "Credit", 3000);

		bank_Assignment23.totalBalance();
		System.out.println();
		bank_Assignment23.totalIndividualTransactions();
		System.out.println();
		bank_Assignment23.totalIndividualDebitOperations();
		System.out.println();
		bank_Assignment23.totalIndividualCreditOperations();
	}
}