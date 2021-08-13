package akshay;

public class Assignment_8 {
	
	int debitcount;
	int creditcount;
	int printbalancecount;
	static int alldebitcount;
	static int allcreditcount;
	static int allprintbalancecount;
	String customername;
	
	void setcustomername(String custname) {
		customername = custname; 
	}
	
	void debitamt() {
		debitcount++;
		alldebitcount++;
	}
	
	void creditamt() {
		creditcount++;
		allcreditcount++;
	}
	
	void printbalance() {
		printbalancecount++;
		allprintbalancecount++;
	}
	
	void individualTansactionSummary () {
		System.out.println(customername + " transaction summary: " + "Credit - " + creditcount + 
				"times, Debit - " +  debitcount + " times, printBalance - " + printbalancecount +" times");
	}
	
	void allTansactionSummary () {
		System.out.println("All transaction summary: " + "Credit - " + allcreditcount + 
				"times, Debit - " +  alldebitcount + " times, printBalance - " + allprintbalancecount +" times");
	}
	
	public static void main (String[] args) {
		Assignment_8 assignment8_1 = new Assignment_8();
		Assignment_8 assignment8_2 = new Assignment_8();
		assignment8_1.setcustomername("User1");
		assignment8_1.debitamt();
		assignment8_1.debitamt();
		assignment8_1.debitamt();
		assignment8_1.creditamt();
		assignment8_1.creditamt();
		assignment8_1.printbalance();
		assignment8_1.printbalance();
		assignment8_1.individualTansactionSummary();
		
		assignment8_2.setcustomername("User2");
		assignment8_2.debitamt();
		assignment8_2.debitamt();
		assignment8_2.creditamt();
		assignment8_2.printbalance();
		assignment8_2.individualTansactionSummary();
		
		assignment8_1.allTansactionSummary();
	}
	
}
