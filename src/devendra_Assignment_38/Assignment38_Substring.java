package devendra_Assignment_38;
/*
find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant
*/
public class Assignment38_Substring {
	String getSubstring(String input) {
		String output = input.substring(input.lastIndexOf("Hi"),input.indexOf("Globant")+ "Globant".length());
		return output;
	}
	public static void main(String[] args) {
		Assignment38_Substring obj = new Assignment38_Substring();
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		System.out.println("Input String : "+str);
		System.out.println("Output Substring : " +obj.getSubstring(str));
	}
}