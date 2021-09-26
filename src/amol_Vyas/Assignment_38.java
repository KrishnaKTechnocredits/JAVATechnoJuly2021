/*Assignment - 38 : 24th Sep'2021

find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant
*/
package amol_Vyas;

public class Assignment_38 {

	String getLastHiAndFirstGlobantFromString(String input) {
		String output="";
		output=input.substring(input.lastIndexOf("Hi"),input.indexOf("Globant")+"Globant".length());
		return output;
	}
	
	public static void main(String[] args) {
		String input="Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		Assignment_38 assignment_38 = new Assignment_38();
		System.out.println(assignment_38.getLastHiAndFirstGlobantFromString(input));
	}
}
