package monali.Assignment_23;

import java.util.Scanner;

/*Assignment - 23 : 27th Aug'2021

A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
          a) Person can debit or credit amount from respective bank.
              Hint : Switch case is expected here. [Please watch today's recording again, in case of confusion.]

          b) A Method to show total balance [ICICI balance + HDFC balance + BOB balance + SBI    Balance]  

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
public class BankSwitchCase {

	int totalBalance;
	String bank;
	int iciciBalance = 2000, hdfcBalance = 2000, sbiBalance = 2000, bobBalance = 2000;
	int iciciCreditCount, iciciDebitCount, hdfcCreditCount, hdfcDebitCount, sbiCreditCount, sbiDebitCount,
			bobCreditCount, bobDebitCount;
	int totalCreditCount, totalDebitCount;

	void bankOperations(int choice, String operation, int amount) {
		switch (choice) {
		case 1:
			bank = "ICICI";
			switch (operation) {
			case "credit":
				iciciBalance = iciciBalance + amount;
				iciciCreditCount++;
				totalCreditCount++;
				break;
			case "debit":
				iciciBalance = iciciBalance - amount;
				iciciDebitCount++;
				totalDebitCount++;
				break;
			default:
				System.out.println("Invalid Operation");
				break;
			}
			break;
		case 2:
			bank = "HDFC";
			switch (operation) {
			case "credit":
				hdfcBalance = hdfcBalance + amount;
				hdfcCreditCount++;
				totalCreditCount++;
				break;
			case "debit":
				hdfcBalance = hdfcBalance - amount;
				hdfcDebitCount++;
				totalDebitCount++;
				break;
			default:
				System.out.println("Invalid Operation");
				break;
			}
			break;
		case 3:
			bank = "SBI";
			switch (operation) {
			case "credit":
				sbiBalance = sbiBalance + amount;
				sbiCreditCount++;
				totalCreditCount++;
				break;
			case "debit":
				sbiBalance = sbiBalance - amount;
				sbiDebitCount++;
				totalDebitCount++;
				break;
			default:
				System.out.println("Invalid Operation");
				break;
			}
			break;

		case 4:
			bank = "BOB";
			switch (operation) {
			case "credit":
				bobBalance = bobBalance + amount;
				bobCreditCount++;
				totalCreditCount++;
				break;
			case "debit":
				bobBalance = bobBalance - amount;
				bobDebitCount++;
				totalDebitCount++;
				break;
			default:
				System.out.println("Invalid Operation");
				break;
			}
			break;

		}
	}

	void totalBalance() {
		System.out.println("Total Balance avalaible : " + (bobBalance + iciciBalance + hdfcBalance + sbiBalance));
	}

	void totalTransactions() {
		System.out.println("Total Credit Operations done : " + totalCreditCount);
		System.out.println("Total Debit Operations done : " + totalDebitCount);
	}

	void individualCreditTransactions() {
		if (iciciCreditCount > 0)
			System.out.println("ICICI bank Credit Operation - " + iciciCreditCount);
		if (hdfcCreditCount > 0)
			System.out.println("HDFC bank Credit Operation - " + hdfcCreditCount);
		if (hdfcCreditCount > 0)
			System.out.println("SBI bank Credit Operation - " + sbiCreditCount);
		if (hdfcCreditCount > 0)
			System.out.println("BOB bank Credit Operation - " + bobCreditCount);
	}

	void individualDebitTransactions() {
		System.out.println("ICICI bank Debit Operation - " + iciciDebitCount);
		System.out.println("HDFC bank Debit Operation - " + hdfcDebitCount);
		System.out.println("SBI bank Debit Operation - " + sbiDebitCount);
		System.out.println("BOB bank Debit Operation - " + bobDebitCount);
	}

	public static void main(String[] args) {
		BankSwitchCase bank = new BankSwitchCase();
		bank.bankOperations(1, "credit", 1000);
		bank.bankOperations(1, "credit", 2000);
		bank.bankOperations(1, "debit", 500);
		bank.bankOperations(1, "debit", 200);
		bank.bankOperations(2, "credit", 1000);
		bank.bankOperations(2, "credit", 2000);
		bank.bankOperations(2, "debit", 500);
		bank.bankOperations(2, "debit", 200);
		bank.bankOperations(3, "credit", 1000);
		bank.bankOperations(3, "debit", 500);
		bank.bankOperations(3, "debit", 200);
		bank.bankOperations(4, "credit", 1000);
		bank.bankOperations(4, "credit", 500);
		bank.bankOperations(4, "debit", 200);

		bank.individualCreditTransactions();
		bank.individualDebitTransactions();
		bank.totalTransactions();
		bank.totalBalance();

	}
}
