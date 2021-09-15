package nishi;

public class ScodingTest2 {
	String getOutput(String input)
	{		
		String str1="";		
		for(int i=0;i<input.length();i++)
		{
			if(Character.isUpperCase(input.charAt(i)))
			{
				str1+=(String.valueOf(input.charAt(i))).toLowerCase();				
			}
			else if(Character.isDigit(input.charAt(i)))
			{
				str1+=input.charAt(i);
			}
			else if(Character.isLowerCase(input.charAt(i)))
			{
				str1+=(String.valueOf(input.charAt(i))).toUpperCase();	
			}
		}
		return str1;
	}	

	public static void main(String[] args) {
			String input = "A1ashVi6";
			System.out.println("The output : "+new ScodingTest2().getOutput(input));
	}

}
