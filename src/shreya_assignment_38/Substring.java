/*Assignment - 38 : 24th Sep'2021

find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant*/

package shreya_assignment_38;

public class Substring {
	void getSubstring(String str) {
		String output="";
		output+=str.substring(str.lastIndexOf("Hi"),str.indexOf("Globant")+"Globant".length());
		System.out.println(output);
	}

	public static void main(String[] args) {
		Substring Substring = new Substring();
		String str="Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		Substring.getSubstring(str);

	}

}
