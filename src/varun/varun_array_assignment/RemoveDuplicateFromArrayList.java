/*Program 1: remove duplicates from arraylist, it should have only single occurance
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]*/

package varun.varun_array_assignment;

import java.util.ArrayList;

public class RemoveDuplicateFromArrayList {
	void removeDuplicateFromTheGivenArrayList(ArrayList<String> str) {
		ArrayList<String> output = new ArrayList<String>();
		for(int index =0;index<str.size();index++) {
			if(str.indexOf(str.get(index))==index)
				output.add(str.get(index));
		}
		System.out.println(output);
	}
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Techno");
		al.add("Mayur");
		al.add("Chandni");
		al.add("Amruta");
		al.add("Chandni");
		al.add("Varun");
		al.add("Mayur");
		al.add("Amruta");
		al.add("Credits");
		al.add("Amruta");
		al.add("Varun");
		RemoveDuplicateFromArrayList removeDuplicateFromArrayList =  new RemoveDuplicateFromArrayList();
		removeDuplicateFromArrayList.removeDuplicateFromTheGivenArrayList(al);
	}
}
