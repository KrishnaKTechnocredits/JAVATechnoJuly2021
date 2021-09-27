/*find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant*/

package elizabeth_Assignment_38;

public class Assignment38 {
	
	String getSubstring(String str){
		String output=" ";
		for(int index=0;index<str.length();index++){
			output=str.substring(str.lastIndexOf("Hi"),str.indexOf("Aashvi"));
		}
		return output;
	}
	
	public static void main(String[] args){
		Assignment38 assignment38= new Assignment38();
		System.out.println(assignment38.getSubstring("Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant"));
	}

}
