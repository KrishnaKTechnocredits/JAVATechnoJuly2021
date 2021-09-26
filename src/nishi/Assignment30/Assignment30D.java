package nishi.Assignment30;

import java.util.Scanner;

public class Assignment30D {

	String getPerfectNumber(int number)
	{		
		int sum=0;
		for(int i =1;i<number;i++)
		{		
			if(number%i==0)
			{
				sum+=i;
			}
		}
		
		if(sum==number)
			return number +" is perfect number";
		else
			return number +" is not a perfect number";
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		System.out.println(new Assignment30D().getPerfectNumber(num));
		sc.close();
	}
}
