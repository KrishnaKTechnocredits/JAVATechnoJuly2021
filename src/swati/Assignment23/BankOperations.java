package swati.Assignment23;

public class BankOperations {

	int iciciBalance=2000,hdfcBalance=4000,bobBalance=5000,sbiBalance=6000;
	int iciciDebitCount,hdfcDebitCount,bobDebitCount,sbiDebitCount;
	int iciciCreditCount,hdfcCreditCount,bobCreditCount,sbiCreditCount;
	int debitTotal,creditTotal;
	
	void debitCreditOperations(String bankName,String operation, int ammount) {
		
		switch(bankName){
		
		case "ICICI":
			switch(operation) {
			case "Debit":
				iciciBalance=iciciBalance-ammount;
				iciciDebitCount++;
				break;
			case "Credit":
				iciciBalance=iciciBalance+ammount;
				iciciCreditCount++;
				break;
			}
		break;
		
		case "HDFC":
			switch(operation) {
			case "Debit":
				hdfcBalance=hdfcBalance-ammount;
				hdfcDebitCount++;
				break;
			case "Credit":
				hdfcBalance=hdfcBalance+ammount;
				hdfcCreditCount++;
				break;
			}
		break;
		
		case "BOB":
			switch(operation) {
			case "Debit":
				bobBalance=bobBalance-ammount;
				bobDebitCount++;
				break;
			case "Credit":
				bobBalance=bobBalance+ammount;
				bobCreditCount++;
				break;
			}
		break;
		
		case "SBI":
			switch(operation) {
			case "Debit":
				sbiBalance=sbiBalance-ammount;
				sbiDebitCount++;
				break;
			case "Credit":
				sbiBalance=sbiBalance+ammount;
				sbiCreditCount++;
				break;
			}
		break;
			
		}
	}

	void totalDebitOperations() {
		System.out.println("ICICI bank Debit Operations :"+ iciciDebitCount);
		System.out.println("HDFC bank Debit Operations :"+ hdfcDebitCount);
		System.out.println("BOB bank Debit Operations :"+ bobDebitCount);
		System.out.println("SBI bank Debit Operations :"+ sbiDebitCount);
		debitTotal=iciciDebitCount+hdfcDebitCount+bobDebitCount+sbiDebitCount;
	}

	void totalCreditOperations() {
		System.out.println("\nICICI bank Credit Operations :"+ iciciCreditCount);
		System.out.println("HDFC bank Credit Operations :"+ hdfcCreditCount);
		System.out.println("BOB bank Credit Operations :"+ bobCreditCount);
		System.out.println("SBI bank Credit Operations :"+ sbiCreditCount);
		creditTotal=iciciCreditCount+hdfcCreditCount+bobCreditCount+sbiCreditCount;
}

	void totalCreditDebitOperations() {
		System.out.println("\nTotal Credit operations - "+creditTotal+" times");
		System.out.println("Total Debit operations - "+debitTotal+" times");
	}

	public static void main(String[] arg) {
		BankOperations bank=new BankOperations();
		bank.debitCreditOperations("ICICI","Credit",500);
		bank.debitCreditOperations("ICICI","Debit",500);
		bank.debitCreditOperations("HDFC","Credit",500);
		bank.debitCreditOperations("HDFC","Debit",500);
		bank.debitCreditOperations("BOB","Credit",500);
		bank.debitCreditOperations("BOB","Debit",500);
		bank.debitCreditOperations("SBI","Credit",500);
		bank.debitCreditOperations("SBI","Debit",500);
		bank.totalDebitOperations();
		bank.totalCreditOperations();
		bank.totalCreditDebitOperations();
	}
}
