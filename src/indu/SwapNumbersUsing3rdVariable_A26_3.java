package indu;

import java.util.Scanner;

public class SwapNumbersUsing3rdVariable_A26_3 {
	void swapUsing3rdVariable(int num1,int num2)
	{
		int swapNum;
		swapNum =num1;
		num1=num2;
		System.out.println("Numbers after swapping using third variable are :\nnum1 : "+num1+" num2 : "+swapNum);
	}
	public static void main(String[] st)
	{
		SwapNumbersUsing3rdVariable_A26_3 swapNumbersUsing3rdVariable_A26_3 = new SwapNumbersUsing3rdVariable_A26_3();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter input num1 : ");
		int num1 = scan.nextInt();
		System.out.println("Enter input num2 : ");
		int num2 = scan.nextInt();
		swapNumbersUsing3rdVariable_A26_3.swapUsing3rdVariable(num1, num2);
		
	}
}
