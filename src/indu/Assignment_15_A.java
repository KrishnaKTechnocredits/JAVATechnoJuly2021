package indu;

import java.util.Arrays;

public class Assignment_15_A {

	int findDiffOfEvenAndOddLengthName(String[] name)
	{
		int evenLength = 0;
		int oddLength = 0;
		for(int index = 0; index < name.length; index++)
		{
			if(name[index].length() % 2 == 0)
				evenLength += name[index].length() ;
			else 
				oddLength += name[index].length();
		}
		if(evenLength > oddLength)
			return evenLength - oddLength;
		else 
			return oddLength - evenLength;
	}
	
	char[] findMiddleChar(String[] name)
	{
		char middleChar;
		char[] mid = new char[name.length];
		for(int index = 0; index < name.length; index++)
		{
			String str = name[index];
			if(name[index].length() % 2 == 0)
				
				middleChar=str.charAt(str.length()/2-1) ;
			else
				middleChar=str.charAt(str.length()/2) ;
			
			mid[index] = middleChar;
			
		}
		return mid;
	}
	
	
	public static void main(String[] arg)
	{
		Assignment_15_A assignment_15 = new Assignment_15_A();
		String[]  input = {"Indira","Tejal","Nikita","Palak" ,"Rutu_"};
		System.out.println("\n==========================================Program 1=================================================");
		System.out.println("\nDifference of odd and even length name of array "+Arrays.toString(input)
								+" is : "+assignment_15.findDiffOfEvenAndOddLengthName(input));
		
		System.out.println("\n===========================================Program 2=================================================");
		System.out.println("\nMiddle char of all name in String Arrya "+Arrays.toString(input)+" is : " 
								+Arrays.toString(assignment_15.findMiddleChar(input)));
	}
}
