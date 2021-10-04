
/*Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"*/
package santosh_Assignment42;

import java.util.Scanner;
public class Assignment42_2 {

	String removeAllDupliOccurrence(String str)
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

	public static void main(String[] args) {
		Assignment42_2 assignment42_2 = new Assignment42_2();
		Scanner scan = new Scanner(System.in);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Enter Input string :");
		String str = scan.nextLine();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("----After Removing  all duplicate occcurence of Char----");
        System.out.println("output is : "+assignment42_2.removeAllDupliOccurrence(str));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
