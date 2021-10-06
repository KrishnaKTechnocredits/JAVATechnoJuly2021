
/*Assignment - 38 : 24th Sep'2021

find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant*/
package shalaka.Assignment38;

public class Substring {
	String getSubstring(String str) {
		String word = "Globant";
		String output = str.substring(str.lastIndexOf("Hi"), str.indexOf(word) + word.length());
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		Substring substring = new Substring();
		System.out.println("Output is: "+substring.getSubstring(str));
	}
}
