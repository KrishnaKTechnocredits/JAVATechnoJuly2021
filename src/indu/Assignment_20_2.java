package indu;

import java.util.Scanner;

public class Assignment_20_2 
{

	void findFrequencyOfEachChar(String str)
	{
		
		Assignment_20_1 assignment_20_1 = new Assignment_20_1();

		for (int index=0 ;index<str.length();index++)
		{
			if(str.lastIndexOf(str.charAt(index)) == index)
			{
				System.out.println("The frequency of "+str.charAt(index) + " is " + 
									assignment_20_1.findFrequencyOfGivenChar(str,str.charAt(index)) );
			}
		}
		
	
	}
	
	public static void main(String[] args) 
	{
		Assignment_20_2 assignment_20_2 = new Assignment_20_2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input : ");
		String str =scanner.nextLine();
		assignment_20_2.findFrequencyOfEachChar(str);
	}
}
