package pritiSwitch_programmes;

public class Assingment_23_1 {
	private int accountHDFC= 1,balanceHDFC=1000,creditCntHDFC=0,debitCntHDFC=0;
	private int accountICICI= 2,balanceICICI=2000,creditCntICICI=0,debitCntICICI=0;
	private int accountBOB= 3,balanceBOB=3000,creditCntBOB=0,debitCntBOB=0;
	private int accountSBI= 4,balanceSBI=1000,creditCntSBI,debitCntSBI=0;
	int creditCnt=0;
	int debitCnt=0;
	private int totalBalance = 0;
	String pwdHDFC= "hdfc123", pwdICICI= "icici123", pwdBOB="bob123", pwdSBI="sbi123";
	
	void displayTotalbalance() {
		totalBalance= balanceHDFC+balanceICICI+balanceBOB+balanceSBI;
		System.out.println("Total balance with all 4 bank accounts is ; "+ totalBalance);
		
	}

	void displayTotalCreditandDebitOperations() {
		System.out.println("Total Credit operations : " +creditCnt);
		System.out.println("Total Debit operations : " +debitCnt);
	}
	
	private void individualCreditOperations() {
		System.out.println("HDFC Bank total Credit operations : " +creditCntHDFC);
		System.out.println("ICICI Bank total Credit operations : " +creditCntICICI);
		System.out.println("BOB Bank total Credit operations : " +creditCntBOB);
		System.out.println("SBI Bank total Credit operations : " +creditCntSBI);
	}
	
	private void individualDebitOperations() {
		System.out.println("HDFC Bank total Debit operations : " +debitCntHDFC);
		System.out.println("ICICI Bank total Debit operations : " +debitCntICICI);
		System.out.println("BOB Bank total Debit operations : " +debitCntBOB);
		System.out.println("SBI Bank total Debit operations : " +debitCntSBI);
	}
	
	
	private void individualCreditOperations(String bankName,int actName,String password, int amt) {
		switch(bankName) {
		case "HDFC":
					switch(accountHDFC){
					case 1: 
							if (password.equals(pwdHDFC)) /*{
							System.out.println("User successfully logined");
							}*/
							balanceHDFC= balanceHDFC+amt;
							creditCntHDFC++;
							creditCnt++;
					}		
					break;
		case "ICICI":
					switch(accountICICI){
					case 2:							
							if (password.equals(pwdICICI)) /*{
							System.out.println("User successfully logined");
							}*/
							balanceICICI= balanceICICI+amt;
							creditCntICICI++;
							creditCnt++;
					}
					break;
		case "BOB":
					switch(accountBOB){
					case 3:
							if (password.equals(pwdBOB)) /*{
							System.out.println("User successfully logined");
							}*/
							balanceBOB= balanceBOB+amt;
							creditCntBOB++;
							creditCnt++;
					}
					break;
		case "SBI":	
					switch(accountSBI){
					case 4:
							if (password.equals(pwdSBI)) /*{
							System.out.println("User successfully logined");
							}*/
							balanceSBI = balanceSBI+amt;
							creditCntSBI++;
							creditCnt++;
					}
					break;
		default:
			System.out.println("You are not registered with this bank ");
		}
	}
	
	private void individualDebitOperations(String bankName,int actName,String password,int amt) {
		switch(bankName) {
		case "HDFC":
					switch(accountHDFC) {
					case 1:
							if (password.equals(pwdHDFC)) {
								if(balanceHDFC>amt+500) {
									balanceHDFC= balanceHDFC-amt;
									debitCntHDFC++;
									debitCnt++;
								} else {
									System.out.println("Insufficiant balance in your HDFC Bank account");
									System.out.println("Your Account balance is :" +balanceHDFC+" only");
								}
								}
					}
					break;
		case "ICICI":
					switch(accountICICI) {
					case 2:	
							if (password.equals(pwdICICI)) {
								if(balanceICICI>amt) {
									balanceICICI= balanceICICI-amt;
									debitCntICICI++;
									debitCnt++;
									}else {
										System.out.println("Insufficiant balance in your ICICI Bank account");
										System.out.println("Your Account balance is :" +balanceICICI+" only");
									}
							}	
					}
					break;							
		case "BOB":
					switch(accountBOB) {
					case 3:	
							if (password.equals(pwdBOB)) {
								if(balanceBOB>amt) {
									balanceBOB= balanceBOB-amt;
									debitCntBOB++;
									debitCnt++;
								}else {
								System.out.println("Insufficiant balance in your BOB Bank account");
								System.out.println("Your Account balance is :" +balanceBOB+" only");
								}
							}
					}
					break;
		case "SBI":	
					switch(accountSBI) {
					case 4 :
							if (password.equals(pwdSBI)) {
								if(balanceSBI>amt) {
									balanceSBI = balanceSBI-amt;
									debitCntSBI++;
									debitCnt++;
								}else {
									System.out.println("Insufficiant balance in your SBI Bank account");
									System.out.println("Your Account balance is :" +balanceSBI+" only");
								}
							}
					}
					break;
		default:
			System.out.println("You are not registered with this bank ");
		
		}	
	}
	
	
	public static void main(String[] a) {
		Assingment_23_1 assingment_23_1 = new Assingment_23_1();
		assingment_23_1.individualCreditOperations("HDFC",1,"hdfc123",2000);
		assingment_23_1.individualCreditOperations("HDFC",1,"hdfc123",1000);
		assingment_23_1.individualDebitOperations("HDFC",1,"hdfc123",3000);
		assingment_23_1.individualDebitOperations("HDFC",1,"hdfc123",500);
		
		assingment_23_1.individualCreditOperations("ICICI",2,"icici123",3500);
		assingment_23_1.individualCreditOperations("ICICI",2,"icici123",1000);
		assingment_23_1.individualDebitOperations("ICICI",2,"icici123",1000);
		
		assingment_23_1.individualCreditOperations("SBI",3,"sbi123",1000);
		assingment_23_1.individualDebitOperations("SBI",3,"sbi123",2500);
		
		assingment_23_1.individualCreditOperations("BOB",4,"bob123",5000);
		assingment_23_1.individualCreditOperations("BOB",4,"bob123",1000);
		assingment_23_1.individualDebitOperations("BOB",4,"bob123",1000);
			
		assingment_23_1.displayTotalbalance();
		assingment_23_1.displayTotalCreditandDebitOperations();
		
		assingment_23_1.individualCreditOperations();
		assingment_23_1.individualDebitOperations();
		
		
		
		
		
	}
}
