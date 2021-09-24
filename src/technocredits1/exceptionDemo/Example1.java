package technocredits1.exceptionDemo;

public class Example1 {
	Example1 example1;

	void processData(int num) { // 1
		try {
			System.out.println(1);
			System.out.println(2);
			int ans = 10 / num;
			System.out.println(ans);
			example1.display();
			System.out.println("Techno");
		} catch (ArithmeticException ae) {
			System.out.println(3);
			try {
				example1.display();
			}catch(ArithmeticException ae1) {
				System.out.println("credits");
			}
		}catch(NullPointerException ne) {
			System.out.println(9);
		}
		System.out.println(4);
	}

	void display() {
		System.out.println("All good");
	}

	public static void main(String[] args) {
		Example1 ex = new Example1();
		ex.processData(0);
	}
}
