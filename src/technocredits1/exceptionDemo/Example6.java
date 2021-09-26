package technocredits1.exceptionDemo;

public class Example6 {
	Example6 example6;
	
	void m1() {
		try {
			System.out.println(1);
			example6.m2();
			System.out.println(2);
		}catch(ArithmeticException e) {
			System.out.println(3);
			System.exit(0);
			System.out.println(4);
		}finally {
			System.out.println(5);
		}
		System.out.println(6);
	}
	
	void m2() {
		System.out.println(7);
	}
	
	public static void main(String[] args) {
		new Example6().m1();
		System.out.println(8);
	}
}
