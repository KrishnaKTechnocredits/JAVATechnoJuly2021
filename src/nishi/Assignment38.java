/*find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant*/

package nishi;

public class Assignment38 {
	String getSubString(String input,String word)
	{		
		int length=word.length();
		String res="";
		int indexOfWord=input.indexOf(word);		
		int lastIndexOfHi=input.lastIndexOf("Hi");	
		res=input.substring(lastIndexOfHi,length+indexOfWord+1);
		return res;
	}
	
	public static void main(String[] args) {
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		String word="Globant";
		System.out.println(new Assignment38().getSubString(str, word));
	}
}
