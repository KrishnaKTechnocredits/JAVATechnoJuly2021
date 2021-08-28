/*Assignment - 23 : 27th Aug'2021

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
		 				 SBI bank Debit Operation - 2*/
 
package ritabrata;
  
public class Assignment23 {
	String bankName;
	int balICICI=1000, balHDFC=1000, balBOB=1000, balSBI=1000;
	int debitCountICICI=0, debitCountHDFC=0, debitCountBOB=0, debitCountSBI=0;
	int creditCountICICI=0, creditCountHDFC=0, creditCountBOB=0, creditCountSBI=0;
	static int totalCrCnt, totalDrCnt;
	void bankTxn(int choice, String optrn, int amt) {
		switch(choice) {
		case 1:{
			bankName="ICICI";
			if(optrn=="Credit") {
				balICICI= balICICI+amt;
				creditCountICICI++;
				totalCrCnt++;	
			}
			else if (optrn=="Debit") {
				balICICI= balICICI-amt;
				debitCountICICI++;
				totalDrCnt++;
			}
			break;
		
		}
		case 2:{
			bankName="HDFC";
			if(optrn=="Credit") {
				balHDFC= balHDFC+amt;
				creditCountHDFC++;
				totalCrCnt++;	
			}
			else if (optrn=="Debit") {
				balHDFC= balHDFC-amt;
				debitCountHDFC++;
				totalDrCnt++;
			}
			break;
		}
		case 3:{
			bankName="BOB";
			if(optrn=="Credit") {
				balBOB= balBOB+amt;
				creditCountBOB++;
				totalCrCnt++;	
			}
			else if (optrn=="Debit") {
				balBOB= balBOB-amt;
				debitCountBOB++;
				totalDrCnt++;
			}
			break;
		}
		case 4:{
			bankName="SBI";
			if(optrn=="Credit") {
				balSBI= balSBI+amt;
				creditCountSBI++;
				totalCrCnt++;	
			}
			else if (optrn=="Debit") {
				balSBI= balSBI-amt;
				debitCountSBI++;
				totalDrCnt++;
			}
			break;
		}
		}
	}
	
	void totalBal() {
		int totalBal;
		totalBal= balICICI+balHDFC+balBOB+balSBI;
		System.out.println("Total balance amount including all the bank accounts are: "+totalBal);
	}
	
	void totalCrDrCount() {
		System.out.println("Total no of credit operation done: "+totalCrCnt+" times");
		System.out.println("Total no of debit operation done: "+totalDrCnt+" times");
	}
	
	void individualCrCount() {
		if(creditCountICICI>0)
			System.out.println("Total no of credit operation done for ICICI: "+creditCountICICI+" times");
		if(creditCountHDFC>0)
			System.out.println("Total no of credit operation done for HDFC: "+creditCountHDFC+" times");
		if(creditCountBOB>0)
			System.out.println("Total no of credit operation done for BOB: "+creditCountBOB+" times");
		if(creditCountSBI>0)
			System.out.println("Total no of credit operation done for SBI: "+creditCountSBI+" times");
	}
	
	void individualDrCount() {
		if (debitCountICICI>0)
			System.out.println("Total no of debit operation done for ICICI: "+debitCountICICI+" times");
		if (debitCountHDFC>0)
			System.out.println("Total no of debit operation done for HDFC: "+debitCountHDFC+" times");
		if (debitCountBOB>0)
			System.out.println("Total no of debit operation done for BOB: "+debitCountBOB+" times");
		if (debitCountSBI>0)
			System.out.println("Total no of debit operation done for SBI: "+debitCountSBI+" times");
	}
	
	public static void main(String[] args) {
		Assignment23 switchCase= new Assignment23();
		switchCase.bankTxn(1, "Credit", 2500);
		switchCase.bankTxn(1, "Credit", 5500);
		
		switchCase.bankTxn(2, "Credit", 4500);
		switchCase.bankTxn(2, "Credit", 3000);
		
		switchCase.bankTxn(4, "Credit", 12500);
		
		switchCase.bankTxn(3, "Credit", 1500);
		switchCase.bankTxn(3, "Credit", 2000);
		switchCase.bankTxn(3, "Credit", 1700);
		switchCase.bankTxn(3, "Credit", 2100);
		
		switchCase.bankTxn(4, "Credit", 1250);
		switchCase.bankTxn(4, "Credit", 1200);
		switchCase.bankTxn(4, "Credit", 2500);
		switchCase.bankTxn(4, "Credit", 3500);
		
		switchCase.bankTxn(1, "Debit", 1500);
		switchCase.bankTxn(1, "Debit", 1342);
		switchCase.bankTxn(2, "Debit", 2345);
		switchCase.bankTxn(2, "Debit", 2300);
		switchCase.bankTxn(3, "Debit", 2345);
		switchCase.bankTxn(3, "Debit", 1000);
		switchCase.bankTxn(4, "Debit", 5000);
		switchCase.bankTxn(4, "Debit", 1235);
		
		
		
		switchCase.totalBal();
		System.out.println("------------------------------------");
		switchCase.totalCrDrCount();
		System.out.println("------------------------------------");
		switchCase.individualCrCount();
		System.out.println("------------------------------------");
		switchCase.individualDrCount();
	}

}
