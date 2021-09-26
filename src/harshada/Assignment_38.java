/* Assignment - 38 : 24th Sep'2021

find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant */

package harshada;

public class Assignment_38 {
	
	String processSubstring(String input, String start,String last) {
		
		String newStr=input.substring( input.lastIndexOf("Hi") , input.indexOf("Globant")) + last;
	
		return newStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		String start="Hi";
		String last="Globant";
		Assignment_38 obj=new Assignment_38 ();
		String output= obj.processSubstring(str, start, last);
		
		System.out.println(output);
		
	}

}
