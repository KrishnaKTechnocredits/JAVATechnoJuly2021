/*Assignment-39 : 25th Sep'2021

Print first N elements of the Fibonacci series. 
n -> 8
output : 0,1,1,2,3,5,8,13 */
package shreya_assignment_39;

public class FibonacciSeries {
	
	void getFibonacciSeries(int num) {
		int num1=0;
		int num2=1;
		System.out.print(num1+","+num2);
		for(int index=1;index<=num-2;index++) {
			int sum=num1+num2;
			System.out.print(","+sum);
			num1=num2;
			num2=sum;
		}
	}
	 
	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries= new FibonacciSeries();
		fibonacciSeries.getFibonacciSeries(8);

	}

}
