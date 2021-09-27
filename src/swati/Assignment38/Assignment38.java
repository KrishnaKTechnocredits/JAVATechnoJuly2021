package swati.Assignment38;

/*Assignment - 38 : 24th Sep'2021
find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant
*/
public class Assignment38 {
	
	void findSubstring(String input) {
		String output="";
		
		output=input.substring(input.lastIndexOf("Hi"), input.indexOf("Globant")+"Globant".length());
		System.out.println(output);
		
		
	}
	
	public static void main(String[] a) {
		Assignment38 a1=new Assignment38();
		a1.findSubstring("Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant");
		
	}

}
