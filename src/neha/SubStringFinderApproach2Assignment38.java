package neha;

import java.util.Scanner;

/*Assignment - 38 : 24th Sep'2021
find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant*/
public class SubStringFinderApproach2Assignment38 {
	void findSubString(String str, String startWord, String endWord) {
		System.out.println("String-->" + str);
		System.out.println(
				"\r\nOutput-->" + str.substring(str.lastIndexOf(startWord), str.indexOf(endWord) + endWord.length()));
	}

	public static void main(String[] args) {
		SubStringFinderApproach2Assignment38 subStringFinder = new SubStringFinderApproach2Assignment38();
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";

		subStringFinder.findSubString(str, "Hi", "Globant");
	}
}
