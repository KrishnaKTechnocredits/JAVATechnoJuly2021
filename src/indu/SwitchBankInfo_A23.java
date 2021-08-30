package indu;

public class SwitchBankInfo_A23 {
	static int iciciBalance = 50000;
	static int hdfcBalance = 10000;
	static int bobBalance = 30000;
	static int sbiBalance = 90000;
	int iciciCredit =0;
	int iciciDebit =0;
	int hdfcCredit =0;
	int hdfcDebit =0;
	int bobCredit =0;
	int bobDebit =0;
	int sbiCredit =0;
	int sbiDebit =0;
	void debitCreditinBank(String bankName , String operation ,int amt)
	{
		switch(bankName)
		{
			case "ICICI" :
				switch (operation)
				{
					case "debit":
						if (amt<=iciciBalance)
						{
							iciciBalance -= amt;
							System.out.println("Debited amount from "+bankName +" is : " +amt);
						}
						else
							System.out.println("Insufficient balance !!!");		
						iciciDebit++;
						break;
					case "credit":
						iciciBalance += amt;
						System.out.println("Credit amount in "+bankName +" is : " +amt);
						iciciCredit++;
						break;		
				}	
				System.out.println(bankName+" balance is : " + iciciBalance);
				break;
			case "HDFC" :
				switch (operation)
				{
					case "debit":
						if (amt<=hdfcBalance)
						{
							hdfcBalance -= amt;
							System.out.println("Debited amount from "+bankName +" is : " +amt);
						}
						else
							System.out.println("Insufficient balance !!!");			
						hdfcDebit++;
						break;
					case "credit":
						hdfcBalance += amt;
						System.out.println("Credit amount in "+bankName +" is : " +amt);
						hdfcCredit++;
						break;		
				}	
				System.out.println(bankName+" balance is : " + hdfcBalance);
				break;
			case "BOB" :
				switch (operation)
				{
					case "debit":
						if (amt<=bobBalance)
						{
							bobBalance -= amt;
							System.out.println("Debited amount from "+bankName +" is : " +amt);
						}
						else
							System.out.println("Insufficient balance !!!");	
							bobDebit++;
							break;
					case "credit":
						bobBalance += amt;
						System.out.println("Credit amount in "+bankName +" is : " +amt);
						bobCredit++;
						break;		
				}	
				System.out.println(bankName+" balance is : " + bobBalance);
				break;
			case "SBI" :
				switch (operation)
				{
					case "debit":
						if (amt<=sbiBalance)
						{
							sbiBalance -= amt;
							System.out.println("Debited amount from "+bankName +" is : " +amt);
						}
						else
							System.out.println("Insufficient balance !!!");					
						sbiDebit++;
						break;
					case "credit":
						sbiBalance += amt;
						System.out.println("Credit amount in "+bankName +" is : " +amt);
						sbiCredit++;
						break;		
				}	
				System.out.println(bankName+" balance is : " + sbiBalance);
				break;
			default:
				System.out.println("Invalid Bank Name");
		}	
	}
	
	void totalBalance()
	{
		System.out.println("Total Balance of all bank is : " +(iciciBalance+hdfcBalance+bobBalance+sbiBalance));
	}
	void totalCreditCount()
	{
		System.out.println("Total Credit operation from all  bank is : " +(iciciCredit+hdfcCredit+bobCredit+sbiCredit));
	}
	
	void totalDebitCount()
	{
		System.out.println("Total debit operation from all  bank is : " +(iciciDebit+hdfcDebit+bobDebit+sbiDebit));
	}
	
	void indivisualBankCreditOperation()
	{
		System.out.println("ICICI bank Credit Operation is :" +iciciCredit);
		System.out.println("HDFC bank Credit Operation is :" +hdfcCredit);
		System.out.println("BOB bank Credit Operation is :" +bobCredit);
		System.out.println("SBI bank Credit Operation is :" +sbiCredit);
	}
	
	void indivisualBankDebitOperation()
	{
		System.out.println("ICICI bank debit Operation is :" +iciciDebit);
		System.out.println("HDFC bank debit Operation is :" +hdfcDebit);
		System.out.println("BOB bank debit Operation is :" +bobDebit);
		System.out.println("SBI bank debit Operation is :" +sbiDebit);
	}
	
	public static void main(String[] arg)
	{
		SwitchBankInfo_A23 switchBankInfo_A23 = new SwitchBankInfo_A23();
		switchBankInfo_A23.debitCreditinBank("ICICI", "debit", 5000);
		switchBankInfo_A23.debitCreditinBank("ICICI", "credit", 15000);
		switchBankInfo_A23.debitCreditinBank("SBI", "credit", 5000);
		switchBankInfo_A23.debitCreditinBank("HDFC", "credit",55000);
		switchBankInfo_A23.debitCreditinBank("HDFC", "debit", 35000);
		switchBankInfo_A23.debitCreditinBank("BOB", "credit", 5000);
		switchBankInfo_A23.debitCreditinBank("BOB", "debit", 35000);
		switchBankInfo_A23.totalBalance();
		switchBankInfo_A23.totalCreditCount();
		switchBankInfo_A23.totalDebitCount();
		switchBankInfo_A23.indivisualBankCreditOperation();
		switchBankInfo_A23.indivisualBankDebitOperation();



	}
}
