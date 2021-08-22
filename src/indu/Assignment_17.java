package indu;

public class Assignment_17 {

	String getReverseString(String inputString)
	{
		System.out.println("\nInput String is   : " +inputString);
		String reverseOutputString="";
		
		for(int index=inputString.length()-1; index>=0; index--)
		{
			reverseOutputString += inputString.charAt(index);
			//System.out.println(reverseOutputString);
		}
		return reverseOutputString;	
	}
	public static void main(String[] args) 
	{
		Assignment_17 assignment_17 = new Assignment_17();
		
		System.out.println("\nReverse String is : " + assignment_17.getReverseString("TECHNOCREDITS"));
		System.out.println("\nReverse String is : " + assignment_17.getReverseString("MUINELES"));
	}
}
