/*
 *Assignment - 24 : 28th Aug'2021
Program 1: Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i 
 */

package tanmoy_Roy.Assignment24;

import java.util.Scanner;


public class Program1 {
	void getVowelsOfString(String input) {
		String vowels="";
		int i=0;
		int vowelCountMap[]= new int[5];		// count of 'a' is mapped to vowelCountMap[0] and so on...
		while(i<input.length()) {
			char ch = input.charAt(i);
			if(ch=='a' &&  vowelCountMap[0]==0 ) {		///check the previous count of a vowels
				vowels+="a, ";
				vowelCountMap[0]++;
			}
			if(ch=='e' &&  vowelCountMap[1]==0 ) {
				vowels+="e, ";
				vowelCountMap[1]++;
			}
			if(ch=='i' &&  vowelCountMap[2]==0 ) {
				vowels+="i, ";
				vowelCountMap[2]++;
			}
			if(ch=='o' &&  vowelCountMap[3]==0 ) {
				vowels+="o, ";
				vowelCountMap[3]++;
			}
			if(ch=='u' &&  vowelCountMap[4]==0 ) {
				vowels+="u, ";
				vowelCountMap[4]++;
			}
			i++;
		}
		System.out.println("The vowels present are : "+vowels);
	}

	public static void main(String[] args) {
		Program1 prg =new Program1();
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = scan.nextLine().toLowerCase();
		prg.getVowelsOfString(input);
		scan.close();

	}

}
