package santosh_Assignment39;

/*Assignment-39 : 25th Sep'2021
Print first N elements of the Fibonacci series. 
n -> 8
output : 0,1,1,2,3,5,8,13 
*/
public class Assignment39 {
	void printFibonacciSeries(int n) {
		int sum = 0;
        int num1 = 0;
		int num2 = 1;
		System.out.print(num1);
		System.out.print(","+ num2);
       		for (int index = 0; index <n - 2; index++) {
			sum = num1 + num2;
			System.out.print(","+sum);
			    num1 = num2;
			    num2 = sum;
		}
	}

	public static void main(String[] args) {
		System.out.println("-----------------------");
		Assignment39 assignment_39=new Assignment39();
		System.out.println("Printing Fibonacci series");
		System.out.println("output :-");
		assignment_39.printFibonacciSeries(8);
		System.out.println("\n-----------------------");

	}
}
