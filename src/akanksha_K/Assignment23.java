package akanksha_K;

public class Assignment23 {
	
	int icicibal = 0;
	int hdfcbal = 0;
	int bobbal = 0;
	int sbibal = 0;
	int currentBal = 0;
	static int icicicreditcount, hdfccreditcount, bobcreditcount, sbicreditcount = 0;
	static int icicidebitcount, hdfcdebitcount, bobdebitcount, sbidebitcount = 0;
	
	void getTotalBalance() {
		int balance = icicibal + hdfcbal + bobbal + sbibal;
		System.out.println("Total balance: " + balance);
	}	
	void setinitialBalance (String Bname, int bal) {
		switch(Bname) {
		
		case "ICICI":
			icicibal= bal;
			break;
			
		case "HDFC":
			hdfcbal= bal;
			break;
				
		case "BOB":
			 bobbal= bal;
				break;
				
		case "SBI":
			 sbibal= bal;
				break;	
				
		default:
			System.out.println("Invalid input");
			
		}	
	}	
	
	int getBankBalance(String Bname) {
		switch(Bname) {
		
		case "ICICI":
			return icicibal;
			
		case "HDFC":
			return hdfcbal;
				
		case "BOB":
			return bobbal;
				
		case "SBI":
			return sbibal;
			
		default:
			return 0;
		}				
	}
	
	void debitAmount(String Bname, int bal) {
		switch(Bname) {
		
		case "ICICI":
			if(bal <= icicibal) {
				icicidebitcount++;
				icicibal = icicibal - bal;
				System.out.println("Debited "+bal+" from ICICI account");
			}
			else {
				System.out.println("No sufficient balance in ICICI account, operation will not be performed.");
			}
			break;
			
		case "HDFC":
			if(bal <= icicibal) {
				hdfcdebitcount++;
				hdfcbal = hdfcbal - bal;
				System.out.println("Debited "+bal+" from HDFC account");
			}
			else {
				System.out.println("No sufficient balance in HDFC account, operation will not be performed.");
			}
			break;
			
		case "BOB":
			if(bal <= bobbal) {
				bobdebitcount++;
				bobbal = bobbal - bal;
				System.out.println("Debited "+bal+" from BOB account");
			}
			else {
				System.out.println("No sufficient balance in BOB account, operation will not be performed.");
			}
			break;
			
		case "SBI":
			if(bal <= sbibal) {
				icicidebitcount++;
				sbibal = sbibal - bal;
				System.out.println("Debited "+bal+" from SBI account");
			}
			else {
				System.out.println("No sufficient balance in SBI account, operation will not be performed.");
			}
			break;
			
		default:
			System.out.println("Invalid input");	
		}
		
	}
	
	void creditAmount(String Bname, int bal) {
		switch(Bname) {
		
		case "ICICI":
			icicicreditcount++;
			icicibal = icicibal + bal;
			System.out.println("Credited " +bal+ " from ICICI account");
		break;
		
		case "HDFC":
			hdfccreditcount++;
			hdfcbal = hdfcbal + bal;
			System.out.println("Credited " +bal+ " from HDFC account");
		break;
		
		case "BOB":
			bobcreditcount++;
			bobbal = bobbal + bal;
			System.out.println("Credited " +bal+ " from BOB account");
		break;
		
		case "SBI":
			sbicreditcount++;
			sbibal = sbibal + bal;
			System.out.println("Credited " +bal+ " from SBI account");
		break;
		
		default:
			System.out.println("Invalid input");
		}
	}
	
	void getTotalCreditOperation() {
		int TotalCreditCount = icicicreditcount + hdfccreditcount + bobcreditcount + sbicreditcount;
		System.out.println("Total credit opearation performed: " + TotalCreditCount);
	}
	
	void getTotalDeditOpearation() {
		int TotalDebitCount = icicidebitcount + hdfcdebitcount + bobdebitcount + sbidebitcount;
		System.out.println("Total credit opearation performed: " + TotalDebitCount);
	}
	
	
	public static void main(String args[]) {
		Assignment23 assignment = new Assignment23();
		assignment.setinitialBalance("ICICI", 10000);
		assignment.setinitialBalance("HDFC", 15000);
		assignment.setinitialBalance("SBI", 20000);
		assignment.setinitialBalance("BOB", 25000);
		
		assignment.getTotalBalance();
		assignment.creditAmount("ICICI", 1000);
		assignment.creditAmount("ICICI", 2000);
		assignment.creditAmount("HDFC", 1500);
		assignment.creditAmount("HDFC", 10000);
		assignment.creditAmount("SBI", 3000);
		assignment.creditAmount("BOB", 5000);
		assignment.creditAmount("BOB", 7000);
		assignment.creditAmount("BOB", 1000);
		assignment.creditAmount("BOB", 5400);
		assignment.creditAmount("SBI", 4000);
		assignment.creditAmount("SBI", 5000);
		assignment.creditAmount("SBI", 200);
		assignment.creditAmount("SBI", 3560);
		
		assignment.debitAmount("ICICI", 3000);
		assignment.debitAmount("ICICI", 390);
		assignment.debitAmount("SBI", 400);
		assignment.debitAmount("SBI", 1500);
		assignment.debitAmount("BOB", 400);
		assignment.debitAmount("BOB", 100);
		assignment.debitAmount("HDFC", 400);
		assignment.debitAmount("HDFC", 5000);
		
		assignment.getTotalCreditOperation();
		assignment.getTotalDeditOpearation();

	}
}	

	


