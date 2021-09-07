package nishi.Assignment29;

import java.util.Scanner;

public class Assignment29B {
	
	boolean getPalindromWithoutReverse(String s)
	{		
		int mid=s.length()/2;
		int i=0;
		boolean flag=false;
		while(i<mid)
		{
			if(s.charAt(i)==s.charAt(s.length()-i-1))
			{
				flag=true;
				i++;
			}
			else
			{
				flag=false;
				break;
			}			
		}
		return flag;		
	}	
	
	void displayPalindromOrNot(String s)
	{
		boolean flag=getPalindromWithoutReverse(s);
		if(flag)
			System.out.println(s+" is palindrom");
		else
			System.out.println(s+" is not palindrom");
	}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input String ");
		String input1=sc.next();
		new Assignment29B().displayPalindromOrNot(input1);
		System.out.println("Enter input String ");
		String input2=sc.next();
		new Assignment29B().displayPalindromOrNot(input2);
		sc.close();
	}
	}

