package indu;

import java.util.Scanner;

public class Assignment_20_3
{
	void findUniqueChar(String str)
	{
		
		Assignment_20_1 assignment_20_1 = new Assignment_20_1();
		System.out.println("The unique char is :");
		for (int index=0 ;index<str.length();index++)
		{
			if(str.lastIndexOf(str.charAt(index)) == index)
			{
				int count = assignment_20_1.findFrequencyOfGivenChar(str,str.charAt(index));
				if(count == 1)
				System.out.print(" "+ str.charAt(index));
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Assignment_20_3 assignment_20_3 = new Assignment_20_3();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input : ");
		String str =scanner.nextLine();
		assignment_20_3.findUniqueChar(str);
	}
}
