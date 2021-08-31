/*A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
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
		 SBI bank Debit Operation - 2*/

package sushant;

public class Assignment_23 {
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
		Assignment_23 assignment_23=new Assignment_23();
		assignment_23.setBalance(1000,1000,1000,1000);
		assignment_23.showTotalbalance();
		assignment_23.personDebitOrCreditOnBank("ICICI","debit",100);
		assignment_23.personDebitOrCreditOnBank("ICICI","debit",100);
		assignment_23.personDebitOrCreditOnBank("HDFC","debit",100);
		assignment_23.personDebitOrCreditOnBank("HDFC","debit",100);
		assignment_23.personDebitOrCreditOnBank("SBI","debit",100);
		assignment_23.personDebitOrCreditOnBank("SBI","debit",100);
		assignment_23.personDebitOrCreditOnBank("BOB","debit",100);
		assignment_23.personDebitOrCreditOnBank("BOB","debit",100);
		assignment_23.showTotalbalance();
		assignment_23.personDebitOrCreditOnBank("ICICI","credit",200);
		assignment_23.personDebitOrCreditOnBank("ICICI","credit",200);
		assignment_23.personDebitOrCreditOnBank("HDFC","credit",200);
		assignment_23.personDebitOrCreditOnBank("HDFC","credit",200);
		assignment_23.personDebitOrCreditOnBank("SBI","credit",200);
		assignment_23.personDebitOrCreditOnBank("BOB","credit",200);
		assignment_23.personDebitOrCreditOnBank("BOB","credit",200);		
		assignment_23.showTotaldebitCreditOperations();
		assignment_23.showIndividualBankCreditOperation();
		assignment_23.showIndividualBankDebitOperation();
		assignment_23.showTotalbalance();
	}		
}