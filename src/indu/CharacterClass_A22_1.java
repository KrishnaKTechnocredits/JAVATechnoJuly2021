package indu;

import java.util.Scanner;

public class CharacterClass_A22_1 {
	
	int i = 2;
	int findTotalDigitInString(String str)
	{
		int count=0;
		for (int index = 0;index<str.length();index++)
		{
			if(Character.isDigit(str.charAt(index)))
			{
				count++;
			}
		}
		return count;
	}
	
	int findSumofTotalDigitInString(String str)
	{
		int sum=0;
		for (int index = 0;index<str.length();index++)
		{
			if(Character.isDigit(str.charAt(index)))
			{
				sum += Character.getNumericValue(str.charAt(index));
			}
		}
		return sum;
	}
	
	public static void main(String[] arf)
	{
		CharacterClass_A22_1 characterClass_A22_1 = new CharacterClass_A22_1();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Input String : ");
		String str = scan.nextLine();
		System.out.println("Total digits in given string is : " + characterClass_A22_1.findTotalDigitInString(str));
		System.out.println("Sum of Total digits in given string is : " + characterClass_A22_1.findSumofTotalDigitInString(str));
		
	}
}
