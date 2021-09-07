/* Assignment - 23 : 27th Aug'2021

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
package anuja;

import java.util.Scanner;

public class Assignment_23 {
	private static int bal1;
	private static int bal2;
	private static int bal3;
	private static int bal4;
	private static int bal;
	static String mode,banktype;
	int scredcnt=0,icredcnt=0,hcredcnt=0,bcredcnt=0;
	int sdebcnt=0,idebcnt=0,hdebcnt=0,bdebcnt=0;
	static int  sc,hc,bc,ic,sd,hd,id,bd;
	int totcred,totdeb;

	int display(String mode,String banktype,int amt) {
		switch(mode) {
		case "debit":
			switch(banktype) {
			case "SBI" :
				bal1=bal1+amt;
				sdebcnt++;
				return sdebcnt;
			case "ICICI" :
				bal2=bal2+amt;
				idebcnt++;
				return idebcnt;
			case "BOB" :
				bal3=bal3+amt;
				bdebcnt++;
				return bdebcnt;
			case "HDFC" :
				bal4=bal4+amt;
				hdebcnt++;
				return hdebcnt;
			default:
				System.out.println("Invalid Bank name");
				return -1;
			}
		case "credit":
			switch(banktype) {
			case "SBI" :
				bal1=bal1-amt;
				scredcnt++;
				sc++;
				return scredcnt;
			case "ICICI" :
				bal2=bal2-amt;
				icredcnt++;
				ic++;
				return icredcnt;
			case "BOB" :
				bal3=bal3-amt;
				bcredcnt++;
				bc++;
				return bcredcnt;
			case "HDFC" :
				bal4=bal4-amt;
				hcredcnt++;
				hc++;
				return hcredcnt;
			default:
				System.out.println("Invalid Bank name");
				return -1;
			}
		default:
			System.out.println("Invalid mode");
			return -1;
		}
	}

	void individualCreditTrans(String mode,String banktype) {
		if(mode.equals("credit") && banktype.equals("SBI")) {
			System.out.println("SBI credit transactions are "+scredcnt);
		}
		else if(mode=="credit" && banktype=="ICICI") {
			ic=icredcnt;
			System.out.println("ICICI credit transactions are "+icredcnt);
		}
		else if(mode.equals("credit") && banktype.equals("BOB")) {
			System.out.println("BOB credit transactions are "+bcredcnt);
			bc=bcredcnt;
		}
		else if(mode.equals("credit") && banktype.equals("HDFC")) {
			System.out.println("HDFC credit transactions are "+hcredcnt);
			hc=hcredcnt;
		}
	}

	void individualDebitTrans(String mode,String banktype) {
		if(mode.equals("debit") && banktype.equals("SBI")) {
			System.out.println("SBI debit transactions are "+sdebcnt);
			sd=sdebcnt;
		}
		else if(mode.equals("debit") && banktype.equals("ICICI")) {
			System.out.println("ICICI debit transactions are "+idebcnt);
			id=idebcnt;
		}
		else if(mode.equals("debit") && banktype.equals("BOB")) {
			System.out.println("BOB debit transactions are "+bdebcnt);
			bd=bdebcnt;
		}
		else if(mode.equals("debit") && banktype.equals("HDFC")) {
			System.out.println("HDFC debit transactions are "+hdebcnt);
			hd=hdebcnt;
		}
	}

	int sbi() {
		bal1=1000;
		return bal1;
	}

	int  icici() {
		bal2=2000;
		return bal2;
	}

	int bob() {
		bal3=3000;
		return bal3;
	}

	int  hdfc() {
		bal4=4000;
		return bal4;
	}

	void totalBal() {
		bal=bal1+bal2+bal3+bal4;
		System.out.println("Total balance in 4 accounts is "+bal);
	}

	void total() {
		totcred=sc+hc+bc+ic;
		totdeb=sd+hd+bd+id;
		System.out.println("Total credit operations are "+totcred);
		System.out.println("Total debit operations are "+totdeb);
	}

	void displaycnt(String mode,String banktype) {
		if(mode.equals("credit") && banktype.equals("SBI")) 
			System.out.println(banktype + "Transactions : "+scredcnt);

		else if (mode.equals("credit") && banktype.equals("ICICI"))
			System.out.println(banktype + "Transactions : "+icredcnt);
		else if (mode.equals("credit") && banktype.equals("HDFC"))
			System.out.println(banktype + "Transactions : "+hcredcnt);
		else if (mode.equals("credit") && banktype.equals("BOB"))
			System.out.println(banktype + "Transactions : "+bcredcnt);
	}

	public static void main(String[] args) {
		Assignment_23 assignment_23=new Assignment_23();
		bal=assignment_23.icici()+assignment_23.sbi()+assignment_23.hdfc() + assignment_23.bob();
		System.out.println("Total balance in 4 accounts is "+bal);
		assignment_23.display("credit","ICICI",100);
		assignment_23.display("credit","ICICI",100);
		assignment_23.individualCreditTrans("credit","ICICI");
		assignment_23.display("credit","HDFC",10);
		assignment_23.display("credit","HDFC",20);
		assignment_23.individualCreditTrans("credit","HDFC");
		assignment_23.display("credit","SBI",05);
		assignment_23.individualCreditTrans("credit","SBI");
		assignment_23.display("credit","BOB",01);
		assignment_23.display("credit","BOB",05);
		assignment_23.display("credit","BOB",05);
		assignment_23.display("credit","BOB",05);
		assignment_23.individualCreditTrans("credit","BOB");
		assignment_23.scredcnt=0;
		assignment_23.display("credit","SBI",01);
		assignment_23.display("credit","SBI",02);
		assignment_23.display("credit","SBI",03);
		assignment_23.display("credit","SBI",04);
		assignment_23.individualCreditTrans("credit","SBI");
		assignment_23.display("debit","ICICI",100);
		assignment_23.display("debit","ICICI",100);
		assignment_23.individualDebitTrans("debit","ICICI");
		assignment_23.display("debit","HDFC",10);
		assignment_23.display("debit","HDFC",5);
		assignment_23.individualDebitTrans("debit","HDFC");
		assignment_23.display("debit","BOB",100);
		assignment_23.display("debit","BOB",100);
		assignment_23.individualDebitTrans("debit","BOB");
		assignment_23.display("debit","SBI",100);
		assignment_23.display("debit","SBI",100);
		assignment_23.individualDebitTrans("debit","SBI");
		assignment_23.total();
		assignment_23.totalBal();
	}
}
