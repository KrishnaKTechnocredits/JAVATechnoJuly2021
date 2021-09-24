package arti_G_Assignment38;
/*Assignment - 38 : 24th Sep'2021

find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant*/

public class Substring {

	String getSubstring(String input, String word) {
		int length=word.length();
		String result="";
		int indexOfWord=input.indexOf(word);
		int lastIndexOfHi=input.lastIndexOf("Hi");
		result=input.substring(lastIndexOfHi,length+indexOfWord+1);
		return result;
	}
	public static void main(String[] args) {
		Substring s1 = new Substring();
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		String word="Globant";
		System.out.println(s1.getSubstring(str, word));
	}

}
