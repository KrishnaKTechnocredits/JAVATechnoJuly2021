/* Assignment-20 : 21st Aug'2021
program 2: Find frequency of each character from user defined string.
input : word -> hello
output : h -> 1     	
		 e -> 1          	
		 l -> 2  	
		 o -> 1
*/

package akanksha_Jain.Assignment_20;

import java.util.Scanner;

public class Program_2 {

	void findFreqOfEachChar(String str) {
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			int count =0;
			for(int index1=0; index1<str.length(); index1++) {
				if(str.charAt(index1) == ch && index == str.indexOf(ch))
					count ++;
			}
			if(count>0)
				System.out.println(str.charAt(index) + " -> " + count);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scanner.next();
		Program_2 program_2 = new Program_2();
		program_2.findFreqOfEachChar(str);
		scanner.close();
	}
}
