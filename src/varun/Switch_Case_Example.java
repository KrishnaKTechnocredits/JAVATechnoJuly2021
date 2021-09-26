package varun;

public class Switch_Case_Example {
	int balICICI = 1000, balBOB = 20000, balHDFC = 30000, balSBI = 40000;
	int ICrdCount, HCrdCount, BCrdCount, SCrdCount;
	int IDebCount, HDebCount, BDebCount, SDebCount;

	void bankDetailsAndTransactionType(String bank, String transaction, int amount) {
		switch (bank) {
		case "HDFC":
			switch (transaction) {
			case "Debit":
				balHDFC -= amount;
				HDebCount++;
				break;
			case "Credit":
				balHDFC += amount;
				HCrdCount++;
				break;
			}
			break;

		case "ICICI":
			switch (transaction) {
			case "Debit":
				balICICI -= amount;
				IDebCount++;
				break;
			case "Credit":
				balICICI += amount;
				ICrdCount++;
				break;
			}
			break;

		case "SBI":
			switch (transaction) {
			case "Debit":
				balSBI -= amount;
				SCrdCount++;
				break;
			case "Credit":
				balSBI += amount;
				SDebCount++;
				break;
			}
			break;

		case "BOI":
			switch (transaction) {
			case "Debit":
				balBOB -= amount;
				BCrdCount++;
				break;
			case "Credit":
				balBOB += amount;
				BDebCount++;
				break;
			}
			break;
		}
	}

	void totalBalance() {
		System.out.println("Total balance from the all four accounts are " + (balBOB + balSBI + balHDFC + balICICI));
	}
	
	void totalTransactionDetails() {
		System.out.println("Total transactions from all four accounts are " + (BCrdCount + HCrdCount + ICrdCount + SCrdCount+IDebCount+HDebCount+SDebCount+BDebCount));
	}
	
	void indiVidualCreditTransactionDetails() {
		System.out.println("Total credit transaction count of ICICI is "+ICrdCount);
		System.out.println("Total credit  transaction count of BOI is "+BCrdCount);
		System.out.println("Total credit  transaction count of HDFC is "+HCrdCount);
		System.out.println("Total credit  transaction count of SBI is "+SCrdCount);
	}
	
	void indiVidualDebitTransactionDetails() {
		System.out.println("Total debit transaction count of ICICI is "+IDebCount);
		System.out.println("Total debit transaction count of BOI is "+BDebCount);
		System.out.println("Total debit transaction count of HDFC is "+HDebCount);
		System.out.println("Total debit transaction count of SBI is "+SDebCount);
	}
	
	public static void main(String[] args) {
		Switch_Case_Example assignment_23 = new Switch_Case_Example();
		assignment_23.bankDetailsAndTransactionType("HDFC", "Credit", 50000);
		assignment_23.bankDetailsAndTransactionType("HDFC", "Debit", 5000);
		assignment_23.totalBalance();
		assignment_23.bankDetailsAndTransactionType("SBI", "Credit", 50000);
		assignment_23.bankDetailsAndTransactionType("ICICI", "Debit", 5000);
		assignment_23.bankDetailsAndTransactionType("BOI", "Credit", 50000);
		assignment_23.bankDetailsAndTransactionType("SBI", "Debit", 5000);
		assignment_23.bankDetailsAndTransactionType("SBI", "Debit", 5000);
		assignment_23.bankDetailsAndTransactionType("ICICI", "Credit", 5000);
		assignment_23.bankDetailsAndTransactionType("ICICI", "Debit", 5000);
		assignment_23.bankDetailsAndTransactionType("BOI", "Debit", 5000);
		assignment_23.totalBalance();
		assignment_23.totalTransactionDetails();
		assignment_23.indiVidualCreditTransactionDetails();
		assignment_23.indiVidualDebitTransactionDetails();
	}
}
