package akanksha_Jain;

public class Assignment_39 {
	
	void printFibonacciSeries(int num) {
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		System.out.println("First " + num + " numbers of Fibonacci Series");
		System.out.print(num1 + " " + num2);
		for(int index=1; index<=num-2; index++) {
			sum = num1 + num2;
			System.out.print(" " + sum);
			num1 = num2;
			num2 = sum;
		}	
	}
	
	public static void main(String[] args) {
		new Assignment_39().printFibonacciSeries(10);
	}
}