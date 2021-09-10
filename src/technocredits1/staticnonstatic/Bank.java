package technocredits1.staticnonstatic;

public class Bank {
	
	int debitCnt;
	int creditCnt;
	String customerName;
	
	void setCustomerName(String custName) {
		customerName = custName;
	}
	
	void debitAmt() {
		debitCnt++;
	}
	
	void creditAmt() {
		creditCnt++;
	}
	
	void printdebitTransactions() {
		System.out.println(customerName + " debit count is " + debitCnt);
	}
	
	public static void main(String[] args) {
		Bank bank1 = new Bank();
		bank1.setCustomerName("Maulik");
		bank1.debitAmt();
	
		Bank bank2 = new Bank();
		bank2.setCustomerName("Krishna");
		bank2.debitAmt();
		bank2.debitAmt();

		bank1.printdebitTransactions();
		bank2.printdebitTransactions();
	}
	
}
