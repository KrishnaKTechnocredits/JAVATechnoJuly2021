package Sourabh_Assignment_23;

import java.util.Scanner;

class BankUsingSwitch{
double iciciBal = 10000;
double hdfcBal = 30000;
double sbiBal = 50000;
double bobBal = 40000;

int icicidebitcount, hdfcdebitcount, sbidebitcount, bobcreditcount ;
int icicicreditcount, hdfccreditcount, sbicreditcount, bobdebitcount;

static int totaldebitcount;
static int totalcreditcount;

void operation(String bankname, String operation, double amount){

	switch(operation.toUpperCase()){

		
		case "DEBIT" :              //debit
			switch(bankname.toUpperCase()){

				case "ICICI" :              //icici
					if(iciciBal>=amount){
						iciciBal = iciciBal - amount;
						System.out.println("\nICICI TOTAL BALANCE : "+iciciBal);
					}else{
						System.out.println("Not Sufficient Balance");
					}
					icicidebitcount+=1;
					totaldebitcount+=1;


					break;


				case "HDFC" :                  //hdfc
					if(hdfcBal>=amount){
						hdfcBal = hdfcBal - amount;
					System.out.println("HDFC TOTAL BALANCE : "+hdfcBal);
					}else{
						System.out.println("Not Sufficient Balance");
					}
					hdfcdebitcount+=1;
					totaldebitcount+=1;

					break;

				case "sbi" :                              //sbi
					if(sbiBal>=amount){
						sbiBal = sbiBal - amount;
						System.out.println("SBI TOTAL BALANCE : "+sbiBal);
					}else{
						System.out.println("Not Sufficient Balance");
					}
					sbidebitcount+=1;
					totaldebitcount+=1;
					break;


				case "BOB" :             //bob
					if(bobBal>=amount){
						bobBal = bobBal - amount;
						System.out.println("BOB TOTAL BALANCE : "+bobBal);
					}else{
						System.out.println("Not Sufficient Balance");
					}
					bobdebitcount+=1;
					totaldebitcount+=1;
					break;

					default :
						System.out.println("Given Bank Option is not available...");
			}
			break;

		
		case "CREDIT" :                          //credit
			switch(bankname.toUpperCase()){
			
				case "ICICI" :                         //icici
						iciciBal = iciciBal + amount;
						System.out.println("\nICICI TOTAL BALANCE : "+iciciBal);

						icicicreditcount+=1;
					totalcreditcount+=1;
						break;

	
					case "HDFC" :         //hdfc
						hdfcBal = hdfcBal + amount;
						System.out.println("\nHDFC TOTAL BALANCE : "+hdfcBal);

						hdfccreditcount+=1;
					totalcreditcount+=1;
						break;

			
					case "SBI" :                //sbi
						sbiBal = sbiBal + amount;
						System.out.println("\nSBI TOTAL BALANCE : "+sbiBal);

						sbicreditcount+=1;
					totalcreditcount+=1;

					break;

			
					case "BOB" :             //bob 
						bobBal = bobBal + amount;
						System.out.println("\nBOB TOTAL BALANCE : "+bobBal);

						bobcreditcount+=1;
					totalcreditcount+=1;
					break;

					default :
						System.out.println("Given Bank Option is not available...");
			}			
			break;

		default :
			System.out.println("Operation Not Allowed...");
	}
}

void individualcreditoperations(){

	System.out.println("\n------------------------CREDIT DETAILS----------------------------" );	
	System.out.println("\nICICI Credit operation: " + icicicreditcount);
	System.out.println("\nHDFC Credit operation: " + hdfccreditcount);
	System.out.println("\nSBI Credit operation: " + sbicreditcount);
	System.out.println("\nBOB Credit operation: " + bobcreditcount);
}

void individualdebitoperations(){
	System.out.println("\n----------------------DEBIT Details------------------------------" );	
	System.out.println("\nICICI Debit operation: " + icicidebitcount);
	System.out.println("\nHDFC Debit operation: " + hdfcdebitcount);
	System.out.println("\nSBI Debit operation: " + sbidebitcount);
	System.out.println("\nBOB Debit operation: " + bobdebitcount);
}

void allTransactionSummary(){

		System.out.println("\n---------------------Total Transaction Details-------------------------------" );	

	System.out.println("Total Credit Count : "+totalcreditcount);
	System.out.println("Total Debit Count : "+totaldebitcount);
} 

public static void main(String[] args){
	BankUsingSwitch bankdetails = new BankUsingSwitch();

	Scanner scanner = new  Scanner(System.in);
	System.out.println("\nEnter the Transaction Count : ");
	int transaction = scanner.nextInt();

	for (int index = 1 ; index <= transaction ; index++)
	{	
	System.out.println("\nSelect Your Bank : 1)ICICI 2)HDFC 3)SBI 4)BOB ");
	String bankname = scanner.next();

	System.out.println("\nSelect Your Input DEBIT OR CREDIT : ");
	String operation = scanner.next();

	System.out.println("\nEnter the Amount : ");
	double amount = scanner.nextDouble();

	bankdetails.operation(bankname,operation,amount);
	}

	bankdetails.individualcreditoperations();
	bankdetails.individualdebitoperations();
	bankdetails.allTransactionSummary();

	System.out.println("-----------------------------------------");		
}
}
