package bhagyashree;

public class CodingTest2 {
	
	String convertStringUpperandLowerCase(String input)
	{
		String temp="";
		for(int index=0;index<input.length();index++)
		{
			
			if(Character.isLowerCase(input.charAt(index)))
			{
				temp=temp+Character.toUpperCase(input.charAt(index));
			}
			else if(Character.isUpperCase(input.charAt(index)))
			{
				temp=temp+Character.toLowerCase(input.charAt(index));
			}
			else if(Character.isDigit(input.charAt(index)))
			{
				temp=temp+input.charAt(index);
			}
		}
	return temp;
	}
	public static void main(String[] args)
	{
		Assignment25 assignment25=new Assignment25();
		//System.out.println("String after conversion: "+assignment25.convertStringUpperandLowerCase("A1ashVi6"));
		
	}

}
