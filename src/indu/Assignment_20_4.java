package indu;

import java.util.Scanner;

public class Assignment_20_4 {
	
	void findFrequencyOfDuplicateChar(String str)
	{
		int count =0;
		Assignment_20_1 assignment_20_1 = new Assignment_20_1(); 
		for(int index=0 ; index<str.length() ; index++)
		{
			if(str.lastIndexOf(str.charAt(index))== index)
			{
				count = assignment_20_1.findFrequencyOfGivenChar(str, str.charAt(index));
				if(count > 1)
				{
					System.out.println("Count of Duplicate Char  " +str.charAt(index) + " is :" +count);
				}
			}
		}
	}
	
	public static void main(String[] ard)
	{
		Assignment_20_4 assignment_20_4 = new Assignment_20_4();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Input");
		String input = scan.nextLine();
		assignment_20_4.findFrequencyOfDuplicateChar(input);

	}
}
