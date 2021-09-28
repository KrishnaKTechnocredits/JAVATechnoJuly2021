/*Assignment - 38 : 24th Sep'2021

find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant*/

package astha.Assignment38;

import java.util.Scanner;

public class SubString {

	String getSubString(String input, String str1, String str2) {
		int index = input.indexOf(str2)+ str2.length()+1;
		String output = input.substring(input.lastIndexOf(str1),index);
		return output;
	}
	
	public static void main(String[] args) {
		SubString subString = new SubString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string");
		String input = scanner.nextLine();
		System.out.println("Enter the string values for finding the substring");
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		scanner.close();
		System.out.println(subString.getSubString(input,str1,str2));
	}
}
