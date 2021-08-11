package ramkrishna;

public class Banking {
	
		static int totaldebitCnt;
		static int totalcreditCnt;
		static int totalprintbal;
		int debitCnt,creditCnt,printBal,balanace;
		String customerName;

	    void setCustomerDetails (String custName, int initialBalance){
	    	customerName=custName;
	        balanace= initialBalance;
	    }

		void debit( int debitAmount){
			 balanace= balanace-debitAmount;
	         totaldebitCnt++;
			 debitCnt++;

		}

		void credit(int creditAmount){
			balanace=balanace+creditAmount;
			totalcreditCnt++;
			creditCnt++;

		}

		void printBalance (){
			totalprintbal++;
			printBal++;
			System.out.println(customerName+ "Current balance is :"+ balanace);

		}

		void individualTransactionSummary(){
	      System.out.println(customerName + "'s transaction summary: Credit - " + creditCnt + " times, Debit - " + debitCnt
					+ " times, print Balance - " + printBal + " time");

		}

		void allTransactionSummary() {
			System.out.println("All transaction summary: Credit - " + totalcreditCnt + " times, Debit - "
					+ totaldebitCnt + " times, print Balance - " + totalprintbal + " time");
		}

		public static void main (String[] args){
	       Banking banking_1= new Banking();
	       banking_1.setCustomerDetails("Ramkrishna",10000);
	       banking_1.debit(5000);
	       banking_1.credit(1000);
	       banking_1.credit(3000);
	       banking_1.printBalance();
	       banking_1.allTransactionSummary();

	       Banking banking_2 =new Banking();
	       banking_2.setCustomerDetails("Ram", 50000);
	       banking_2.debit(5000);
	       banking_2.credit(1000);
	       banking_2.credit(3000);
	       banking_2.printBalance();
	       banking_2.allTransactionSummary();


		}
	}

