package indu;

import java.util.Scanner;

public class Assignment_20_1
{
	int findFrequencyOfGivenChar(String str , char ch)
	{
		
		int count = 0;
		for(int index=0 ;index<=str.lastIndexOf(ch) ;index++)
		{
			if(str.charAt(index)==ch)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) 
	{
		Assignment_20_1 assignment_20_1 = new Assignment_20_1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input : ");
		String str =scanner.nextLine();
		System.out.println("Enter the character to get the count : ");
		char ch = scanner.next().charAt(0);
		System.out.println("Character count is : "+assignment_20_1.findFrequencyOfGivenChar(str,ch));
	}
}
