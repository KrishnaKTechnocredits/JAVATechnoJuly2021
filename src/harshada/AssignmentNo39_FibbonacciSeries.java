//Print first N elements of the Fibonacci series.
//n -> 8
//output : 0,1,1,2,3,5,8,13
package harshada;

import java.util.Scanner;

public class AssignmentNo39_FibbonacciSeries {

	void getFibbonacciSeries(int n) {
		int num1=0;
		int num2=1;
		System.out.print(num1+"  "+num2+ "  ");
		for(int index=1; index<=n-2; index++) {
			int sum=num1+num2;
			System.out.print(sum+"  ");
			num1=num2;
			num2=sum;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignmentNo39_FibbonacciSeries obj=new AssignmentNo39_FibbonacciSeries();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		System.out.println("Fibbonacci series of "+ num + " numbers is given below :" );
		obj.getFibbonacciSeries(num);
	}

}
