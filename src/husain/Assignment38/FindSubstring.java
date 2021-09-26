/*
 * Assignment - 38 : 24th Sep'2021

find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant
 */

package husain.Assignment38;

public class FindSubstring {

	String findString(String str) {

		str = str.substring(str.lastIndexOf("Hi"), str.indexOf("Aashvi"));
		return str;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindSubstring st = new FindSubstring();
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		System.out.println("The substrng of the given string \"" + str + "\" is " + st.findString(str));

	}

}
