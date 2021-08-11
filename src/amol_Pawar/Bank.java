package amol_Pawar;
class Bank{

	int currentBalance=10000;

	void debitOpration(int debitAmount){
		currentBalance=currentBalance-debitAmount;
	}
	
	void creditOpration(int creditAmount){
		currentBalance=currentBalance+creditAmount;
	}
	
	void displyBalance(){
		System.out.println("Current balance available in account is : "+currentBalance);
	}
	
	public static void main(String[] args){
		Bank bank=new Bank();
		bank.debitOpration(1000);//9000
		bank.debitOpration(500);//8500
		bank.displyBalance();//currentBalance=8500
		bank.creditOpration(200);//8700
		bank.displyBalance();//currentBalance=8700
	}
}