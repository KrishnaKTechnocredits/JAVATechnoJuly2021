/*Assignment - 23 : 27th Aug'2021

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
                output :	ICICI bank Debit Operation - 2
                         	HDFC bank Debit Operation - 2
 							BOB bank Debit Operation - 2
		 					SBI bank Debit Operation - 2*/
package atul_K.Assignments.Ass23;

import java.util.Scanner;

public class Program1 {
	private int ibalance =5000;
	private	int hbalance =5000;
	private	int sbalance =5000;
	private	int bbalance =5000;
	private	int iCreditOp =0;
	private	int hCreditOp =0;
	private	int sCreditOp =0;
	private	int bCreditOp =0;
	private	int iDeditOp =0;
	private	int hDeditOp =0;
	private	int sDeditOp =0;
	private	int bDeditOp =0;
	
	public static void main(String[] args) {
		String bank;
		int amt;
		Scanner scanner = new Scanner(System.in);
		Program1 b1 = new Program1();
		System.out.println("Enter the Bank Name");
		bank = scanner.next();
		scanner.nextLine();
		System.out.println("Enter the Amount");
		amt = scanner.nextInt();
		b1.creaditOperation(bank, amt);
		System.out.println("Enter the Bank Name");
		bank = scanner.next();
		scanner.nextLine();
		System.out.println("Enter the Amount");
		amt = scanner.nextInt();
		b1.debitOperation(bank, amt);
		b1.creaditOperation(bank, amt);
		b1.debitOperation(bank, amt);
		b1.debitOperation(bank, amt);
		System.out.println("Total Balance :"+b1.totalBalance());
		System.out.println("Total debit transactions :"+ b1.totalDebitOperation());
		System.out.println("Total credit transactions :"+b1.totalCreditOperation());
		b1.displayDebitOpBackWise();
		b1.displayCreditOpBackWise();
	}


	int totalBalance() {
		return ibalance+hbalance+sbalance+bbalance;
	}	
	
	int totalDebitOperation() {
		return (iDeditOp+hDeditOp+sDeditOp+bDeditOp);
	}
	
	int totalCreditOperation() {
		return (iCreditOp+hCreditOp+sCreditOp+bCreditOp);
	}
	
	void displayDebitOpBackWise() {
		System.out.println("ICICI Debit Operation :" + iDeditOp);
		System.out.println("HDFC Debit Operation :" + hDeditOp);
		System.out.println("SBI Debit Operation :" + sDeditOp);
		System.out.println("BOB Debit Operation :" + bDeditOp);
	}
	
	void displayCreditOpBackWise() {
		System.out.println("ICICI Credit Operation :" + iCreditOp);
		System.out.println("HDFC Credit Operation :" + hCreditOp);
		System.out.println("SBI Credit Operation :" + sCreditOp);
		System.out.println("BOB Credit Operation :" + bCreditOp);
	}
	
	
	void creaditOperation(String bname, int amt) {
		bname = bname.toUpperCase();
		switch(bname) {
			case "ICICI":
				ibalance += amt;
				iCreditOp++;
				break;
			case "HDFC":
				ibalance += amt;
				hCreditOp++;
				break;
			case "SBI":
				ibalance += amt;
				sCreditOp++;
				break;
			case "BOB":
				ibalance += amt;
				bCreditOp++;
				break;
			default:
				System.out.println("invalid Operation");
				break;
		}
	}
	
	void debitOperation(String bname, int amt) {
		bname = bname.toUpperCase();
		switch(bname) {
			case "ICICI":
				ibalance -= amt;
				iDeditOp++;
				break;
			case "HDFC":
				ibalance -= amt;
				hDeditOp++;
				break;
			case "SBI":
				ibalance -= amt;
				sDeditOp++;
				break;
			case "BOB":
				ibalance -= amt;
				bDeditOp++;
				break;
			default:
				System.out.println("invalid Operation");
				break;
		}
	}
}
