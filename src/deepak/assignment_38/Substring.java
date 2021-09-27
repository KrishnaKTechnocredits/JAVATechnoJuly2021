/*Assignment - 38 : 24th Sep'2021

find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant
*/
package deepak.assignment_38;

public class Substring {
	
	String getSubstring(String str) {
		String firstWord = "Hi";
		String lastWord = "Globant";
		int lengthLast= lastWord.length();
		String Output = str.substring(str.lastIndexOf(firstWord), (str.indexOf(lastWord))+lengthLast);
		return Output;
	}
	
	public static void main(String[] args) {
		Substring obj = new Substring();
		String input = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		String output = obj.getSubstring(input);
		System.out.println("Substring of "+"'"+input+"'"+" from last 'Hi' to first 'Globant'"+"is below :\n\n"+output);
		
	}

}
