package arti_G;

//Bank
class Assignment_2 {

	int currentBalance = 10000;

	void debitInfo(int debit) {
		currentBalance = currentBalance - debit;
		System.out.println(" After Debit Balance is " + "= " + currentBalance);
	}

	void creditInfo(int credit) {
		currentBalance = currentBalance + credit;
		System.out.println(" After Credit Balance is " + "= " + currentBalance);
	}

	void displayBalance() {
		System.out.println(" Current Balance is " + "= " + currentBalance);
	}

	public static void main(String[] a) {
		Assignment_2 assignment_2 = new Assignment_2();
		assignment_2.debitInfo(2000);
		assignment_2.creditInfo(3000);
		assignment_2.displayBalance();
	}
}