package nasir_Assignment_24;

import java.util.Scanner;

public class Vowels {
	String getVowelsInString(String string)
	{		
		String s=" "; 
		System.out.print("vowels are ");
		for(int i=0;i<string.length();i++)
		{
			if(string.indexOf(string.charAt(i))==i)
			{
				if((string.charAt(i)=='a') || (string.charAt(i)=='e') || (string.charAt(i)=='i') || (string.charAt(i)=='o') || (string.charAt(i)=='u') ||
					(string.charAt(i)=='A') || (string.charAt(i)=='E') || (string.charAt(i)=='I') || (string.charAt(i)=='O') || (string.charAt(i)=='U'))
				{
					s+=string.charAt(i)+" ";						
				}
			}
		}
		return s;
	}

	public static void main(String[] args) {		
		System.out.println("Enter input String ");
		Scanner sc=new Scanner(System.in);
		String input = sc.next();
		System.out.print("Output :"+new Vowels().getVowelsInString(input));		
		sc.close();

	}

}