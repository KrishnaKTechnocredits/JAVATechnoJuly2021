package indu;

public class Assignment_8 {

		
	static int totalDebitAmtCount;
	static int totalCreditAmtCount;
	static int totalPrintBalanceCount;
	int debitAmountCount;
	int creditAmountCount;
	String name ;
	int currentBalance;
	int printBalanceCount;
	
	void setUserDetails(String userName , int balanceAmt)
	{
		name = userName;
		currentBalance = balanceAmt;
		System.out.println("User Name :" +userName + " Balance Amount :" +balanceAmt);
	}
	
	void debitAmount(int debAmt)
	{
		currentBalance = currentBalance - debAmt;
		System.out.println("Debited Amount : " + debAmt);
		debitAmountCount++;
		totalDebitAmtCount++;
	}
	
	void creditAmount(int creAmt)
	{
		
		currentBalance = currentBalance + creAmt;
		System.out.println("Credited Amount : " + creAmt);
		creditAmountCount++;
		totalCreditAmtCount++;
		
	}
	
	void printCurrentBalance()
	{
		System.out.println("Current Balance : " + currentBalance);
		printBalanceCount++;
		totalPrintBalanceCount++;
	}
	
	void userTranscationSummary()
	{
		System.out.println(name +" transcation summary : Debit - " + debitAmountCount+" times "
							+ ", Credit -" + creditAmountCount + " times , PrintBalance - " + printBalanceCount + " times .");
		
	}
	
	static void totalTranscationSummary()
	{
		System.out.println( "All Transcation summary : Debit - " + totalDebitAmtCount+" times "
							+ ", Credit -" + totalCreditAmtCount + " times , PrintBalance - " + totalPrintBalanceCount + " times .");
		
	}
	
	public static void main(String[] arg)
	{
		
		Assignment_8 assignment_8_1 = new Assignment_8();
        Assignment_8 assignment_8_2 = new Assignment_8();
        
		assignment_8_1.setUserDetails("Meher",50000);
		assignment_8_1.debitAmount(2000);
		assignment_8_1.debitAmount(3000);
		assignment_8_1.debitAmount(5000);
		assignment_8_1.printCurrentBalance();
		assignment_8_1.creditAmount(5000);
		assignment_8_1.creditAmount(3000);
		assignment_8_1.printCurrentBalance();
		
		assignment_8_2.setUserDetails("Misti",30000);
		assignment_8_2.creditAmount(10000);
		assignment_8_2.creditAmount(5000);
		assignment_8_2.printCurrentBalance();
		
		assignment_8_1.userTranscationSummary();
		assignment_8_2.userTranscationSummary();
		totalTranscationSummary();
		
	}
	
}
