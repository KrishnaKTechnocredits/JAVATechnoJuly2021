package sneha;

class Bank{
	int balance = 10000;
	
	void debit(int x){
		balance = balance + x;
		System.out.println(x + "is debited to your account");
	}
	
	void credit(int x){
		balance = balance - x;
		System.out.println(x + "is credited from your account");
	}
	
	void display(){
		System.out.println("Your account balance is: " + balance);
	}
	
	public static void main(String[] a){
		Bank bank = new Bank();
		bank.display();
		bank.credit(1000);
		bank.debit(5000);
		bank.credit(3000);
		bank.display();
		bank.debit(11000);
		bank.display();
	}
}