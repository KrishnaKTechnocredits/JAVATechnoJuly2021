package tarangAssignment23;

import java.util.Scanner;

public class SwitchLoop {

	int balanceICICI = 50000, balanceHDFC = 40000, balanceBOB = 30000, balanceSBI = 20000;
	int creditICICI, creditHDFC, creditBOB, creditSBI, debitICICI, debitHDFC, debitBOB, debitSBI;

	void bankwisetransaction(String bankName, String transaction, int amount) {
		switch (bankName) {
		case "ICICI":
			switch (transaction) {
			case "Debit":
				balanceICICI = balanceICICI - amount;
				debitICICI++;
				break;
			case "Credit":
				balanceICICI = balanceICICI + amount;
				creditICICI++;
				break;
			}
			break;
		case "HDFC":
			switch (transaction) {
			case "Debit":
				balanceHDFC = balanceHDFC - amount;
				debitHDFC++;
				break;
			case "Credit":
				balanceHDFC = balanceHDFC + amount;
				creditHDFC++;
				break;
			}
			break;
		case "BOB":
			switch (transaction) {
			case "Debit":
				balanceBOB = balanceBOB - amount;
				debitBOB++;
				break;
			case "Credit":
				balanceBOB = balanceBOB + amount;
				creditBOB++;
				break;
			}
			break;
		case "SBI":
			switch (transaction) {
			case "Debit":
				balanceSBI = balanceSBI - amount;
				debitSBI++;
				break;
			case "Credit":
				balanceSBI = balanceSBI + amount;
				creditSBI++;
				break;
			}
			break;
		}
	}

	void bankWiseDebitCount() {
		System.out.println("ICICI bank debit Operation " + debitICICI);
		System.out.println("HDFC bank debit Operation " + debitHDFC);
		System.out.println("BOB bank debit Operation " + debitBOB);
		System.out.println("SBI bank debit Operation " + debitSBI);
	}

	void bankWiseCreditCount() {
		System.out.println("ICICI bank credit Operation " + creditICICI);
		System.out.println("HDFC bank credit Operation " + creditHDFC);
		System.out.println("BOB bank credit Operation " + creditBOB);
		System.out.println("SBI bank credit Operation " + creditSBI);
	}

	void totalDebitCreditCount() {
		System.out.println("Total debit operation of all accounts " + debitICICI + debitHDFC + debitBOB + debitSBI);
		System.out.println("Total credit operation of all accounts " + creditICICI + creditHDFC + creditBOB + creditSBI);
	}

	void totalBalance() {
		System.out.println("Total balance in all accounts is :" + balanceICICI + " "+ balanceHDFC +" "+ + balanceBOB +" "+ + balanceSBI);
	}

	public static void main(String[] args) {
		SwitchLoop switchLoop = new SwitchLoop();
		switchLoop.bankwisetransaction("ICICI", "Debit", 2000);
		switchLoop.bankwisetransaction("HDFC", "Debit", 5000);
		switchLoop.bankwisetransaction("SBI", "Debit", 4500);
		switchLoop.bankwisetransaction("BOB", "Credit", 5000);
		switchLoop.bankwisetransaction("BOB", "Debit", 2000);
		switchLoop.bankwisetransaction("SBI", "Debit", 4500);
		switchLoop.bankwisetransaction("ICICI", "Debit", 2000);
		switchLoop.bankwisetransaction("HDFC", "Credit", 5000);
		switchLoop.bankwisetransaction("SBI", "Credit", 4500);
		switchLoop.bankwisetransaction("ICICI", "Credit", 6000);
		switchLoop.bankwisetransaction("BOB", "Credit", 5000);
		switchLoop.bankwisetransaction("SBI", "Debit", 4500);
		switchLoop.bankwisetransaction("SBI", "Debit", 4500);
		switchLoop.bankwisetransaction("HDFC", "Credit", 5000);
		switchLoop.bankwisetransaction("ICICI", "Debit", 2000);
		switchLoop.bankWiseDebitCount();
		switchLoop.bankWiseCreditCount();
		switchLoop.totalDebitCreditCount();
		switchLoop.totalBalance();
	}
}
