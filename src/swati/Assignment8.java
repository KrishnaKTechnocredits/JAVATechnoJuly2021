package swati;
class Assignment8{
	
	int debit,credit,printBalance,currentBalance;
	static int totalDebit,totalCredit,totalPrintBalance;
	String userName;
	
	void setUserDetails(String uName,int initialBalance){
		userName=uName;
		currentBalance=initialBalance;
		
	}
	void debitAmmount(int debitAmmount){
		currentBalance=currentBalance-debitAmmount;
		debit++;
		totalDebit++;
	}
	
	void creditAmmount(int creditAmmount){
		currentBalance=currentBalance-creditAmmount;
		credit++;
		totalCredit++;
	}
	
	void printBalance(){
		System.out.println(userName+" Current Balance is:" + currentBalance);
		printBalance++;
		totalPrintBalance++;
	}
	
	void individualTransactionSummary(){
		
		System.out.println(userName+ " Transaction summary: Credit- "+credit+" Times,Debit- "+debit+" Times,PrintBalance- "+printBalance+" Times");
		
	}
	
	static void allTransactionSummary(){
		System.out.println("All transaction summary : Credit - "+totalCredit+" times, Debit - "+totalDebit+" times, printBalance - "+totalPrintBalance+" Time");
	}
	
	
	public static void main(String[] args){
		Assignment8 assignment8 =new Assignment8();
		Assignment8 assignment8_2 =new Assignment8();
		assignment8.setUserDetails("Swati",5000);
		assignment8.debitAmmount(500);
		assignment8.creditAmmount(500);
		assignment8.creditAmmount(500);
		assignment8.printBalance();
		assignment8.individualTransactionSummary();
		assignment8_2.setUserDetails("Krishna",8000);
		assignment8_2.debitAmmount(500);
		assignment8_2.debitAmmount(500);
		assignment8_2.creditAmmount(2000);
		assignment8_2.printBalance();
		assignment8_2.individualTransactionSummary();
		allTransactionSummary();
	}
}