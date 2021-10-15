package chirag.assignment45;
/*Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicates {
	
	public static void main(String[] args) {
		String [] arr = {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		List<String> list = Arrays.asList(arr);
		ArrayList<String> al1=new ArrayList<>(list);
		ArrayList<String> al2=new ArrayList<>();
		
		for(int index=0;index < al1.size();index++) {
			String name = al1.get(index);
			if(al1.indexOf(name) != al1.lastIndexOf(name)) {
				if(!al2.contains(name))
				al2.add(name);
			}
		}
		System.out.println(al2);
	}
}