package nishi;

public class Assignment8 {
	
	int debitCnt;
	int creditCnt;
	int balance1;
	int printBalanceCnt;
	static int debitCnt1;
	static int creditCnt1;
	static int printBalanceCnt1;
	
	String username1;
			
	void setUserDetails(String username,int balance){
		username1=username;
		balance1=balance;
	}
	
	void debitAmt()
	{
		debitCnt++;
		debitCnt1++;
	}
	
	void creditAmt()
	{
		creditCnt++;
		creditCnt1++;
	}
	
	void printBalance()
	{
		printBalanceCnt++;
		printBalanceCnt1++;
		System.out.println(username1+"'s Current Balance is : "+balance1);
	}
	
	void individualTransactionSummary()
	{
		System.out.println(username1+" transaction summary :"+ "Credit - "+creditCnt+" times, "
				+"Debit - "+debitCnt+" times"+", printBalance - "+printBalanceCnt+" times");
	}
	
	static void allTransactionSummary()
	{
		System.out.println("All transaction summary :"+ "Credit - "+creditCnt1+" times, "
				+"Debit - "+debitCnt1+" times"+", printBalance - "+printBalanceCnt1+" times");
	}	

	public static void main(String[] args) {
		Assignment8 assignment8_1 = new Assignment8();
		assignment8_1.setUserDetails("Nishi", 1000);
		assignment8_1.creditAmt();
		assignment8_1.creditAmt();
		assignment8_1.debitAmt();
		assignment8_1.printBalance();
		Assignment8 assignment8_2 = new Assignment8();
		assignment8_2.setUserDetails("Bharti", 2000);
		assignment8_2.creditAmt();
		assignment8_2.creditAmt();
		assignment8_2.creditAmt();
		assignment8_2.creditAmt();
		assignment8_2.creditAmt();
		assignment8_2.debitAmt();
		assignment8_2.debitAmt();
		assignment8_1.individualTransactionSummary();
		assignment8_2.individualTransactionSummary();
		Assignment8.allTransactionSummary();

	}
	
	

}
