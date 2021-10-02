package madhavi;

public class Assignment_39 {
	// Method to print
	// first n Fibonacci Numbers
	static void printFibonacciNumbers(int n) {
		int first = 0, next = 1, i;

		if (n < 1)
			return;
		System.out.print(first + " ");
		for (i = 1; i < n; i++) {
			System.out.print(next + " ");
			int sum = first + next;
			first = next;
			next = sum;
		}
	}

	public static void main(String[] args) {
		// Assignment_39 assignment_39 = new Assignment_39();
		int n = 8;
		printFibonacciNumbers(n);
	}
}
