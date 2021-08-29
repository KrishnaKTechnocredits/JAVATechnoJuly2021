package precilla.assignment23;

public class BankAccounts {
	String bankName="";
	static int debitOperation;
	static int creditOperation;
	int iciciDebitCount,sbiDebitCount,bobDebitCount,hdfcDebitcount;
	int iciciCreditCount,sbiCreditCount,bobCreditCount,hdfcCreditCount;
	private float iciciBankBalance=0,hdfcBankBalance=0,bobBankBalance=0,sbiBankbalance=0;
	float total;
	
	void performData(String name,float amount,String operation) {
		bankName=name;
		switch(bankName){
			case "ICICI":
				if(operation=="Debit")
					debitAmount(name,amount);
				if(operation=="Credit")
					creditAmount(name,amount);		
			break;
			case "HDFC":
				if(operation=="Debit")
					debitAmount(name,amount);
				if(operation=="Credit")
					creditAmount(name,amount);		
			break;
			case "SBI":
				if(operation=="Debit")
					debitAmount(name,amount);
				if(operation=="Credit")
					creditAmount(name,amount);		
			break;
			case "BOB":
				if(operation=="Debit")
					debitAmount(name,amount);
				if(operation=="Credit")
					creditAmount(name,amount);		
			break;
			default:
				System.out.println("No such banks ");
		}	
	}
	void debitAmount(String name,float amount) {
		bankName=name;
		if(bankName=="ICICI" && iciciBankBalance>0) {
			iciciBankBalance=iciciBankBalance-amount;
			iciciDebitCount++;
			debitOperation++;
		}
		if(bankName=="HDFC" && hdfcBankBalance >0) {
			hdfcBankBalance=hdfcBankBalance-amount;
			hdfcDebitcount++;
			debitOperation++;
		}
		if(bankName=="SBI" && sbiBankbalance>0) {
			sbiBankbalance=sbiBankbalance-amount;
			sbiDebitCount++;
			debitOperation++;
		}
		if(bankName=="BOB" && bobBankBalance >0) {
			bobBankBalance=bobBankBalance-amount;
			bobDebitCount++;
			debitOperation++;
		}
	}
	void creditAmount(String name,float amount) {
		bankName=name;
		if(bankName=="ICICI") {
			iciciBankBalance=iciciBankBalance+amount;
			iciciCreditCount++;
			creditOperation++;
		}
		if(bankName=="HDFC") {
			hdfcBankBalance=hdfcBankBalance+amount;
			hdfcCreditCount++;
			creditOperation++;
		}
		if(bankName=="SBI") {
			sbiBankbalance=sbiBankbalance+amount;
			sbiCreditCount++;
			creditOperation++;
		}
		if(bankName=="BOB") {
			bobBankBalance=bobBankBalance+amount;
			bobCreditCount++;
			creditOperation++;
		}
	}
	void totalBalance() {
		total=iciciBankBalance+hdfcBankBalance+bobBankBalance+sbiBankbalance;
		System.out.print(total);
	}
	void operation() {
		System.out.println("Total Debit operation "+debitOperation+ " times ");
		System.out.println("Total Credit operation "+creditOperation+" times");
	}
	void individualBankCreditOperation() {
		System.out.println("ICICI Bank Credit Operation "+iciciCreditCount);
		System.out.println("HDFC Bank Credit Operation "+hdfcCreditCount);
		System.out.println("SBI Bank Credit Operation "+sbiCreditCount);
		System.out.println("BOB Bank Credit Operation "+bobCreditCount);
		
	}
	void individualBankDebitOperation() {
		System.out.println("ICICI Bank Debit operation "+iciciDebitCount);
		System.out.println("HDFC Bank Debit operation "+hdfcDebitcount);
		System.out.println("SBI Bank Debit operation "+sbiDebitCount);
		System.out.println("BOB Bank Debit operation "+bobDebitCount);
	}
	public static void main(String[] args) {
		BankAccounts bank=new BankAccounts();
		//Method 1 
		bank.performData("ICICI", 10000, "Credit"); //10000
		bank.performData("BOB", 800, "Credit");//800
		bank.performData("HDFC", 5000, "Credit");//5000
		bank.performData("SBI", 9000, "Credit");//9000
		bank.performData("BOB", 500, "Debit");//300
		bank.performData("SBI", 1000, "Debit");//8000
		bank.performData("ICICI", 1000, "Credit");//11000
		bank.performData("HDFC", 1000, "Debit");//4000
		bank.performData("ICICI", 1000, "Debit");//10000,Total is 10000+4000+8000+300=22300
		System.out.print("****************************\nTotal Balance : ");
		bank.totalBalance();
		System.out.println("\n\n**************Total Debit and Credit Operation**************");
		bank.operation();
		System.out.println("\n**************Individual Credit Operation**************");
		bank.individualBankCreditOperation();
		System.out.println("\n**************Individual Debit Operation**************");
		bank.individualBankDebitOperation();
	}
}
