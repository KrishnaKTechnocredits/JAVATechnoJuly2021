/* Assignment - 23 : 27th Aug'2021
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
                          	 SBI bank Debit Operation – 2
*/

package akanksha_Jain;

public class Assignment_23 {
	static int totalCreditCount, totalDebitCount;
	static int totalBalance;
	static int iciciCreditCount, hdfcCreditCount, bobCreditCount, sbiCreditCount;
	static int iciciDebitCount, hdfcDebitCount, bobDebitCount, sbiDebitCount;
	int totalICICIBal=10000, totalHDFCBal=15000, totalBOBBal=5000, totalSBIBal=50000;
	String operation, bankName;
	
	void getTotalBalance() {
		totalBalance = totalICICIBal + totalHDFCBal + totalBOBBal + totalSBIBal;
		System.out.println("Total balance of all accounts= " + totalBalance);
	}
	
	void getTotalCreditDebitCount() {
		System.out.println("Total credit operation- " + totalCreditCount + " times");
		System.out.println("Total debit operation- " + totalDebitCount + " times");
	}
	
	void getIndividualBankCreditCount() {
		System.out.println("ICICI bank credit operation- " + iciciCreditCount + " times");
		System.out.println("HDFC bank credit operation- " + hdfcCreditCount + " times");
		System.out.println("BOB bank credit operation- " + bobCreditCount + " times");
		System.out.println("SBI bank credit operation- " + sbiCreditCount + " times");
	}
	
	void getIndividualBankDebitCount() {
		System.out.println("ICICI bank debit operation- " + iciciDebitCount + " times");
		System.out.println("HDFC bank debit operation- " + hdfcDebitCount + " times");
		System.out.println("BOB bank debit operation- " + bobDebitCount + " times");
		System.out.println("SBI bank debit operation- " + sbiDebitCount + " times");
	}
	
	void callOperation(String operation, String bankName, int amount) {
		String operations = operation;
		String bAccountName = bankName;
		int amt = amount;
		switch(operations) {
		case "Credit":
			switch(bAccountName) {
			case "ICICI":
				totalICICIBal += amt;
				iciciCreditCount ++;
				totalCreditCount ++;
				break;
			case "HDFC":
				totalHDFCBal += amt;
				hdfcCreditCount ++;
				totalCreditCount ++;
				break;
			case "BOB":
				totalBOBBal += amt;
				bobCreditCount ++;
				totalCreditCount ++;
				break;
			case "SBI":
				totalSBIBal += amt;
				sbiCreditCount ++;
				totalCreditCount ++;
				break;
			default:
				System.out.println("Invalid");
			}
			break;
		case "Debit":
			switch(bAccountName) {
			case "ICICI":
				if(totalICICIBal>amt) {
					totalICICIBal -= amt;
					iciciDebitCount ++;
					totalDebitCount ++;
				}
				else 
					System.out.println("Not enough balance");
				break;
			case "HDFC":
				if(totalHDFCBal>amt) {
					totalHDFCBal -= amt;
					hdfcDebitCount ++;
					totalDebitCount ++;
				}
				else 
					System.out.println("Not enough balance");
				break;
			case "BOB":
				if(totalBOBBal>amt) {
					totalBOBBal -= amt;
					bobDebitCount ++;
					totalDebitCount ++;
				}
				else 
					System.out.println("Not enough balance");
				break;
			case "SBI":
				if(totalSBIBal>amt) {
					totalSBIBal -= amt;
					sbiDebitCount ++;
					totalDebitCount ++;
				}
				else 
					System.out.println("Not enough balance");
				break;
			default:
				System.out.println("Invalid");
			}	
		break;
		default:
			System.out.println("Invalid details");
		}
	}
	
	public static void main(String[] args) {
		Assignment_23 assignment_23 = new Assignment_23();
		assignment_23.callOperation("Credit", "ICICI", 4000);
		assignment_23.callOperation("Credit", "ICICI", 1000);
		assignment_23.callOperation("Debit", "ICICI", 3000);
		assignment_23.callOperation("Debit", "ICICI", 2000);
		assignment_23.callOperation("Credit", "HDFC", 2000);
		assignment_23.callOperation("Credit", "HDFC", 4000);
		assignment_23.callOperation("Debit", "HDFC", 1000);
		assignment_23.callOperation("Debit", "HDFC", 5000);
		assignment_23.callOperation("Credit", "BOB", 500);
		assignment_23.callOperation("Credit", "BOB", 5000);
		assignment_23.callOperation("Credit", "BOB", 1000);
		assignment_23.callOperation("Credit", "BOB", 2000);
		assignment_23.callOperation("Debit", "BOB", 5500);
		assignment_23.callOperation("Debit", "BOB", 1000);
		assignment_23.callOperation("Credit", "SBI", 5000);
		assignment_23.callOperation("Credit", "SBI", 500);
		assignment_23.callOperation("Credit", "SBI", 1000);
		assignment_23.callOperation("Credit", "SBI", 2000);
		assignment_23.callOperation("Credit", "SBI", 900);
		assignment_23.callOperation("Debit", "SBI", 1500);
		assignment_23.callOperation("Debit", "SBI", 1000);
		assignment_23.getTotalBalance();
		assignment_23.getTotalCreditDebitCount();
		assignment_23.getIndividualBankCreditCount();
		assignment_23.getIndividualBankDebitCount();
	}
}
