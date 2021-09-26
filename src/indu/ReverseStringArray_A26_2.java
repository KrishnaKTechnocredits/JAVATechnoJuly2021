package indu;

import java.util.Arrays;

public class ReverseStringArray_A26_2 
{
	void reverseArrayString(String[] str)
	{
		String[] output = new String[str.length];
		int index=str.length-1;
		int j=0;
		while (index>=0)
		{
			output[j]= str[index--];
			j++;
		}
		System.out.println("REverse String Array is : "+Arrays.toString(output));
	}
	public static void main(String[] st)
	{
		ReverseStringArray_A26_2 reverseStringArray_A26_2 = new ReverseStringArray_A26_2();
		String[] input = {"Credits", "Techno","From","Diwali","Happy"};
		System.out.println("Input String is : "+Arrays.toString(input));
		reverseStringArray_A26_2.reverseArrayString(input);
	}
		
	
}
