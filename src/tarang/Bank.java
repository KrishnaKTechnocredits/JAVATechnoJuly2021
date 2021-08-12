package tarang;

class Bank{

    int currentBalance = 10000;

    void credit(int amount){
	  currentBalance = currentBalance + amount;
	  }
	  
	void debit(int amount){
	  currentBalance = currentBalance - amount;
	  }
	  
	void displayCurrentBalance(){
	   System.out.println("Current balance of your account is:" + currentBalance);
	  }
	  
    public static void main (String[] a){
       Bank bank = new Bank();
       bank.credit(1000);	  
       bank.credit(3000);
       bank.debit(2000);
       bank.credit(4000);
       bank.debit(1000);
       bank.debit(3200);
       bank.displayCurrentBalance();
     }
}	 