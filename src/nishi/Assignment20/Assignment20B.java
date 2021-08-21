package nishi.Assignment20;

import java.util.Scanner;

public class Assignment20B {
	
	void printFrequencyOfEachCharacter(String input)
	{
		int count=0;
		for(int i=0;i<input.length();i++)
		{
			if(i==input.indexOf(input.charAt(i)))
			{
				count=new Assignment20A().findFrequencyOfCharacter(input, input.charAt(i));
				System.out.println(input.charAt(i)+"->"+count);
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
