package nishi.Assignment20;

import java.util.Scanner;

public class Assignment20D {
	
	void printDuplicateCharacter(String input)
	{
		for(int i=0;i<input.length();i++)
		{
			int count=0;
			if(i==input.indexOf(input.charAt(i)))
			{
				 count=new Assignment20A().findFrequencyOfCharacter(input, input.charAt(i));
			}			
			if(count>1)
			{
				System.out.println(input.charAt(i)+"->"+count);
			}
		}
	}	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String input ");
		String input = sc.next();
		new Assignment20D().printDuplicateCharacter(input);
		sc.close();
		
	}

}
