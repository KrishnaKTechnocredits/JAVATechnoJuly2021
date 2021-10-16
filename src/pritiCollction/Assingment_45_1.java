package pritiCollction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assingment_45_1 {
	
	ArrayList<String> removeDuplicates(String [] names){
		ArrayList<String> list= new ArrayList<String> (Arrays.asList(names));
		ArrayList<String> filternamelist= new ArrayList<String>();
		for (String name : list) {
			if (!(filternamelist.contains(name))){
				filternamelist.add(name);
			}
		}
		return filternamelist;
	}
	
	public static void main(String[] a) {
		Assingment_45_1 assingment_45_1 =new Assingment_45_1();
		String [] input = {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		ArrayList<String> list= assingment_45_1.removeDuplicates(input);
		System.out.println(list);
	}
	
}
/*Program 1: remove duplicates from arraylist, it should have only single occurance
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]
*/
