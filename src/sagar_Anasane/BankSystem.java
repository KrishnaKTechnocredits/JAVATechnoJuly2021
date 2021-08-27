package sagar_Anasane;

class BankSystem{
	int DebitAmt;
	int CreditAmt;
	String Name;
	int Balance = 24000;
	int DebitCount;
	int CreditCount;
	int PrintCount;
	static int Ccount = 0;
	static int Dcount = 0;
	static int Pcount = 0;
	
	void setUsernameDetails(String uname){
		Name = uname ;
		
	}
	void debitAmount(int debit){
		Balance = Balance - debit ;
		DebitCount++ ;
		Dcount ++;
	
	}
	
	void creditAmount(int credit){
		Balance = Balance - credit ;
		CreditCount++ ;
		Ccount++;
	}
	
	void printBalance(){
		System.out.println("Balance is = "+Balance);	
		PrintCount++;
		Pcount ++;
	}
	
	void indivisualTransactionSummary(){
		System.out.println(Name + "Transaction Summary : Credit -" + CreditCount+ "Times,Debit -" + DebitCount + "Times,Print Balance-" + PrintCount +"Times");
		
	}
	
	void allTransactionSummary(){
		System.out.println(Name + "Transaction Summary : Credit -" + Ccount+ "Times,Debit -" + Dcount + "Times,Print Balance-" + Pcount +"Times");
	}

	public static void main(String[] args){
		BankSystem bankSystem1 = new BankSystem();
		bankSystem1.setUsernameDetails("Sagar");
		bankSystem1.creditAmount(3000);
		bankSystem1.creditAmount(5000);
		bankSystem1.debitAmount(4000);
		bankSystem1.printBalance();
		bankSystem1.indivisualTransactionSummary();
		BankSystem bankSystem2 = new BankSystem();
		bankSystem2.setUsernameDetails("Gaurav");
		bankSystem2.creditAmount(2000);
		bankSystem2.creditAmount(1000);
		bankSystem2.creditAmount(6000);
		bankSystem2.creditAmount(7000);
		bankSystem2.creditAmount(1000);
		bankSystem2.debitAmount(6000);
		bankSystem2.debitAmount(3000);
		bankSystem2.indivisualTransactionSummary();
		bankSystem1.allTransactionSummary();
	
	}	
}