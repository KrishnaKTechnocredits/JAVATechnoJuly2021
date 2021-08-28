package sayali_V;

public class Assignment_23 {
	double currantBalanceICICI, currantBalanceHDFC, currantBalanceBOB, currantBalanceSBI;
	int iciciDebitcount = 0;
	int iciciCreditcount = 0;
	int hdfcDebitcount = 0;
	int hdfcCreditcount = 0;
	int bobCreditcount = 0;
	int bobDebitcount = 0;
	int sbiCreditcount = 0;
	int sbiDebitcount = 0;

	static int allCreditCount = 0;
	static int allDebitCount = 0;

	void setBalance(double iciciBalance, double hdfcBalance, double bobBalance, double sbiBalance) {
		currantBalanceICICI = iciciBalance;
		currantBalanceHDFC = hdfcBalance;
		currantBalanceBOB = bobBalance;
		currantBalanceSBI = sbiBalance;
	}

	void getAllCreditAndDebitOpration(String bankName, String opration, int amount) {
		String bName = bankName.toUpperCase();
		String opt = opration.toLowerCase();
		switch (bName) {

		case "ICICI":
			switch (opt) {
			case "credit":
				currantBalanceICICI = currantBalanceICICI + amount;
				iciciCreditcount++;
				allCreditCount++;
				break;
			case "debit":
				currantBalanceICICI = currantBalanceICICI - amount;
				iciciDebitcount++;
				allDebitCount++;
				break;
			}
			break;
		case "HDFC":
			switch (opt) {
			case "credit":
				currantBalanceHDFC = currantBalanceHDFC + amount;
				hdfcCreditcount++;
				allCreditCount++;
				break;
			case "debit":
				currantBalanceHDFC = currantBalanceHDFC - amount;
				hdfcDebitcount++;
				allDebitCount++;
				break;
			}
			break;
		case "BOB":
			switch (opt) {
			case "credit":
				currantBalanceBOB = currantBalanceBOB + amount;
				bobCreditcount++;
				allCreditCount++;
				break;
			case "debit":
				currantBalanceBOB = currantBalanceBOB - amount;
				bobDebitcount++;
				allDebitCount++;
				break;
			}
			break;
		case "SBI":
			switch (opt) {
			case "credit":
				currantBalanceSBI = currantBalanceSBI + amount;
				sbiCreditcount++;
				allCreditCount++;
				break;
			case "debit":
				currantBalanceSBI = currantBalanceSBI - amount;
				sbiDebitcount++;
				allDebitCount++;
				break;
			}
		}
	}

	void getAllOpration() {
		System.out.println("Credit count of all the bank are : " + allCreditCount);
		System.out.println("Debit count of all the bank are : " + allDebitCount);
	}

	void getIndividualCreditOpration() {
		System.out.println("Credit count of ICICI bank is: " + iciciCreditcount);
		System.out.println("Credit count of HDFC bank is: " + hdfcCreditcount);
		System.out.println("Credit count of BOB bank is: " + bobCreditcount);
		System.out.println("Credit count of SBI bank is: " + sbiCreditcount);
	}

	void getIndividualDebitOpration() {
		System.out.println("Debit count of ICICI bank is: " + iciciDebitcount);
		System.out.println("Debit count of HDFC bank is: " + hdfcDebitcount);
		System.out.println("Debit count of BOB bank is: " + bobDebitcount);
		System.out.println("Debit count of SBI bank is: " + sbiDebitcount);
	}

	void getTotalBalance() {
		System.out.println("Total balance in all the banks is : "
				+ (currantBalanceSBI + currantBalanceICICI + currantBalanceBOB + currantBalanceHDFC));
	}

	public static void main(String[] args) {
		Assignment_23 assignment = new Assignment_23();
		assignment.setBalance(50, 300, 300, 200);
		assignment.getAllCreditAndDebitOpration("hdfC", "creDit", 50);
		assignment.getAllCreditAndDebitOpration("hdfC", "creDit", 200);
		assignment.getAllCreditAndDebitOpration("icici", "Credit", 200);
		assignment.getAllCreditAndDebitOpration("icici", "Credit", 500);
		assignment.getAllCreditAndDebitOpration("Sbi", "Credit", 100);
		assignment.getAllCreditAndDebitOpration("Bob", "Credit", 100);
		assignment.getAllCreditAndDebitOpration("Bob", "Credit", 100);
		assignment.getAllCreditAndDebitOpration("Bob", "Credit", 100);
		assignment.getAllCreditAndDebitOpration("Bob", "Credit", 100);
		assignment.getAllCreditAndDebitOpration("Sbi", "Credit", 100);
		assignment.getAllCreditAndDebitOpration("Sbi", "Credit", 100);
		assignment.getAllCreditAndDebitOpration("Sbi", "Credit", 100);
		assignment.getAllCreditAndDebitOpration("Sbi", "Credit", 100);
		assignment.getAllCreditAndDebitOpration("hdfC", "Debit", 100);
		assignment.getAllCreditAndDebitOpration("hdfC", "Debit", 200);
		assignment.getAllCreditAndDebitOpration("icici", "debit", 200);
		assignment.getAllCreditAndDebitOpration("icici", "debit", 500);
		assignment.getAllCreditAndDebitOpration("Sbi", "debit", 100);
		assignment.getAllCreditAndDebitOpration("Sbi", "debit", 100);
		assignment.getAllCreditAndDebitOpration("BOB", "debit", 100);
		assignment.getAllCreditAndDebitOpration("BOb", "debit", 100);
		assignment.getIndividualCreditOpration();
		assignment.getIndividualDebitOpration();
		assignment.getAllOpration();
		assignment.getTotalBalance();
	}
}
