package madhavi;

public class Assignment_23 {
	int totalBalance;
	int intialICICIBalance, intialHDFCBalance, intialBOBBalance, intialSBIBalance;
	static String username;
	static int totalCreditCount;
	static int totalDebtCount;

	// Method to set username and bank balance
	void setUserDetails(String uname, int ICICIBalance, int HDFCBalance, int BOBBalance, int SBIBalance) {
		username = uname;
		intialICICIBalance = ICICIBalance;
		intialHDFCBalance = HDFCBalance;
		intialBOBBalance = BOBBalance;
		intialSBIBalance = SBIBalance;
	}
	
	// Method to show total balance
	int printTotalBalance() {
		totalBalance = intialICICIBalance + intialHDFCBalance + intialBOBBalance + intialSBIBalance;
		return totalBalance;
	}
	
	// Method to show individual bank Credit operation
	void individualbankCredOp(String bankName, int creditCount) {
		String bank = bankName;
		switch (bank) {
		case "ICICI":
			System.out.println("ICICI bank Credit Operation - " + creditCount);
			break;

		case "HDFC":
			System.out.println("HDFC bank Credit Operation - " + creditCount);
			break;

		case "BOB":
			System.out.println("BOB bank Credit Operation - " + creditCount);
			break;

		case "SBI":
			System.out.println("SBI bank Credit Operation - " + creditCount);
			break;

		default:
		}
		totalCreditCount = totalCreditCount + creditCount;
	}

	// Method to show individual bank Debit operation
	void individualbankDebitOp(String bankName, int debtCount) {
		String bank = bankName;
		switch (bank) {
		case "ICICI":
			System.out.println("ICICI bank Debit Operation - " + debtCount);
			break;

		case "HDFC":
			System.out.println("HDFC bank Debit Operation - " + debtCount);
			break;

		case "BOB":
			System.out.println("BOB bank Debit Operation - " + debtCount);
			break;

		case "SBI":
			System.out.println("SBI bank Debit Operation - " + debtCount);
			break;

		default:
		}
		totalDebtCount = totalDebtCount + debtCount;
	}

	// Method to show total bank credit/debit operations.
	void totalBankCredDebitOp() {
		System.out.println("Total Credit operation - " + totalCreditCount + " times");
		System.out.println("Total Debit operation - " + totalDebtCount + " times");

	}

	public static void main(String[] args) {
		Assignment_23 assignment_23 = new Assignment_23();
		assignment_23.setUserDetails("Joe", 5000, 6000, 7000, 8000);
		System.out.println(username + " all transaction summary ->");
		System.out.println("Show Total balance -:");
		System.out.println(assignment_23.printTotalBalance());
		System.out.println("----------------------------------------");

		System.out.println("Show individual bank credit operations -:");
		assignment_23.individualbankCredOp("ICICI", 2);
		assignment_23.individualbankCredOp("HDFC", 2);
		assignment_23.individualbankCredOp("SBI", 1);
		assignment_23.individualbankCredOp("BOB", 4);
		assignment_23.individualbankCredOp("SBI", 4);
		System.out.println("----------------------------------------");
		System.out.println("Show individual bank debit operations -:");
		assignment_23.individualbankDebitOp("ICICI", 2);
		assignment_23.individualbankDebitOp("HDFC", 2);
		assignment_23.individualbankDebitOp("BOB", 2);
		assignment_23.individualbankDebitOp("SBI", 2);
		System.out.println("----------------------------------------");
		assignment_23.totalBankCredDebitOp();

	}
}
