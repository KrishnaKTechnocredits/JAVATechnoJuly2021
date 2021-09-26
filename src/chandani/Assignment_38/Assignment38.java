/*Assignment - 38 : 24th Sep'2021

find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant*/
package chandani.Assignment_38;

public class Assignment38 {
	
	void getSubstring(String str) {
		
		int length = "Globant".length();
		String str2 = str.substring(str.lastIndexOf("Hi"), str.indexOf("Globant") + length);
		System.out.println(str2);
	}

	public static void main(String[] args) {
		Assignment38 assignment38 = new Assignment38();
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		assignment38.getSubstring(str);
	}
	
}
