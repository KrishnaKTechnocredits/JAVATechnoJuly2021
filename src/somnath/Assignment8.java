package somnath;
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
		creditCount=creditCount+1;
		creditCount2=creditCount2+2;
	}

    void debitAmountBal(int debitAmount){
        currentBalance=currentBalance-debitAmount;
        debitCount++;
        debitCount2++;
    }

    void printCurrentBal(){
        System.out.println(custName +"Your current Balance"+currentBalance);
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
		assignment8.setUserDetails("Somnath ",15000);
		assignment8.creditAmountBal(5000);
		assignment8.creditAmountBal(5000);
		assignment8.debitAmountBal(12000);
		assignment8.debitAmountBal(3000);
		assignment8.printCurrentBal();
		assignment8.individualTransactionSummary();
		
		Assignment8 assignment8_1=new Assignment8();
		assignment8_1.setUserDetails("Vishal ",30000);
		assignment8_1.creditAmountBal(5000);
		assignment8_1.creditAmountBal(5000);
		assignment8_1.debitAmountBal(12000);
		assignment8_1.debitAmountBal(3000);
		assignment8_1.printCurrentBal();
		assignment8_1.individualTransactionSummary();
		allTransactionSummary();
		}
}		