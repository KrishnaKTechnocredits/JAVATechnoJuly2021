package sneha;

public class Assignment_08 {

	static int debit;
	static int credit;
	static int balance1;
	static int b;

	static int debitind;
	static int creditind;
	static int balance2;
	
	int credit1 = 0, credit2 = 0;
	int debit1 = 0, debit2 = 0;
	int b1 = 0, b2 = 0;
	
	void credit1(int money) {
		
		balance1 = balance1 + money;
		credit++;
		credit1++;
	}
	
	void debit1(int money) {
		balance1 = balance1 - money;
		debit++;
		debit1++;
	}
	

	void credit2(int money) {
		
		balance2 = balance2 + money;
		credit++;
		credit2++;
	}
	
	void debit2(int money) {
		balance2 = balance2 - money;
		debit++;
		debit2++;
	}
	
	void printBalance1() {
		System.out.println("*******************************************************************************");
		System.out.println("Available balance of first user is : " + balance1);
		System.out.println("*******************************************************************************");
		b++;
		b1++;
	}
	
	void printBalance2() {
		System.out.println("*******************************************************************************");
		System.out.println("Available balance of second user is : " + balance2);
		System.out.println("*******************************************************************************");
		b++;
		b2++;
	}
	
	void individualTransactionSummary1() {
		System.out.println();
		System.out.println("*******************************************************************************");
		System.out.println("Your Transaction History is:");
		System.out.println("*******************************************************************************");
		System.out.println("credit method calls for first user" + credit1 + " times");
		System.out.println("debit method calls for first user " + debit1 + " times");
		System.out.println("printBalance method calls calls for first user " + b1 + " times");
		System.out.println("#################################################################################");
	}
	
	void individualTransactionSummary2() {
		System.out.println();
		System.out.println("*******************************************************************************");
		System.out.println("Your Transaction History is:");
		System.out.println("*******************************************************************************");
		System.out.println("credit method calls for second user " + credit2 + " times");
		System.out.println("debit method calls for second user " + debit2 + " times");
		System.out.println("printBalance method calls for second user" + b2 + " times");
		System.out.println("#################################################################################");
	}

	void allTransactionSummary() {
		System.out.println("All transaction summary is:");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("credit - " + credit + " times");
		System.out.println("debit - " + debit + " times");
		System.out.println("printBalance - " + b + " times");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
	}

	public static void main(String[] args) {
		
		Assignment_08 assignment_8_1 = new Assignment_08();
		Assignment_08 assignment_8_2 = new Assignment_08();
		
		assignment_8_1.credit1(3000);
		assignment_8_1.credit1(3000);
		assignment_8_1.credit1(3000);
		assignment_8_1.debit1(1000);
		assignment_8_1.printBalance1();
		assignment_8_1.individualTransactionSummary1();
		
		assignment_8_2.credit2(7000);
		assignment_8_2.debit2(2000);
		assignment_8_2.debit2(1000);
		assignment_8_2.credit2(7000);
		assignment_8_2.printBalance2();
		assignment_8_2.printBalance2();
		assignment_8_2.individualTransactionSummary2();
		
		assignment_8_1.allTransactionSummary();
		

				}


	}


