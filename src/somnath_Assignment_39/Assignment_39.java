package somnath_Assignment_39;

		/*Assignment-39 : 25th Sep'2021
			Print first N elements of the Fibonacci series. 
			n -> 8
			output : 0,1,1,2,3,5,8,13 */


public class Assignment_39 {

	void FibonacciSeries(int num)
	{
		int sum = 0;
		int num1=0;
		int num2=1;
		System.out.println("first N elements of the Fibonacci series "+num +" :");
		System.out.print(num1);
		System.out.print(", "+num2);
		for(int index=0;index<num-2;index++)
		{
			sum = num1+num2;
			System.out.print(","+sum);
			num1=num2;
			num2=sum;
		}
	}

	public static void main(String[] args) {
		Assignment_39 assignment_39  = new Assignment_39();
		assignment_39.FibonacciSeries(8);
	}
} 
