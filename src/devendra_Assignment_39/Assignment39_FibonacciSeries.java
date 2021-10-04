package devendra_Assignment_39;

public class Assignment39_FibonacciSeries {
	void printFibonacciSeries(int num) {
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		System.out.print(num1+" ");
		System.out.print(num2);
		for (int index = 0; index < num - 2; index++) {
			sum = num1 + num2;
			System.out.print(" "+sum);
			num1 = num2;
			num2 = sum;
		}
	}

	public static void main(String[] args) {
		Assignment39_FibonacciSeries obj = new Assignment39_FibonacciSeries();
		System.out.print("Fibonacci Series : ");
		obj.printFibonacciSeries(8);
	}
}

/*
Print first N elements of the Fibonacci series. 
n -> 8
output : 0,1,1,2,3,5,8,13
*/