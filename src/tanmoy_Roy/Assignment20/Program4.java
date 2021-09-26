/*program 4 : print duplicate characters with their frequency from user defined string.
input : word -> aakanksha
output : a -> 4
         k -> 2
		 n -> 1
		 s -> 1
		 h -> 1
*/

package tanmoy_Roy.Assignment20;

import java.util.Scanner;

public class Program4 {
	
	static void getFreqOfChar(String input) {
		Program1 prg= new Program1();
		int i=0,n=input.length(),charCount=0;
		System.out.println("The duplicate charaters are ");
		while(i<n) {
			charCount=prg.getCharCount(input,input.charAt(i));
			if(i==input.lastIndexOf(input.charAt(i))  && charCount>1 )
				System.out.println(input.charAt(i)+" with frequency "+ charCount);
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
