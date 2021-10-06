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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PrintIndexOfAllOcurrenceOfElement {

	void printingAllIndexOfElement(String[] arr, String str){
		ArrayList<String> arl = new ArrayList<String>(Arrays.asList(arr));
		ArrayList<Integer> arl2 = new ArrayList<Integer>();
		if(arl.contains(str)) {
			for(int i=0; i<arl.size(); i++) {
				String s = arl.get(i);
				if(arl.get(i).equals(str)) {
					arl2.add(i);
				}
			}
			System.out.println("Output: all ocurrences of "+str+" is "+arl2);
		} else System.out.println("The element "+str+" is not found in dataset.");
	}
	
	public static void main(String[] args) {
		String[] input = {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		System.out.println("Printing index of all occurances of "+"Akanksha"+".\nInput : "+Arrays.toString(input));
		new PrintIndexOfAllOcurrenceOfElement().printingAllIndexOfElement(input, "Akanksha");
	}
}