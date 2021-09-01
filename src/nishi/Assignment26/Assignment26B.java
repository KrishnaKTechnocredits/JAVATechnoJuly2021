package nishi.Assignment26;

import java.util.Arrays;

public class Assignment26B {
	
	String[] getReverseOfArray(String[] input)
	{
		String[] output=new String[input.length];
		for(int i=input.length-1,j=0;i>=0 || j<input.length;i--,j++)
		{
			output[j]=input[i];
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input= {"Credits","Techno","From","Diwali","Happy"};
		String[] output=new Assignment26B().getReverseOfArray(input);
		System.out.println(Arrays.toString(output));

	}

}
