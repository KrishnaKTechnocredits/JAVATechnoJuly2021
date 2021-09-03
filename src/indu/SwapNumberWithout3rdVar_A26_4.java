package indu;

import java.util.Scanner;

public class SwapNumberWithout3rdVar_A26_4 {
	void swapUsingwithout3rdVariable(int num1,int num2)
	{
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Numbers after swapping without third variable are :\nnum1 : "+num1+" num2 : "+num2);
	}
	public static void main(String[] st)
	{
		SwapNumberWithout3rdVar_A26_4 swapNumberWithout3rdVar_A26_4 = new SwapNumberWithout3rdVar_A26_4();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter input num1 : ");
		int num1 = scan.nextInt();
		System.out.println("Enter input num2 : ");
		int num2 = scan.nextInt();
		swapNumberWithout3rdVar_A26_4.swapUsingwithout3rdVariable(num1, num2);
		
	}
}
