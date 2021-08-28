/*Assignment - 23 : 27th Aug'2021

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
		 SBI bank Debit Operation - 2*/

package amol_Vyas;

public class Assignment_23 {

	int balICICI = 10000, balBOB = 10000, balHDFC = 10000, balSBI = 10000;
	int countCreditICICI, countCreditBOB, countCreditHDFC, countCreditSBI;
	int countDebitICICI, countDebitBOB, countDebitHDFC, countDebitSBI;

	void selectBankAndTransaction(String bank, String transaction, int amount) {

		switch (bank) {
		case "HDFC":
			switch (transaction) {
			case "Debit":
				balHDFC -= amount;
				countDebitHDFC++;
				break;
			case "Credit":
				balHDFC += amount;
				countCreditHDFC++;
				break;
			}
			break;

		case "SBI":
			switch (transaction) {
			case "Debit":
				balSBI -= amount;
				countDebitSBI++;
				break;
			case "Credit":
				balHDFC += amount;
				countCreditSBI++;
				break;
			}
			break;

		case "ICICI":
			switch (transaction) {
			case "Debit":
				balICICI -= amount;
				countDebitICICI++;
				break;
			case "Credit":
				balHDFC += amount;
				countCreditICICI++;
				break;
			}
			break;

		case "BOB":
			switch (transaction) {
			case "Debit":
				balBOB -= amount;
				countDebitBOB++;
				break;
			case "Credit":
				balBOB += amount;
				countCreditBOB++;
				break;
			}
		}
	}

	void totalBalance() {
		System.out.println("Total balance in my all account is " + (balICICI + balBOB + balHDFC + balSBI));
	}

	void totalTransaction() {
		System.out.println("Total transaction in my all account is " + (countCreditICICI + countCreditBOB
				+ countCreditHDFC + countCreditSBI + countDebitICICI + countDebitBOB + countDebitHDFC + countDebitSBI));
	}

	void totalIndDebitTransaction() {
		System.out.println("Total Debit transaction of HDFC bank is " + countDebitHDFC);
		System.out.println("Total Debit transaction of ICICI bank is " + countDebitICICI);
		System.out.println("Total Debit transaction of BOB bank is " + countDebitBOB);
		System.out.println("Total Debit transaction of SBI bank is " + countDebitSBI);
	}

	void totalIndCreditTransaction() {
		System.out.println("Total Credit transaction of HDFC bank is " + countCreditHDFC);
		System.out.println("Total Credit transaction of ICICI bank is " + countCreditICICI);
		System.out.println("Total Credit transaction of BOB bank is " + countCreditBOB);
		System.out.println("Total Credit transaction of SBI bank is " + countCreditSBI);
	}

	public static void main(String[] args) {
		Assignment_23 assignment_23 = new Assignment_23();
		assignment_23.selectBankAndTransaction("HDFC", "Credit", 200);
		assignment_23.selectBankAndTransaction("HDFC", "Credit", 2100);
		assignment_23.selectBankAndTransaction("SBI", "Credit", 2200);
		assignment_23.selectBankAndTransaction("BOB", "Credit", 300);
		assignment_23.selectBankAndTransaction("SBI", "Credit", 500);
		assignment_23.selectBankAndTransaction("ICICI", "Credit", 5100);
		assignment_23.selectBankAndTransaction("BOB", "Debit", 2200);
		assignment_23.selectBankAndTransaction("ICICI", "Debit", 400);
		assignment_23.selectBankAndTransaction("HDFC", "Debit", 2000);
		assignment_23.selectBankAndTransaction("SBI", "Debit", 2020);
		assignment_23.selectBankAndTransaction("HDFC", "Debit", 2100);
		assignment_23.selectBankAndTransaction("SBI", "Debit", 2040);
		assignment_23.selectBankAndTransaction("ICICI", "Debit", 2100);
		assignment_23.selectBankAndTransaction("BOB", "Debit", 200);
		assignment_23.totalBalance();
		assignment_23.totalTransaction();
		assignment_23.totalIndCreditTransaction();
		assignment_23.totalIndDebitTransaction();
	}

}
