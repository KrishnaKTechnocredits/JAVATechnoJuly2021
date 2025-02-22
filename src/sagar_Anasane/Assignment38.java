/*Assignment - 38 : 24th Sep'2021
find the substring starting from last hi to first Globant. 
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant
*/
package sagar_Anasane;

public class Assignment38 {
	void findSubString(String str) {
		//String[] arr= str.split(" ");
		String output="";
		output = str.substring(str.lastIndexOf("Hi"),str.indexOf("Globant")+"Globant".length());
		System.out.println("The Substring Starting from Last hi to First Globant :"+"\n"+output);
	}
	public static void main(String[] args) {
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		Assignment38 assignment38 = new Assignment38();
		assignment38.findSubString(str);
	}
}
