package ritabrata;


public class Assignment_8 {

	static int countCredit, countDebit, totalBalanceCount ;
	int balance, creditCount, debitCount, balanceCount;
	String name;
	void setUserDetails(String userName, int initialBalance) {
		name = userName;
		balance= initialBalance;
		System.out.println("User name: "+ userName+ "; Balance: "+ initialBalance);
	}
	
	void debitAmmount(int debit) {
		if(balance>=debit) {
			balance= balance- debit;
			System.out.println("Debited amount: "+debit);
			countDebit++;
			debitCount++;
		}
		else
			System.out.println("Fund insufficient, enter valid amount");
	}
	
	void creditAmmount(int credit) {
		balance= balance+ credit;
		System.out.println("Credited amount: "+credit);
		creditCount++;
		countCredit++;
	}
	
	void printBalance() {
		System.out.println("Available balance: "+balance);
		balanceCount++;
		totalBalanceCount++;
		
	}
	void individualTransactionSummary() {
		System.out.println(name+"'s transaction Summery: Debit "+debitCount+ "times, Credit: "+ creditCount+"times, Balance checked: "+balanceCount +"times");
		
	}
	static void allTransactionSummary() {
		System.out.println("Total ransaction Summery: Debit "+countDebit+ "times, Credit: "+ countCredit+"times, Balance Checked: "+totalBalanceCount +"times");
		
		
	}
	public static void main(String[] args) {
		Assignment_8 customer1= new Assignment_8();
		System.out.println("Transaction details for Customer1:");
		customer1.setUserDetails("Ritabrata", 10000);
		customer1.debitAmmount(5000);
		customer1.printBalance();
		customer1.creditAmmount(2000);
		customer1.debitAmmount(1000);
		customer1.printBalance();
		customer1.individualTransactionSummary();
		System.out.println("---------------------------------------");
		
		Assignment_8 customer2= new Assignment_8();
		System.out.println("Transaction details for Customer2:");
		customer2.setUserDetails("Bhattacharyya", 55000);
		customer2.debitAmmount(5000);
		customer2.printBalance();
		customer2.creditAmmount(2000);
		customer2.creditAmmount(1000);
		customer2.printBalance();
		customer2.creditAmmount(2552);
		customer2.creditAmmount(750);
		customer2.printBalance();
		customer2.debitAmmount(1000);
		customer2.printBalance();
		customer2.individualTransactionSummary();
		System.out.println("----------------------------------------");
		allTransactionSummary();
		

	}

}

