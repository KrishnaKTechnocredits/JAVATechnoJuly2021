/*program 3: print unique characters from user defined string.
input : word -> aakanksha
output : n
         s
         h
 */

package tanmoy_Roy.Assignment20;

import java.util.Scanner;

public class Program3 {
	
	static void getFreqOfChar(String input) {
		Program1 prg= new Program1();
		int i=0,n=input.length(),charCount=0;
		System.out.println("The Unique charaters are ");
		while(i<n) {
			charCount=prg.getCharCount(input,input.charAt(i));
			if(i==input.lastIndexOf(input.charAt(i))  && charCount==1 )
				System.out.print(input.charAt(i)+" ");
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