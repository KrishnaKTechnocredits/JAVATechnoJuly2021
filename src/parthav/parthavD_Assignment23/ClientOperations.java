package parthav.parthavD_Assignment23;

public class ClientOperations {

	public static void main(String[] args) {
		BankingOperations custObject = new BankingOperations();
		//BankingOperations custObject1 = new BankingOperations();
		custObject.setCustomerDetails("Khyati Shah", 20000);
		// custObject1.setCustomerDetails("Parin Shah", 20000);   This will prompt message to the user that its an invalid customer
		custObject.initiateDebitCreditTransactions("Credit", "ICICI", 1000);
		custObject.initiateDebitCreditTransactions("Credit", "ICICI", 1000);
		custObject.initiateDebitCreditTransactions("Credit", "HDFC", 2000);
		custObject.initiateDebitCreditTransactions("Credit", "HDFC", 2000);
		custObject.initiateDebitCreditTransactions("Credit", "SBI", 500);
		custObject.initiateDebitCreditTransactions("Credit", "SBI", 500);
		custObject.initiateDebitCreditTransactions("Credit", "SBI", 500);
		custObject.initiateDebitCreditTransactions("Credit", "SBI", 500);
		custObject.initiateDebitCreditTransactions("Credit", "SBI", 500);
		custObject.initiateDebitCreditTransactions("Credit", "BOB", 500);
		custObject.initiateDebitCreditTransactions("Credit", "BOB", 500);
		custObject.initiateDebitCreditTransactions("Credit", "BOB", 500);
		custObject.initiateDebitCreditTransactions("Credit", "BOB", 500);
		custObject.initiateDebitCreditTransactions("Debit", "ICICI", 500);
		custObject.initiateDebitCreditTransactions("Debit", "ICICI", 500);
		custObject.initiateDebitCreditTransactions("Debit", "HDFC", 1000);
		custObject.initiateDebitCreditTransactions("Debit", "HDFC", 1000);
		custObject.initiateDebitCreditTransactions("Debit", "BOB", 250);
		custObject.initiateDebitCreditTransactions("Debit", "BOB", 250);
		custObject.initiateDebitCreditTransactions("Debit", "SBI", 250);
		custObject.initiateDebitCreditTransactions("Debit", "SBI", 250);
		custObject.showTotalBalance();
		custObject.showIndividualCreditOperations();
		custObject.showIndividualDebitOperations();
		BankingOperations.showTotalCreditDebitTransactions();

	}

}
