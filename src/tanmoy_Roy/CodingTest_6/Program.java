/*
 * Program 1: Find first non repeating character from a word. [expected : 10 mins]
input : technocredits
output : h 

Program 2: Find first non repeating word from a given String. [expected : 15 mins]
input : hi this is techno gm credits this hi is 
output : techno
 */

package tanmoy_Roy.CodingTest_6;

import java.util.Scanner;

public class Program {
	
	char firstNonRepeatingChar(String input) {
		char ch=' ';
		for(int i=0;i<input.length();i++)
			if(i==input.lastIndexOf(input.charAt(i))) {
				ch=input.charAt(i);
				break;
			}
		return ch;
	}
	
	String firstNonRepeatingWord(String[] input) {
		int i,j,count;
		for (i=0;i<input.length;i++) {
			count=0;
			for (j=0;j<input.length;j++) {
				if(input[i].equals(input[j]) )
					count++;
			}
			if(count==1)
				break;
		}
		return input[i];
	}
	public static void main(String[] args) {
		Program prg = new Program();
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Word to find first non repeating character: ");
		String input=scan.nextLine();
		System.out.println( "First non repeating character of "+input+" is "+prg.firstNonRepeatingChar(input));
		
		System.out.println("Enter the String : ");
		String[] arr = scan.nextLine().split(" ");
		System.out.println( "First non repeating word is "+prg.firstNonRepeatingWord(arr));
		
		scan.close();

	}

}
