package nidhi;

class Assignment_23{
	
	int hdfcBal = 10000;
	int iciciBal = 10000;
	int bobBal = 10000;
	int sbiBal = 10000;
	
	int hdfcDebit = 0;
	int iciciDebit = 0;
	int bobDebit = 0;
	int sbiDebit = 0;
	
	int hdfcCredit = 0;
	int iciciCredit = 0;
	int bobCredit = 0;
	int sbiCredit = 0;
	
	int totalBalance(){
		int totalBal = hdfcBal + iciciBal + bobBal + sbiBal;
		return totalBal;
	}
	
	void totalOperations(){
		System.out.println("Total Credit operations : " + (hdfcCredit + iciciCredit + bobCredit + sbiCredit));
		System.out.println("Total Debit operations : " + (hdfcDebit + iciciDebit + bobDebit + sbiDebit));
	}

	void bankAccounts(String bankName, String operation, int amt){
		
		switch(bankName){
		case "HDFC":
			if (operation== "Debit"){
				hdfcBal = hdfcBal - amt;
				hdfcDebit++;
			} else if(operation == "Credit"){
				hdfcBal = hdfcBal + amt;
				hdfcCredit++;
			}
			break;
		case "ICICI":
			if (operation=="Debit"){
				iciciBal = iciciBal - amt;
				iciciDebit++;
			} else if(operation == "Credit"){
				iciciBal = iciciBal + amt;
				iciciCredit++;
			}
			break;
		case "BOB":
			if (operation=="Debit"){
				bobBal = bobBal - amt;
				bobDebit++;
			} else if(operation == "Credit"){
				bobBal = bobBal + amt;
				bobCredit++;
			}
			break;
		case "SBI":
			if (operation=="Debit"){
				sbiBal = sbiBal - amt;
				sbiDebit++;
			} else if(operation == "Credit"){
				sbiBal = sbiBal + amt;
				sbiCredit++;
			}
			break;
		}
	}
	
	void allBankDebitOperation(){
		System.out.println("ICICI bank credit operation - " + iciciCredit + "times");
		System.out.println("BOB bank credit operation - " + bobCredit + "times");
		System.out.println("SBI bank credit operation - " + sbiCredit + "times");
		System.out.println("HDFC bank credit operation - " + hdfcCredit + "times");		
	}
	
	void allBankCreditOperation(){
		System.out.println("ICICI bank debit operation - " + iciciDebit + "times");
		System.out.println("BOB bank debit operation - " + bobDebit + "times");
		System.out.println("SBI bank debit operation - " + sbiDebit + "times");
		System.out.println("HDFC bank debit operation - " + hdfcDebit + "times");
	}	
		
	public static void main(String[] ar){
		Assignment_23 assignment23= new Assignment_23();
		assignment23.bankAccounts("BOB", "Credit", 1000);
		assignment23.bankAccounts("SBI", "Debit", 2000);
		assignment23.bankAccounts("ICICI", "Credit", 1000);
		assignment23.bankAccounts("SBI", "Debit", 2000);
		assignment23.bankAccounts("BOB", "Credit", 1000);
		assignment23.bankAccounts("HDFC", "Debit", 2000);
		assignment23.bankAccounts("HDFC", "Credit", 1000);
		assignment23.bankAccounts("SBI", "Debit", 2000);
		assignment23.bankAccounts("SBI", "Debit", 6000);
		assignment23.allBankDebitOperation();
		assignment23.allBankCreditOperation();
		assignment23.totalOperations();
		System.out.println("Total account balance :" + assignment23.totalBalance());
	}
}