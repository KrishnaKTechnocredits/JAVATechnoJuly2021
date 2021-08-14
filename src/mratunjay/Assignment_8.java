package mratunjay;

public class Assignment_8 {

	int PrintCount = 0;
	int DebitCount = 0;
	int CreditCount = 0;

	static int PrintAllCount = 0;
	static int DebitAllCount = 0;
    static int CreditAllCount = 0;

	void SetUserDetails(String name, int amount) {

		System.out.println("User name: " + name);
	 	System.out.println("Initial amount: " + amount);
	}

	void CreditBalance(int C) {
		
		for (; C > 0; C--)
		{
			CreditCount++;
		    CreditAllCount++;
		}
				
	}

	void DebitBalance(int D) {
		for (; D > 0; D--) {
			DebitCount++;
			DebitAllCount++;
		}
		

	}

	void PrintBalance(int P) {
		for (; P > 0; P--) {
			PrintCount++;
			PrintAllCount++;
		}
		

	}

	void IndividualTransactionSummary(String User1) {

		System.out.println(User1 + " transaction summary : " + "Credit - " + CreditCount + " times," + " Debit - "
				+ DebitCount + " times, " + "Print balance " + PrintCount + " times");
	}

	void AllTransactionSummary() {

		System.out.println("All transactions Summary : " + " Credit - " + Assignment_8.CreditAllCount + " times, " + "Debit - "
				+Assignment_8.DebitAllCount + " times, " + "Print balance " + PrintAllCount + " times");
	}

	public static void main(String[] orgs) {

		Assignment_8 A8_1 = new Assignment_8();
		Assignment_8 A8_2 = new Assignment_8();
		A8_1.SetUserDetails("User1", 10000);
		A8_1.CreditBalance(2);
		A8_1.DebitBalance(1);
		A8_1.PrintBalance(1);
		A8_1.IndividualTransactionSummary("User1");
		A8_2.SetUserDetails("User2", 10000);
		A8_2.CreditBalance(5);
		A8_2.DebitBalance(2);
		A8_2.IndividualTransactionSummary("User2");
		A8_2.AllTransactionSummary();
		
}
}
