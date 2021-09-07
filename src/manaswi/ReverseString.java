package manaswi;
public class ReverseString
 {
	String getReverseString(String input) 
	{
		String st =""; 
		for(int index = input.length()-1;index >= 0;index--)
		{
			    input.charAt(index);
				st= st + input.charAt(index);
		}
		return st;
	}
	public static void main(String[] args)
	{
		ReverseString reverseString = new ReverseString();
		String str = "this is technocredits";
		System.out.println(reverseString.getReverseString(str));
	}

}