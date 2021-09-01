package dattaraj;

public class Assignment_23 {
	static int totalCreditCount, totalDebitCount;
	static double totalBalance;
	static int iciciCreditCount, hdfcCreditCount, bobCreditCount, sbiCreditCount;
	static int iciciDebitCount, hdfcDebitCount, bobDebitCount, sbiDebitCount;
	Double totalICICIBal=50000.00, totalHDFCBal=25000.00, totalBOBBal=35000.70, totalSBIBal=500000.35;
	String operation, bankName;

	void getTotalBalance() {
		totalBalance = totalICICIBal + totalHDFCBal + totalBOBBal + totalSBIBal;
		System.out.println("Total balance of all accounts= " + totalBalance);
	}

	void getTotalCreditDebitCount() {
		System.out.println("Total credit operation- " + totalCreditCount + " times");
		System.out.println("Total debit operation- " + totalDebitCount + " times");
	}

	void getIndividualBankCreditCount() {
		System.out.println("ICICI bank credit operation- " + iciciCreditCount + " times");
		System.out.println("HDFC bank credit operation- " + hdfcCreditCount + " times");
		System.out.println("BOB bank credit operation- " + bobCreditCount + " times");
		System.out.println("SBI bank credit operation- " + sbiCreditCount + " times");
	}

	void getIndividualBankDebitCount() {
		System.out.println("ICICI bank debit operation- " + iciciDebitCount + " times");
		System.out.println("HDFC bank debit operation- " + hdfcDebitCount + " times");
		System.out.println("BOB bank debit operation- " + bobDebitCount + " times");
		System.out.println("SBI bank debit operation- " + sbiDebitCount + " times");
	}

	void callOperation(String operation, String bankName, double amount) {
		String operations = operation;
		String bAccountName = bankName;
		double amt = amount;
		switch(operations) {
		case "Credit":
			switch(bAccountName) {
			case "ICICI":
				totalICICIBal += amt;
				iciciCreditCount ++;
				totalCreditCount ++;
				break;
			case "HDFC":
				totalHDFCBal += amt;
				hdfcCreditCount ++;
				totalCreditCount ++;
				break;
			case "BOB":
				totalBOBBal += amt;
				bobCreditCount ++;
				totalCreditCount ++;
				break;
			case "SBI":
				totalSBIBal += amt;
				sbiCreditCount ++;
				totalCreditCount ++;
				break;
			default:
				System.out.println("Invalid");
			}
			break;
		case "Debit":
			switch(bAccountName) {
			case "ICICI":
				totalICICIBal -= amt;
				iciciDebitCount ++;
				totalDebitCount ++;
				break;
			case "HDFC":
				totalHDFCBal -= amt;
				hdfcDebitCount ++;
				totalDebitCount ++;
				break;
			case "BOB":
				totalBOBBal -= amt;
				bobDebitCount ++;
				totalDebitCount ++;
				break;
			case "SBI":
				totalSBIBal -= amt;
				sbiDebitCount ++;
				totalDebitCount ++;
				break;
			default:
				System.out.println("Invalid");
			}	
		break;
		default:
			System.out.println("Invalid details");
		}
	}

	public static void main(String[] args) {
		Assignment_23 assignment_23 = new Assignment_23();
		assignment_23.callOperation("Credit", "ICICI", 4000.50);
		assignment_23.callOperation("Debit", "ICICI", 1000);

		assignment_23.callOperation("Credit", "HDFC", 2000);
		assignment_23.callOperation("Credit", "HDFC", 4000);
		assignment_23.callOperation("Debit", "HDFC", 5000.50);
		
		assignment_23.callOperation("Credit", "BOB", 2000.20);
		assignment_23.callOperation("Debit", "BOB", 5500.30);
		assignment_23.callOperation("Debit", "BOB", 1000);
		
		assignment_23.callOperation("Credit", "SBI", 2000);
		assignment_23.callOperation("Credit", "SBI", 1200.40);
		assignment_23.callOperation("Debit", "SBI", 1500);
		assignment_23.callOperation("Debit", "SBI", 1000);
		
		assignment_23.getTotalBalance();
		assignment_23.getTotalCreditDebitCount();
		assignment_23.getIndividualBankCreditCount();
		assignment_23.getIndividualBankDebitCount();
	}
	

}
