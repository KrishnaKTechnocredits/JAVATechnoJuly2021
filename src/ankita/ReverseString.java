package ankita;

public class ReverseString {
	//static String input;
	String stringReverse(String input)
	{
		String output="";
		for(int index=input.length()-1;index>0;index--)
		{
			output=output+input.charAt(index);
		}
		return output;
	}

	
	
	public static void main(String[] args) 
	{
	ReverseString reversestring=new ReverseString();
	String stringReverse=reversestring.stringReverse(" technocredits ");
	System.out.println("reverse string is "+ stringReverse);
	}
}
