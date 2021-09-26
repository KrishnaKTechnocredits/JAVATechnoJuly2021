//find first non repeating vowel character from given string.
package nishi.Assignment34;

public class Assignment34C {
	
	char getFirstUniqueVowel(String s)
	{
		char out = ' ';
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)=='a')|| (s.charAt(i)=='e') || (s.charAt(i)=='i')|| (s.charAt(i)=='o')
				||(s.charAt(i)=='u'))
			{
				if(i==s.lastIndexOf(s.charAt(i)))
				{
					out=s.charAt(i);
					break;
				}
			}
		}
		return out;
	}
	
	public static void main(String[] args) {
		String ip="aeapquawrpti";
		System.out.println("Output :"+new Assignment34C().getFirstUniqueVowel(ip));
	}
}
