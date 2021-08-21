/*Program 1: find frequency of given character from user defined string.
use scanner class to take word and character from user.
input : word -> technocredits
        ch -> e
output : e -> 2
*/


package tanmoy_Roy.Assignment20;

import java.util.Scanner;

public class Program1 {
	
	int getCharCount(String input,char ch) {
		int i=0,count=0,n=input.lastIndexOf(ch);
		while(i<=n) {
			if(input.charAt(i)==ch)
				count++;
			i++;
		}
		return count;
	}

	public static void main(String[] args) {
		Program1 prg =new Program1();
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = scan.nextLine();
		System.out.println("Enter the character to get the count: ");
		char ch = scan.next().charAt(0);
		System.out.println("The character count is: "+prg.getCharCount(input,ch));
		scan.close();
	}

}
