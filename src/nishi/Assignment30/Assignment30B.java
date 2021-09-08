package nishi.Assignment30;

import java.util.Scanner;

public class Assignment30B {

	String isArmstrongNumber(int number)
	{
		int temp=number;
		int result=0;
		while(number!=0)
		{
			result+=Math.pow(number%10, 3);
			number=number/10;
		}
		if(temp==result)
			return temp+" is an Armstrong number";
		else
			return temp+ " is not an Armstrong number";		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		System.out.println(new Assignment30B().isArmstrongNumber(num));
		sc.close();
	}
}
