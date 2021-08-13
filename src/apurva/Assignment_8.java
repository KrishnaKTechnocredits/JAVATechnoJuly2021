package apurva;
public class Assignment_8{
	int creditCount;
	int debitCount;
	int current_balance=1000000;
	int printCount;
	static int debitCnt;
	static int creditCnt;
	static int printCnt;
	
	void creditAmount(int creditedAmount){
		current_balance	= current_balance + creditedAmount;
		creditCount++;
		creditCnt++;
	}
	
	void debitAmount(int debitedAmount){
		current_balance = current_balance - debitedAmount;
		debitCount++;
		debitCnt++;
	}
	
	
	void printBalance(){
		
		System.out.println( "Current balance is :" +current_balance );
		printCount++;
		printCnt++;
	}
	
	void individualTransactionSummary(String name){
		System.out.println( name + " transaction summary: " + "Credit-" +creditCount + " times, " + "Debit-" + debitCount + " time, " + "printBalance- " + printCount + " time");
		
	}
	
	static void allTransactionSummary(){
		System.out.println( "All transaction summary: " + "Credit- " +creditCnt + " times," + "Debit- "+ debitCnt + " times, " + "printBalance- " +printCnt +" times");
		
	}
	
	public static void main(String[] a){
		Assignment_8 assign = new Assignment_8();
		Assignment_8 assign1 = new Assignment_8();
		assign.debitAmount(2000);
		assign.creditAmount(3000);
		assign.creditAmount(2000);
		assign.printBalance();
		assign.individualTransactionSummary("User1");
		System.out.println("------------------------------------");
		assign1.creditAmount(1000);
		assign1.creditAmount(10);
		assign1.creditAmount(30);
		assign1.creditAmount(500);
		assign1.creditAmount(200);
		assign1.debitAmount(500);
		assign1.debitAmount(1000);
		assign1.individualTransactionSummary("User2");
		System.out.println("------------------------------------");
		assign.allTransactionSummary();	
		
	}
}