package chirag.assignment38;

/*Assignment - 38 : 24th Sep'2021

find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant
*/
public class FindSubstring {
	
	void getSubString(String input,String start,String end) {
		String output = input.substring(input.lastIndexOf(start), input.indexOf(end));
		output = output + end;
		System.out.println(output);
		}	
	 
	public static void main(String[] args) {
		FindSubstring findSubstring =new FindSubstring();
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		findSubstring.getSubString(str, "Hi", "Globant");
	}
}
