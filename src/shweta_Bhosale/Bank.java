package shweta_Bhosale;
class Bank{
	
	int currentBalance = 10000;
	void debit(int Debit1){
		 currentBalance=currentBalance-Debit1;
			System.out.println("Debited amount balance is: " +Debit1);
		}
	void credit(int Credit1){
		 currentBalance =currentBalance+Credit1;
			System.out.println("Credited balance is: " +Credit1);
		}
	void displayBalance(){
		
			System.out.println("Current balance is: " + currentBalance);
		}
	public static void main(String[] args){
	Bank bank= new Bank();
	bank.displayBalance();
	bank.debit(7000); 
	bank.displayBalance();
	bank.credit(5000);
	bank.displayBalance();
	}	
}


//assig: 3
//Find weekdays or weekend based on dayIndex.
//1-> Monday
//2-> Tue
//7-> Sunday

//Prog1: Pass parameter
//dayIndex -> 3 : then weekday
//dayIndex -> 6 : then WeekEnd
//dayIndex -> 11 : InvalidIndex
//dayIndex -> -3 : Invalid Index

//Prog 2: Validate Broswer name.
//Valid list : Chrome, IE, Edge --> Valid browser
//Safari, FF -> Invalid browser
//Note : score == 10
//String broswer = "Chrome";

//broswer.equals("Chrome") || browser.equals("IE") || browser.equals("Edge") ----[equal method] 