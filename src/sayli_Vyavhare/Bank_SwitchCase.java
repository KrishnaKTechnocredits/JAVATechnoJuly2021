/*Assignment - 23 : 

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
package sayli_Vyavhare;
public class Bank_SwitchCase {

	int balanceICICI = 1000, balanceBOB = 1000, balanceHDFC = 1000, balanceSBI = 1000, debitCountICICI,
			creditCountICICI, debitCountBOB, creditCountBOB, debitCountHDFC, creditCountHDFC, debitCountSBI,
			creditCountSBI;

	void bankAndTransactions(String bank, String transaction, int amount) {
		switch (bank) {
		case "HDFC":
			switch (transaction) {

			case "Debit":
				balanceHDFC = balanceHDFC - amount;
				debitCountHDFC++;
				break;
			case "Credit":
				balanceHDFC = balanceHDFC + amount;
				creditCountHDFC++;
				break;
			}
			break;

		case "ICICI":
			switch (transaction) {

			case "Debit":
				balanceICICI = balanceICICI - amount;
				debitCountICICI++;
				break;
			case "Credit":
				balanceICICI = balanceICICI + amount;
				creditCountICICI++;
				break;
			}
			break;

		case "BOB":
			switch (transaction) {

			case "Debit":
				balanceBOB = balanceBOB - amount;
				debitCountBOB++;
				break;
			case "Credit":
				balanceBOB = balanceBOB + amount;
				creditCountBOB++;
				break;
			}
			break;

		case "SBI":
			switch (transaction) {

			case "Debit":
				balanceSBI = balanceSBI - amount;
				debitCountSBI++;
				break;
			case "Credit":
				balanceSBI = balanceSBI + amount;
				creditCountSBI++;
				break;
			}

		}

	}

	void individualBankCredit() {
		System.out.println("ICICI Bank credit operation count :" + creditCountICICI);
		System.out.println("BOB Bank credit operation count :" + creditCountBOB);
		System.out.println("HDFC Bank credit operation count :" + creditCountHDFC);
		System.out.println("SBI Bank credit operation count :" + creditCountSBI);
		System.out.println("------------------------------------------------------");

	}

	void individualBankDebit() {
		System.out.println("ICICI Bank debit operation count :" + debitCountICICI);
		System.out.println("BOB Bank debit operation count :" + debitCountBOB);
		System.out.println("HDFC Bank debit operation count :" + debitCountHDFC);
		System.out.println("SBI Bank debit operation count :" + debitCountSBI);
		System.out.println("------------------------------------------------------");

	}

	void totalCreditAndDebitOperation() {
		System.out.println("Total credit operations are:"
				+ (creditCountICICI + creditCountBOB + creditCountHDFC + creditCountSBI));
		System.out.println(
				"Total debit operations are:" + (debitCountICICI + debitCountBOB + debitCountHDFC + debitCountSBI));
		System.out.println("------------------------------------------------------");

	}

	void printTotalBalance() {
		System.out.println("Total balance is " + (balanceICICI + balanceBOB + balanceHDFC + balanceSBI));
		System.out.println("------------------------------------------------------");

	}

	public static void main(String[] args) {
		Bank_SwitchCase bank = new Bank_SwitchCase();
		bank.bankAndTransactions("HDFC", "Debit", 500);
		bank.bankAndTransactions("BOB", "Credit", 1500);
		bank.bankAndTransactions("SBI", "Debit", 500);
		bank.bankAndTransactions("BOB", "Credit", 200);
		bank.bankAndTransactions("ICICI", "Credit", 3000);
		bank.bankAndTransactions("SBI", "Credit", 2000);
		bank.bankAndTransactions("HDFC", "Credit", 500);
		bank.bankAndTransactions("BOB", "Debit", 500);
		bank.bankAndTransactions("SBI", "Debit", 500);
		bank.bankAndTransactions("HDFC", "Debit", 500);
		bank.bankAndTransactions("BOB", "Credit", 2500);
		bank.bankAndTransactions("SBI", "Debit", 500);
		bank.bankAndTransactions("BOB", "Credit", 200);
		bank.bankAndTransactions("ICICI", "Debit", 300);
		bank.bankAndTransactions("SBI", "Credit", 2000);
		bank.bankAndTransactions("HDFC", "Debit", 1500);
		bank.bankAndTransactions("BOB", "Debit", 500);
		bank.bankAndTransactions("SBI", "Debit", 500);
		bank.individualBankDebit();
		bank.individualBankCredit();
		bank.printTotalBalance();
		bank.totalCreditAndDebitOperation();
	}
}
