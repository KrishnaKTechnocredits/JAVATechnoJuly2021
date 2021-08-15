package astha.Assignment8;

public class Assignment8 {
	
	String customerName;
	double totalBalance;
	int debitCount, creditCount, printCount;
	static int totalDebitCount, totalCreditCount, totalPrintCount;
	
	void setDetails(String userName,double balanceAmount) {
		customerName = userName;
		totalBalance = balanceAmount;
	}

	void debitOperation(double debitAmount) {
		if (totalBalance > debitAmount) {
		totalBalance -= debitAmount;
		debitCount++;
		totalDebitCount++;
		}
		else
			System.out.println("Insufficient Balance");
	}
	
	void creditOperation(double creditAmount) {
		totalBalance += creditAmount;
		creditCount++;
		totalCreditCount++;
	}
	
	void printBalance() {
		System.out.println("The total balance is : "+totalBalance);
		printCount++;
		totalPrintCount++;
	}
	
	void individualTransactionSummary() {
		System.out.println(customerName+" transaction summary : Credit - "+creditCount+" times, Debit - "+debitCount+" times, printBalance - "+printCount+" times");
	}
	
	void allTransactionSummary() {
		System.out.println("All transaction summary : Credit - "+totalCreditCount+"times, Debit - "+totalDebitCount+" times, printBalance - "+totalPrintCount+" times");
				
	}
	
	public static void main(String[] args) {
		Assignment8 assignment8_1 = new Assignment8();
		assignment8_1.setDetails("Astha Prakash",20000);
		assignment8_1.debitOperation(3000);
		assignment8_1.printBalance();
		assignment8_1.debitOperation(1000);
		assignment8_1.printBalance();
		assignment8_1.creditOperation(4000);
		assignment8_1.printBalance();
		assignment8_1.creditOperation(2000);
		assignment8_1.printBalance();
		assignment8_1.creditOperation(1000);
		assignment8_1.printBalance();
		assignment8_1.individualTransactionSummary();
		Assignment8 assignment8_2 = new Assignment8();
		assignment8_2.setDetails("Ankita Prakash",50000);
		assignment8_2.debitOperation(10000);
		assignment8_2.printBalance();
		assignment8_2.creditOperation(4000);
		assignment8_2.printBalance();
		assignment8_2.creditOperation(2000);
		assignment8_2.creditOperation(1000);
		assignment8_2.creditOperation(1000);
		assignment8_2.printBalance();
		assignment8_2.individualTransactionSummary();
		assignment8_2.allTransactionSummary();
	}
}
