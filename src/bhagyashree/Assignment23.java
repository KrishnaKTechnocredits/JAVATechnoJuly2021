/*A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
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
		 SBI bank Debit Operation - 2*/
package bhagyashree;

public class Assignment23 {

	int iciciBal = 0;
	int hdfcBal = 0;
	int bobBal = 0;
	int sbiBal = 0;

	int iciciCredit = 0;
	int hdfcCredit = 0;
	int bobCredit = 0;
	int sbiCredit = 0;

	int iciciDebit = 0;
	int hdfcDebit = 0;
	int bobDebit = 0;
	int sbiDebit = 0;

	int totalBal = 0;

	void bankDetails(String bank, int amount, String operation) {
		switch (bank) {
		case "ICICI":
			switch (operation) {
			case "Credit":
				iciciBal = iciciBal + amount;
				iciciCredit++;

			case "Debit":
				iciciBal = iciciBal - amount;
				iciciDebit++;
			}
			break;

		case "HDFC":
			switch (operation) {
			case "Credit":
				hdfcBal = hdfcBal + amount;
				hdfcCredit++;

			case "Debit":
				hdfcBal = hdfcBal - amount;
				hdfcDebit++;
			}
			break;

		case "BOB":
			switch (operation) {
			case "Credit":
				bobBal = bobBal + amount;
				bobCredit++;

			case "Debit":
				bobBal = bobBal - amount;
				bobDebit++;
			}
			break;
		case "SBI":
			switch (operation) {
			case "Credit":
				sbiBal = sbiBal + amount;
				sbiCredit++;

			case "Debit":
				sbiBal = sbiBal - amount;
				sbiDebit++;
			}
			break;
		}
	}

	void getTotalBalOfAllAccounts() {
		totalBal = iciciBal + hdfcBal + bobBal + sbiBal;
		System.out.println(totalBal);
	}

	void getCountOfAllTransactions() {
		int totaltransaction = iciciCredit + iciciDebit + hdfcDebit + hdfcCredit + bobCredit + bobDebit + sbiDebit
				+ sbiCredit;
		System.out.println(totaltransaction);
	}

	void getTransactionCountforBank() {
		System.out.println("Total ICICI Debit Transactions are: " + iciciDebit);
		System.out.println("Total ICICI Credit Transactions are: " + iciciCredit);

		System.out.println("Total HDFC Debit Transactions are: " + hdfcDebit);
		System.out.println("Total HDFC Credit Transactions are: " + hdfcCredit);

		System.out.println("Total BOB Debit Transactions are: " + bobDebit);
		System.out.println("Total BOB Credit Transactions are: " + bobCredit);

		System.out.println("Total SBI Debit Transactions are: " + sbiDebit);
		System.out.println("Total SBI Credit Transactions are: " + sbiCredit);
	}

	public static void main(String[] args) {
		Assignment23 assignment23 = new Assignment23();
		assignment23.bankDetails("ICICI", 10000, "Credit");
		assignment23.bankDetails("ICICI", 500, "Credit");
		assignment23.bankDetails("ICICI", 500, "Debit");
		assignment23.bankDetails("ICICI", 500, "Debit");

		assignment23.bankDetails("HDFC", 10000, "Credit");
		assignment23.bankDetails("HDFC", 10000, "Credit");
		assignment23.bankDetails("HDFC", 500, "Debit");
		assignment23.bankDetails("HDFC", 1000, "Debit");

		assignment23.bankDetails("BOB", 10000, "Credit");
		assignment23.bankDetails("BOB", 5000, "Credit");
		assignment23.bankDetails("BOB", 5000, "Debit");
		assignment23.bankDetails("BOB", 1000, "Debit");

		assignment23.bankDetails("SBI", 10000, "Credit");
		assignment23.bankDetails("SBI", 5000, "Credit");
		assignment23.bankDetails("SBI", 1000, "Debit");
		assignment23.bankDetails("SBI", 1000, "Debit");

		assignment23.getTotalBalOfAllAccounts();
		assignment23.getCountOfAllTransactions();
		assignment23.getTransactionCountforBank();
	}

}
