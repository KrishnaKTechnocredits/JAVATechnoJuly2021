package sagar_Gharge;


class Bank {
	
	String CustomerName = "Sagar ramesh Gharge";
	String Bankname = "ICICI Bank LTD";
	int BankAccountNo = 40050;
	String BankAdd = "mulund west Mumbai";
	
	void dispalyInfo (){
		System.out.println (" Customer Name is " + CustomerName);
		System.out.println (" Customer bank name is " + Bankname);
		System.out.println (" Customer Bank Account No is " + BankAccountNo);
		System.out.println (" Customer BankAdd is " + BankAdd );
	}
	
	public static void main (String [] args) {
	Bank s1 = new Bank ();
	s1.dispalyInfo();
	}		
}
