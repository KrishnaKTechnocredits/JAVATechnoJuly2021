/*Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"*/

package nishi.Assignment42;

public class Assignment42B {
	String removeAllDuplicates(String input)
	{
		String str="";
		for(int i=0;i<input.length();i++)
		{
			if(input.indexOf(input.charAt(i))==input.lastIndexOf(input.charAt(i)))
			{
				str+=input.charAt(i);
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
		String input="technocredits";
		System.out.println(new Assignment42B().removeAllDuplicates(input));
	}
}
