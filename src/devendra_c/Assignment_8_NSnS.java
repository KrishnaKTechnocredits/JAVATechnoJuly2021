package devendra_c;

public class Assignment_8_NSnS {
	String user_name;
	int balAmt, credCnt, debCnt;
	int printBalCnt;
	static int credCntAll, debCntAll, printBalCntAll;
	
	void setUserDetails(String userName,int initialBal) {
		user_name = userName;
		balAmt = initialBal;
		System.out.println(user_name+ "'s Initial Balance is " +balAmt);
	}

	void creditAmt(int creditAmt) {
		balAmt = balAmt +creditAmt;
		credCnt++;
		credCntAll++;
	}

	void debitAmt(int debitAmt) {
		balAmt = balAmt - debitAmt;
		debCnt++;
		debCntAll++;
	}

	void printCurrentBal() {
		System.out.println(user_name+ "'s Current Balance is " +balAmt);
		printBalCnt++;
		printBalCntAll++;
	}

	void individualTransactionsummary() {
		System.out.println(user_name+ "'s Transaction Summary:");
		System.out.println("Credit count is " +credCnt+ ", Debit count is " +debCnt+ ", Balance check count is " +printBalCnt);
		System.out.println("-----------------------------------------");
	}

	static void transactionSummary() {
		System.out.println("All Transaction Summary:");
		System.out.println("Credit count is " +credCntAll+ ", Debit count is " +debCntAll+ ", Balance check Total count is " +printBalCntAll);
		System.out.println("-----------------------------------------");
	}

	public static void main(String[] args) {
		transactionSummary();
		
		Assignment_8_NSnS a8_1 = new Assignment_8_NSnS();
		a8_1.setUserDetails("Deven", 25000);
		a8_1.creditAmt(5000);
		a8_1.printCurrentBal();
		a8_1.debitAmt(1000);
		a8_1.creditAmt(500);
		a8_1.printCurrentBal();
		a8_1.individualTransactionsummary();

		Assignment_8_NSnS a8_2 = new Assignment_8_NSnS();
		a8_2.setUserDetails("DC",50000);
		a8_2.creditAmt(1000);
		a8_2.printCurrentBal();
		a8_2.debitAmt(2500);
		a8_2.creditAmt(1200);
		a8_2.debitAmt(550);
		a8_2.printCurrentBal();
		a8_2.individualTransactionsummary();
			
		transactionSummary();
	}
}

