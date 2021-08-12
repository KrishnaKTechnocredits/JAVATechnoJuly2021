package bhagyashree;

public class Assignment8 {
	
	int debitBalance;
	int creditBalance;
	int initialBalance;
	String custName;
	static int increament;
	static int increament1;
    static int currBalincreament;
	
	void setUserDetails(String username,int inibalance)
	{
		custName=username;
		initialBalance=inibalance;
	}
	
	void credit(int creditamt)
	{
		initialBalance=initialBalance+creditamt;
		increament=increament+1;
	}
	
	void debit(int debit)
	{
		initialBalance=initialBalance-debit;
		increament1=increament1+1;
	}
	
	void printCurrentBalance()
	{
		System.out.println("Current Balance for user "+custName+"   is:  "+initialBalance);	
		currBalincreament=currBalincreament+1;
		
	}
	
	void printAllTransactionSummary()
	{
		
		System.out.println("All Transaction Summary: "+"Credit:"+increament+"  Debit:"+increament1+"   Print Balance:"+currBalincreament);
		System.out.println("---------------------------------------------------------------------------------------");
	}
	
	public static void main(String[] args)
	{
		Assignment8 assignment8=new Assignment8();
		assignment8.setUserDetails("Bhagyashree",10000);
		assignment8.credit(5000);
		assignment8.credit(2000);
		assignment8.credit(5000);
		assignment8.debit(1000);
		assignment8.debit(10000);
		assignment8.printCurrentBalance();
		
		
		Assignment8 assignment8_1=new Assignment8();
		assignment8_1.setUserDetails("Jitendra",15000);
		assignment8_1.credit(5000);
		assignment8_1.credit(5000);
		assignment8_1.credit(2000);
		assignment8_1.debit(2000);
		assignment8_1.debit(1000);
		assignment8_1.printCurrentBalance();
		
		Assignment8 assignment8_2=new Assignment8();
		assignment8_2.printAllTransactionSummary();
		
	}

}
