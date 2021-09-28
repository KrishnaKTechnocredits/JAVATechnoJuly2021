/*Assignment - 38 : 24th Sep'2021

find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant*/

package mayur.SubstringFromStartToLastAssignment_38;

public class Assignment38 {
	
	void getSubString(String str) {
		String endWord = "Globant";
		String output = str.substring(str.lastIndexOf("Hi"), str.indexOf("Globant")+endWord.length());
		System.out.println(output);
	}

	public static void main(String[] args) {
		Assignment38 assignment38 = new Assignment38();
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		assignment38.getSubString(str);
		
	}
}

