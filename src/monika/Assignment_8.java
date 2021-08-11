package monika;

class Assignment_8{
	
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
		Assignment_8 assignment_8_1 =new Assignment_8();
		Assignment_8 assignment_8_2 =new Assignment_8();
		assignment_8_1.setUserDetails("Monika",10000);
		assignment_8_1.debitAmmount(1500);
		assignment_8_1.creditAmmount(500);
		assignment_8_1.creditAmmount(1000);
		assignment_8_1.printBalance();
		assignment_8_1.individualTransactionSummary();
		assignment_8_2.setUserDetails("Rahul",15000);
		assignment_8_2.debitAmmount(2000);
		assignment_8_2.debitAmmount(500);
		assignment_8_2.creditAmmount(1000);
		assignment_8_2.printBalance();
		assignment_8_2.individualTransactionSummary();
		allTransactionSummary();
	}
}