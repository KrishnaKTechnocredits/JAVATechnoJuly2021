package precilla;

public class Assignment8 {
	float currentBalance;
	String userName;
	int debitCount, creditCount, printBal;
	static int debitCnt, creditCnt ,printBalance;
	
	void setUserDetails(String user,float initialBalance) {
		currentBalance=initialBalance;
		userName=user;
	}
	void debitAmount(float debitAmt) {
		currentBalance=currentBalance-debitAmt;
		debitCount++;
		debitCnt++;
	}
	void creditAmount(float creditAmt) {
		currentBalance=currentBalance+creditAmt;
		creditCount++;
		creditCnt++;
	}
	void printBalance() {
		System.out.println( "Current balance of "+userName +" is "+currentBalance);
		printBal++;
		printBalance++;

	}
	void individualTransactionSummary() {
		System.out.println(userName+" Transaction Summary: Credit - "+creditCount+" times,Debit - "+
		debitCount+" times,printBalance - "+printBal+" times");
	}
	void allTransactionSummary() {
		System.out.println(userName+" Transaction Summary: Credit - "+creditCnt+" times,Debit - "+
				debitCnt+" times,printBalance - "+printBalance+" times");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment8 assignment8=new Assignment8();
		assignment8.setUserDetails("User 1 ", 0);
		assignment8.creditAmount(20000);//20000
		assignment8.creditAmount(20000);//40000
		assignment8.debitAmount(20000);//20000
		assignment8.printBalance();
		assignment8.individualTransactionSummary();
		
		Assignment8 assignment8_user2=new Assignment8();
		assignment8_user2.setUserDetails("User 2" , 0);
		assignment8_user2.creditAmount(20000);//20000
		assignment8_user2.creditAmount(10000);//30000
		assignment8_user2.creditAmount(25000);//55000
		assignment8_user2.creditAmount(5000);//60000
		assignment8_user2.creditAmount(30000);//90000
		assignment8_user2.debitAmount(20000);//70000
		assignment8_user2.debitAmount(10000);//60000
		assignment8_user2.individualTransactionSummary();
		
		Assignment8 assignment8_All=new Assignment8();
		assignment8_All.setUserDetails("All", 0);
		assignment8_All.allTransactionSummary();
		
	}

}
