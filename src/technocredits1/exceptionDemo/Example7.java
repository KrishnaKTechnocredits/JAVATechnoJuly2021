package technocredits1.exceptionDemo;

public class Example7 {
	Example7 example7;
	void m2() {
		System.out.println("Hi");
	}
	
	void m1() {
		try {
			System.out.println(1);
			try {
				int x = 10/0;
				System.out.println("-");
			}
			catch(Exception e) {
				example7.m2();	
				System.out.println(3);
			}
			finally {
				System.out.println(2);
				int y = 10/0;
				System.out.println("Hello");
			}
		}catch(NullPointerException ne) {
			System.out.println(5);
		}finally {
			System.out.println("*");
		}
		System.out.println(7);
	}
	
	public static void main(String[] args) {
		new Example7().m1();
	}
}
