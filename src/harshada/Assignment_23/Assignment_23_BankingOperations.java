/*
Assignment - 23 : 27th Aug'2021

A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
         a) Person can debit or credit amount from respective bank.
             Hint : Switch case is expected here. [Please watch today's recording again, in case of confusion.]

         b) A Method to show total balance [ICICI balance + HDFC balance + BOB balance + SBI Balance]

         c) A Method to show total credit, debit operations 
                output : Total credit operation - 7 times
                             Total debit operation - 5 times

        d) A Method to show individual bank credit operations.
               output : ICICI bank Credit Operation - 2
                        HDFC bank Credit Operation - 2
		                 SBI bank Credit Operation - 1
                        BOB bank Credit Operation - 4
                        SBI bank Credit Operation - 4


        e) A Method to show individual bank debit operations.
               output : ICICI bank Debit Operation - 2
                        HDFC bank Debit Operation - 2
BOB bank Debit Operation - 2
		 SBI bank Debit Operation - 2
*/
package harshada.Assignment_23;
import java.util.Scanner;

public class Assignment_23_BankingOperations {

	static int iciciBalance;
	static int hdfcBalance;
	static int bobBalance;
	static int sbiBalance;
	static String userName;
	static int hdfcCreditCount=0;
	static int hdfcDebitCount;
	static int hdfcPrintCount;
	static int iciciCreditCount;
	static int iciciDebitCount;
	static int iciciPrintCount;
	static int bobCreditCount;
	static int bobDebitCount;
	static int bobPrintCount;
	static int sbiCreditCount;
	static int sbiDebitCount;
	static int sbiPrintCount;
	static int total_credit_count;
	static int total_debit_count;
	static int total_printBalance_count;
	static int totalBalance;
	
	
	void chooseBank(String choice, int operationCode) {
		
		switch(choice) {
		case "ICICI":
			
			if(operationCode==1) {
				processCredit("ICICI");
			}
			if(operationCode==2) {
				processDebit("ICICI");
			}
			if(operationCode==3) {
				printBalance("ICICI");
			}
			
			break;
		case "HDFC":
			
			if(operationCode==1) {
				processCredit("HDFC");
			}
			if(operationCode==2) {
				processDebit("HDFC");
			}
			if(operationCode==3) {
				printBalance("HDFC");
			}
			
			break;
		case "BOB":
			//Scanner sc3=new Scanner(System.in);
			//System.out.println("Welcome to BOB Bank \n Enter CHOICE CODE 1. Credit Operation 2.Debit Operation 3. Print Balance  ");
			//int operationCode3=sc3.nextInt();
			if(operationCode==1) {
				processCredit("BOB");
			}
			if(operationCode==2) {
				processDebit("BOB");
			}
			if(operationCode==3) {
				printBalance("BOB");
			}
			//sc3.close();
			break;
		case "SBI":
			//Scanner sc4=new Scanner(System.in);
			//System.out.println("Welcome to SBI Bank \n Enter CHOICE CODE 1. Credit Operation 2.Debit Operation 3. Print Balance  ");
			//int operationCode=sc4.nextInt();
			if(operationCode==1) {
				processCredit("SBI");
			}
			if(operationCode==2) {
				processDebit("SBI");
				sbiDebitCount++;
			}
			if(operationCode==3) {
				printBalance("SBI");
				sbiPrintCount++;
			}
			//sc4.close();
			break;
		default:
			System.out.println("Invalid Bank Selection Choice !!! Try Again ");
		
		}
	}
	
	static void processCredit(String bName) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amout to Credit into account ");
		int creditAmount=sc.nextInt();
		if(bName.equals("ICICI")) {
			iciciBalance = iciciBalance + creditAmount;
			iciciCreditCount++;
		}
		
		if(bName.equals("HDFC")) {
			hdfcBalance = hdfcBalance + creditAmount;
			hdfcCreditCount++;
		}
		
		if(bName.equals("BOB")) {
			bobBalance = bobBalance + creditAmount;
			bobCreditCount++;
		}
		
		if(bName.equals("SBI")) {
			sbiBalance = sbiBalance + creditAmount;
			sbiCreditCount++;
		}
		total_credit_count ++;
	}
	 
	static void processDebit(String bName) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amout to Debit from account ");
		int debitAmount=sc.nextInt();
		if(bName.equals("ICICI")) {
			iciciBalance = iciciBalance - debitAmount;
			iciciDebitCount++;
		}
		
		if(bName.equals("HDFC")) {
			hdfcBalance = hdfcBalance - debitAmount;
			hdfcDebitCount++;
		}
		
		if(bName.equals("BOB")) {
			bobBalance = bobBalance - debitAmount;
			bobDebitCount++;
		}
		
		if(bName.equals("SBI")) {
			sbiBalance = sbiBalance - debitAmount;
			sbiDebitCount++;
		}
		total_debit_count ++;
	}
	 
	static void printBalance(String bName) {
		if(bName.equals("ICICI")) {
		System.out.println("Availabe Balance in ICICI Account= "+ iciciBalance );
		iciciPrintCount ++;
		total_printBalance_count ++;
		}
		
		if(bName.equals("HDFC")) {
			System.out.println("Availabe Balance in HDFC Account = "+ hdfcBalance );
			hdfcPrintCount ++;
			total_printBalance_count ++;
			}
		
		if(bName.equals("BOB")) {
			System.out.println("Availabe Balance in BOB Account = "+ bobBalance );
			bobPrintCount ++;
			total_printBalance_count ++;
			}
		
		if(bName.equals("SBI")) {
			System.out.println("Availabe Balance in SBI Account = "+ sbiBalance );
			sbiPrintCount ++;
			total_printBalance_count ++;
			}
	}
	void displayTotalBalance() {
		totalBalance=iciciBalance+hdfcBalance+bobBalance+sbiBalance;
		System.out.println("Total balance available in all four bank accounts are : "+ totalBalance);
		
	}
	
	void displayTotalCreditDebitCount() {
		total_credit_count=hdfcCreditCount+iciciCreditCount+bobCreditCount+sbiCreditCount;
		total_debit_count=hdfcDebitCount+iciciDebitCount+bobDebitCount+sbiDebitCount;
		System.out.println("Total Credit is = "+ total_credit_count+ " times");
		System.out.println("Total Debit is = "+ total_debit_count+ " times");
	}
	 void setInfo() {
		 	System.out.println("Transaction Summary:"); 
			System.out.println( "User Name= "+ userName);
	 }
	
	void individualTransactionSummary(String bankName) {
		if(bankName=="ICICI") {
			System.out.println( " Individual bank summary of " + bankName + "is shown below");
			System.out.println( "Credit Transactions=  "+ iciciCreditCount);
			System.out.println( "Debit Transactions= " + iciciDebitCount);
			System.out.println( "Print Balance Statements = "+ iciciPrintCount+ "\n");
		}
		if(bankName=="HDFC") {
			System.out.println( " Individual bank summary of " + bankName + "is shown below");
			System.out.println( "Credit Transactions=  "+ hdfcCreditCount);
			System.out.println( "Debit Transactions= " + hdfcDebitCount);
			System.out.println( "Print Balance Statements = "+ hdfcPrintCount+ "\n");
		}
		if(bankName=="BOB") {
		System.out.println( "Credit Transactions=  "+ bobCreditCount);
		System.out.println( "Debit Transactions= " + bobDebitCount);
		System.out.println( "Print Balance Statements = "+ bobPrintCount+ "\n");
		}
		if(bankName=="SBI") {
			System.out.println( "Credit Transactions=  "+ sbiCreditCount);
			System.out.println( "Debit Transactions= " + sbiDebitCount);
			System.out.println( "Print Balance Statements = "+ sbiPrintCount+ "\n");
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_23_BankingOperations assignment23=new Assignment_23_BankingOperations();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user name");
		userName=sc.next();
		int choice=1;
		while(choice==1) {
		System.out.println("Enter the bank name from which the banking operations are to be performed: 1. ICICI 2. HDFC 3.BOB 4. SBI ");
		String bankName=sc.next();
		System.out.println("Welcome to " +bankName+ "  Bank \nEnter CHOICE CODE 1. Credit Operation 2.Debit Operation 3. Print Balance  ");
		int operationCode=sc.nextInt();
		assignment23.chooseBank(bankName, operationCode);
		System.out.println("To continue Press 1" );
		choice=sc.nextInt();
		}
		System.out.println("\n **********************************");
		assignment23.setInfo();
		System.out.println("Enter bank name for printing Individual transaction summary ");
		String bankName1=sc.next();
		assignment23.individualTransactionSummary(bankName1);
		assignment23.displayTotalCreditDebitCount();
		assignment23.displayTotalBalance();
		sc.close();
		
	}

}