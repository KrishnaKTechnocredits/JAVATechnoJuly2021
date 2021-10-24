package ashit_assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment_46_Program_12 
{

	ArrayList<Integer> removeAllZeros(ArrayList<Integer> al) 
	{
		ArrayList<Integer> output = new ArrayList<Integer>();
		for(Integer num : al)
		{
			if(num != 0)
				output.add(num);
		}
		return output;
	}

	public static void main(String[] args)
	{
		Integer[] input = {10,0,0,1,0,3,0,2,6};
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(input));
		Assignment_46_Program_12 p12 = new Assignment_46_Program_12();
		System.out.println("Input- " + al);
		System.out.println("Remove all zeros from input list- " + p12.removeAllZeros(al));
	}
}
