package avinash.assignment38;
/*find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant*/
public class Assignment_38 {

	String getSubString(String input) {
		String output = input.substring(input.lastIndexOf("Hi"),input.indexOf("Globant")+ "Globant".length());
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_38 assignment_38 = new Assignment_38();
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		System.out.println("Substring: " + assignment_38.getSubString(str));

	}

}
