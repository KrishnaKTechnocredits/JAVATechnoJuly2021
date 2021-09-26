package margi;

class Assignment_8_BankingSystem{
	
	int initialBalance, debitCnt, creditCnt, printCnt;
	static int totalDebitCnt, totalCreditCnt, totalPrintCnt;
	String userName;
	
	void setDetails(String uName, int initBalance){
		userName = uName;
		initialBalance = initBalance;
	}
	
	void debitCount(int debit){
		initialBalance = initialBalance - debit;
		debitCnt++;
		totalDebitCnt++;
	}
	
	void creditCount(int credit){
		initialBalance = initialBalance + credit;
		creditCnt++;
		totalCreditCnt++;
	}
	
	void printBalance(){
		System.out.println("Current Balance of " + userName + " is: " + initialBalance);
		printCnt++;
		totalPrintCnt++;
	}
	
	void individualTransactionSummary(){
		System.out.println(userName + " transaction summary : Credit : " + creditCnt + " times, Debit : " + debitCnt + " times, printBalance : " + printCnt);
	}
	
	void allTransactionSummary(){
		System.out.println("All transaction summary : Credit : " + totalCreditCnt + " times, Debit : " + totalDebitCnt + " times, printBalance : " + totalPrintCnt);
	}
	
	public static void main(String[] args){
		Assignment_8_BankingSystem bankSystem_1 = new Assignment_8_BankingSystem();
		Assignment_8_BankingSystem bankSystem_2 = new Assignment_8_BankingSystem();
		bankSystem_1.setDetails("Margi",15000);
		bankSystem_1.creditCount(1000);
		bankSystem_1.debitCount(500);
		bankSystem_1.creditCount(3000);
		bankSystem_1.printBalance();
		bankSystem_1.individualTransactionSummary();
		bankSystem_2.setDetails("Janki",4500);
		bankSystem_2.creditCount(500);
		bankSystem_2.creditCount(6000);
		bankSystem_2.debitCount(10000);
		bankSystem_2.creditCount(2000);
		bankSystem_2.creditCount(1500);
		bankSystem_2.creditCount(1000);
		bankSystem_2.debitCount(4000);
		bankSystem_2.individualTransactionSummary();
		bankSystem_2.allTransactionSummary();
	}
}