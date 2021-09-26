package gauravk.Assignment_38;

import java.util.Arrays;

/*
 * Assignment - 38 : 24th Sep'2021
find the substring starting from last hi to first Globant. 
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant
 */
public class SubstringProgram {
	
	String subStringFinder(String s1, String a, String z) {
		int startingPointIndex =s1.lastIndexOf(a);
		int endingPointIndex = s1.indexOf(z);
		
		String output = s1.substring(startingPointIndex, endingPointIndex+z.length());
		return output;
	}
	
	public static void main(String[] args) {
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		System.out.println("Substring starting from last 'Hi' to first 'Globant' is: \n"+new SubstringProgram().subStringFinder(str,"Hi","Globant"));
	}
}
