//assignment 2 , 2nd August 2021
package neha.assignment_2;
class Bank{
	double balance = 100000;
	
	void debitBalance(double a){
		balance=balance-a;
	}	
	
	void creditBalance(double a){
		balance=balance+a;
	}
	
	void checkBalance(){
		System.out.println("Current balance of savings account is "+balance);
	}
	
	public static void main(String[] a){
		Bank bank=new Bank(); 
		//debit and check
		bank.debitBalance(45000);
		bank.checkBalance();
		//credit and check
		bank.creditBalance(85000);
		bank.checkBalance();
		//credit and check
		bank.creditBalance(20000);
		bank.checkBalance();
		//debit and check
		bank.debitBalance(40000);
		bank.checkBalance();
	}

}