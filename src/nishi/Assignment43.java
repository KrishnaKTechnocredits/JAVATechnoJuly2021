/*WAP to find length of String without using Length Method and length property.
String input="technocredits";
output=13;*/

package nishi;

public class Assignment43 {

	int getCountOfCharInString(String input)
	{
		int i=0;
		for(;i<input.length();i++);		
		return i;
	}
	
	public static void main(String[] args) {
		String input="technocredits";
		System.out.println("output= "+new Assignment43().getCountOfCharInString(input));
	}
}
