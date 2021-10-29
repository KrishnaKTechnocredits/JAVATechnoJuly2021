/*Print first N elements of the Fibonacci series. 
n -> 8
output : 0,1,1,2,3,5,8,13*/
package ashit_assignment_39;
public class Assignment_39 {
	static void getFibonacciSeries(int num) {
		int num1 =0;int num2=1, sum;
		System.out.print(num1);
		System.out.print(","+ num2);
		for(int index=0;index<num-2;index++) {
			sum = num1 + num2;
			System.out.print(","+ sum);
			num1 = num2;
			num2 = sum;
		}

	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_39 assignment_39 = new Assignment_39();
		Assignment_39.getFibonacciSeries(8);


	}

}
