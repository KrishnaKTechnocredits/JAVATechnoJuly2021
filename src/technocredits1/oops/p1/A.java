package technocredits1.oops.p1;

public class A{
	int x = 10;
	static void m1() {
		System.out.println("Hi");
	}
	
	private void m11() {
		System.out.println(1);
	}
	
	public static void main(String[] args) {
		A a1 = new B();
		a1.m11();
	}
}
