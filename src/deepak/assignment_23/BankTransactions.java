package deepak.assignment_23;

public class BankTransactions {
	int hdfcBalance;
	int sbiBalance;
	int iciciBalance;
	int bobBalance;
	int creditCount;
	int debitCount;
	int hdfcCreditcnt;
	int sbiCreditcnt;
	int iciciCreditcnt;
	int bobCreditcnt;
	int hdfcDebitcnt;
	int sbiDebitcnt;
	int iciciDebitcnt;
	int bobDebitcnt;
	
	void operationType(String transaction, String bank, int amount) {
		
		switch(transaction) {
			case "credit":
				if(bank.equals("HDFC")) {
					hdfcBalance += amount;
					hdfcCreditcnt++;
				}else if(bank.equals("SBI")) {
					sbiBalance += amount;
					sbiCreditcnt++;
				}else if(bank.equals("ICICI")) {
					iciciBalance += amount;
					iciciCreditcnt++;
				}else if(bank.equals("BOB")) {
					bobBalance += amount;
					bobCreditcnt++;
				}break;
			case "debit":
				if(bank.equals("HDFC")) {
					hdfcBalance -= amount;
					hdfcDebitcnt++;
				}else if(bank.equals("SBI")) {
					sbiBalance -= amount;
					sbiDebitcnt++;
				}else if(bank.equals("ICICI")) {
					iciciBalance -= amount;
					iciciDebitcnt++;
				}else if(bank.equals("BOB")) {
					bobBalance -= amount;
					bobDebitcnt++;
				}break;	
			default:
				System.out.println("Entered values are not as expected");
		}
		
	}
		
	int showBalance() {
		int totalBal = hdfcBalance+sbiBalance+iciciBalance+bobBalance;
		return totalBal;
	}
	
	void totalTransactionsCount() {
		System.out.println("Total Credit Operations: "+(hdfcCreditcnt+sbiCreditcnt+iciciCreditcnt+bobCreditcnt));
		System.out.println("Total Debit Operations: "+(hdfcDebitcnt+sbiDebitcnt+iciciDebitcnt+bobDebitcnt));
	}
	
	void individualBankCreditOperations() {
		System.out.println("HDFC Credit Operation: "+hdfcCreditcnt);
		System.out.println("SBI Credit Operation: "+sbiCreditcnt);
		System.out.println("ICICI Credit Operation: "+iciciCreditcnt);
		System.out.println("BOB Credit Operation: "+bobCreditcnt);
	}
	
	void individualBankDebitOperations() {
		System.out.println("HDFC Debit Operation: "+hdfcDebitcnt);
		System.out.println("SBI Debit Operation: "+sbiDebitcnt);
		System.out.println("ICICI Debit Operation: "+iciciDebitcnt);
		System.out.println("BOB Debit Operation: "+bobDebitcnt);
	}
	
	
	void setBalance(int hdfc, int sbi, int icici, int bob) {
		hdfcBalance=hdfc;
		sbiBalance=sbi;
		iciciBalance=icici;
		bobBalance=bob;			
	}
	
	public static void main(String[] args) {
		BankTransactions obj = new BankTransactions();
		obj.setBalance(10000, 10000, 10000, 10000);
		obj.operationType("credit","HDFC", 1000);
		obj.operationType("credit","HDFC", 1500);
		obj.operationType("credit","SBI", 2000);
		obj.operationType("credit","ICICI", 3000);
		obj.operationType("credit","ICICI", 4500);
		obj.operationType("credit","BOB", 1000);
		obj.operationType("credit","BOB", 1000);
		obj.operationType("credit","BOB", 1000);
		obj.operationType("credit","BOB", 1000);
		
		obj.operationType("debit","HDFC", 500);
		obj.operationType("debit","HDFC", 500);
		obj.operationType("debit","SBI", 500);
		obj.operationType("debit","SBI", 500);
		obj.operationType("debit","ICICI", 500);
		obj.operationType("debit","ICICI", 500);
		obj.operationType("debit","BOB", 500);
		obj.operationType("debit","BOB", 500);
		
		System.out.println("---------------------------------------");
		System.out.println("Total Bank Balance: "+obj.showBalance());
		System.out.println("---------------------------------------");
		obj.totalTransactionsCount();
		System.out.println("---------------------------------------");
		obj.individualBankCreditOperations();
		System.out.println("---------------------------------------");
		obj.individualBankDebitOperations();
		System.out.println("---------------------------------------");
		
	}

}
