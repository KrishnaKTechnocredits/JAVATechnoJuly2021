
/*Assignment-45 :
Program 1: remove duplicates from arraylist, it should have only single occurance
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]
*/

package santosh_Assignment45;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment45_Program1 {

	void removeDuplicates(String[] str)
	{
		List<String> list = Arrays.asList(str);
		ArrayList<String> names = new ArrayList<String>(list);
		ArrayList<String> output = new ArrayList<String>();
		System.out.println("\nInput string :\n"+names);

		for(int index=0;index<names.size();index++)
		{
			if(index==names.indexOf(names.get(index)))
			{
				output.add(names.get(index));
			}
		}
		System.out.println("\nAfter removing duplicates from arraylist:");
		System.out.println("\nOutPut is :\n "+output);
	}
	public static void main(String[] args) {
		Assignment45_Program1 ass45_1 = new Assignment45_Program1();
		String[] input = {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		ass45_1.removeDuplicates(input);
	}
}
