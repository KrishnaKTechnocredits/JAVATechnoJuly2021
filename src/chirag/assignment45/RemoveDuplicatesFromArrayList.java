package chirag.assignment45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Program 1: remove duplicates from arraylist, it should have only single occurance
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]*/

public class RemoveDuplicatesFromArrayList {
	
	public static void main(String[] args) {
		
		String [] arr = {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		List<String> list = Arrays.asList(arr);
		ArrayList<String> al=new ArrayList<>(list);
		
		for(int index=0;index < al.size();index++) {
			String name = al.get(index);
			if(al.indexOf(name) != al.lastIndexOf(name)) {
				al.remove(al.get(index));
				index--;
			}
		}
		System.out.println(al);
	}
}