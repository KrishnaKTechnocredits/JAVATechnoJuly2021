package somnath;
public class Assignment23 {

	float hdfcBalance = 12000, iciciBalance = 11000, sbiBalance = 10000, bobBalance = 15000;
	int hdfcDebitCount = 0, iciciDebitCount = 0, sbiDebitCount = 0, bobDebitCount = 0;
	int hdfcCreditCount = 0, iciciCreditCount = 0, sbiCreditCount = 0, bobCreditCount = 0;

	void debitOrCredit(String bank, float amount, String operation) {
		switch (bank) {
		case "ICICI":
			switch (operation) {
			case "Debit":
				if (iciciBalance >= amount) {
					iciciBalance -= amount;
					iciciDebitCount++;
				} else
					System.out.println("Insufficient balance to perform debit action");
				break;
			case "Credit":
				iciciBalance += amount;
				iciciCreditCount++;
				break;
			default:
				System.out.println("Please choose a valid option");
			}
			break;
		case "HDFC":
			switch (operation) {
			case "Debit":
				if (hdfcBalance >= amount) {
					hdfcBalance -= amount;
					hdfcDebitCount++;
				} else
					System.out.println("Insufficient balance to perform debit action");
				break;
			case "Credit":
				hdfcBalance += amount;
				hdfcCreditCount++;
				break;
			default:
				System.out.println("Please choose a valid option");
			}
			break;
		case "SBI":
			switch (operation) {
			case "Debit":
				if (sbiBalance >= amount) {
					sbiBalance -= amount;
					sbiDebitCount++;
				} else
					System.out.println("Insufficient balance to perform debit action");
				break;
			case "Credit":
				sbiBalance += amount;
				sbiCreditCount++;
				break;
			default:
				System.out.println("Please choose a valid option");
			}
			break;
		case "BOB":
			switch (operation) {
			case "Debit":
				if (bobBalance >= amount) {
					bobBalance -= amount;
					bobDebitCount++;
				} else
					System.out.println("Insufficient balance to perform debit action");
				break;
			case "Credit":
				bobBalance += amount;
				bobCreditCount++;
				break;
			default:
				System.out.println("Please choose a valid option");
			}
			break;
		default:
			System.out.println("Please select a valid bank:" + bank);

		}
	}

	void showTotalBalance() {
		System.out.print("Total Balance:");
		System.out.println(hdfcBalance + iciciBalance + sbiBalance + bobBalance);
	}

	void showTotalTranscationCount() {
		System.out.print("Total Debit Count:");
		System.out.println(hdfcDebitCount + iciciDebitCount + sbiDebitCount + bobDebitCount);
		System.out.print("Total Credit Count:");
		System.out.println(hdfcCreditCount + iciciCreditCount + sbiCreditCount + bobCreditCount);
	}

	void showBankWiseCreditCount() {
		System.out.println("ICICI bank Credit Operation: " + iciciCreditCount);
		System.out.println("HDFC bank Credit Operation: " + hdfcCreditCount);
		System.out.println("SBI bank Credit Operation: " + sbiCreditCount);
		System.out.println("BOB bank Credit Operation: " + bobCreditCount);
	}

	void showBankWiseDebitCount() {
		System.out.println("ICICI bank Debit Operation: " + iciciDebitCount);
		System.out.println("HDFC bank Debit Operation: " + hdfcDebitCount);
		System.out.println("SBI bank Debit Operation: " + sbiDebitCount);
		System.out.println("BOB bank Debit Operation: " + bobDebitCount);
	}

	public static void main(String[] args) {
		Assignment23 assignment23 = new Assignment23();
		assignment23.debitOrCredit("HDFC", 2000f, "Credit");
		assignment23.debitOrCredit("HDFC", 3000f, "Debit");
		assignment23.debitOrCredit("BOB", 2500f, "Debit");
		assignment23.debitOrCredit("HDFC", 3600f, "Credit");
		assignment23.debitOrCredit("BOB", 1200f, "Debit");
		assignment23.debitOrCredit("HDFC", 2400f, "Credit");
		assignment23.debitOrCredit("BOB", 3600f, "Credit");
		assignment23.debitOrCredit("SBI", 600f, "Credit");
		assignment23.debitOrCredit("ICICI", 4500f, "Credit");
		assignment23.debitOrCredit("ICICI", 3200f, "Credit");
		assignment23.debitOrCredit("SBI", 1200f, "Debit");
		assignment23.debitOrCredit("ICICI",1100f, "Debit");
		System.out.println("-------------------------------");
		assignment23.showTotalBalance();
		System.out.println("-------------------------------");
		assignment23.showTotalTranscationCount();
		System.out.println("-------------------------------");
		assignment23.showBankWiseCreditCount();
		System.out.println("-------------------------------");
		assignment23.showBankWiseDebitCount();
		System.out.println("-------------------------------");
	}
} 
 