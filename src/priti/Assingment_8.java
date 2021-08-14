package priti;
class Assingment_8{
	int debitCnt;
	int creditCnt;
	int currentBalance= 10000;
	String customerName;
	static int overAllDebitCnt;
	static int overAllcreditCnt;
		
	void setCutomerDetails(String name){
		customerName = name;
	}
	
	void debitAmt(int amt){
		currentBalance = currentBalance-amt;
		debitCnt= debitCnt+1;
		overAllDebitCnt++;
	}
	
	void creditAmt(int amt){
		currentBalance = currentBalance+amt;
		creditCnt++;
		overAllcreditCnt++;
	}
		
	void printBalance(){
		System.out. println("Customer- name is " + customerName);
		System.out. println("Customer- " + customerName + " current balance is "+ currentBalance);
	}
		
	void printDebitandcreditTranSummary(){
		System.out.println("customer- debit transaction summary is " + debitCnt );
		System.out.println("customer- credit transaction summary is " + creditCnt);
	}
	
	void overallTranSummary(){
		int tranSummary= overAllcreditCnt+overAllDebitCnt;
		System.out.println("Cutstomer-"+customerName + "- total transaction summary is "+ tranSummary);
			
	}
	
	public static void main(String[] a){
		Assingment_8 assingment_8_1 = new Assingment_8();
		System.out.println("-----------------------------------------------------");
		
		assingment_8_1.setCutomerDetails("Rudra");
		assingment_8_1.debitAmt(1000);
		assingment_8_1.debitAmt(1000);
		assingment_8_1.debitAmt(1000);
		assingment_8_1.creditAmt(5000);
		assingment_8_1.creditAmt (5000);
		assingment_8_1.printBalance();
		assingment_8_1.printDebitandcreditTranSummary();
		assingment_8_1.overallTranSummary();
		
		System.out.println("-----------------------------------------------------");
		
		Assingment_8 assingment_8_2 = new Assingment_8();
		assingment_8_2.setCutomerDetails("Raghav");
		assingment_8_2.debitAmt(1000);
		assingment_8_2.debitAmt(1000);
		assingment_8_2.creditAmt(1000);
		assingment_8_2.creditAmt(2000);
		assingment_8_2.creditAmt(1000);
		assingment_8_2.printBalance();
		assingment_8_2.printDebitandcreditTranSummary();
		assingment_8_2.overallTranSummary();
	}
}

