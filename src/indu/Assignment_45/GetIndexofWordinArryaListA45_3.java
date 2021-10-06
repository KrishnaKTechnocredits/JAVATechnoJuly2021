/*program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
         4*/
package indu.Assignment_45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetIndexofWordinArryaListA45_3 {

	void printAllOccurenceOfElement(String[] str, String word)
	{
		List<String> list = Arrays.asList(str);
		ArrayList<String> input = new ArrayList<String>(list);
		System.out.println("Input string to print index of  all occurences of "+word+" is :\n\n"+input);
		System.out.println("\nIndex of element "+word +" : ");
		for(int index=0;index<input.size();index++)
		{
			if(input.get(index).contains(word))
			{	
				System.out.print(index+ " ");
			}	
		}
	}
	
	public static void main(String[] args) {
		GetIndexofWordinArryaListA45_3 a45_3 = new GetIndexofWordinArryaListA45_3();
		String[] str = {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		a45_3.printAllOccurenceOfElement(str, "Akanksha");
	}
}
