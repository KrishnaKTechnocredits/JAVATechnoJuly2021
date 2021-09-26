package nishi.Assignment22;

import java.util.Scanner;

public class Assignment22A {
	
	int getNoOfDigitsFromString(String str)
	{	
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.next();
		System.out.println("Total Digits in a given String :"+new Assignment22A().getNoOfDigitsFromString(str));
		sc.close();
	}
}
