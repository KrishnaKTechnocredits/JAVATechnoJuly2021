package shantanu.fibonacciSeries_assignment39;

public class FibonacciSeries {
	void displaySeries(int total) {
		int first = 0, second = 1;
		int sum;
		System.out.print(first + " "+ second);
		for(int index = 3; index <= total; index++) {
			sum = first + second;
			System.out.print(" "+sum);
			first = second;
			second = sum;
		}		
	}
	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries =  new FibonacciSeries();
		fibonacciSeries.displaySeries(10);
	}
}
