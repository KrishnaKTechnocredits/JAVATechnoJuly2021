/*program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
         4*/

package nishi.Assignment45;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45C {
	
	public static void main(String[] args) {
		
		String[] arr= {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		ArrayList<String> al=new ArrayList<>(Arrays.asList(arr));
		for(int index=0;index<al.size();index++)
		{
			if(al.get(index).equals("Akanksha"))
				System.out.println(index);
		}
	}
	

}
