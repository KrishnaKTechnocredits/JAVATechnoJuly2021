package akshay;

public class Example {
	void evenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " it is even");
		}
		else {
			System.out.println(num + " it is odd");
		}
	}
	public static void main(String[] args) {
		Example example = new Example();
		example.evenOdd(20);
	}
}