package prerana;

public class Assignment_1 {

		int currentBalance=10000;
		
		void debitBalance(int amt)
		{
		   currentBalance=currentBalance-amt;
		  
		}
		void creditBalance(int amt)
		{
			currentBalance=currentBalance+amt;
		}
			
		void displayBalance(){
			System.out.println("currentBalance is "+currentBalance);
		}
		public static void main(String[] args){
		Assignment_1 b=new Assignment_1();
		b.debitBalance(2000);
		b.creditBalance(5000);
		b.creditBalance(1500);
		b.debitBalance(1000);
		b.displayBalance();
		}
	}


