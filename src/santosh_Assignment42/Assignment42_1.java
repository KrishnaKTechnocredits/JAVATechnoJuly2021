
/*Assignment - 42 : 29th Sep'2021 
Program 1: Remove multiple occurrence of characters from given string.

input : "technocredits"
output : technordis
*/
package santosh_Assignment42;

import java.util.Scanner;
public class Assignment42_1 {


String removeMultOccurence(String str)
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
	Assignment42_1 assignment42_1 = new Assignment42_1();
	Scanner scan = new Scanner(System.in);
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Enter Input string :");
	String str = scan.nextLine();
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("----After Removing all Multiple occcurence of Char----");
    System.out.println("output is   : "+assignment42_1.removeMultOccurence(str));
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
