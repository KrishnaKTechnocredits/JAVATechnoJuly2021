package manaswi;
import java.util.ArrayList;
import java.util.Arrays;

/*Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]*/

public class Assignment_45_2 
{
	void getDuplicate(String[] input)
	{
		int count = 0;
		ArrayList<String> listname = new ArrayList<String>(Arrays.asList(input));
		ArrayList<String> output = new ArrayList<>();
		for (int index = 0; index < listname.size(); index++) 
		{
			if (listname.indexOf(listname.get(index)) != listname.lastIndexOf(listname.get(index)))
			{
				if (index == listname.indexOf(listname.get(index))) 
				{
					output.add(listname.get(index));

				}
			}

		}
		System.out.println("Output string is : " + output);
	}

	public static void main(String[] args) 
	{
		String[] input = { "Techno", "Mayur", "Chandni", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta", "Credits","Amruta" };
		Assignment_45_2 assignment_45_2 = new Assignment_45_2();
		assignment_45_2.getDuplicate(input);

	}
}