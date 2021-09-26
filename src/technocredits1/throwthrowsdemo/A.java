package technocredits1.throwthrowsdemo;

public class A {

	void m1() throws ArrayIndexOutOfBoundsException, InterruptedException {
		B b = new B();
		try {
			b.m2();
		}catch(ArithmeticException ae) {
			System.out.println(1);
		}catch(NullPointerException ae) {
			System.out.println(2);
		}
	}
	
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, InterruptedException {
		new A().m1();
		System.out.println("End");
	}
}
