package nishi.Assignment25;

public class Assignment25A {
	
	String getOutput(String input)
	{		
		String upperCase="";
		String digit="";
		String lowerCase="";		
		for(int i=0;i<input.length();i++)
		{
			if(Character.isUpperCase(input.charAt(i)))
			{
				upperCase+=input.charAt(i);
			}
			if(Character.isDigit(input.charAt(i)))
			{
				digit+=input.charAt(i);
			}
			if(Character.isLowerCase(input.charAt(i)))
			{
				lowerCase+=input.charAt(i);
			}
		}
		return upperCase+digit+lowerCase;
	}	
	
	public static void main(String[] args) {
			String input = "Ma1U2liK";
			System.out.println("The output : "+new Assignment25A().getOutput(input));
	}

}
