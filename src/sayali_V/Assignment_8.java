package sayali_V;

public class Assignment_8 
{
		int debitcount,creditcount,printbalancecount;
		static int totaldebitcount,totalcreditcount,totalprintbalancecount;
		String customerName;
		int initialBalance;
		
		void setUserDetails(String custName,int inBalance)
		{
			customerName=custName;
			 initialBalance=inBalance;
		}
		
		void debitAmount(int debitAmt)
		{
			initialBalance=initialBalance-debitAmt;
			debitcount++;
			totaldebitcount++;
		}
		
		void creditAmount(int creditAmt)
		{
			initialBalance=initialBalance+creditAmt;
			creditcount++;
			totalcreditcount++;
		}
		
		void printBalance()
		{
			printbalancecount++;
			totalprintbalancecount++;
			System.out.println(customerName + "'s Current balance is: " + initialBalance);
		}
		
		void indiviualTransactionSummary()
		{
			System.out.println(customerName + "'s transaction summary: Credit - " + creditcount + " times, Debit - " + debitcount + " times, print Balance - " + printbalancecount + " time");
		}
		
		static  void allTransactionSummary()
		{
			
			System.out.println( "All transaction summary: Credit - " + totalcreditcount + " times, Debit - " + totaldebitcount + " times, print Balance - " + totalprintbalancecount + " time" );
		}
		
		public static void main(String args[])
		{
			Assignment_8 Assignment1=new Assignment_8();
			Assignment1.setUserDetails("abcd", 60000);
			Assignment1.creditAmount(2000);
			Assignment1.creditAmount(3000);
			Assignment1.debitAmount(1000);
			Assignment1.printBalance();
			Assignment1.indiviualTransactionSummary();
			
			Assignment_8 Assignment2=new Assignment_8();
			Assignment2.setUserDetails("abc", 45000);
			Assignment2.creditAmount(2000);
			Assignment2.creditAmount(3000);
			Assignment2.creditAmount(4000);
			Assignment2.creditAmount(6000);
			Assignment2.creditAmount(1000);
			Assignment2.debitAmount(1000);
			Assignment2.debitAmount(500);
			Assignment2.indiviualTransactionSummary();
			
			allTransactionSummary();
			}
}


