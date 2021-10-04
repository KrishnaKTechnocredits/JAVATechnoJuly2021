package rasika;
/*
find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant
*/

public class Assignment_38 {

	String getSubstring(String str){
		String output = str.substring(str.lastIndexOf("Hi"),str.indexOf("Globant")+"Globant".length());
		return output;
	}
	
	public static void main(String[] args) {
		Assignment_38 assignment_38 = new Assignment_38();
		System.out.println(assignment_38.getSubstring("Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant"));
	}
}
