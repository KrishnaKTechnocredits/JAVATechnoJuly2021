package ramkrishna;

public class SwitchCase {
   
		 int totalCreditCount, totalDebitCount;
	     int totalBalance;
		 int iciciCreditCount, hdfcCreditCount, bobCreditCount, sbiCreditCount;
		int iciciDebitCount, hdfcDebitCount, bobDebitCount, sbiDebitCount;
		int totalICICIBal = 10000, totalHDFCBal = 15000, totalBOBBal = 5000, totalSBIBal = 50000;
		String operation, bankName;

		void getTotalBalance() {
			totalBalance = totalICICIBal + totalHDFCBal + totalBOBBal + totalSBIBal;
			System.out.println("Total balance of all the accounts is = " + totalBalance);
		}

		void getTotalCreditDebitCount() {
			System.out.println("Total credit operation happened - " + totalCreditCount + " times");
			System.out.println("Total debit operation happened - " + totalDebitCount + " times");
		}

		void getIndividualBankCreditCount() {
			System.out.println("ICICI bank credit operation happened - " + iciciCreditCount + " times");
			System.out.println("HDFC bank credit operation happened - " + hdfcCreditCount + " times");
			System.out.println("BOB bank credit operation happened - " + bobCreditCount + " times");
			System.out.println("SBI bank credit operation happened - " + sbiCreditCount + " times");
		}

		void getIndividualBankDebitCount() {
			System.out.println("ICICI bank debit operation happened - " + iciciDebitCount + " times");
			System.out.println("HDFC bank debit operation happened - " + hdfcDebitCount + " times");
			System.out.println("BOB bank debit operation happened - " + bobDebitCount + " times");
			System.out.println("SBI bank debit operation happened - " + sbiDebitCount + " times");
		}

		void operation(String operation, String bankName, int amount) {
			String operations = operation;
			String bAccountName = bankName;
			int amt = amount;
			switch (operations) {
			case "Credit":
				switch (bAccountName) {
				case "ICICI":
					totalICICIBal = totalICICIBal + amt;
					iciciCreditCount++;
					totalCreditCount++;
					break;
				case "HDFC":
					totalHDFCBal = totalHDFCBal + amt;
					hdfcCreditCount++;
					totalCreditCount++;
					break;
				case "BOB":
					totalBOBBal = totalBOBBal + amt;
					bobCreditCount++;
					totalCreditCount++;
					break;
				case "SBI":
					totalSBIBal = totalSBIBal + amt;
					sbiCreditCount++;
					totalCreditCount++;
					break;
				default:
					System.out.println("Invalid");
				}
				break;
			case "Debit":
				switch (bAccountName) {
				case "ICICI":
					totalICICIBal = totalICICIBal - amt;
					iciciDebitCount++;
					totalDebitCount++;
					break;
				case "HDFC":
					totalHDFCBal = totalHDFCBal - amt;
					hdfcDebitCount++;
					totalDebitCount++;
					break;
				case "BOB":
					totalBOBBal = totalBOBBal - amt;
					bobDebitCount++;
					totalDebitCount++;
					break;
				case "SBI":
					totalSBIBal = totalSBIBal - amt;
					sbiDebitCount++;
					totalDebitCount++;
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
			SwitchCase switchcase = new SwitchCase();
			switchcase.operation("Credit", "ICICI", 4000);
			switchcase.operation("Credit", "ICICI", 1000);
			switchcase.operation("Debit", "ICICI", 3000);
			switchcase.operation("Debit", "ICICI", 2000);
			switchcase.operation("Credit", "HDFC", 2000);
			switchcase.operation("Credit", "HDFC", 4000);
			switchcase.operation("Debit", "HDFC", 1000);
			switchcase.operation("Debit", "HDFC", 5000);
			switchcase.operation("Credit", "BOB", 500);
			switchcase.operation("Credit", "BOB", 5000);
			switchcase.operation("Credit", "BOB", 1000);
			switchcase.operation("Credit", "BOB", 2000);
			switchcase.operation("Debit", "BOB", 5500);
			switchcase.operation("Debit", "BOB", 1000);
			switchcase.operation("Credit", "SBI", 5000);
			switchcase.operation("Credit", "SBI", 500);
			switchcase.operation("Credit", "SBI", 1000);
			switchcase.operation("Credit", "SBI", 2000);
			switchcase.operation("Credit", "SBI", 900);
			switchcase.operation("Debit", "SBI", 1500);
			switchcase.operation("Debit", "SBI", 1000);
		 switchcase.getTotalBalance();
		 switchcase.getTotalCreditDebitCount();
		 switchcase.getIndividualBankCreditCount();
		 switchcase.getIndividualBankDebitCount();
		}
	}

