package indu;

import java.util.Scanner;

public class ReverseOfString_A26_1 {

	void reverseString(String str)
	{
		String output = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			output += str.charAt(i); 
		}
		System.out.println("Reverse string is : "+output);
	}
	
	public static void main(String[] st)
	{
		ReverseOfString_A26_1 reverseOfString_A26_1 = new ReverseOfString_A26_1();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter input string : ");
		String str = scan.nextLine();
		reverseOfString_A26_1.reverseString(str);
		
	}
}

