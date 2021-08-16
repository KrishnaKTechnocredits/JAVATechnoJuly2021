package anuja;

public class Assignment_8 {

	int bal=50000;
	//int amt;
	int count;
	int count1;
	int count2;
	static int c1;
	static int c2;
	static int c3;
	
	void setUserDetails(String name) {
		System.out.println("username is "+ name);
		System.out.println("Initial balance is "+ bal);
	}
	
	void debitAmt(int amt){
		c1++;
		count++;
		bal=bal-amt;
		//System.out.println("Balance is" +bal);
		
	}
	
	void creditAmt(int amt) {
		c2++;
		count1++;
		bal=bal+amt;
	}
	
	void printbalance() {
		c3++;
		count2++;
		//System.out.println("Balance left is "+ bal);
	}
	
	void individualTransactionSummary() {
		System.out.println("username transaction summary:Credit: "+count1+ "times,"
				+ "debit- "+count+" times,prinBalance- "+count2+" times" );
	}
	
	void allTransactionSummary() {
		System.out.println("All transaction Summary:Credit-"+c2+" times,debit-"+c1+
				" times,printbalance-"+c3+" times");
				
	}
	
	public static void main(String[] args) {
		Assignment_8 assignment_8=new Assignment_8();
		Assignment_8 assignment_8_1=new Assignment_8();
		assignment_8.setUserDetails("Anuja");
		assignment_8.debitAmt(1000);
		assignment_8.creditAmt(2000);
		assignment_8.creditAmt(4000);
		assignment_8.printbalance();
		assignment_8.individualTransactionSummary();
		assignment_8_1.setUserDetails("Harshita");
		assignment_8_1.debitAmt(1000);
		assignment_8_1.debitAmt(2000);
		assignment_8_1.creditAmt(1000);
		assignment_8_1.creditAmt(2000);
		assignment_8_1.creditAmt(3000);
		assignment_8_1.creditAmt(4000);
		assignment_8_1.creditAmt(5000);
		//assignment_8_1.printbalance();
		assignment_8_1.individualTransactionSummary();
		assignment_8.allTransactionSummary();
		assignment_8_1.allTransactionSummary();
	}
}
