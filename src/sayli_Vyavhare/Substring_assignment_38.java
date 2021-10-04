/*Assignment - 38 : 24th Sep'2021

find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant*/

package sayli_Vyavhare;

public class Substring_assignment_38 {

	public static void main(String[] args) {

		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		String output = "";

		output = str.substring(str.lastIndexOf("Hi"), str.indexOf("Globant")+ "globant".length());
		
		System.out.println(output);
	}

}
