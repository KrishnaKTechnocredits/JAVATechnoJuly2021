package indu;

import java.util.Scanner;

public class ConverCases_Test_2 {
	
	String convertCases(String str)
	{
		String temp1;
		String output="";
		for(int i=0 ;i<str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
				temp1=""+str.charAt(i);
				output+=temp1.toUpperCase();
			}
			else if(Character.isUpperCase(str.charAt(i)))
			{
				temp1=""+str.charAt(i);
				output+=temp1.toLowerCase();;
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				output+=str.charAt(i);
			}
		}
		
		return output;
	}
	public static void main(String[] arg)
	{
		ConverCases_Test_2 test_2 = new ConverCases_Test_2();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Input String :");
		String input = scan.nextLine();
		System.out.println("Output String : " +test_2.convertCases(input));
	}
}