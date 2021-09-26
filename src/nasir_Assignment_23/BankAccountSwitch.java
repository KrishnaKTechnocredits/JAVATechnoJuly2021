package nasir_Assignment_23;

public class BankAccountSwitch {
	int iciciBalance=10000;
	int hdfcBalance=10000;
	int bobBalance=10000;
	int sbiBalance=10000;
	int creditCountIcici,creditCountHdfc,creditCountbob,creditCountSbi;
	int debitCountIcici,debitCountHdfc,debitCountbob,debitCountSbi;
	
	public void processData(String bank,String operation,int amount) {
		
		switch(bank) {
		case "ICICI":
			switch(operation){
		case "debit":
			iciciBalance-=amount;
			debitCountIcici++;
			break;
		case "credit":
			iciciBalance+=amount;
			creditCountIcici++;
			break;
			}
			break;
		case "HDFC":
			switch(operation){
		case "debit":
			hdfcBalance-=amount;
			debitCountHdfc++;
			break;
		case "credit":
			hdfcBalance+=amount;
			creditCountHdfc++;
			break;
			}
			break;
		case "SBI":
			switch(operation){
		case "debit":
			sbiBalance-=amount;
			debitCountSbi++;
			break;
		case "credit":
			sbiBalance+=amount;
			creditCountSbi++;
			break;
			}
			break;
		case "BOB":
			switch(operation){
		case "debit":
			bobBalance-=amount;
			debitCountbob++;
			break;
		case "credit":
			bobBalance+=amount;
			creditCountbob++;
			break;
			}
			break;
			
			
		}
	}
	void totalBalance() {
		int balance=iciciBalance+hdfcBalance+bobBalance+sbiBalance;
		System.out.println("Total Balance in all account is "+balance);
	}
	void totalOperation() {
		System.out.println("Total operation: "+(creditCountIcici+creditCountHdfc+creditCountbob+creditCountSbi +debitCountIcici+debitCountHdfc+debitCountbob+debitCountSbi ));
			
			
		}
	void individualBankCreditOperation() {
		System.out.println("ICICI bank Credit Operation: " +creditCountIcici );
		System.out.println("HDFC bank Credit Operation: " +creditCountHdfc );
		System.out.println("BOB bank Credit Operation: " +creditCountbob );
		System.out.println("SBI bank Credit Operation: " +creditCountSbi );
	}
	void individualBankDebitOperation() {
		System.out.println("ICICI bank Debit Operation: " +debitCountIcici );
		System.out.println("HDFC bank Debit Operation: " +debitCountHdfc );
		System.out.println("BOB bank Debit Operation: " +debitCountbob );
		System.out.println("SBI bank Debit Operation: " +debitCountSbi );
	}
	
	

	public static void main(String[] args) {
		BankAccountSwitch bankAccountSwitch=new BankAccountSwitch();
		bankAccountSwitch.processData("HDFC", "credit", 100);
		bankAccountSwitch.processData("HDFC", "credit", 1100);
		bankAccountSwitch.processData("SBI", "credit", 1200);
		bankAccountSwitch.processData("BOB", "credit", 300);
		bankAccountSwitch.processData("SBI", "credit", 500);
		bankAccountSwitch.processData("ICICI", "credit", 1100);
		bankAccountSwitch.processData("BOB", "debit", 2200);
		bankAccountSwitch.processData("ICICI", "debit", 100);
		bankAccountSwitch.processData("HDFC", "debit", 1000);
		bankAccountSwitch.processData("SBI", "debit", 1020);
		bankAccountSwitch.processData("HDFC", "debit", 1100);
		bankAccountSwitch.processData("SBI", "debit", 1040);
		bankAccountSwitch.processData("ICICI", "debit",1100);
		bankAccountSwitch.processData("BOB", "debit", 200);
		bankAccountSwitch.processData("ICICI", "credit", 1100);
		bankAccountSwitch.totalBalance();
		bankAccountSwitch.totalOperation();
		bankAccountSwitch.individualBankCreditOperation();
		bankAccountSwitch.individualBankDebitOperation();
		

	}

}
