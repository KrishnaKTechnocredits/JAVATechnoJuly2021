/*Assignment - 38 : 24th Sep'2021

find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant*/

package bhakti;

public class Assignment_38 {
	void findSubString(String input, String start, String end) {
		String output= input.substring(input.lastIndexOf(start),input.indexOf(end));
		output+=end;
		System.out.println(output);
	}
	public static void main(String[] args) {
		String input= "Hi Hello Techno Hi Credits Hello this GM Neha GM Globant Aashvi Globant";
		Assignment_38 a1= new Assignment_38();
		a1.findSubString(input, "Hi", "Globant");
		a1.findSubString(input, "Hello", "GM");
	}

}
