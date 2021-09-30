package himanshu_Common_Programs;

public class Fibonacci_Series {

	void findFibonacciMethod(int n) {

		int no1 = 0;
		int no2 = 1;
		int temp;

		System.out.print("Fibonacci Series : ");
		System.out.print(no1 + ",");
		System.out.print(no2);

		for (int index = 0; index <= n - 2; index++) {

			temp = no1 + no2;
			no1 = no2;
			no2 = temp;

			System.out.print("," + temp);
		}

	}

	public static void main(String[] args) {

		Fibonacci_Series fs = new Fibonacci_Series();
		fs.findFibonacciMethod(8);

	}

}
