//Assignment no 2
//Create a class called Bank with 
//currentBalance=10000
//debit
//credit
//displayBalance 
package pranita;


class Bank{
	int currentBalance=10000;
  
  void debitValue(int amount){
	  currentBalance=currentBalance-amount;
	  System.out.println("debit amount is Rs" + amount);
	  System.out.println("Balance after debiting the amount is Rs" +currentBalance);
	  
  }
	  
  void creditValue(int amount){
	  currentBalance=currentBalance+amount;
	  System.out.println("credit amount is Rs" + amount);
	  System.out.println("Balance after crediting the amount is Rs" +currentBalance);
  }
  void displayValue(){ 
	  System.out.println("Your current balance is Rs " +currentBalance);
  }  
	  
  public static void main(String[] a){
		Bank bank = new Bank();
		bank.creditValue(5000);
		bank.debitValue(2000);
		bank.debitValue(4000);
		bank.displayValue();
  }
	  
}	  