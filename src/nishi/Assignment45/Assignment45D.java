/*program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]		 
output : [Akanksha, AparnaTiwari*/

package nishi.Assignment45;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45D {
	public static void main(String[] args) {
		String[] arr= {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"};
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(arr));
		ArrayList<String> newAl=new ArrayList<String>();
		for(String name:al)
		{
			if(name.contains("A") && name.length()>6)
			{
				if(!newAl.contains(name))
					newAl.add(name);
			}
		}
		System.out.println("Output: "+newAl);
	}
}
