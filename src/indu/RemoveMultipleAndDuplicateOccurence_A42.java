
package indu;

import java.util.Scanner;

public class RemoveMultipleAndDuplicateOccurence_A42 {

	/*
	Program 2: Remove all occurrence of duplicate character from given string.
	input : "technocredits"
	output : "hnordis"*/

	String removeAllOccoranceofDuplicateChar(String str)
	{
		int count;
		String output = "";
		for(int i =0;i<str.length();i++)
		{	count =0;
			if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i)))
			{
				count++;
			}
			if(count==1)
				output +=str.charAt(i);	
		}
		
		return output;
	}
	
	/*Program 1: Remove multiple occurrence of characters from given string.

	input : "technocredits"
	output : technordis*/
	
	String removeMultipleOccurence(String str)
	{
		String output = "";
		for(int i =0;i<str.length();i++)
		{	
			if(str.indexOf(str.charAt(i))== i)
			{
				output+=str.charAt(i);
				
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		RemoveMultipleAndDuplicateOccurence_A42 a42 = new RemoveMultipleAndDuplicateOccurence_A42();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter InpuT string :");
		String str = scan.nextLine();
		System.out.println("After Removing all Multiple occcurence of Char output is   : "+a42.removeMultipleOccurence(str));

		System.out.println("After Removing  all duplicate occcurence of Char output is : "+a42.removeAllOccoranceofDuplicateChar(str));
		

	}
}
