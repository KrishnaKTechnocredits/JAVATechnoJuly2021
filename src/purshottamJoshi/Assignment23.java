package purshottamJoshi;

class Assignment23 {

	int balICICI = 10000, balHDFC = 12000, balBOB = 8000, balSBI = 5000;
	int debitICICI, debitHDFC, debitBOB, debitSBI;
	int creditICICI, creditHDFC, creditBOB, creditSBI;

	void selectBankAndTransaction(String bank, String transaction, int amount) {
		
		switch (bank) {
		case "ICICI":
			if(transaction.equals("Debit")){
				balICICI -= amount;
				debitICICI++;
			}if(transaction.equals("Credit")){
				balICICI += amount;
				creditICICI++;
			}
			break;
		
		case "HDFC":
			if(transaction.equals("Debit")){
				balHDFC -=amount;
				debitHDFC++;
			}if(transaction.equals("Credit")){
				balHDFC += amount;
				creditHDFC++;
			}
			break;

		case "BOB":
			if(transaction.equals("Debit")){
				balBOB -= amount;
				debitBOB++;
			}	
			if(transaction.equals("Credit")){
				balBOB += amount;
				creditBOB++;
			}
			break;
			
		case "SBI":
			if(transaction.equals("Debit")){
				balSBI -=amount;
				debitSBI++;
			}if(transaction.equals("Credit")){
				balSBI += amount;
				creditSBI++;
			}
			break;
		default :
			System.out.println("Invalid Input");
		}
	}
	void totalBalance() {
		System.out.println("Total balance is : "+ (balICICI + balBOB + balHDFC + balSBI));
	}
	void totalTransaction() {
		System.out.println("Total Debit Transactions : "+(debitICICI + debitBOB + debitHDFC + debitSBI));
		System.out.println("Total Credit transactions : "+(creditICICI + creditBOB + creditHDFC + creditSBI));
	}
	void individualDebitTransaction() {
		System.out.println("Debit Transactions of ICICI bank : "+debitICICI);
		System.out.println("Debit Transactions of HDFC bank : "+debitHDFC);
		System.out.println("Debit Transactions of BOB bank : " +debitBOB);
		System.out.println("Debit Transactions of SBI bank : "+debitSBI);
	}
	void individualCreditTransaction() {
		System.out.println("Credit Transactions of ICICI bank : "+creditICICI);
		System.out.println("Credit Transactions of HDFC bank : "+creditHDFC);
		System.out.println("Credit Transactions of BOB bank : "+creditBOB);
		System.out.println("Credit Transactions of SBI bank : "+creditSBI);
	}

	public static void main(String[] args) {
		Assignment23 assignment23 = new Assignment23();
		assignment23.selectBankAndTransaction("HDFC","Credit", 200);
		assignment23.selectBankAndTransaction("BOB","Credit",4000);
		assignment23.selectBankAndTransaction("SBI","Debit",1300);
		assignment23.selectBankAndTransaction("ICICI","Credit",1000);
		assignment23.selectBankAndTransaction("BOB","Debit",1000);
		assignment23.selectBankAndTransaction("ICICI","Debit",3000);
		assignment23.selectBankAndTransaction("HDFC","Debit",1500);
		assignment23.selectBankAndTransaction("SBI","Debit",500);
		assignment23.selectBankAndTransaction("HDFC","Debit",3000);
		assignment23.selectBankAndTransaction("SBI","Credit",2040);
		assignment23.selectBankAndTransaction("ICICI","Debit",2100);
		assignment23.selectBankAndTransaction("BOB","Debit",200);
		assignment23.totalBalance();
		assignment23.totalTransaction();
		assignment23.individualDebitTransaction();
		assignment23.individualCreditTransaction();
	}
}
