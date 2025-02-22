/*Assignment-45 : 2nd Oct

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
*/package sayli_Vyavhare;

import java.util.ArrayList;
import java.util.Arrays;

public class Assign_45 {

	// Program 1: remove duplicates from arraylist, it should have only single
	// occurance
	static void removeDuplicates(String[] input) {
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList(input));
		ArrayList<String> arr1 = new ArrayList<String>();

		System.out.println("Given list is:" + arr);
		for (String name : arr) {
			if (!arr1.contains(name)) {
				arr1.add(name);
			}
		}

		System.out.println("After removing duplicates from arraylist:" + "\n" + arr1);

	}

	// Program 2: print duplicates in arraylist [print all the elements having freq
	// more than 1]
	static void getDuplicates(String[] input) {
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList(input));
		ArrayList<String> output = new ArrayList<String>();

		System.out.println("Given list is:" + arr);
		for (int index=0;index<arr.size();index++) {
			if(arr.indexOf(arr.get(index))!=arr.lastIndexOf(arr.get(index))) {
				if(!output.contains(arr.get(index))){
					output.add(arr.get(index));
				}
			}
		}

		System.out.println("Duplicates present in  arraylist:" + "\n" + output);

	}

	// program 3: print index of all occurences of Akanksha.
	static void getOccurrences(String str) {
		String[] input = { "Techno", "Akanksha", "Mayur", "Chandni", "Akanksha", "Amruta", "Chandni", "Parthav",
				"Mayur", "Amruta", "Credits", "Amruta" };
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList(input));
		System.out.println("ArrayList is: "+arr);
		for (int index=0;index<arr.size();index++) {
			if (arr.get(index)==str) {
				System.out.println("Index is :" + index );
			}

		}
	}
	
	//program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
	static void getName(String input1[]) {
		
		ArrayList <String> arr=new ArrayList<String>(Arrays.asList(input1));
		ArrayList <String> arr1=new ArrayList<String>();

		for(int index=0;index<arr.size();index++) {
			String input=arr.get(index);
			if(input.length()>6 && input.contains("A")) {
				if(!arr1.contains(input))
				 arr1.add(input);
			}
		}
		System.out.println("Arrayist contains:" +arr1);

	}

	public static void main(String args[]) {

		String[] input = { "Techno", "Mayur", "Chandni", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta", "Credits",
				"Amruta" };
		removeDuplicates(input);
		System.out.println("------------------------------------------------------------");
		getDuplicates(input);
		System.out.println("------------------------------------------------------------");
		getOccurrences("Akanksha");
		System.out.println("------------------------------------------------------------");
		String input1[]= {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"};
		getName(input1);

	}
}
