package neha;

/*Assignment - 38 : 24th Sep'2021
find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant*/
public class SubStringAssignment38 {
	void findSubString(String str) {
		String output = str.substring(str.lastIndexOf("Hi"), str.indexOf("Aashvi")); // starting index of Aashvi is
																						// exclusive
		System.out.println("Output String: "+output.trim()); // this will remove extra space after Globant
		System.out.println("Length: " + output.trim().length());
	}

	public static void main(String[] args) {
		SubStringAssignment38 subStringAssignment38 = new SubStringAssignment38();
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		subStringAssignment38.findSubString(str);
	}
}
