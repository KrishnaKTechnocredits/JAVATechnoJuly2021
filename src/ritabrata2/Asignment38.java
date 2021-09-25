/*Assignment - 38 : 24th Sep'2021

find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant
*/

package ritabrata2;

public class Asignment38 {
	void getString(String input) {
		String output="";
		for(int index=0; index<input.length(); index++) {
			output= input.substring(input.lastIndexOf("Hi"),input.indexOf("Aashvi"));
		}
		System.out.println("The output substring is: "+output);
	}
	
	public static void main(String[] args) {
		Asignment38 assignment38 = new Asignment38();
		String input="Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		assignment38.getString(input);
	}
}
