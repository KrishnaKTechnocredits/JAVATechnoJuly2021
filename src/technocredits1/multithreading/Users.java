package technocredits1.multithreading;

public class Users extends Thread {
	Bank myAccount;
	
	Users(Bank myAccount){
		this.myAccount = myAccount;
	}
	
	public void run() {
		myAccount.debitAmt(10000);
	}
}
