package indu.Assignment_30;

import java.util.Scanner;

public class IsNumberArmstrong {
	
	void isNumArmstrong(int input)
	{
		int sum=0;
		int remainder =0;
		int num = input;
		while(num>0)
		{
			remainder = num%10;
			//System.out.println(remainder);
			sum= sum+(remainder*remainder*remainder);
			num /=10;
		}
		//System.out.println(sum);
		if(sum==input) 
			System.out.println(input+" is Armstrong Number...!!!");
		else 
			System.out.println(input+" is not an Armstrong Number...!!!");
	}
	
	public static void main(String[] args) {
		IsNumberArmstrong a = new IsNumberArmstrong();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to determine if its Armstrong  : ");
		int num = scan.nextInt();
		a.isNumArmstrong(num);
	}
}
