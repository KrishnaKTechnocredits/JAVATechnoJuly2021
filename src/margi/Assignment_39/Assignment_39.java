package margi.Assignment_39;

/*Print first N elements of the Fibonacci series. 
n -> 8
output : 0,1,1,2,3,5,8,13*/

public class Assignment_39 {

	void getFibonacciSeries(int num) {
		int num1 = 0, num2 = 1, sum;
		System.out.print(num1);
		System.out.print("," + num2);
		for(int index=0; index<num-2; index++) {
			sum = num1 + num2;
			System.out.print("," + sum);
			num1 = num2;
			num2 = sum;
		}
	}
	
	public static void main(String[] args) {
		Assignment_39 assignment_39 = new Assignment_39();
		assignment_39.getFibonacciSeries(8);
	}
}
