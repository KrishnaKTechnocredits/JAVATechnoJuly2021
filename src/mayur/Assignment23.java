/*
 * A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
          a) Person can debit or credit amount from respective bank.
              Hint : Switch case is expected here. [Please watch today's recording again, in case of confusion.]

          b) A Method to show total balance [ICICI balance + HDFC balance + BOB balance + SBI Balance]

          c) A Method to show total credit, debit operations 
                 output : Total credit operation - 7 times
                              Total debit operation - 5 times

         d) A Method to show individual bank credit operations.
                output : ICICI bank Credit Operation - 2
                         HDFC bank Credit Operation - 2
		                 SBI bank Credit Operation - 1
                         BOB bank Credit Operation - 4
                         SBI bank Credit Operation - 4


         e) A Method to show individual bank debit operations.
                output : ICICI bank Debit Operation - 2
                         HDFC bank Debit Operation - 2
 BOB bank Debit Operation - 2
		 SBI bank Debit Operation - 2
 * 
 */


package mayur;

public class Assignment23 {
	
	double iciciBalance;
	double hdfcBalance;
	double bobBalance;
	double sbiBalance;
	int iciciDebitAmt;
	int iciciCreditAmt;
	int hdfcDebitAmt;
	int hdfcCreditAmt;
	int bobDebitAmt;
	int bobCreditAmt;
	int sbiDebitAmt;
	int sbiCreditAmt;
	
	void setBalance(double icici_Balance,double hdfc_Balance,double bob_Balance,double sbi_Balance) {
		iciciBalance=icici_Balance;
		hdfcBalance=hdfc_Balance;
		bobBalance=bob_Balance;
		sbiBalance=sbi_Balance;
		
	}
	void showTotalCreditOrDebitOperations(String bankName,String debitOrcredit,double amount )
	{
		switch(bankName)
		{
			case "ICICI":
			{
				switch(debitOrcredit)
				{
				case "debit":
					if(iciciBalance>amount)
					{
					iciciBalance-=amount;
					iciciDebitAmt++;
					}
					break;
				case "credit":
					iciciBalance+=amount;
					iciciCreditAmt++;
					break;
				default :
					System.out.println("It is not correct");

				}
			}
			break;
			case "HDFC":
			{
				switch(debitOrcredit)
				{
				case "debit":
					if(hdfcBalance>amount)
					{
					hdfcBalance-=amount;
					hdfcDebitAmt++;
					}
					break;
				case "credit":
					hdfcBalance+=amount;
					hdfcCreditAmt++;
					break;
				default :
					System.out.println("It is not correct");

				}
			}
			break;
			case "BOB":
			{
				switch(debitOrcredit)
				{
				case "debit":
					if(bobBalance>amount)
					{
					bobBalance-=amount;
					bobDebitAmt++;
					}
					break;
				case "credit":
					bobBalance+=amount;
					bobCreditAmt++;
					break;
				default :
					System.out.println("Corrct option is not selected");

				}
			}
			break;
			case "SBI":
			{
				switch(debitOrcredit)
				{
				case "debit":
					if(sbiBalance>amount)
					{
					sbiBalance-=amount;
					sbiDebitAmt++;
					}
					break;
				case "credit":
					sbiBalance+=amount;
					sbiCreditAmt++;
					break;
				default :
					System.out.println("It is not correct");

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
		int totalCredit = iciciCreditAmt+hdfcCreditAmt+bobCreditAmt+sbiCreditAmt;
		int totalDebit=iciciDebitAmt+hdfcDebitAmt+bobDebitAmt+sbiDebitAmt;
		System.out.println("Total credit operation-"+totalCredit);
		System.out.println("Total debit operation-"+totalDebit);
	}

	void showIndividualBankCreditOperation()
	{
		System.out.println("ICICI bank Credit Operation-"+iciciCreditAmt);
		System.out.println("HDFC bank Credit Operation-"+hdfcCreditAmt);
		System.out.println("BOB bank Credit Operation-"+bobCreditAmt);
		System.out.println("SBI bank Credit Operation-"+sbiCreditAmt);
	}

	void showIndividualBankDebitOperation()
	{
		System.out.println("ICICI bank Debit Operation-"+iciciDebitAmt);
		System.out.println("HDFC bank Debit Operation-"+hdfcDebitAmt);
		System.out.println("BOB bank Debit Operation-"+bobDebitAmt);
		System.out.println("SBI bank Debit Operation-"+sbiDebitAmt);
	}

	public static void main(String[] args) {
		Assignment23 assignment23=new Assignment23();
		assignment23.setBalance(1000,1000,1000,1000);
		assignment23.showTotalbalance();
		assignment23.showTotalCreditOrDebitOperations("ICICI","debit",100);
		assignment23.showTotalCreditOrDebitOperations("ICICI","debit",100);
		assignment23.showTotalCreditOrDebitOperations("HDFC","debit",100);
		assignment23.showTotalCreditOrDebitOperations("HDFC","debit",100);
		assignment23.showTotalCreditOrDebitOperations("SBI","debit",100);
		assignment23.showTotalCreditOrDebitOperations("SBI","debit",100);
		assignment23.showTotalCreditOrDebitOperations("BOB","debit",100);
		assignment23.showTotalCreditOrDebitOperations("BOB","debit",100);
		assignment23.showTotalbalance();
		assignment23.showTotalCreditOrDebitOperations("ICICI","credit",200);
		assignment23.showTotalCreditOrDebitOperations("ICICI","credit",200);
		assignment23.showTotalCreditOrDebitOperations("HDFC","credit",200);
		assignment23.showTotalCreditOrDebitOperations("HDFC","credit",200);
		assignment23.showTotalCreditOrDebitOperations("SBI","credit",200);
		assignment23.showTotalCreditOrDebitOperations("BOB","credit",200);
		assignment23.showTotalCreditOrDebitOperations("BOB","credit",200);		
		assignment23.showTotaldebitCreditOperations();
		assignment23.showIndividualBankCreditOperation();
		assignment23.showIndividualBankDebitOperation();
		assignment23.showTotalbalance();
	}		
	

}
