package indrani;

public class Assignment_23_switchcase {

	double balICICI = 10000, balHDFC = 12000, balBOB = 8000, balSBI = 5000,finalBal;
	int debCountICICI,credCountICICI,debCountHDFC,credCountHDFC,debCountBOB,credCountBOB,debCountSBI,credCountSBI;
	int totalCredCount, totalDebCount;

	void transactions(String bank, String oprtn, double amount) {
		switch (bank) {
		case "ICICI" :
			switch (oprtn) {
			case "credit":
				balICICI = balICICI + amount;
				credCountICICI++;
				totalCredCount++;
				break;
			case "debit":
				balICICI = balICICI - amount;
				debCountICICI++;
				totalDebCount++;
				break;
			default:
				System.out.println("no valid operation performed");
				break;
			}
			break;
		case "HDFC" :
			switch (oprtn) {
			case "credit":
				balHDFC = balHDFC + amount;
				credCountHDFC++;
				totalCredCount++;
				break;
			case "debit":
				balHDFC = balHDFC - amount;
				debCountHDFC++;
				totalDebCount++;
				break;
			default:
				System.out.println("no valid operation performed");
				break;
			}
			break;
		case "BOB" :
			switch (oprtn) {
			case "credit":
				balBOB = balBOB + amount;
				credCountBOB++;
				totalCredCount++;
				break;
			case "debit":
				balBOB = balBOB - amount;
				debCountBOB++;
				totalDebCount++;
				break;
			default:
				System.out.println("no valid operation performed");
				break;
			}
			break;

		case "SBI" :
			switch (oprtn) {
			case "credit":
				balSBI = balSBI + amount;
				credCountSBI++;
				totalCredCount++;
				break;
			case "debit":
				balSBI = balSBI - amount;
				debCountSBI++;
				totalDebCount++;
				break;
			default:
				System.out.println("no valid operation performed");
				break;
			}
			break;

		}
	}

		void totalCredDebitTrans() {
		System.out.println("Credit transactions done : " + totalCredCount);
		System.out.println("Debit transactions done : " + totalDebCount);
	}

	void printBankwiseCredits() {
			System.out.println("No. of credit operations in ICICI bank : " + credCountICICI);
			System.out.println("No. of credit operations in HDFC bank : " + credCountHDFC);
			System.out.println("No. of credit operations in BOB bank : " + credCountBOB);
			System.out.println("No. of credit operations in SBI bank : " + credCountSBI);
	}

	void printBankwiseDebits() {
		System.out.println("No. of debit operations in ICICI bank : " + debCountICICI);
		System.out.println("No. of debit operations in HDFC bank : " + debCountHDFC);
		System.out.println("No. of debit operations in BOB bank : " + debCountBOB);
		System.out.println("No. of debit operations in SBI bank : " + debCountSBI);
	}
	void printTotalBalance() {
		System.out.println(" Final balance summing up amounts from all the banks : " + (balICICI + balHDFC + balBOB + balSBI));
	}
	void printBankwiseBalance() {
		System.out.println("Balance remaining in ICICI account : " + balICICI);
		System.out.println("Balance remaining in HDFC account: " + balHDFC);
		System.out.println("Balance remaining in BOB account : " + balBOB);
		System.out.println("Balance remaining in SBI account : " + balSBI);
	}


	public static void main(String[] args) {
		Assignment_23_switchcase bankswitch = new Assignment_23_switchcase();
		
		bankswitch.transactions("HDFC", "credit", 500);
		bankswitch.transactions("HDFC", "credit", 2000);
		bankswitch.transactions("BOB", "debit", 900);
		bankswitch.transactions("SBI", "debit", 1700);
		bankswitch.transactions("HDFC", "credit", 10000);
		bankswitch.transactions("ICICI", "credit", 3000);
		bankswitch.transactions("SBI", "debit", 1900);
		bankswitch.transactions("SBI", "credit", 2100);
		bankswitch.transactions("BOB", "credit", 2300);
        bankswitch.printBankwiseCredits();
		bankswitch.printBankwiseDebits();
		bankswitch.printTotalBalance();
		bankswitch.totalCredDebitTrans();
		bankswitch.printBankwiseBalance();
	}
}
