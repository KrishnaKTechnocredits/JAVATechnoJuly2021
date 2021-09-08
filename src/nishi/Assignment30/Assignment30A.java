package nishi.Assignment30;

import java.util.Scanner;

public class Assignment30A {
	
	int getReverseOfNumber(int num)
	{		
		int rev=0;			
		while(num!=0)
		{
			rev=(rev*10)+(num%10);
			num=num/10;			
		}
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		System.out.println("reverse number is "+new Assignment30A().getReverseOfNumber(num));
		sc.close();
	}

}
