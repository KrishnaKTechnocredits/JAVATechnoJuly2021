/*program 2: Find frequency of each character from user defined string.
input : word -> hello
output : h -> 1
         e -> 1
         l -> 2
         o -> 1
*/
package tanmoy_Roy.Assignment20;

import java.util.Scanner;

public class Program2 {
	
	static void getFreqOfChar(String input) {
		Program1 prg= new Program1();
		int i=0,n=input.length();
		while(i<n) {
			if(i==input.lastIndexOf(input.charAt(i)))
				System.out.println("The "+input.charAt(i)+" count is: "+prg.getCharCount(input,input.charAt(i)));
			i++;
		}
		
	}

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = scan.nextLine();
		getFreqOfChar(input);
		scan.close();
		
	}

}
