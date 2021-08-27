//Assignment 23

import java.util.Scanner;
class Assignment23 {
	
	//int bankIndex=0;
	int creditAll=0;
	int debitAll=0;
	int creditBob=0; int creditHdfc=0; int creditIcici=0; int creditSbi=0;
	int debitBob=0; int debitHdfc=0; int debitIcici=0; int debitSbi=0; 
	double balBob=1000; double balHdfc=2000; double balIcici=3000; double balSbi=4000;
	double bal1=0; double bal2=0; double bal3=0; double bal4=4;
	
	void processBank(int operation) {
		
		Scanner scanner = new Scanner(System.in);
		switch(operation) {
			case 1 :
				System.out.println(" ICICI Bank : 1 \n HDFC Bank : 2 \n BOB Bank : 3 \n SBI : 4");
				
				System.out.println(" Enter the bank for credit operation :: ");
				 int cdt = scanner.nextInt();
				
				switch(cdt) {
					case 1 :
						System.out.println("\n---------------------------------");
						System.out.println(" Welcome to ICICI Bank ");
						System.out.println("Enter amount to be credited ::");
						 bal1 = scanner.nextInt();
						balIcici += bal1;
						System.out.println("ICICI Balance : " + balIcici);
						creditIcici++;
						creditAll++;
						break;
					
					case 2 :
						System.out.println("\n---------------------------------");
						System.out.println(" Welcome to HDFC Bank ");
						System.out.println("Enter amount to be credited ::");
						 bal2= scanner.nextInt();
						balHdfc += bal2;
						System.out.println("HDFC Balance : " + balHdfc);
						creditHdfc++;
						creditAll++;
						break;
					
					case 3 :
						System.out.println("\n---------------------------------");
						System.out.println(" Welcome to BOB Bank ");
						System.out.println("Enter amount to be credited ::");
						 bal3 = scanner.nextInt();
						balBob += bal3;
						System.out.println("BOB Balance : " + balBob);
						creditBob++;
						creditAll++;
						break;
						
					case 4 :
						System.out.println("\n---------------------------------");
						System.out.println(" Welcome to SBI Bank ");
						System.out.println("Enter amount to be credited ::");
						 bal4 = scanner.nextInt();
						balSbi += bal4;
						System.out.println("SBI Balance : " + balSbi);
						creditSbi++;
						creditAll++;
						break;	
					
				}
				break;
			case 2 :
				System.out.println("---------------------------------");
				System.out.println(" ICICI Bank : 1 \n HDFC Bank : 2 \n BOB Bank : 3 \n SBI : 4");
				//Scanner scanner = new Scanner(System.in);
				System.out.println(" Enter the bank for debit operation :: ");
				 int bank = scanner.nextInt();
				
				switch(bank) {
					case 1 :
						System.out.println("\n---------------------------------");
						System.out.println(" Welcome to ICICI Bank ");
						System.out.println("Enter amount to be debited ::");
						bal1 = scanner.nextInt();
						balIcici -= bal1;
						
						System.out.println("ICICI Balance : " + balIcici);
						debitIcici++;
						debitAll++;
						
						break;
					
					case 2 :
						System.out.println("\n---------------------------------");
						System.out.println(" Welcome to HDFC Bank ");
						System.out.println("Enter amount to be debited ::");
						bal2 = scanner.nextInt();
						balHdfc -= bal2;
						System.out.println("HDFC Balance : " + balHdfc);
						debitHdfc++;
						debitAll++;
						break;
					
					case 3 :
						System.out.println("\n---------------------------------");
						System.out.println(" Welcome to BOB Bank ");
						System.out.println("Enter amount to be debited ::");
						bal3 = scanner.nextInt();
						balBob -= bal3;
						System.out.println("BOB Balance : " + balBob);
						debitBob++;
						debitAll++;
						break;
						
					case 4 :
						System.out.println("\n---------------------------------");
						System.out.println(" Welcome to SBI Bank ");
						System.out.println("Enter amount to be debited ::");
						bal4 = scanner.nextInt();
						balSbi -= bal4;
						System.out.println("SBI Balance : " + balSbi);
						debitSbi++;
						debitAll++;
						break;	
					
				}
				
				break;
			case 3:
				System.out.println(" Invalid operation, Exit");
					break;
		}
	}
	
	
	
	void getTotalBalance() {
		System.out.println("\n---------------------------------");
		double totBal = balBob + balHdfc + balIcici + balSbi;
		System.out.println("Total Balance :: "+ totBal);
	
	}
	
	void showTotalOperations() {
		System.out.println("\n---------------------------------");
		System.out.println(" Total number of credit operations :: " + creditAll);
		System.out.println(" Total number of debit operations :: " + debitAll);
	
	}
	
	void showIndividualBankCreditOperations() {
		System.out.println("\n---------------------------------");
		System.out.println(" ICICI credit operations : " + creditIcici);
		System.out.println(" HDFC credit operations : " + creditHdfc);
		System.out.println(" BOB credit operations : " + creditBob);
		System.out.println(" SBI credit operations : " + creditSbi);
	}
	
	void showIndividualBankDebitOperations() {	
		System.out.println("\n---------------------------------");
		System.out.println(" ICICI debit operations : " + debitIcici);
		System.out.println(" HDFC debit operations : " + debitHdfc);
		System.out.println(" BOB debit operations : " + debitBob);
		System.out.println(" SBI debit operations : " + debitSbi);
		
	}
	
	public static void main(String[] args) {
		Assignment23 assignment = new Assignment23();
		System.out.println(" Select operations ::");
		int input=0;
		
		System.out.println(" \n Credit : 1 \n Debit : 2  \n Exit : 3");
		Scanner scanner = new Scanner(System.in);
		
			
		input = scanner.nextInt();
		
		assignment.processBank(input);
		System.out.println(" \n Credit : 1 \n Debit : 2  \n Exit : 3");
				
		input = scanner.nextInt();
		
		assignment.processBank(input);
		System.out.println(" \n Credit : 1 \n Debit : 2  \n Exit : 3");
		  input = scanner.nextInt();
		assignment.processBank(input);
		System.out.println(" \n Credit : 1 \n Debit : 2  \n Exit : 3");
		  input = scanner.nextInt();
		assignment.processBank(input);
		System.out.println(" \n Credit : 1 \n Debit : 2  \n Exit : 3");
		   input = scanner.nextInt();
		assignment.processBank(input); 
		assignment.showIndividualBankCreditOperations();
		assignment.showIndividualBankDebitOperations();
		assignment.showTotalOperations();
		assignment.getTotalBalance();
		
	}
	
}