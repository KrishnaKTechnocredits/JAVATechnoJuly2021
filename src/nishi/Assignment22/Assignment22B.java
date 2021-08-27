package nishi.Assignment22;

import java.util.Scanner;

public class Assignment22B {
	
	int getSumOfAllDigitsInString(String str)
	{
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				sum+=Character.getNumericValue(str.charAt(i));
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.next();
		System.out.println("Sum of Digits in a given String :"+new Assignment22B().getSumOfAllDigitsInString(str));
		sc.close();
	}

}
