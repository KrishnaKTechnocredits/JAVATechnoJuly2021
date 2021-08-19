package ankita;

public class Banksystem {
	  int debitcnt;
	 int creditcnt;
	 int printcnt;
	 public String customername;
	  public int amt;
	  static int Debitcnt;
	  static int Creditcnt;
	  static int Printcnt;
	 
	 
	 void setUserdetail(String custname,int initialBalance)
	 {
		 customername=custname;
		 System.out.println("UserName is "+ customername+" Initial Balance is "+initialBalance);
		 amt=initialBalance;
	 }
	 void debitamt(int a) 
	{
		if(a<=0) 
		{
			System.out.println("No balence can not Debit please add Amount first");
		}else 
		{
		  amt=amt-a;
		System.out.println("Debited amt is " +a);
		debitcnt=debitcnt+1;
		Debitcnt=Debitcnt+1;
		}
		
	}
	 void creditamt(int c) 
	 {
		 amt=amt+c;
		 System.out.println("credited amt is " +c);
		 creditcnt=creditcnt+1;
		 Creditcnt=Creditcnt+1;
		
	 }
	 
	 void printbal() 
	 {
		 System.out.println("current bal is "+amt);
		 printcnt=printcnt+1;
		 Printcnt=Printcnt+1;
	 }
	 void transacSummary()
	 {
		 
		 System.out.println("transaction summary credi "+creditcnt);
		 System.out.println("transaction summary debit "+debitcnt);
	 }
	 
	 void ShowalltransacSummary()
	 {
		 
		 System.out.println("all transaction summary credi "+Creditcnt);
		 System.out.println("all transaction summary debit "+Debitcnt);
	 }
	 
	public static void main(String[] args) {
		Banksystem banksystem= new Banksystem();
		banksystem.setUserdetail("AK",500);
		banksystem.debitamt(100);
		banksystem.creditamt(500);
		banksystem.debitamt(100);
		banksystem.debitamt(100);
		banksystem.creditamt(500);
		banksystem.printbal();
		banksystem.printbal();
		
		System.out.println("***************************************");
		
		Banksystem banksystem1= new Banksystem();
		banksystem1.setUserdetail("WK",400);
		banksystem1.debitamt(200);
		banksystem1.creditamt(100);
		banksystem1.debitamt(200);
		banksystem1.creditamt(100);
		banksystem1.printbal();
		banksystem1.printbal();
		
		System.out.println("***************************************");
		banksystem.transacSummary();
		banksystem1.transacSummary();
		banksystem1.ShowalltransacSummary();
	}
}
