/*program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]		 
output : [Akanksha, AparnaTiwari]*/
package indu.Assignment_45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetElementStartsWithAndLengthA45_4 {
	
	ArrayList<String> getElementStartWithandlength(String[] str, String ch,int length)
	{
		List<String> list = Arrays.asList(str);
		ArrayList<String> input = new ArrayList<String>(list);
		ArrayList<String> output = new ArrayList<String>();
		System.out.println("Input string is :\n\n"+input);
		for(String name :input)
		{
			if(name.startsWith(ch)&& name.length()>length)
			{
				if(!(output.contains(name)))
				{
					output.add(name);
				}
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		GetElementStartsWithAndLengthA45_4 a45_4= new  GetElementStartsWithAndLengthA45_4();
		String[] str = {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"};		
		System.out.println("\nList with name that start with A and length greater then 6 is :\n\n" +a45_4.getElementStartWithandlength(str, "A", 6));
	}
}
