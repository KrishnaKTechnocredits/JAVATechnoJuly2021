package parthav.parthavD_Assignment23;

public class BankingOperations {

	private String customerName;
	private static int totalCreditTransactions;
	private static int totalDebitTransactions;
	private double iciciBalance;
	private double hdfcBalance;
	private double bobBalance;
	private double sbiBalance;
	private int iciciTotalCreditTransactions;
	private int hdfcTotalCreditTransactions;
	private int sbiTotalCreditTransactions;
	private int bobTotalCreditTransactions;
	private int bobTotalDebitTransactions;
	private int sbiTotalDebitTransactions;
	private int hdfcTotalDebitTransactions;
	private int iciciTotalDebitTransactions;

	// Added an extra validation of specific customer just to highlight as an example the kind of validation we can implement for this method.
	//This way we can ensure that invalid / non allowed customers cannot proceed with this and other non-private methods
	void setCustomerDetails(String custName, double balance) {
		if (custName == "Khyati Shah") {
			customerName = custName;
			setBalance(custName, balance);			
		}
		
		else
			System.out.println("This customer is not allowed to set the balance");
	}
	
	private void setBalance(String custName, double balance) {
		
			iciciBalance = balance;
			hdfcBalance = balance;
			bobBalance = balance;
			sbiBalance = balance;
			System.out.println("Initial balance set successfully");
			System.out.println(" The initial balance for customer " + customerName + " is " + (iciciBalance + hdfcBalance
					+ sbiBalance + bobBalance));
		
	}
	

	void initiateDebitCreditTransactions(String operation, String bankName, double amount) {
		if (customerName == "Khyati Shah")
			creditDebitOperations(operation, bankName, amount);
		else
			System.out.println("This customer is not allowed to initiate Debit / Credit transactions");

	}

	private void creditDebitOperations(String operation, String bankName, double amount) {
		switch (bankName) {
		case "HDFC":
			switch (operation) {
			case "Credit":
				hdfcBalance += amount;
				hdfcTotalCreditTransactions++;
				totalCreditTransactions++;
				break;

			case "Debit":
				if (amount < hdfcBalance) {
					hdfcBalance -= amount;
					hdfcTotalDebitTransactions++;
					totalDebitTransactions++;
				}

				else
					System.out.println("Insufficient balance");
				break;

			default:
				System.out.println("Invalid operation");
				break;

			}
			break;

		case "ICICI":
			switch (operation) {
			case "Credit":
				iciciBalance += amount;
				iciciTotalCreditTransactions++;
				totalCreditTransactions++;
				break;

			case "Debit":
				if (amount < iciciBalance) {
					iciciBalance -= amount;
					iciciTotalDebitTransactions++;
					totalDebitTransactions++;

				}

				else
					System.out.println("Insufficient balance");
				break;

			default:
				System.out.println("Invalid operation");
				break;

			}
			break;

		case "BOB":
			switch (operation) {
			case "Credit":
				bobBalance += amount;
				bobTotalCreditTransactions++;
				totalCreditTransactions++;
				break;

			case "Debit":
				if (amount < bobBalance) {
					bobBalance -= amount;
					bobTotalDebitTransactions++;
					totalDebitTransactions++;
				}

				else
					System.out.println("Insufficient balance");
				break;

			default:
				System.out.println("Invalid operation");
				break;

			}
			break;

		case "SBI":
			switch (operation) {
			case "Credit":
				sbiBalance += amount;
				sbiTotalCreditTransactions++;
				totalCreditTransactions++;
				break;

			case "Debit":
				if (amount < sbiBalance) {
					sbiBalance -= amount;
					sbiTotalDebitTransactions++;
					totalDebitTransactions++;
				}

				else
					System.out.println("Insufficient balance");
				break;

			default:
				System.out.println("Invalid operation");
				break;

			}
			break;

		default:
			System.out.println("Invalid bank selected");

		}

	}

	void showTotalBalance() {
		if (customerName == "Khyati Shah")
			System.out.println(" The total balance for customer " + customerName + " is " + (iciciBalance + hdfcBalance
					+ sbiBalance + bobBalance));
		else
			System.out.println("This customer does not have the account in the bank");
	}

	void showIndividualCreditOperations() {
		if (customerName == "Khyati Shah") {
			System.out.println(" The individual number of HDFC credit transactions for customer " + customerName
					+ " is " + hdfcTotalCreditTransactions);
			System.out.println(" The individual number of ICICI credit transactions for customer " + customerName
					+ " is " + iciciTotalCreditTransactions);
			System.out.println(" The individual number of BOB credit transactions for customer " + customerName + " is "
					+ bobTotalCreditTransactions);
			System.out.println(" The individual number of SBI credit transactions for customer " + customerName + " is "
					+ sbiTotalCreditTransactions);
		}

		else
			System.out.println("This customer is not yet eligible to view credit transactions");
	}

	void showIndividualDebitOperations() {
		if (customerName == "Khyati Shah") {
			System.out.println(" The individual number of HDFC debit transactions for customer " + customerName + " is "
					+ hdfcTotalDebitTransactions);
			System.out.println(" The individual number of ICICI credit transactions for customer " + customerName
					+ " is " + iciciTotalDebitTransactions);
			System.out.println(" The individual number of BOB credit transactions for customer " + customerName + " is "
					+ bobTotalDebitTransactions);
			System.out.println(" The individual number of SBI credit transactions for customer " + customerName + " is "
					+ sbiTotalDebitTransactions);
		}

		else
			System.out.println("This customer is not yet eligible to view debit transactions");
	}

	static void showTotalCreditDebitTransactions() {
		System.out.println("The total number of debit transactions in the bank are: " + totalDebitTransactions);
		System.out.println("The total number of credit transactions in the bank are: " + totalCreditTransactions);
	}

}
