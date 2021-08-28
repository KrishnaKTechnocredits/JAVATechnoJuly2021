/*
 Assignment - 23 : 27th Aug'2021
A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
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
 */

package monika;

public class Assignment_23 {

	int hdfcBalance = 10000, iciciBalance = 15000, sbiBalance = 20000, bobBalance = 25000;
	int hdfcDebitCount = 0, iciciDebitCount = 0, sbiDebitCount = 0, bobDebitCount = 0;
	int hdfcCreditCount = 0, iciciCreditCount = 0, sbiCreditCount = 0, bobCreditCount = 0;
	
	void debitOrCreditAmount(String bank,int amount,String operation) {
		
		switch(bank) {
		case "ICICI":
				switch(operation) {
				case "Debit":
						 	if(iciciBalance>amount) {
						 		iciciBalance-=amount;
						 		iciciDebitCount++;
						 	}
						 	else 
						 		System.out.println("Balance is not sufficient to perform Debit Operation");
						 		break;
				case "Credit":
						 	iciciBalance+=amount;
						 	iciciCreditCount++;
						 	break;
				}
				break;
		case "HDFC":
				switch(operation) {
				case "Debit":
					 		if(hdfcBalance>amount) {
					 			hdfcBalance-=amount;
					 			hdfcDebitCount++;
					 		}
					 		else 
					 			System.out.println("Balance is not sufficient to perform Debit Operation");
					 		break;
				case "Credit":
					 		hdfcBalance+=amount;
					 		hdfcCreditCount++;
					 		break;
				}
				break;
		case "SBI":
			switch(operation) {
			case "Debit":
					 	if(sbiBalance>amount) {
					 		sbiBalance-=amount;
					 		sbiDebitCount++;
					 	}
					 	else 
					 		System.out.println("Balance is not sufficient to perform Debit Operation");
					 	break;
			case "Credit":
					 	sbiBalance+=amount;
					 	sbiCreditCount++;
					 	break;
			}
			break;
		case "BOB":
			switch(operation) {
			case "Debit":
					 	if(bobBalance>amount) {
					 		bobBalance-=amount;
					 		bobDebitCount++;
					 	}
					 	else 
					 		System.out.println("Balance is not sufficient to perform Debit Operation");
					 		break;
			case "Credit":
					 	bobBalance+=amount;
					 	bobCreditCount++;
					 	break;
			}
			break;	
		}
	}

	void totalBalance() {
		System.out.println("Total Balance of all bank account is:"+(iciciBalance+hdfcBalance+sbiBalance+bobBalance));
	}
	void allTransaction() {
		System.out.println("Totl transaction in all bank account is:"+(iciciCreditCount+hdfcCreditCount+sbiCreditCount+bobCreditCount+iciciDebitCount+hdfcDebitCount+sbiDebitCount+bobDebitCount));
	}
	void totalDebitTransation() {
		System.out.println("Total Debit Transaction of ICICI bank is:"+iciciDebitCount);
		System.out.println("Total Debit Transaction of HDFC bank is:"+hdfcDebitCount);
		System.out.println("Total Debit Transaction of SBI bank is:"+sbiDebitCount);
		System.out.println("Total Debit Transaction of BOB bank is:"+bobDebitCount);
	}
	void totalCreditTransation() {
		System.out.println("Total Credit Transaction of ICICI bank is:"+iciciCreditCount);
		System.out.println("Total Credit Transaction of HDFC bank is:"+hdfcCreditCount);
		System.out.println("Total Credit Transaction of SBI bank is:"+sbiCreditCount);
		System.out.println("Total Credit Transaction of BOB bank is:"+bobCreditCount);
	}
	public static void main(String[] args) {
		Assignment_23 assignment_23= new Assignment_23();
		assignment_23.debitOrCreditAmount("ICICI",1000,"Debit");
		assignment_23.debitOrCreditAmount("HDFC",500,"Credit");
		assignment_23.debitOrCreditAmount("BOB",150,"Debit");
		assignment_23.debitOrCreditAmount("SBI",190,"Credit");
		assignment_23.debitOrCreditAmount("ICICI",590,"Debit");
		assignment_23.debitOrCreditAmount("ICICI",700,"Credit");
		assignment_23.debitOrCreditAmount("BOB",950,"Credit");
		assignment_23.debitOrCreditAmount("HDFC",400,"Credit");
		assignment_23.debitOrCreditAmount("SBI",800,"Debit");
		assignment_23.debitOrCreditAmount("ICICI",300,"Credit");
		assignment_23.debitOrCreditAmount("HDFC",100,"Debit");
		assignment_23.debitOrCreditAmount("SBI",200,"Debit");
		assignment_23.debitOrCreditAmount("ICICI",300,"Credit");
		assignment_23.debitOrCreditAmount("BOB",100,"Credit");
		assignment_23.totalBalance();
		assignment_23.allTransaction();
		assignment_23.totalCreditTransation();
		assignment_23.totalDebitTransation();
		
		
				
		
	}
}