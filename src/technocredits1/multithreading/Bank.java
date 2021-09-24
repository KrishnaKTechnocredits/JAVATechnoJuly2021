package technocredits1.multithreading;

public class Bank {

	int balance = 10000;
	
	synchronized void debitAmt(int amt) {
		System.out.println(Thread.currentThread().getName());
		if(amt <= balance) {
			System.out.println("Withdrawing amout " + amt);
			balance = balance - amt;
		}else
			System.out.println("Insufficient fund, requested amout " + amt + " and balance is " + balance);	
		System.out.println("Now total balance is " + balance);
	}
}
