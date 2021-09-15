package indu.Assignment_30;

import java.util.Scanner;

public class IsNumberPerfect {
	
	static void isGivenNumAPerfectNumber()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num to determine perfect Number : ");
		int num= scan.nextInt();
		int index = 1;
		int sum=0;
		while(index<num)
		{
			if(num % index==0)
				sum +=index;
			index++;
		}
		
		if(sum==num)
			System.out.println(num+" is perfect Num");
		else
			System.out.println(num+" is not a perfect Num");
	}
	
	public static void main(String[] args) {
		isGivenNumAPerfectNumber();
	}
}
