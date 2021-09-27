package gauravk.Assignment_39;

import java.util.Scanner;

/*
 * Fibonacci series till nth sequence.
 */
public class FibonacciSeriesNth {
	
	void displayFibonacciTillNth(int x) {
		int num1=0, num2=1;
		int sum=0;
		System.out.println("The first "+x+"(th) Fibonacci numbers are \n");
		System.out.print(num1+"  "+num2+"  ");
		for(int i=1; i<=x-2; i++) {
			sum=num1+num2;
			num1=num2;
			num2=sum;
			System.out.print(sum+"  ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type the length of Fibonacci series you want : ");
		int n = sc.nextInt();
		new FibonacciSeriesNth().displayFibonacciTillNth(n);
	}
}
