package shalaka.Assignment23;

public class PersonalBankDetails {
	static int totalCredcount, totalDebtCount;
	int iciciBalance, SbiBalance, bobBalance, hdfcBalance, hdfcCredCount, sbiCredCount, bobCredCount, iciciCredCount;
	int hdfcDebitCount, sbiDebitCount, bobDebitCount, iciciDebitCount;

	void setDetails(int iciciBal, int sbiBal, int bobBal, int hdfcBal) {
		iciciBalance = iciciBal;
		SbiBalance = sbiBal;
		bobBalance = bobBal;
		hdfcBalance = hdfcBal;
	}

	void indiviualBankCredit(String bankName, int balance) {
		switch (bankName) {
		case "ICICI":
			iciciBalance += balance;
			iciciCredCount++;
			totalCredcount++;
			break;
		case "SBI":
			SbiBalance += balance;
			sbiCredCount++;
			totalCredcount++;
			break;
		case "BOB":
			bobBalance += balance;
			bobCredCount++;
			totalCredcount++;
			break;
		case "HDFC":
			hdfcBalance += balance;
			hdfcCredCount++;
			totalCredcount++;
			// System.out.println(" HDFC bank Credit Operation "+hdfcCredCount);
			break;
		}
	}

	void indiviualBankDebit(String bankName, int balance) {
		switch (bankName) {
		case "ICICI":
			iciciBalance -= balance;
			iciciDebitCount++;
			totalDebtCount++;
			break;
		case "SBI":
			SbiBalance += balance;
			sbiDebitCount++;
			totalDebtCount++;
			break;
		case "BOB":
			bobBalance += balance;
			bobDebitCount++;
			totalDebtCount++;
			break;
		case "HDFC":
			hdfcBalance += balance;
			hdfcDebitCount++;
			totalDebtCount++;
			break;
		}
	}

	void display() {
		System.out.println("HDFC bank Credit Operation " + hdfcCredCount);
		System.out.println("BOB bank Credit Operation " + bobCredCount);
		System.out.println("SBI bank Credit Operation " + sbiCredCount);
		System.out.println("ICICI bank Credit Operation " + iciciCredCount);
		System.out.println("\nHDFC bank Debit Operation " + hdfcDebitCount);
		System.out.println("BOB bank Debit Operation " + bobDebitCount);
		System.out.println("SBI bank Debit Operation " + sbiDebitCount);
		System.out.println("ICICI bank Debit Operation " + iciciDebitCount);
	}

	void getTotalCreditDebitCount() {
		System.out.println("\nTotal credit operation -" + totalCredcount + " times");
		System.out.println("Total debit operation -" + totalDebtCount + " times");
	}

	int getTotalBalance() {

		int totalAmount = iciciBalance + SbiBalance + bobBalance + hdfcBalance;
		return totalAmount;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonalBankDetails PersonalBankDetails = new PersonalBankDetails();
		PersonalBankDetails.setDetails(5000, 8000, 6000, 10000);
		PersonalBankDetails.indiviualBankCredit("ICICI", 3000);
		PersonalBankDetails.indiviualBankCredit("ICICI", 4000);
		PersonalBankDetails.indiviualBankCredit("HDFC", 2000);
		PersonalBankDetails.indiviualBankCredit("HDFC", 2000);
		PersonalBankDetails.indiviualBankCredit("SBI", 2000);
		PersonalBankDetails.indiviualBankDebit("BOB", 1000);
		PersonalBankDetails.indiviualBankDebit("BOB", 2000);
		PersonalBankDetails.indiviualBankDebit("BOB", 1000);
		PersonalBankDetails.indiviualBankDebit("BOB", 2000);
		PersonalBankDetails.display();
		System.out.println("\nTotal balance is : " + PersonalBankDetails.getTotalBalance());
		PersonalBankDetails.getTotalCreditDebitCount();
	}
}