/* Assignment - 38 : 24th Sep'2021
find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant*/

package kalpesh;

public class Assignment_38 {
	void printSubString(String str) {
		int length = "Globant".length();
		String str2 = str.substring(str.lastIndexOf("Hi"), str.indexOf("Globant") + length);
		System.out.println(str2);
	}

	public static void main(String[] args) {
		Assignment_38 newObject = new Assignment_38();
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		newObject.printSubString(str);
	}

}
