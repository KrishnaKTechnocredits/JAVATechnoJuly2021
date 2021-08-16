package anurag;

public class BankSystem {
	String userName;
	int amount;
	int debit;
	int credit;
	int printBalance;
	static int allDebit;
	static int allCredit;
	static int allPrintBalance;
	
	void setUserDetails(String name,int amt)
	{
		userName=name;
		amount = amt;
	}
	void debitAmount(int amt)
	{
		amount = amount - amt;
		debit++;
		allDebit++;
	}
	void creditAmount(int amt)
	{
		amount = amount + amt;
		credit++;
	    allCredit++;
	}
	void printBalance()
	{
		System.out.println("Current balance - " + amount);
	    printBalance++;
	    allPrintBalance++;
	}
	void individualTransactionSummary()
	{
		System.out.println("User name - " + userName + "||Debit Transaction -" + debit + 	"|| Credit Transaction - " +credit + "||Print balance -" +printBalance);
	}
    void allTransactionSummary()
    {
    	System.out.println("All Debit  - "+allDebit);
    	System.out.println("All Credit - "+allCredit);
    	System.out.println("All Print Balance - "+allPrintBalance);
    }
	public static void main(String []args)
    {
    	BankSystem b1 = new BankSystem();
		b1.setUserDetails("Anurag", 15000);
    	b1.debitAmount(1000);
		b1.debitAmount(2000);
		b1.creditAmount(3000);
		b1.creditAmount(3000);
		b1.printBalance();
		b1.individualTransactionSummary();
		BankSystem b2=new BankSystem();
		b2.setUserDetails("Kalpana", 20000);
		b2.debitAmount(1000);
		b2.debitAmount(2000);
		b2.debitAmount(2000);
		b2.creditAmount(3000);
		b2.creditAmount(3000);
		b2.individualTransactionSummary();
        BankSystem b3 = new BankSystem();
        b3.allTransactionSummary();
  

        
    }

}
