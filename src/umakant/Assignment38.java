/*
find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant
 */

package umakant;

public class Assignment38 {
	
	String getSubstring(String input,String lastIndexString,String firstIndexString) {
		int beginIndex= input.lastIndexOf(lastIndexString);
		int endIndex = input.indexOf(firstIndexString);
		if(beginIndex < endIndex ) {
			return input.substring(beginIndex, endIndex+firstIndexString.length());
		}
		else
			return "";
	}
	
	public static void main(String[] args) {
		String input = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		System.out.println(new Assignment38().getSubstring(input, "Hi", "Globant"));
	}

}

