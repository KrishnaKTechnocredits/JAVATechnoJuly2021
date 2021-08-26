package shalaka.staticnonstatic;

public class BankingSystem_Assignment8 {
	String UserName;
	int balance;
	int debitCnt;
	int creditCnt;
	int printBalance;
	static int debitCntAll;
	static int creditCntAll;
	static int printBalanceAll;
	static int currentBalance=0;
	void setUserDetails(String username,int initialBal) {
		UserName=username;
		balance=initialBal;
		}
		
	void debitAmount(int debit) {
		currentBalance=balance-debit;
		debitCnt++;
		debitCntAll++;
	}
	
	void creditAmount(int credit) {
		currentBalance=currentBalance+credit;
		creditCnt++;
		creditCntAll++;
	}
	
	void PrintBalance() {
		//System.out.println("Current Balance is "+ currentBalance);
		printBalance++;
		printBalanceAll++;
	}
	
	void individualTransactionSummary() {
		System.out.println(UserName+" transaction Summery: credit- "+creditCnt+" times, "+" debit-"+debitCnt+" times, "+" printBalance "+printBalance);
	}
	
	void allIndividualTransactionSummary() {
		System.out.println("All transaction summery: credit- "+creditCntAll+" times, "+" debit-"+debitCntAll+" times, "+" printBalance "+printBalanceAll);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankingSystem_Assignment8 bankingSystem_Assignment8 = new BankingSystem_Assignment8();
		bankingSystem_Assignment8.setUserDetails("shalaka",10000);
		bankingSystem_Assignment8.debitAmount(1000);
		bankingSystem_Assignment8.creditAmount(2000);
		bankingSystem_Assignment8.creditAmount(2000);
		bankingSystem_Assignment8.PrintBalance();
		bankingSystem_Assignment8.individualTransactionSummary();
		BankingSystem_Assignment8 bankingSystem_Assignment8a = new BankingSystem_Assignment8();
		bankingSystem_Assignment8a.setUserDetails("shweta",20000);
		bankingSystem_Assignment8a.creditAmount(1000);
		bankingSystem_Assignment8a.creditAmount(2000);
		bankingSystem_Assignment8a.creditAmount(3000);
		bankingSystem_Assignment8a.creditAmount(1000);
		bankingSystem_Assignment8a.creditAmount(1000);
		bankingSystem_Assignment8a.debitAmount(2000);
		bankingSystem_Assignment8a.individualTransactionSummary();
		bankingSystem_Assignment8.allIndividualTransactionSummary();
	}

}
