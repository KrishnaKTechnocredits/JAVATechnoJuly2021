package gauravk.Assignment_23;

import java.util.Scanner;

/*
 * Assignment - 23 : 27th Aug'2021

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
public class BanksSummaryOperationsAndStatus {
	Scanner sc = new Scanner(System.in);
	double balanceICICI=5000, balanceHDFC=9000, balanceBOB=11000, balanceSBI=10000;
	int crCountICICI, crCountHDFC, crCountBOB, crCountSBI, dbCountICICI, dbCountHDFC, dbCountBOB, dbCountSBI, totalCreditCount, totalDebitCount;
	
	void multiBankingPortal() {
		
		System.out.print("Enter your First name: ");
		String fName = sc.next();
		System.out.println("Welcome to Banking Portal, "+fName+". Now enter your pin: ");
		int pwd = sc.nextInt();
		operationMenu(fName);
	}
	
	void operationMenu(String name) {
		System.out.println("Please select the bank by typing a letter against banks :");
		int i=1;
		do {
			System.out.println("I --> ICIC bank\nH --> HDFC bank\nB --> BOB bank\nS --> SBI bank\nX --> Exit.");
			char bankSelection = sc.next().charAt(0);
			switch(bankSelection) {
				case 'i':
				case 'I':
					System.out.println("Select the operation. \nC --> Credit\nD --> Debit\n any other key --> Exit");
					char op = sc.next().charAt(0);
					switch(op) {
						case 'c':
						case 'C':
							System.out.println("Enter credit amount.");
							double crAmount = sc.nextDouble();
							if(crAmount>0) {
								balanceICICI += crAmount;
								crCountICICI++;
								totalCreditCount++;
							}
							break;
						case 'd':
						case 'D':
							System.out.println("Enter debit amount.");
							double dbAmount = sc.nextDouble();
							if(dbAmount>0 && dbAmount<=balanceICICI) {
								balanceICICI -= dbAmount;
								dbCountICICI++;
								totalDebitCount++;
							}
							break;
						default:
							break;
					}
					break;		
				case 'h':
				case 'H':
					System.out.println("Select the operation. \nC --> Credit\nD --> Debit\n any other key --> Exit");
					char op1 = sc.next().charAt(0);
					switch(op1) {
						case 'c':
						case 'C':
							System.out.println("Enter credit amount.");
							double crAmountHDFC = sc.nextDouble();
							if(crAmountHDFC>0) {
								balanceHDFC += crAmountHDFC;
								crCountHDFC++;
								totalCreditCount++;
							}
							break;
						case 'd':
						case 'D':
							System.out.println("Enter debit amount.");
							double dbAmountHDFC = sc.nextDouble();
							if(dbAmountHDFC>0 && dbAmountHDFC<=balanceHDFC) {
								balanceHDFC -= dbAmountHDFC;
								dbCountHDFC++;
								totalDebitCount++;
							}
							break;
						default:
							break;
					}
					break;
				case 'b':
				case 'B':
					System.out.println("Select the operation. \nC --> Credit\nD --> Debit\n any other key --> Exit");
					char op2 = sc.next().charAt(0);
					switch(op2) {
						case 'c':
						case 'C':
							System.out.println("Enter credit amount.");
							double crAmountBOB = sc.nextDouble();
							if(crAmountBOB>0) {
								balanceBOB += crAmountBOB;
								crCountBOB++;
								totalCreditCount++;
							}	
							break;
						case 'd':
						case 'D':
							System.out.println("Enter debit amount.");
							double dbAmountBOB = sc.nextDouble();
							if(dbAmountBOB>0 && dbAmountBOB<=balanceBOB) {
								balanceBOB -= dbAmountBOB;
								dbCountBOB++;
								totalDebitCount++;
							}
							break;
						default:
							break;
					}
					break;
				case 's':
				case 'S':
					System.out.println("Select the operation. \nC --> Credit\nD --> Debit\n any other key --> Exit");
					char op3 = sc.next().charAt(0);
					switch(op3) {
						case 'c':
						case 'C':
							System.out.println("Enter credit amount.");
							double crAmountSBI = sc.nextDouble();
							if(crAmountSBI>0) {
								balanceSBI += crAmountSBI;
								crCountSBI++;
								totalCreditCount++;
							}	
							break;
						case 'd':
						case 'D':
							System.out.println("Enter debit amount.");
							double dbAmountSBI = sc.nextDouble();
							if(dbAmountSBI>0 && dbAmountSBI<=balanceSBI) {
								balanceSBI -= dbAmountSBI;
								dbCountSBI++;
								totalDebitCount++;
							}
							break;
						default:
							break;
					}
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
		System.out.println("Total balance inclusive of all accounts is: "+(balanceICICI+balanceHDFC+balanceBOB+balanceSBI));
	}
	
	void displayTotalOperations() {
		System.out.println("Total Credit operations : "+totalCreditCount+"\nTotal Debit operations : "+totalDebitCount);
	}
	
	void displayIndividualOperations() {
		if(totalCreditCount!=0) {
			if(crCountICICI!=0)
				System.out.println("ICIC credit operations : "+crCountICICI);
			if(crCountHDFC!=0)
				System.out.println("HDFC credit operations : "+crCountHDFC);
			if(crCountBOB!=0)
				System.out.println("BOB credit operations : "+crCountBOB);
			if(crCountSBI!=0)
				System.out.println("SBI credit operations : "+crCountSBI);
		}
		if(totalDebitCount!=0) {
			if(dbCountICICI!=0)
				System.out.println("ICIC debit operations : "+dbCountICICI);
			if(dbCountHDFC!=0)
				System.out.println("HDFC debit operations : "+dbCountHDFC);
			if(dbCountBOB!=0)
				System.out.println("BOB debit operations : "+dbCountBOB);
			if(dbCountSBI!=0)
				System.out.println("SBI debit operations : "+dbCountSBI);
		}
	}
		
	public static void main(String[] args) {
		BanksSummaryOperationsAndStatus operator = new BanksSummaryOperationsAndStatus();
		operator.multiBankingPortal();
	}
}
