package sayali_V;

public class Assignment_17 
{
	String getReverseString (String input)
	{
		String output= "";
		for(int i=input.length()-1;i>=0;i--)
		{
			output=output+input.charAt(i);
			
		}
		return output;
	}
	public static void main(String args[])
	{
		Assignment_17 Assignment=new Assignment_17();
		System.out.println("reverse String is :");
		System.out.println(Assignment.getReverseString("technocredits"));
	}
}
