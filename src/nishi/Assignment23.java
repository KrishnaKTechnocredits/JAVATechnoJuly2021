package nishi;

public class Assignment23 {
	double iciciBalance;
	double hdfcBalance;
	double bobBalance;
	double sbiBalance;
	int iciciDebitCnt;
	int iciciCreditCnt;
	int hdfcDebitCnt;
	int hdfcCreditCnt;
	int bobDebitCnt;
	int bobCreditCnt;
	int sbiDebitCnt;
	int sbiCreditCnt;
	
	void setBalance(double iciciBalance1,double hdfcBalance1,double bobBalance1,double sbiBalance1)
	{
		iciciBalance=iciciBalance1;
		hdfcBalance=hdfcBalance1;
		bobBalance=bobBalance1;
		sbiBalance=sbiBalance1;
	}
	
	void personDebitOrCreditOnBank(String bankName,String debitOrCredit,double amount)
	{
		switch(bankName)
		{
			case "ICICI":
			{
				switch(debitOrCredit)
				{
				case "debit":
					if(iciciBalance>amount)
					{
					iciciBalance-=amount;
					iciciDebitCnt++;
					}
					break;
				case "credit":
					iciciBalance+=amount;
					iciciCreditCnt++;
					break;
				default :
					System.out.println("Corrct option is not selected");
					
				}
			}
			break;
			case "HDFC":
			{
				switch(debitOrCredit)
				{
				case "debit":
					if(hdfcBalance>amount)
					{
					hdfcBalance-=amount;
					hdfcDebitCnt++;
					}
					break;
				case "credit":
					hdfcBalance+=amount;
					hdfcCreditCnt++;
					break;
				default :
					System.out.println("Corrct option is not selected");
					
				}
			}
			break;
			case "BOB":
			{
				switch(debitOrCredit)
				{
				case "debit":
					if(bobBalance>amount)
					{
					bobBalance-=amount;
					bobDebitCnt++;
					}
					break;
				case "credit":
					bobBalance+=amount;
					bobCreditCnt++;
					break;
				default :
					System.out.println("Corrct option is not selected");
					
				}
			}
			break;
			case "SBI":
			{
				switch(debitOrCredit)
				{
				case "debit":
					if(sbiBalance>amount)
					{
					sbiBalance-=amount;
					sbiDebitCnt++;
					}
					break;
				case "credit":
					sbiBalance+=amount;
					sbiCreditCnt++;
					break;
				default :
					System.out.println("Corrct option is not selected");
					
				}
			}
			break;
			default:
				System.out.println("Bank Name is wrong");		
		}
	}
	
	void showTotalbalance()
	{
		double total = iciciBalance+hdfcBalance+bobBalance+sbiBalance;
		System.out.println("Total Balance is "+total);
	}
	
	void showTotaldebitCreditOperations()
	{
		int totalCredit = iciciCreditCnt+hdfcCreditCnt+bobCreditCnt+sbiCreditCnt;
		int totalDebit=iciciDebitCnt+hdfcDebitCnt+bobDebitCnt+sbiDebitCnt;
		System.out.println("Total credit operation-"+totalCredit);
		System.out.println("Total debit operation-"+totalDebit);
	}
	
	void showIndividualBankCreditOperation()
	{
		System.out.println("ICICI bank Credit Operation-"+iciciCreditCnt);
		System.out.println("HDFC bank Credit Operation-"+hdfcCreditCnt);
		System.out.println("BOB bank Credit Operation-"+bobCreditCnt);
		System.out.println("SBI bank Credit Operation-"+sbiCreditCnt);
	}
	
	void showIndividualBankDebitOperation()
	{
		System.out.println("ICICI bank Debit Operation-"+iciciDebitCnt);
		System.out.println("HDFC bank Debit Operation-"+hdfcDebitCnt);
		System.out.println("BOB bank Debit Operation-"+bobDebitCnt);
		System.out.println("SBI bank Debit Operation-"+sbiDebitCnt);
	}
	
	public static void main(String[] args) {
		Assignment23 assignment23=new Assignment23();
		assignment23.setBalance(1000,1000,1000,1000);
		assignment23.showTotalbalance();
		assignment23.personDebitOrCreditOnBank("ICICI","debit",100);
		assignment23.personDebitOrCreditOnBank("ICICI","debit",100);
		assignment23.personDebitOrCreditOnBank("HDFC","debit",100);
		assignment23.personDebitOrCreditOnBank("HDFC","debit",100);
		assignment23.personDebitOrCreditOnBank("SBI","debit",100);
		assignment23.personDebitOrCreditOnBank("SBI","debit",100);
		assignment23.personDebitOrCreditOnBank("BOB","debit",100);
		assignment23.personDebitOrCreditOnBank("BOB","debit",100);
		assignment23.showTotalbalance();
		assignment23.personDebitOrCreditOnBank("ICICI","credit",200);
		assignment23.personDebitOrCreditOnBank("ICICI","credit",200);
		assignment23.personDebitOrCreditOnBank("HDFC","credit",200);
		assignment23.personDebitOrCreditOnBank("HDFC","credit",200);
		assignment23.personDebitOrCreditOnBank("SBI","credit",200);
		assignment23.personDebitOrCreditOnBank("BOB","credit",200);
		assignment23.personDebitOrCreditOnBank("BOB","credit",200);		
		assignment23.showTotaldebitCreditOperations();
		assignment23.showIndividualBankCreditOperation();
		assignment23.showIndividualBankDebitOperation();
		assignment23.showTotalbalance();
	}		
}
