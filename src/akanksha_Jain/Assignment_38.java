/* Assignment - 38 : 24th Sep'2021
find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant */

package akanksha_Jain;

import java.util.Scanner;

public class Assignment_38 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine(); //str  = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		System.out.println("Enter the beginning index string");
		String s1 = sc.next(); // s1 = "Hi";
		System.out.println("Enter the end index string");
		String s2 = sc.next(); // s2 = "Globant";
		int beginIndex = str.lastIndexOf(s1);
		int endIndex = str.indexOf(s2);
		int length = s2.length();
		System.out.println(str.substring(beginIndex, endIndex+length));
		sc.close();
	}
}