/*find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant*/

package vivek;

public class Assignment38 {

	String getSubstring(String str, String firstWord, String lastWord) {
		return str.substring(str.lastIndexOf(firstWord), str.indexOf(lastWord) + lastWord.length());
	}

	public static void main(String[] args) {
		Assignment38 assignment38 = new Assignment38();
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		System.out.println(assignment38.getSubstring(str, "Hi", "Globant"));
	}
}
