package aniket;

public class CodingTest_6_1 {
	char getFirstNonRepeatingChar(String s)
	{
		char c=' ';
		for(int i=0;i<s.length();i++)
		{
			if(i==s.lastIndexOf(s.charAt(i)))
			{
				c=s.charAt(i);
				break;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		String s="technocredits";
		System.out.println("Output : "+new CodingTest_6_1().getFirstNonRepeatingChar(s));
	}
}
