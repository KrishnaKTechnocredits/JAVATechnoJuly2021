/*Assignment - 38 : 24th Sep'2021
find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant
*/
package santosh_Assignment38;

public class Assignment_38 {

	void getSubString(String input,String start,String last) {

		String newStr = "";

		System.out.print("Given string is -\n" + input);
	    newStr = input.substring(input.lastIndexOf("Hi"),input.indexOf("Globant"))+ last;
        System.out.println("\nOutput-\n" + newStr);
		

	}

	public static void main(String[] args) {

		Assignment_38 ass_38 = new Assignment_38();
		String str1 = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		String start="Hi";
		String last="Globant";
	    ass_38.getSubString(str1,start,last);
	}
} 
