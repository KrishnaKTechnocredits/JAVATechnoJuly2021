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


package bhaktiAssignment_23;

public class SwichAssignment_23 {
	int creditCountICICI=0;
	int debitCountICICI=0;
	float balanceICICI=1000;
	
	int creditCountHDFC=0;
	int debitCountHDFC=0;
	float balanceHDFC=1000;
	
	int creditCountBOB=0;
	int debitCountBOB=0;
	float balanceBOB=1000;
	
	int creditCountSBI=0;
	int debitCountSBI=0;
	float balanceSBI=1000;
	//a Person can debit or credit amount from respective bank.
	void opration (String opration, String bank, float amount) {
		
		if (opration.equals("Credit")) {
				
				switch(bank) {
				case "ICICI":
					creditCountICICI++;
					balanceICICI+=amount;
					break;
				case "HDFC":
					creditCountHDFC++;
					balanceHDFC+=amount;
					break;
				case "BOB":
					creditCountBOB++;
					balanceBOB+=amount;
					break;
				case"SBI":	
					creditCountSBI++;
					balanceSBI+=amount;
					break;
				default:
					System.out.println("Not valid bank");
		}
		}else if (opration.equals("Debit")) {
			
				switch(bank) {
				case "ICICI":
					debitCountICICI++;
					balanceICICI-=amount;
					break;
				case "HDFC":
					debitCountHDFC++;
					balanceHDFC-=amount;
					break;
				case "BOB":
					debitCountBOB++;
					balanceBOB-=amount;
					break;
				case"SBI":	
					debitCountSBI++;
					balanceSBI-=amount;
					break;
				default:
					System.out.println("Not valid bank");
			  }		
		}else
			System.out.println("Invalid opration ");
		
	}
	
	void debit(String bank, float amount) {
		switch(bank) {
		case "ICICI":
			debitCountICICI++;
			balanceICICI-=amount;
			break;
		case "HDFC":
			debitCountHDFC++;
			balanceHDFC-=amount;
			break;
		case "BOB":
			debitCountBOB++;
			balanceBOB-=amount;
			break;
		case"SBI":	
			debitCountSBI++;
			balanceSBI-=amount;
			break;
		default:
			System.out.println("Not valid bank");
	  }
		
	}
	// b) A Method to show total balance [ICICI balance + HDFC balance + BOB balance + SBI Balance]
	void displayTotalBalance() {
		System.out.println("Balance of ICICI bank is: "+balanceICICI);
		System.out.println("Balance of HDFC bank is: "+balanceHDFC);
		System.out.println("Balance of BOB bank is: "+balanceBOB);
		System.out.println("Balance of SBI bank is: "+balanceSBI);
		System.out.println("");
		
	}
	//c)  A Method to show total credit, debit operations 
	void showTotalCreditDebitCount() {
		
		System.out.println("Total Debit count: " +(debitCountICICI+ debitCountHDFC +debitCountBOB +debitCountSBI));
		System.out.println("Total Credit count: " +(creditCountICICI+ creditCountHDFC + creditCountBOB + creditCountSBI));
		System.out.println("");
		
	}
	
	//d) A Method to show individual bank credit operations.
	void showCreditCuontindivual() {
		System.out.println("Total Credit count of ICICI : " +creditCountICICI);
		System.out.println("Total Credit count of HDFC: " + creditCountHDFC);
		System.out.println("Total Credit count of BOB: " + creditCountBOB );
		System.out.println("Total Credit count of SBI: " + creditCountSBI);
		System.out.println("");
		
	}
	//e) A Method to show individual bank credit operations.
		void showDebitCuontindivual() {
			System.out.println("Total Debit count of ICICI : " +debitCountICICI);
			System.out.println("Total Debit count of HDFC: " + debitCountHDFC);
			System.out.println("Total Debit count of BOB: " + debitCountBOB );
			System.out.println("Total Debit count of SBI: " + debitCountSBI);
			System.out.println("");
			
		}
	
	public static void main (String[] gh) {
		SwichAssignment_23 swichAssignment_23= new SwichAssignment_23();
		swichAssignment_23.opration("Credit", "ICICI", 234.0f);
		swichAssignment_23.opration("Credit", "SBI", 700.0f);
		swichAssignment_23.opration("Debit", "ICICI", 100);
		swichAssignment_23.displayTotalBalance();
		swichAssignment_23.showTotalCreditDebitCount();
		swichAssignment_23.showCreditCuontindivual();
		swichAssignment_23.showDebitCuontindivual();
		
		
	}

}
