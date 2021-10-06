package gauravk.Assignment_45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

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
public class RemoveDuplicatesFrmArrayList {
	 
	ArrayList<String> removeDuplicatesUsingList(String[] arr){
		ArrayList<String> arl = new ArrayList<String>(Arrays.asList(arr));
		
		for(int i=0; i<arl.size(); i++) {
			String s = arl.get(i);
			if(arl.indexOf(s)!=arl.lastIndexOf(s)) {
				arl.remove(arl.lastIndexOf(s));
				i--;
			}
		}
		return arl;
	}
	
	LinkedHashSet<String> removeDuplicatesUsingSet(String[] arr){
		LinkedHashSet<String> hsl = new LinkedHashSet<>(Arrays.asList(arr));
		
		return hsl;
	}
	
	public static void main(String[] args) {
		String[] input = {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		System.out.println("Removing duplicates from arraylist & keeping only single occurance of every element.\nInput : "+Arrays.toString(input));
		System.out.println("----------using List collection---------------");
		System.out.println("Output: "+new RemoveDuplicatesFrmArrayList().removeDuplicatesUsingList(input));
		System.out.println("----------using Set collection---------------");
		System.out.println("Output: "+new RemoveDuplicatesFrmArrayList().removeDuplicatesUsingSet(input));
	}
}
