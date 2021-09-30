/*Assignment - 38 : 24th Sep'2021
find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant*/
package manaswi;

public class Assignment_38 
{

	void subString(String input,String start,String end) 
	{
		String output = input.substring(input.lastIndexOf(start), input.indexOf(end));
		output = output+end;
		System.out.println(output);
	}
	public static void main(String[] args) 
	{
		Assignment_38 subString_Program = new Assignment_38();
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		subString_Program.subString(str,"Hi","Globant");
	}
}