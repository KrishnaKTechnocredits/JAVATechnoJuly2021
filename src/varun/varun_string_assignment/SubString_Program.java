/*Assignment - 38 : 24th Sep'2021

find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant*/
package varun.varun_string_assignment;

public class SubString_Program {
	
	void subString(String input,String start,String end) {
		String output = input.substring(input.lastIndexOf(start), input.indexOf(end));
		output = output+end;
		System.out.println(output);
	}
	public static void main(String[] args) {
		SubString_Program subString_Program = new SubString_Program();
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		subString_Program.subString(str,"Hi","Globant");
	}
}