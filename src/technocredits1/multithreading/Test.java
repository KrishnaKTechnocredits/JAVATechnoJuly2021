package technocredits1.multithreading;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		Bank myAccount = new Bank();
		
		Users u1 = new Users(myAccount);
		Users u2 = new Users(myAccount);
		
		u1.setName("Maulik");
		u2.setName("Krishna");
		u1.start();
		u2.start();
		
	}
}
