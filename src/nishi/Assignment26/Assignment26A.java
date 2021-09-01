package nishi.Assignment26;

public class Assignment26A {
	
	String getReverse(String input)
	{
		String s="";
		for(int i=input.length()-1;i>=0;i--)
		{
			s+=input.charAt(i);
		}
		return s;
	}

	public static void main(String[] args) {
		String input = "This is technocredits";
		System.out.println("Output : "+new Assignment26A().getReverse(input));
	}

}
