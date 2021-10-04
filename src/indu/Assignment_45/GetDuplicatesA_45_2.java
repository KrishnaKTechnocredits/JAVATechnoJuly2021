/*Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]*/
package indu.Assignment_45;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class GetDuplicatesA_45_2 {
	void getDuplicates(String[] str)
	{
		List<String> list = Arrays.asList(str);
		ArrayList<String> name = new ArrayList<String>(list);
		System.out.println("Input string  to get the element having more than one occurence in Arryalist :\n\n" + name);
		int count=0;
		ArrayList<String> output = new ArrayList<String>();
		for(int index=0;index<name.size();index++)
		{
			if(!(name.indexOf(name.get(index))==name.lastIndexOf(name.get(index))))
			{
				if(index==name.indexOf(name.get(index)))
				output.add(name.get(index));
			}
			
		}
		System.out.println("\nOutput is : "+output);
	}
	
	public static void main(String[] args) {
		GetDuplicatesA_45_2 a45_2 = new GetDuplicatesA_45_2();
		String[] str = {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		a45_2.getDuplicates(str);
	}
}
