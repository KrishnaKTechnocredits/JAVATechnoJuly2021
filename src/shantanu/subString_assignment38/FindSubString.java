package shantanu.subString_assignment38;

public class FindSubString {
	public static void main(String[] args) {
			String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
			System.out.println("Original String : "+str);
			System.out.print("Substring: ");
			String subStr=str.substring(str.lastIndexOf("Hi"), str.indexOf("Globant")+"Globant".length());
			System.out.println(subStr);
		}
	}
