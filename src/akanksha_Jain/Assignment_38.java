/* Assignment - 38 : 24th Sep'2021

find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant */

package akanksha_Jain;

public class Assignment_38 {
	
	public static void main(String[] args) {
		String str  = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		String s1 = "Hi";
		String s2 = "Globant";
		int beginIndex = str.lastIndexOf(s1);
		int endIndex = str.indexOf(s2);
		int length = s2.length();
		System.out.println(str.substring(beginIndex, endIndex+length));
	}
}
