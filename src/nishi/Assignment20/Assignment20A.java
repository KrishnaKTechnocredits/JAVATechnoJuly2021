package nishi.Assignment20;

import java.util.Scanner;

public class Assignment20A {
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
		System.out.println(c+"->"+count);
		return count;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter String :");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		System.out.println("Enter Character");
		char c=sc.next().charAt(0);
		new Assignment20A().findFrequencyOfCharacter(input,c);
		sc.close();
		
		
	}
}
