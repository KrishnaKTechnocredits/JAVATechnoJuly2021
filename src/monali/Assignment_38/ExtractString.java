package monali.Assignment_38;

/*Assignment - 38 : 24th Sep'2021

find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant*/
public class ExtractString {

	void getSubString(String str) {
		String output = str.substring(str.lastIndexOf("Hi"), str.indexOf("Globant"));
		System.out.println(output);
	}

	public static void main(String[] args) {
		ExtractString extractStr = new ExtractString();
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		extractStr.getSubString(str);
	}
}
