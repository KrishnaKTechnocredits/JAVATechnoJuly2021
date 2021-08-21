package nishi.Assignment20;

import java.util.Scanner;

public class Assignment20C {
	
	void printUniqueCharacter(String input)
	{
		for(int i=0;i<input.length();i++)
		{
			int count=0;
			if(i==input.indexOf(input.charAt(i)))
			{
				 count=findFrequencyOfCharacter(input, input.charAt(i));
			}			
			if(count==1)
			{
				System.out.println(input.charAt(i));
			}
		}
	}
	
	int findFrequencyOfCharacter(String input,char c)
	{	
		int count=0;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==c)
			{
				count++;
			}			
		}		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String input ");
		String input = sc.next();
		new Assignment20C().printUniqueCharacter(input);
		sc.close();
		
	}

}
