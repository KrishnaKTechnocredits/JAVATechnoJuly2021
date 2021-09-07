package nishi.Assignment29;

import java.util.Scanner;

public class Assignment29C {
	
	boolean ispalindromNumber(int num)
	{
		int i=0;
		int rev=0;
		int temp=num;
		String length=String.valueOf(num);
		int length1=length.length();	
		while(num!=0)
		{
			rev+=(num%10)*Math.pow(10,length1-i-1);
			num=num/10;
			i++;
		}
		System.out.println("rev = "+rev);
		if(rev==temp)
			return true;
		else
			return false;
	}
	
	void displayPalindromNumber(int n)
	{
		if(ispalindromNumber(n))
			System.out.println(n+" is palindrom");
		else
			System.out.println(n+" is not palindrom");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input number ");
		int input1=sc.nextInt();
		new Assignment29C().displayPalindromNumber(input1);
		System.out.println("Enter input number ");
		int input2=sc.nextInt();
		new Assignment29C().displayPalindromNumber(input2);
		sc.close();
	}

}
