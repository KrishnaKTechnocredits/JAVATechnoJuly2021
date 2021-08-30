package shantanu.switchCaseAssignment23;

public class BankTransactions {
	float balanceHDFC, balanceICICI, balanceSBI, balanceBOB;
	int totalCredit, totalDebit, creditHDFC, debitHDFC, creditICICI, debitICICI, creditSBI, debitSBI, creditBOB, debitBOB;
	void setInitialBalance(float balance) {
		balanceHDFC = balanceICICI = balanceSBI = balanceBOB = balance;
	}
	void displayTotalBalance() {
		System.out.println("Total current balance is: "+(balanceHDFC + balanceICICI + balanceSBI + balanceBOB));
	}
	void displayTotalCreditAndDebit() {
		System.out.println("Total credit transactions: "+totalCredit);
		System.out.println("Total debit transactions: "+totalDebit);
	}
	void displayIndividualBankCreditOperations() {
		System.out.println("Credit transactions for each bank:");
		System.out.println("HDFC:"+creditHDFC);
		System.out.println("ICICI:"+creditICICI);
		System.out.println("SBI:"+creditSBI);
		System.out.println("BOB:"+creditBOB);
	}
	void displayIndividualBankDebitOperations() {
		System.out.println("Debit transactions for each bank:");
		System.out.println("HDFC:"+debitHDFC);
		System.out.println("ICICI:"+debitICICI);
		System.out.println("SBI:"+debitSBI);
		System.out.println("BOB:"+debitBOB);
	}
	void performTransaction(String transaction, float amount) {
		switch(transaction) {
		case "HDFC Credit":
			balanceHDFC += amount;
			totalCredit++;
			creditHDFC++;
			break;
		case "ICICI Credit":
			balanceICICI += amount;
			totalCredit++;
			creditICICI++;
			break;
		case "SBI Credit":
			balanceSBI += amount;
			totalCredit++;
			creditSBI++;
			break;
		case "BOB Credit":
			balanceBOB += amount;
			totalCredit++;
			creditBOB++;
			break;
		case "HDFC Debit":
			if(balanceHDFC < amount || balanceHDFC == 0) {
				System.out.println("Insufficient Balance");
				break;
			}
			else {
				balanceHDFC -= amount;
				totalDebit++;
				debitHDFC++;
				break;	
			}
		case "ICICI Debit":
			if(balanceICICI < amount || balanceICICI == 0) {
				System.out.println("Insufficient Balance");
				break;
			}
			else {
				balanceICICI -= amount;
				totalDebit++;
				debitICICI++;
				break;	
			}
		case "SBI Debit":
			if(balanceSBI < amount || balanceSBI == 0) {
				System.out.println("Insufficient Balance");
				break;
			}
			else {
				balanceSBI -= amount;
				totalDebit++;
				debitSBI++;
				break;	
			}
		case "BOB Debit":
			if(balanceBOB < amount || balanceBOB == 0) {
				System.out.println("Insufficient Balance");
				break;
			}
			else {
				balanceBOB -= amount;
				totalDebit++;
				debitBOB++;
				break;	
			}
		default:
			System.out.println("Invalid transaction");
		}
	}
	public static void main(String[] args) {
		BankTransactions bankTransactions = new BankTransactions();
		bankTransactions.setInitialBalance(1000.00f);
		System.out.println("---------------Before Transaction--------------");
		bankTransactions.displayTotalBalance();
		bankTransactions.displayTotalCreditAndDebit();
		bankTransactions.performTransaction("HDFC Credit", 5000.00f);
		bankTransactions.performTransaction("ICICI Credit", 6000.00f);
		bankTransactions.performTransaction("SBI Credit", 4000.00f);
		bankTransactions.performTransaction("BOB Credit", 3000.00f);
		bankTransactions.performTransaction("HDFC Debit", 2000.00f);
		bankTransactions.performTransaction("HDFC Debit", 2500.00f);
		bankTransactions.performTransaction("ICICI Debit", 1000.00f);
		bankTransactions.performTransaction("ICICI Debit", 500.00f);
		bankTransactions.performTransaction("ICICI Debit", 100.00f);
		bankTransactions.performTransaction("SBI Debit", 800.00f);
		bankTransactions.performTransaction("SBI Debit", 500.00f);
		bankTransactions.performTransaction("SBI Credit", 2000.00f);
		bankTransactions.performTransaction("BOB Credit", 10000.00f);
		bankTransactions.performTransaction("BOB Debit", 2000.00f);
		System.out.println("-----------------After Transaction-------------");
		bankTransactions.displayIndividualBankCreditOperations();
		bankTransactions.displayIndividualBankDebitOperations();
		bankTransactions.displayTotalCreditAndDebit();
		bankTransactions.displayTotalBalance();
	}
}
