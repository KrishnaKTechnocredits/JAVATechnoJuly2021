package akanksha_K;

public class Assignment8 {
	int creditcount;
	int debitcount;
	int balance;
	String user;
	int printcount;
	static int allcreditcount;
	static int alldebitcount;
	static int allprintbalance;
	
	
	void debitAmount(int debitamount) {
		if(debitamount<=balance){
		   balance = balance - debitamount;
		   debitcount = debitcount + 1;
		   System.out.println(user + " debited amount: " + debitamount);
		   alldebitcount = alldebitcount + 1;
		}
		else {
		   System.out.println("Insufficient balance");
		}	
	}
	
	void creditAmount(int creditamount) {
		 balance = balance + creditamount;
		 creditcount = creditcount + 1;
		 System.out.println(user + " credited amount: " + creditamount);
		 allcreditcount = allcreditcount + 1;
	}
	
	void printBalance() {
		 System.out.println(user + " balance: " + balance);
		 printcount = printcount + 1;	 
		 allprintbalance = allprintbalance + 1;
	}
	
	void individualTransactionSummary() {
		 System.out.println(user + " Transaction Summery: " + " credit- " + creditcount + 
				 " times"+ " Debit- " + debitcount + " times" + " Printbalance- " +printcount + " time");
		 System.out.println();
	}
	
	void setUserDetails(String username, int initialbalance) {
		user =username;	
		balance= initialbalance;
		System.out.println(username + " set with initial balance: " + initialbalance);
	}
	
	void allTransactionSummary() {
		System.out.println("All Transaction Summery: " + " credit- " + allcreditcount + 
				 " times"+ " Debit-" + alldebitcount + " times" + " Printbalance- " +allprintbalance + " time");
		
	}

	public static void main(String[] args) {
		Assignment8 assignment8_1 = new Assignment8();
		Assignment8 assignment8_2 = new Assignment8();
		assignment8_1.setUserDetails("User 1",50000);
		assignment8_1.creditAmount(5000);
		assignment8_1.printBalance();
		assignment8_1.creditAmount(4000);
		assignment8_1.debitAmount(2000);
		assignment8_1.printBalance();
		assignment8_1.individualTransactionSummary();
		
		assignment8_2.setUserDetails("User 2",70000);
		assignment8_2.creditAmount(1000);
		assignment8_2.creditAmount(1000);
		assignment8_2.debitAmount(1000);
		assignment8_2.printBalance();
		assignment8_2.individualTransactionSummary();
		
		assignment8_1.allTransactionSummary();
	}

}
