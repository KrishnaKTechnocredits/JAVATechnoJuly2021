package ashit_assignment_38;

public class Assingment_38 {
	void findSubString(String str) {
		String output = str.substring(str.lastIndexOf("Hi"), str.indexOf("Globant")+"Globant".length());
		System.out.println("SubString:"+output);

	}

	/*for practice
	void findSubstring1(String input) {
		String output = input.substring(input.indexOf("Credits"));
		System.out.println(output);
		String output1= input.substring(input.lastIndexOf("Techno"), input.lastIndexOf("Hello"));
		System.out.println(output1);
		
	}*/

	public static void main(String[] a) {
		Assingment_38  assingment_38 = new Assingment_38();
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		assingment_38.findSubString(str);
		//assingment_38.findSubstring1(str);
	}
}
/*find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant*/