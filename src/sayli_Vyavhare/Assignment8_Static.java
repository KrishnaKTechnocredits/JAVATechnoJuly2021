package sayli_Vyavhare;
public class Assignment8_Static {
    String customerName;
    int initialBalance,credit,debit,currentBalance;
    static int debitCount,creditCount,printBalance;
    int debitCnt,creditCnt,printbal;
	
	void setUserDetails(String custname,int initialBalance){
		customerName= custname;
	    currentBalance= initialBalance;
	}
	void debitAmount(int debit){
		currentBalance=currentBalance-debit;
		debitCnt++;
		debitCount++;	
	}
	void creditAmount(int credit){
		currentBalance=currentBalance+credit;
		creditCnt++;
		creditCount++;
	}
	void  printBalance(){
		System.out.println("Current balance of "+ customerName +" is " + currentBalance);
         printbal++;	
         printBalance++;
	}
	void individualTransactionSummary() {
		System.out.println(customerName +" has debited "+ debitCnt + " times");
		System.out.println(customerName +" has credited "+ creditCnt + " times");
		System.out.println(customerName +" has printed balance "+ printbal + " times");
		System.out.println("-----------------------------");
	}
	void allTransactionSummary() {
		System.out.println(customerName +" has debited "+ debitCount + " times");
		System.out.println(customerName +" has credited "+ creditCount + " times");
		System.out.println(customerName +" has printed balance "+ printBalance + " times");
	}
	
	public static void main(String[] args) {
		Assignment8_Static assignment8static=new Assignment8_Static();
		assignment8static.setUserDetails("Sayli", 0);
		assignment8static.creditAmount(1000);
		assignment8static.debitAmount(200);
		assignment8static.creditAmount(500);
		assignment8static.printBalance();
		assignment8static.individualTransactionSummary();

		Assignment8_Static assignment8static1=new Assignment8_Static();
		assignment8static1.setUserDetails("Raghav", 0);
		assignment8static1.creditAmount(2000);
		assignment8static1.creditAmount(100);
		assignment8static1.debitAmount(100);
		assignment8static1.creditAmount(200);
		assignment8static1.printBalance();
		assignment8static1.individualTransactionSummary();
		
		Assignment8_Static assignment8staticall=new Assignment8_Static();
		assignment8staticall.setUserDetails("All", 0);
		assignment8staticall.allTransactionSummary(); 
	}
}
