package shweta_Dharmadhikari.switchcase_assignment_23;

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
public class BankSwitchCaseExample {
	int balance;
	int iciciBalance, hdfcBalance, bobBalance, sbiBalance;
	int totalCreditCount = 0, totalDebitCount, creditCount = 0, debitCount = 0;
	String bankName;
	int hdfcCreditCount, sbiCreditCount, iciciCreditCount, bobCreditCount;
	int hdfcDebitCount, sbiDebitCount, iciciDebitCount, bobDebitCount;

	void setUserBalanceDetails(int icicAccountBalance, int hdfcAccountBalance, int bobAccountBalance,
			int sbiAccountBalance) {
		iciciBalance = icicAccountBalance;
		hdfcBalance = hdfcAccountBalance;
		bobBalance = bobAccountBalance;
		sbiBalance = sbiAccountBalance;
	}

	void bankCredit(String bName, int balance) {
		bankName = bName;
		switch (bankName) {
		case "ICICI":
			iciciBalance += balance;
			iciciCreditCount++;
			creditCount++;
			totalCreditCount++;
			break;
		case "HDFC":
			hdfcBalance += balance;
			hdfcCreditCount++;
			creditCount++;
			totalCreditCount++;
			break;
		case "BOB":
			bobBalance += balance;
			creditCount++;
			bobCreditCount++;
			totalCreditCount++;
			break;
		case "SBI":
			sbiBalance += balance;
			sbiCreditCount++;
			creditCount++;
			totalCreditCount++;
			break;
		}
	}

	void bankDebit(String bankName, int balance) {
		switch (bankName) {
		case "ICICI":
			iciciBalance -= balance;
			iciciDebitCount++;
			totalDebitCount++;
			break;
		case "HDFC":
			hdfcBalance -= balance;
			hdfcDebitCount++;
			creditCount++;
			totalDebitCount++;
			break;
		case "BOB":
			bobBalance -= balance;
			bobDebitCount++;
			creditCount++;
			totalDebitCount++;
			break;
		case "SBI":
			sbiBalance -= balance;
			creditCount++;
			sbiDebitCount++;
			totalDebitCount++;
			break;
		}
	}

	int getTotalBalance() {
		int totalBalance = iciciBalance + hdfcBalance + bobBalance + sbiBalance;
		return totalBalance;
	}

	void displayUserDetails() {
		System.out.println("\nICIC bank Credit Operation - " + iciciCreditCount);
		System.out.println("HDFC bank Credit Operation - " + hdfcCreditCount);
		System.out.println("BOB bank Credit Operation - " + bobCreditCount);
		System.out.println("SBI bank Credit Operation - " + sbiCreditCount);
		System.out.println("\nICIC bank Debit Operation - " + iciciDebitCount);
		System.out.println("HDFC bank Debit Operation - " + hdfcDebitCount);
		System.out.println("BOB bank Debit Operation - " + bobDebitCount);
		System.out.println("SBI bank Debit Operation - " + sbiDebitCount);
	}

	void IndivitualBankBalanceAfterCreditAndDebit() {
		System.out.println("\nBalance for ICICI bank is : " + iciciBalance);
		System.out.println("Balance for HDFC bank is : " + hdfcBalance);
		System.out.println("Balance for BOB bank is : " + bobBalance);
		System.out.println("Balance for SBI bank is : " + sbiBalance);
	}

	void totalCreditDebitOperations() {
		System.out.println("\nTotal credit operations are : " + totalCreditCount);
		System.out.println("Total debit operations are : " + totalDebitCount);
	}

	public static void main(String[] args) {
		BankSwitchCaseExample bankSwitchCaseExample = new BankSwitchCaseExample();
		bankSwitchCaseExample.setUserBalanceDetails(50000, 10000, 20000, 300000);
		bankSwitchCaseExample.bankCredit("ICICI", 3000);
		bankSwitchCaseExample.bankCredit("ICICI", 2000);
		bankSwitchCaseExample.bankCredit("HDFC", 1000);
		bankSwitchCaseExample.displayUserDetails();
		bankSwitchCaseExample.IndivitualBankBalanceAfterCreditAndDebit();
		bankSwitchCaseExample.bankCredit("SBI", 3000);
		bankSwitchCaseExample.bankCredit("BOB", 3000);
		bankSwitchCaseExample.bankCredit("BOB", 3000);
		bankSwitchCaseExample.bankDebit("ICICI", 2000);
		bankSwitchCaseExample.bankDebit("HDFC", 1000);
		bankSwitchCaseExample.bankDebit("SBI", 1000);
		bankSwitchCaseExample.bankDebit("BOB", 2000);
		bankSwitchCaseExample.bankDebit("BOB", 1000);
		bankSwitchCaseExample.displayUserDetails();
		bankSwitchCaseExample.totalCreditDebitOperations();
		System.out.println("\nTotal Balance is : " + bankSwitchCaseExample.getTotalBalance());

	}

}
