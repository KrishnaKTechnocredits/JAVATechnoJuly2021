package margi.Assignment_23;

public class Assignment_23 {
	
	static int totalDebitCnt=0, totalCreditCnt=0;
	int iciciBalance=10000, hdfcBalance=5000, bobBalance=7000, sbiBalance=15000;
	int iciciDebit, iciciCredit, hdfcDebit, hdfcCredit, bobDebit, bobCredit, sbiDebit, sbiCredit;
	int totalIciciDebitCnt, totalIciciCreditCnt, totalHdfcDebitCnt, totalHdfcCreditCnt, totalBobDebitCnt, totalBobCreditCnt, totalSbiDebitCnt, totalSbiCreditCnt;
	
	void processData(String operations, String bName, int debitCredit) {
		int amount = debitCredit;
		String operation = operations;
		String bankName = bName;
		switch(operation) {
			case "debit":
			{
				switch(bankName) {
					case "ICICI" : iciciBalance -= amount;
									totalDebitCnt++;
									totalIciciDebitCnt++;
									break;
					case "HDFC" : hdfcBalance -= amount;
									totalDebitCnt++;
									totalHdfcDebitCnt++;
									break;
					case "BOB" : bobBalance -= amount;
									totalDebitCnt++;
									totalBobDebitCnt++;
									break;
					case "SBI" : sbiBalance -= amount;
									totalDebitCnt++;
									totalSbiDebitCnt++;
									break;
					default : System.out.println("Invalid details");
				}
			}  break;
			case "credit":
			{
				switch(bankName) {
					case "ICICI" : iciciBalance += amount;
									totalCreditCnt++;
									totalIciciCreditCnt++;
									break;
					case "HDFC" : hdfcBalance += amount;
									totalCreditCnt++;
									totalHdfcCreditCnt++;
									break;
					case "BOB" : bobBalance += amount;
									totalCreditCnt++;
									totalBobCreditCnt++;
									break;
					case "SBI" : sbiBalance += amount;
									totalCreditCnt++;
									totalSbiCreditCnt++;
									break;
					default : System.out.println("Invalid details");
				}break;
			} 
			default: System.out.println("Invalid operation");
		}
	}
	
	//total balance
	void displayBalance() {
		int totalBalance = iciciBalance + hdfcBalance + bobBalance + sbiBalance;
		System.out.println("Total balance is: " + totalBalance);
	}
	
	//total credit, debit operations
	void displayTotalDebitCredit(){
		System.out.println("Total credit operations: "+ totalCreditCnt);
		System.out.println("Total debit operations: "+ totalDebitCnt);
	}
	
	//individual bank credit operations
	void displayIndividualBankCreditOperations(){
		System.out.println("ICICI bank Credit Operation: "+ totalIciciCreditCnt);
		System.out.println("HDFC bank Credit Operation: "+ totalHdfcCreditCnt);
		System.out.println("BOB bank Credit Operation: "+ totalBobCreditCnt);
		System.out.println("SBI bank Credit Operation: "+ totalSbiCreditCnt);
	}
	
	//individual bank debit operations
	void displayIndividualBankDebitOperations() {
		System.out.println("ICICI bank Debit Operation: "+ totalIciciDebitCnt);
		System.out.println("HDFC bank Debit Operation: "+ totalHdfcDebitCnt);
		System.out.println("BOB bank Debit Operation: "+ totalBobDebitCnt);
		System.out.println("SBI bank Debit Operation: "+ totalSbiDebitCnt);
	}
	
	public static void main(String[] args) {
		Assignment_23 assignment_23 = new Assignment_23();
		assignment_23.processData("debit", "ICICI",2000);
		assignment_23.processData("credit", "ICICI",1000);
		assignment_23.processData("debit", "SBI",3000);
		assignment_23.processData("credit", "ICICI",1000);
		assignment_23.processData("credit", "SBI",1500);
		assignment_23.processData("debit", "ICICI",250);
		assignment_23.processData("credit", "HDFC",1000);
		assignment_23.processData("credit", "BOB",2000);
		assignment_23.processData("debit", "SBI",2500);
		assignment_23.processData("credit", "SBI",3000);
		assignment_23.processData("credit", "BOB",2000);
		assignment_23.processData("debit", "HDFC",1500);
		assignment_23.displayBalance();
		assignment_23.displayTotalDebitCredit();
		assignment_23.processData("credit", "SBI",1500);
		assignment_23.processData("debit", "HDFC",250);
		assignment_23.processData("credit", "HDFC",1000);
		assignment_23.processData("credit", "BOB",2000);
		assignment_23.processData("debit", "BOB",2500);
		assignment_23.processData("credit", "SBI",3000);
		assignment_23.processData("credit", "BOB",2000);
		assignment_23.processData("debit", "BOB",1500);
		assignment_23.displayIndividualBankCreditOperations();
		assignment_23.displayIndividualBankDebitOperations();
		
	}
}
