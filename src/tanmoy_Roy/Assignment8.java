package tanmoy_Roy;

public class Assignment8 {
	
	int eachTimeCredited,eachTimeDebited,eachTimePrinted;
	static int totalTimesCredited,totalTimesDebited,totalTimesPrinted;
	String userName="";
	double balance=0.0;
	
		//Setter Method
		void setUserDetails(double Amount,String Name) {
			balance=Amount;
			userName=Name;
		}
		
		void credit(double amount){
			balance+=amount;
			eachTimeCredited++;
			totalTimesCredited++;
		}
		
		void debit(double amount){
			balance-=amount;
			eachTimeDebited++;
			totalTimesDebited++;
		}
		
		void printBalance(){
			System.out.println("\nCurrent Account Balance for "+userName+" is "+balance);
			eachTimePrinted++;
			totalTimesPrinted++;
		}
		
		void individualTransactionSummary() {
			
			System.out.println("Times individual has Credited - "+eachTimeCredited+
					"\nTimes individual has Debited - "+eachTimeDebited+
					"\nTimes individual has Printed Balance - "+eachTimePrinted);
		}
		
		void allTransactionSummary() {
			
			System.out.println("\nTotal Times all users has Credited - "+totalTimesCredited+
					"\nTotal Times all users has debited- "+totalTimesDebited+
					"\nTotal times all users Printed Balance - "+totalTimesPrinted);
		}
		
		
		public static void main(String[] args){
			Assignment8 user1 = new Assignment8();
			user1.setUserDetails(15800.58, "Tanmoy");
			user1.credit(580.60);
			user1.credit(780.25);
			user1.debit(120.3);
			user1.printBalance();
			user1.individualTransactionSummary();
			
			Assignment8 user2 = new Assignment8();
			user2.setUserDetails(17700.58,"Roy");
			user2.credit(890.60);
			user2.debit(100.25);
			user2.debit(120.3);
			user2.printBalance();
			user2.individualTransactionSummary();
			
			user2.allTransactionSummary();
		
		}
}
