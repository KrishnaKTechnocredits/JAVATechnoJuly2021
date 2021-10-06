package gauravk.Assignment_45;
/*
 * Assignment-45 : 2nd Oct

Program 1: remove duplicates from arraylist, it should have only single occurance
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]

Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]

program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
         4

program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]		 
output : [Akanksha, AparnaTiwari]
 */

/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
*/
import java.util.*;

public class ReturnArrayListWithCriteria {
	Collection<String> allElementsStartingWithAndLength (String[] arr, String ch, int len){
		ArrayList<String> arl = new ArrayList<String>(Arrays.asList(arr));
		LinkedHashSet<String> arl2 = new LinkedHashSet<>();
		for(String name : arl) {
			if(name.startsWith(ch) && name.length()>len) {
				arl2.add(name);
			}
		}
		return arl2;
	}
	
	public static void main(String[] args) {
		String[] input = {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"};
		System.out.println("Returning an ArrayList which contains name starts with A and having length more than 6 chars.\nInput : "+Arrays.toString(input));
		System.out.println("----------using both ArrayList and LinkedHashSet of collection framework----------");
		System.out.println("Output : "+new ReturnArrayListWithCriteria().allElementsStartingWithAndLength(input, "A", 6));
	}
}
