
/*
Assignment - 23 : 27th Aug'2021
A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
         a) Person can debit or credit amount from respective bank.
             Hint : Switch case is expected here. [Please watch today's recording again, in case of confusion.]
         b) A Method to show total balance [ICICI balance + HDFC balance + BOB balance + SBI Balance]
         c) A Method to show total credit, debit operations 
                output : Total credit operation - 7 times
                             Total debit operation - 5 times
        d) A Method to show individual bank credit operations.
               output : ICICI bank Credit Operation - 2
                        HDFC bank Credit Operation - 2
		                 SBI bank Credit Operation - 1
                        BOB bank Credit Operation - 4
                        SBI bank Credit Operation - 4
        e) A Method to show individual bank debit operations.
               output : ICICI bank Debit Operation - 2
                        HDFC bank Debit Operation - 2
BOB bank Debit Operation - 2
		 SBI bank Debit Operation - 2
*/


package tanmoy_Roy.Assignment23;

public class Program1 {

	private double hdfcBalance = 5700, iciciBalance = 57820, sbiBalance = 13589, bobBalance = 1400;
	private int hdfcDebitCount = 0, iciciDebitCount = 0, sbiDebitCount = 0, bobDebitCount = 0,
	 hdfcCreditCount = 0, iciciCreditCount = 0, sbiCreditCount = 0, bobCreditCount = 0;

	 void transaction(String bank, double amount, String operation) {
		switch (bank) {
		case "ICICI":
			switch (operation) {
			case "Debit":
				if (iciciBalance >= amount) {
					iciciBalance -= amount;
					iciciDebitCount++;
				} else
					System.out.println("Not enought balance to perform debit action");
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
					System.out.println("Not enought balance to perform debit action");
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
					System.out.println("Not enought balance to perform debit action");
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
					System.out.println("Not enought balance to perform debit action");
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

	void getTotalBalance() {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.print("Total Balance:");
		System.out.println(hdfcBalance + iciciBalance + sbiBalance + bobBalance);
		System.out.println("-----------------------------------------------------------------------------");
	}

	void getTotalTranscationCount() {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.print("Total Debit Count:");
		System.out.println(hdfcDebitCount + iciciDebitCount + sbiDebitCount + bobDebitCount);
		System.out.print("Total Credit Count:");
		System.out.println(hdfcCreditCount + iciciCreditCount + sbiCreditCount + bobCreditCount);
		System.out.println("-----------------------------------------------------------------------------");
	}

	void getTransactionCreditCount() {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("ICICI bank Credit Operation: " + iciciCreditCount);
		System.out.println("HDFC bank Credit Operation: " + hdfcCreditCount);
		System.out.println("SBI bank Credit Operation: " + sbiCreditCount);
		System.out.println("BOB bank Credit Operation: " + bobCreditCount);
		System.out.println("-----------------------------------------------------------------------------");
	}

	void getTransactionDebitCount() {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("ICICI bank Debit Operation: " + iciciDebitCount);
		System.out.println("HDFC bank Debit Operation: " + hdfcDebitCount);
		System.out.println("SBI bank Debit Operation: " + sbiDebitCount);
		System.out.println("BOB bank Debit Operation: " + bobDebitCount);
		System.out.println("-----------------------------------------------------------------------------");
	}

	public static void main(String[] args) {
		Program1 prg = new Program1();
		prg.transaction("HDFC", 1000, "Credit");
		prg.transaction("HDFC", 500, "Debit");
		prg.transaction("BOB", 100, "Debit");
		prg.transaction("HDFC", 500, "Credit");
		prg.transaction("BOB", 100, "Debit");
		prg.transaction("HDFC", 1000, "Credit");
		prg.transaction("SBI", 500, "Debit");
		prg.transaction("SBI", 1000, "Credit");
		prg.transaction("ICICI", 1000, "Debit");
		prg.transaction("ICICI", 500, "Credit");
		prg.transaction("SBI", 1000, "Debit");
		prg.getTotalTranscationCount();
		prg.getTransactionCreditCount();
		prg.getTransactionDebitCount();
		prg.getTotalBalance();
	}
}