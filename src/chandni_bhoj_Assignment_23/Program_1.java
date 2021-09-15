package chandni_bhoj_Assignment_23;

public class Program_1 {
	
	int iciciBal, hdfcBal, bobBal, sbiBal;
	int iciciCredit, hdfcCredit, bobCredit, sbiCredit;
	int iciciDebit, hdfcDebit, bobDebit, sbiDebit;
	
	void setBal (int icici, int hdfc, int bob, int sbi) {
			iciciBal = icici;
			hdfcBal = hdfc;
			bobBal = bob;
			sbiBal = sbi;
	}
	
	void selectDetails (String bank, String operation, int amount) {
	
	switch (bank) {
		case "ICICI":
			switch (operation) {
			case "Debit" :
				iciciBal -= amount;
				iciciDebit++;
				break;
			case "Credit" :
				iciciBal += amount;
				iciciCredit++;
				break;
			}
			break;
			
		case "HDFC" :
			switch (operation) {
			case "Debit" :
				hdfcBal =- amount;
				hdfcDebit++;
				break;
			case "Credit" :
				hdfcBal =+ amount;
				hdfcCredit++;
				break;
			}
			break;
			
		case "BOB" :
			switch (operation) {
			case "Debit" :
				bobBal =- amount;
				bobDebit++;
				break;
			case "Credit" :
				bobBal =+ amount;
				bobCredit++;
				break;
			}
			break;
			
		case "SBI" :
			switch (operation) {
			case "Debit" :
				sbiBal =- amount;
				sbiDebit++;
				break;
			case "Credit" :
				sbiBal =+ amount;
				sbiCredit++;
				break;
			}
			break;
		}
	}
		
	
	void totalBalance () {
		System.out.println ("Total Balance of all account is " + (iciciBal + hdfcBal + bobBal + sbiBal));
	}
	
	void totalCreditAndDebitOperations () {
		System.out.println ("Total credit operations : " + (iciciCredit + hdfcCredit + bobCredit + sbiCredit));
		System.out.println ("Total debit operations : " + (iciciDebit + hdfcDebit + bobDebit + sbiDebit));
	}
	
	void displayIndividualCredit () {
		System.out.println ("ICICI Credit times : " + iciciCredit);
		System.out.println ("HDFC Credit times : " + hdfcCredit);
		System.out.println ("BOB Credit times : " + bobCredit);
		System.out.println ("SBI Credit times : " + sbiCredit);
		
	}
	
	void displayIndividualDebit () {
		System.out.println ("ICICI Debit times : " + iciciDebit);
		System.out.println ("HDFC Debit times : " + hdfcDebit);
		System.out.println ("BOB Debit times : " + bobDebit);
		System.out.println ("SBI Debit times : " + sbiDebit);
	
	}
	
	public static void main(String[] args) {
		Program_1 program_1 = new Program_1();
		program_1.setBal(10000, 20000, 5500, 10000);
		program_1.selectDetails("ICICI","Debit", 2000);
		program_1.selectDetails("ICICI","Debit", 500);
		program_1.selectDetails("HDFC","Debit", 800);
		program_1.selectDetails("HDFC","Debit", 500);
		program_1.selectDetails("BOB","Debit", 1000);
		program_1.selectDetails("BOB","Debit", 500);
		program_1.selectDetails("SBI","Debit", 3000);
		program_1.selectDetails("HDFC","Debit", 1000);
		program_1.selectDetails("ICICI","Credit", 2000);
		program_1.selectDetails("ICICI","Credit", 1500);
		program_1.selectDetails("HDFC","Credit", 2000);
		program_1.selectDetails("BOB","Credit", 5000);
		program_1.selectDetails("SBI","Credit", 2500);
		program_1.totalBalance();
		program_1.totalCreditAndDebitOperations();
		program_1.displayIndividualCredit();
		program_1.displayIndividualDebit();
			
	}




}
			
				
					
