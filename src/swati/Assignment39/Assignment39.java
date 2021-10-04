package swati.Assignment39;

/*Assignment-39 : 25th Sep'2021
Print first N elements of the Fibonacci  series. 
n -> 8
output : 0,1,1,2,3,5,8,13 
*/
public class Assignment39 {
	
	void printFibonacci(int n) {
		int num1=0;
		int num2=1;
		int sum=0;
		System.out.print(num1);
		for(int index=1;index<n;index++) {
			sum=num1+num2;
			System.out.print(","+num2);
			num1=num2;
			num2=sum;
					
		}
				
	}
	
	public static void main(String[] a) {
		Assignment39 a1=new Assignment39();
		a1.printFibonacci(8);
	}

}
