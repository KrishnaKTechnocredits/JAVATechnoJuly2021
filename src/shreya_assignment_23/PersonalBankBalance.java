package shreya_assignment_23;

public class PersonalBankBalance {
	static int balance;
	int hdfcBalance=10000,sbiBalance=20000,bobBalance=5000,iciciBalance=50000;
	int totalCredit,totalDebit,creditHDFC,debitHDFC,creditSBI,debitSBI,creditICICI,debitICICI,creditBOB,debitBOB;
	
	void displayInitialbalance() {
		balance=hdfcBalance+sbiBalance+bobBalance+iciciBalance;
		System.out.println("Total balance is "+balance);
	}
	
	void ProcessInfo(String bank,String operation,int amount) {
		switch(bank) {
		case "SBI":
			switch(operation) {
			case "credit":
				sbiBalance+=amount;
				creditSBI++;
				totalCredit++;
				break;
			case "debit":
				sbiBalance-=amount;
				debitSBI++;
				totalDebit++;
				break;
			}
			break;
		case "ICICI":
			switch(operation) {
			case "credit":
				iciciBalance+=amount;
				creditICICI++;
				totalCredit++;
				break;
			case "debit":
				iciciBalance-=amount;
				debitICICI++;
				totalDebit++;
				break;
			}
			break;
		case "BOB":
			switch(operation) {
			case "credit":
				bobBalance+=amount;
				creditBOB++;
				totalCredit++;
				break;
			case "debit":
				bobBalance-=amount;
				debitBOB++;
				totalDebit++;
				break;
			}
			break;
		case "HDFC":
			switch(operation) {
			case "credit":
				hdfcBalance+=amount;
				creditHDFC++;
				totalCredit++;
				break;
			case "debit":
				hdfcBalance-=amount;
				debitHDFC++;
				totalDebit++;
				break;
			}
			break;
		}
	}
	
	void individualBankCreditCount() {
		System.out.println("-----Individual bank credit operations-----");
		System.out.println("SBI bank credit operation: "+creditSBI);
		System.out.println("HDFC bank credit operation: "+creditHDFC);
		System.out.println("ICICI bank credit operation: "+creditICICI);
		System.out.println("BOB bank credit operation: "+creditBOB);
		
	}
	
	void individualBankDebitCount() {
		System.out.println("-----Individual bank debit operations-----");
		System.out.println("SBI bank debit operation: "+debitSBI);
		System.out.println("HDFC bank debit operation: "+debitHDFC);
		System.out.println("ICICI bank debit operation: "+debitICICI);
		System.out.println("BOB bank debit operation: "+debitBOB);
		
	}
	
	void totalCreditAndDebit() {
		System.out.println("-----Total debit and credit operations-----");
		System.out.println("Total credit operation: "+totalCredit);
		System.out.println("Total debit operation: "+totalDebit);
	}
	
	
	public static void main(String[] args) {
		System.out.println("-----Bank details-----");
		PersonalBankBalance personalBankBalance=new PersonalBankBalance();
		personalBankBalance.displayInitialbalance();
		personalBankBalance.ProcessInfo("SBI", "credit", 1000);
		personalBankBalance.ProcessInfo("SBI", "credit", 500);
		personalBankBalance.ProcessInfo("SBI", "credit", 1200);
		personalBankBalance.ProcessInfo("SBI", "credit", 3000);
		personalBankBalance.ProcessInfo("SBI", "credit", 2000);
		personalBankBalance.ProcessInfo("HDFC", "credit", 200);
		personalBankBalance.ProcessInfo("HDFC", "credit", 5000);
		personalBankBalance.ProcessInfo("BOB", "credit", 500);
		personalBankBalance.ProcessInfo("BOB", "credit", 5000);
		personalBankBalance.ProcessInfo("BOB", "credit", 800);
		personalBankBalance.ProcessInfo("BOB", "credit", 150);
		personalBankBalance.ProcessInfo("ICICI", "credit", 500);
		personalBankBalance.ProcessInfo("ICICI", "credit", 15000);
		personalBankBalance.ProcessInfo("SBI", "debit", 500);
		personalBankBalance.ProcessInfo("SBI", "debit", 1000);
		personalBankBalance.ProcessInfo("ICICI", "debit", 5000);
		personalBankBalance.ProcessInfo("ICICI", "debit", 4000);
		personalBankBalance.ProcessInfo("BOB", "debit", 500);
		personalBankBalance.ProcessInfo("BOB", "debit", 2500);
		personalBankBalance.ProcessInfo("HDFC", "debit", 900);
		personalBankBalance.ProcessInfo("HDFC", "debit", 3500);
		personalBankBalance.individualBankCreditCount();
		personalBankBalance.individualBankDebitCount();
		personalBankBalance.totalCreditAndDebit();
		
	}

}
