package avinash.assignment23;

public class Assignment23 {
	int totalBalance;
	int intialICICIBal,initialHDFCBal,initialBOBBal,intialSBIBal;
	static String username;
	static int totalCreditCnt;
	static int totalDebitCnt;
	
	void setUserDetails(String customerName,int ICICIBal,int HDFCBal,int BOBBal,int SBIBal) {
		username = customerName;
		intialICICIBal = ICICIBal;
		initialHDFCBal = HDFCBal;
		initialBOBBal = BOBBal;
		intialSBIBal = SBIBal;		
	}
	
	int printTotalBalance(){
		
		totalBalance = intialICICIBal + initialHDFCBal + initialBOBBal + intialSBIBal;
		return totalBalance;	
	}
	
	void individualCreditBal(String bankName,int creditCount) {
		switch(bankName) {
		case "ICICI":
			System.out.println("ICICI bank Credit Operation - " + creditCount);
			break;

		case "HDFC":
			System.out.println("HDFC bank Credit Operation - " + creditCount);
			break;

		case "BOB":
			System.out.println("BOB bank Credit Operation - " + creditCount);
			break;

		case "SBI":
			System.out.println("SBI bank Credit Operation - " + creditCount);
			break;
		default:
			
		}
		totalCreditCnt +=creditCount;
	}
	
	
	
	void individualDebitBal(String bankName,int debitCount) {
		switch(bankName) {
		case "ICICI":
			System.out.println("ICICI bank Debit Operation - " + debitCount);
			break;

		case "HDFC":
			System.out.println("HDFC bank Debit Operation - " + debitCount);
			break;

		case "BOB":
			System.out.println("BOB bank Debit Operation - " + debitCount);
			break;

		case "SBI":
			System.out.println("SBI bank Debit Operation - " + debitCount);
			break;
		default:
			
		}
		totalDebitCnt +=debitCount;
	}
	
	void totalBankCredDebitCnt() {
		System.out.println("Total Credit operation - " + totalCreditCnt + " times");
		System.out.println("Total Debit operation - " + totalDebitCnt + " times");

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment23 assignment23 = new Assignment23();
		assignment23.setUserDetails("Chad", 8000, 5000, 9000, 6000);
		System.out.println(username + " all transaction summary ->");
		System.out.println("Show Total balance -:");
		System.out.println(assignment23.printTotalBalance());
		System.out.println("----------------------------------------");

		System.out.println("Show individual bank credit operations -:");
		assignment23.individualCreditBal("ICICI", 2);
		assignment23.individualCreditBal("HDFC", 2);
		assignment23.individualCreditBal("SBI", 1);
		assignment23.individualCreditBal("BOB", 4);
		assignment23.individualCreditBal("SBI", 4);
		System.out.println("----------------------------------------");
		System.out.println("Show individual bank debit operations -:");
		assignment23.individualDebitBal("ICICI", 2);
		assignment23.individualDebitBal("HDFC", 2);
		assignment23.individualDebitBal("BOB", 2);
		assignment23.individualDebitBal("SBI", 2);
		System.out.println("----------------------------------------");
		assignment23.totalBankCredDebitCnt();

	}

}
