/*Assignment - 38 : 24th Sep'2021

find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant*/

package shraddha.Assignment38;

public class FindSubstring {
	public static void main(String[] args) {
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		String output = str.substring(str.lastIndexOf("Hi"), str.indexOf("Globant")+"Globant".length());
		System.out.println(output);
	}
}
