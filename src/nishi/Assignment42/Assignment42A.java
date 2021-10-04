/*Remove multiple occurrence of characters from given string.

input : "technocredits"
output : technordis*/

package nishi.Assignment42;
public class Assignment42A {
	String removeMultipleOccuranceOfChar(String input)
	{
		String str="";
		for(int i=0;i<input.length();i++)
		{
			if(i==input.indexOf(input.charAt(i)))
			{
				str+=input.charAt(i);
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
		String input="technocredits";
		System.out.println(new Assignment42A().removeMultipleOccuranceOfChar(input));
	}
}
