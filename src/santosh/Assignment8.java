
package santosh;
class Assignment8{

    String custName;
	int creditCount;
	int debitCount;
	int printBalance;
	static int creditCount2;
	static int debitCount2;
	static int printBalance2;
	int currentBalance;
	
	void setUserDetails(String name,int initialBal){
		
		custName=name;
		currentBalance=initialBal;
	}
	
	void creditAmountBal(int creditAmount){
		currentBalance=currentBalance+creditAmount;
        creditCount++;
        creditCount2++;
	}

    void debitAmountBal(int debitAmount){
        currentBalance=currentBalance-debitAmount;
        debitCount++;
        debitCount2++;
    }

    void printCurrentBal(){
        System.out.println(custName +"Your current Balance "+currentBalance);
        printBalance=printBalance+ 1;
        printBalance2++;
    }
   
    void individualTransactionSummary(){
         System.out.println("Credit count is "+creditCount);
         System.out.println("Debit Count is "+debitCount);
         System.out.println("Print Balance Count"+printBalance);
    }		 
	
	 static void allTransactionSummary(){
         System.out.println("Credit count is "+creditCount2);
         System.out.println("Debit Count is "+debitCount2);
         System.out.println("Print Balance Count"+printBalance2);
		
    }
	
	public static void main(String[] args){
		Assignment8 assignment8=new Assignment8();
		System.out.println("------------------------");
		System.out.println("First User Dteails are");
		assignment8.setUserDetails("Harsh ",25000);
		assignment8.creditAmountBal(15000);
		assignment8.creditAmountBal(10000);
		assignment8.debitAmountBal(13000);
		assignment8.debitAmountBal(7000);
		assignment8.printCurrentBal();
		assignment8.individualTransactionSummary();
		
		Assignment8 assignment8_2 = new Assignment8();
		System.out.println("------------------------");
		System.out.println("Second User Dteails are");
		assignment8_2.setUserDetails("Sai ",40000);
		assignment8_2.creditAmountBal(15000);
		assignment8_2.creditAmountBal(10000);
		assignment8_2.debitAmountBal(13000);
		assignment8_2.debitAmountBal(7000);
		assignment8_2.printCurrentBal();
		assignment8_2.individualTransactionSummary();
		System.out.println("-----------------------");
		allTransactionSummary();
		System.out.println("-----------------------");
	}
}	
		
		
		
		
		
		