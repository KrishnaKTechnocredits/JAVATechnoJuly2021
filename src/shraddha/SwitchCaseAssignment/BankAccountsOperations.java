/*A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
          a) Person can debit or credit amount from respective bank.
              Hint : Switch case is expected here.

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
		 SBI bank Debit Operation - 2*/

package shraddha.SwitchCaseAssignment;

import java.util.Scanner;

public class BankAccountsOperations {
	// each bank balance
	float hdfcBalance;
	float icicicbalance;
	float sbiBalance;
	float bobBalance;
	// each bank credit counters
	int iciciCreditCount;
	int hdfcCreditCount;
	int sbiCreditCount;
	int bobCreditCount;
	// each bank debit counters
	int sbiDebitCount;
	int iciciDebitCount;
	int hdfcDebitCount;
	int bobDebitCount;
	// Common Counters
	static int debitCount;
	static int creditCount;
	int totalBalance;

	public static void main(String[] args) {
		BankAccountsOperations bankObject = new BankAccountsOperations();
		bankObject.bankingOperations();
	}

	void bankingOperations() {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		do {
		System.out.println(
				"Please Enter bank name to proceed from the following options:- 1) ICICI  2) HDFC   3) SBI   4) BOB ");
		String input = sc.next().toLowerCase();
		switch (input) {
		case "icici":
			if (icicicbalance == 0) {
				System.out.println("Please Set initial balance");
				icicicbalance = sc.nextInt();
			}
			System.out.println(
					"Enter the operation to be performed :- 1) For Credit please press 'C'   2) For Debit please press 'D'");
			String iciciOperation = sc.next();
			if (iciciOperation.equalsIgnoreCase("C")) {
				System.out.println("Enter Amount to be Credited in your account :- ");
				float creditAmt = Float.parseFloat(sc.next());
				if (creditAmt != 0) {
					iciciCreditCount++;
					creditCount++;
					icicicbalance += creditAmt;
				}
			} else if (iciciOperation.equalsIgnoreCase("D")) {
				System.out.println("Enter Amount to be debitted from your account :- ");
				float debitAmt = Float.parseFloat(sc.next());
				if (debitAmt != 0 && debitAmt <= icicicbalance) {
					iciciDebitCount++;
					debitCount++;
					icicicbalance -= debitAmt;
				} else if(debitAmt == 0) {
					System.out.println("Please enter Valid Amount");
				} else {
					System.out.println("Cannot deduct entered amount from the account. Insufficient Balance !!");
				}
			} else
				System.out.println("Invalid input !!");
			System.out.println();
			break;
		case "sbi":
			if (sbiBalance == 0) {
				System.out.println("Please Set initial balance");
				sbiBalance = sc.nextInt();
			}
			System.out.println(
					"Enter the operation to be performed :- 1) For Credit please press 'C'   2) For Debit please press 'D'");
			String sbioperation = sc.next();
			if (sbioperation.equalsIgnoreCase("C")) {
				System.out.println("Enter Amount to be Credited in your account :- ");
				float creditAmt = Float.parseFloat(sc.next());
				if (creditAmt != 0) {
					sbiCreditCount++;
					creditCount++;
					sbiBalance += creditAmt;
				}
			} else if (sbioperation.equalsIgnoreCase("D")) {
				System.out.println("Enter Amount to be debitted from your account :- ");
				float debitAmt = Float.parseFloat(sc.next());
				if (debitAmt != 0 && debitAmt <= sbiBalance) {
					sbiDebitCount++;
					debitCount++;
					sbiBalance -= debitAmt;
				} else if(debitAmt == 0) {
					System.out.println("Please enter Valid Amount");
				} else {
					System.out.println("Cannot deduct entered amount from the account. Insufficient Balance !!");
				}
			} else
				System.out.println("Invalid input !!");
			break;
		case "hdfc":
			if (hdfcBalance == 0) {
				System.out.println("Please Set initial balance");
				hdfcBalance = sc.nextInt();
			}
			System.out.println(
					"Enter the operation to be performed :- 1) For Credit please press 'C' 2) For Debit please press 'D'");
			String hdfcoperation = sc.next();
			if (hdfcoperation.equalsIgnoreCase("C")) {
				System.out.println("Enter Amount to be Credited in your account :- ");
				float creditAmt = Float.parseFloat(sc.next());
				if (creditAmt != 0) {
					hdfcCreditCount++;
					creditCount++;
					hdfcBalance += creditAmt;
				}
				break;
			} else if (hdfcoperation.equalsIgnoreCase("D")) {
				System.out.println("Enter Amount to be debitted from your account :- ");
				float debitAmt = Float.parseFloat(sc.next());
				if (debitAmt != 0 && debitAmt <= hdfcBalance) {
					hdfcDebitCount++;
					debitCount++;
					hdfcBalance -= debitAmt;
				} else if(debitAmt == 0) {
					System.out.println("Please enter Valid Amount");
				} else {
					System.out.println("Cannot deduct entered amount from the account. Insufficient Balance !!");
				}
				break;
			} else
				System.out.println("Invalid input !!");
			break;
		case "bob":
			if (bobBalance == 0) {
				System.out.println("Please Set initial balance");
				bobBalance = sc.nextInt();
			}
			System.out.println(
					"Enter the operation to be performed :- 1) For Credit please press 'C'  2) For Debit please press 'D'");
			String boboperation = sc.next();
			if (boboperation.equalsIgnoreCase("C")) {
				System.out.println("Enter Amount to be Credited in your account :- ");
				float creditAmt = Float.parseFloat(sc.next());
				if (creditAmt != 0) {
					bobCreditCount++;
					creditCount++;
					bobBalance += creditAmt;
				}
				break;
			} else if (boboperation.equalsIgnoreCase("D")) {
				System.out.println("Enter Amount to be debitted from your account :- ");
				float debitAmt = Float.parseFloat(sc.next());
				if (debitAmt != 0 && debitAmt <= bobBalance) {
					bobDebitCount++;
					debitCount++;
					bobBalance -= debitAmt;
				}else if(debitAmt == 0) {
					System.out.println("Please enter Valid Amount");
				} else {
					System.out.println("Cannot deduct entered amount from the account. Insufficient Balance !!");
				}
				break;
			} else
				System.out.println("Invalid input !!");
			break;

		default:
			System.out.println("Invalid Name.......!!");
			break;
		}
			System.out.println("Press X to exit banking OR press any other key to continue.");
			char key = sc.next().charAt(0);
			if(key=='x' || key =='X') {
				balanceDisplayAllBankAccounts();
				displayTotalOperations();
				displayIndividualOperations();
			break;
			}
			else
				continue;
		} while(i>0);
		

	}

	void balanceDisplayAllBankAccounts() {
		System.out.println("---------------------------------------------");
		System.out.println("Total balance inclusive of all accounts is: "
				+ (icicicbalance + hdfcBalance + sbiBalance + bobBalance));
	}

	void displayTotalOperations() {
		System.out.println("---------------------------------------------");
		System.out.println("Total Credit operations : " + creditCount + "\nTotal Debit operations : " + debitCount);
	}

	void displayIndividualOperations() {
		System.out.println("---------------------------------------------");
		if (creditCount != 0) {
			if (iciciCreditCount != 0)
				System.out.println("ICICI credit operations : " + iciciCreditCount);
			if (hdfcCreditCount != 0)
				System.out.println("HDFC credit operations : " + hdfcCreditCount);
			if (bobCreditCount != 0)
				System.out.println("BOB credit operations : " + bobCreditCount);
			if (sbiCreditCount != 0)
				System.out.println("SBI credit operations : " + sbiCreditCount);
		}
		System.out.println("---------------");
		if (debitCount != 0) {
			if (iciciDebitCount != 0)
				System.out.println("ICICI debit operations : " + iciciDebitCount);
			if (hdfcDebitCount != 0)
				System.out.println("HDFC debit operations : " + hdfcDebitCount);
			if (bobDebitCount != 0)
				System.out.println("BOB debit operations : " + bobDebitCount);
			if (sbiDebitCount != 0)
				System.out.println("SBI debit operations : " + sbiDebitCount);
		}
	}

}
