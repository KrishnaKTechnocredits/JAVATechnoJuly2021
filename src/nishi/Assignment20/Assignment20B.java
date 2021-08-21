package nishi.Assignment20;

import java.util.Scanner;

public class Assignment20B {
	
	void printFrequencyOfEachCharacter(String input)
	{
		for(int i=0;i<input.length();i++)
		{
			if(i==input.indexOf(input.charAt(i)))
			{
				new Assignment20A().findFrequencyOfCharacter(input, input.charAt(i));
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String input ");
		String input = sc.next();
		new Assignment20B().printFrequencyOfEachCharacter(input);
		sc.close();
		
	}

}
