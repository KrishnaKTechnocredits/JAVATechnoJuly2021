package mratunjay.Assignment_1_To_5;

class Assignment_2{
	int balance = 100000;
	
	void debitBalance(int a){
		balance=balance-a;
	}	
	
	void creditBalance(int a){
		balance=balance+a;
	}
	
	void checkBalance(){
		System.out.println("Current balance of savings account is: "+balance);
	}
	
	public static void main(String[] a){
		Assignment_2 A_2 = new Assignment_2(); 		
		A_2.debitBalance(45000);
		A_2.checkBalance();		
		A_2.creditBalance(85000);
		A_2.checkBalance();		
		A_2.creditBalance(20000);
		A_2.checkBalance();	
		A_2.debitBalance(40000);
		A_2.checkBalance();
	}

}
