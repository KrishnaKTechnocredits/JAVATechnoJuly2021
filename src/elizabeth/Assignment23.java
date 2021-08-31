package elizabeth;

class Assignment23{
	
	String bankName;
	int iciciBalance,hdfcBalance,bobBalance,sbiBalance,iciciDebitCount,iciciCreditCount,hdfcDebitCount,hdfcCreditCount,bobDebitCount,bobCreditCount,sbiDebitCount,sbiCreditCount;
	static int totalDebitCount;
	static int totalCreditCount;
	
	void getBankName(int choice, String operation,int amount){
		switch (choice){
			case 1: 
			bankName="ICICI";
				if(operation=="credit"){
					iciciBalance=iciciBalance+amount;
					iciciCreditCount++;
					totalCreditCount++;
				}else if(operation=="debit"){
					hdfcBalance=hdfcBalance-amount;
					iciciDebitCount++;
					totalDebitCount++;
				}
			break;
			case 2: 
			bankName="HDFC";
				if(operation=="credit"){
						iciciBalance=iciciBalance+amount;
						hdfcCreditCount++;
						totalCreditCount++;
				}else if(operation=="debit"){
						hdfcBalance=hdfcBalance-amount;
						hdfcDebitCount++;
						totalDebitCount++;
				}
			break;
			case 3: 
			bankName="BOB";
				if(operation=="credit"){
							iciciBalance=iciciBalance+amount;
							bobCreditCount++;
							totalCreditCount++;
				}else if(operation=="debit"){
							hdfcBalance=hdfcBalance-amount;
							bobDebitCount++;
							totalDebitCount++;
				}
			break;
			case 4: 
			bankName="SBI";
			if(operation=="credit"){
							iciciBalance=iciciBalance+amount;
							sbiCreditCount++;
							totalCreditCount++;
			}else if(operation=="debit"){
							hdfcBalance=hdfcBalance-amount;
							sbiDebitCount++;
							totalDebitCount++;
			}
			break;
			default: 
			System.out.println("Invalid Choice");
		
		}
	}
	
	int getTotalBalance(int balance1,int balance2,int balance3,int balance4){
		iciciBalance=balance1;
		hdfcBalance=balance2;
		bobBalance=balance3;
		sbiBalance=balance4;
		int totalBalance=balance1+balance2+balance2+balance4;
		return totalBalance;
	}
	
	void getIndividualBankCredits(){
		System.out.println("ICICI credit operation - " +iciciCreditCount);
		System.out.println("HDFC credit operation - " +hdfcCreditCount);
		System.out.println("BOB credit operation - " +bobCreditCount);
		System.out.println("SBI credit operation - " +sbiCreditCount);
	}

	
	void getIndividualBankDebits(){
		System.out.println("ICICI debit operation - " +iciciDebitCount);
		System.out.println("HDFC debit operation - " +hdfcDebitCount);
		System.out.println("BOB debit operation - " +bobDebitCount);
		System.out.println("SBI debit operation - " +sbiDebitCount);
	}
	
	void getTotalOperations(){
		System.out.println("Total credit operation: " +totalCreditCount);
		System.out.println("Total debit operation: " +totalDebitCount);
		
	}
	
	public static void main(String[] args){
		Assignment23 assignment23=new Assignment23();
		System.out.println("Total Balance is:" +assignment23.getTotalBalance(20000,20000,30000,40000));
		assignment23.getBankName(1,"credit",8000);
		assignment23.getBankName(1,"credit",6000);
		assignment23.getBankName(2,"credit",2500);
		assignment23.getBankName(2,"credit",5000);
		assignment23.getBankName(4,"credit",9000);
		assignment23.getBankName(3,"credit",5000);
		assignment23.getBankName(3,"debit",5000);
		assignment23.getBankName(3,"credit",5000);
		assignment23.getBankName(2,"debit",5000);
		assignment23.getBankName(1,"debit",10000);
		assignment23.getBankName(3,"debit",8000);
		assignment23.getBankName(4,"debit",5000);
		assignment23.getIndividualBankCredits();
		assignment23.getIndividualBankDebits();
		assignment23.getTotalOperations();
	
	}

}