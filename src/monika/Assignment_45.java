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
*/
package monika;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment_45 {

	static void removeDuplicateEleFromArrayList(ArrayList<String> input) {
		ArrayList<String> output=new ArrayList<String>();
		for(int index=0;index<input.size();index++) {
			if(input.indexOf(input.get(index))==index)
				output.add(input.get(index));
		}
		System.out.println("Remove Duplicates From ArrayList: "+output);
	}
	
	static void printDuplicateArrayListEle(ArrayList<String> input) {
		ArrayList<String> output=new ArrayList<String>();
		for(int index=0;index<input.size();index++) {
			String name=input.get(index);
			if(input.indexOf(name)!=input.lastIndexOf(name))
				if(input.indexOf(name)==index)
					output.add(name);
		}
		System.out.println("All the elements having frequency more than 1: "+output);
	}
	
	static void printOccuranceOfPrticularElement(ArrayList<String> input, String name){
		
		for(int index=0;index<input.size();index++) {
			if(input.get(index)==name)
				System.out.println(index);
		}
	}
	
	static void printNameStartsWithAAndLengthGreaterthan6Chars(ArrayList<String> input){
		
		ArrayList<String> output=new ArrayList<String>();
		for(String name:input) {
			if(name.startsWith("A") && name.length()>6)
				if(!(output.contains(name)))
					output.add(name);
		}
		System.out.println("ArrayList which contains name starts with A and having length more than 6 chars: "+output);
	}
	public static void main(String[] args) {
		String[] str1 = { "Techno", "Mayur", "Chandni", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta", "Credits",
		"Amruta" };
		ArrayList<String> input=new ArrayList<>(Arrays.asList(str1));
		Assignment_45.removeDuplicateEleFromArrayList(input);
		Assignment_45.printDuplicateArrayListEle(input);
		String[] str2 = { "Techno", "Akanksha", "Mayur", "Chandni", "Akanksha", "Amruta", "Chandni", "Parthav", "Mayur",
				"Amruta", "Credits", "Amruta" };
		input=new ArrayList<String>(Arrays.asList(str2));
		Assignment_45.printOccuranceOfPrticularElement(input, "Akanksha");
		String[] str3 = { "Techno", "Akanksha", "Mayur", "Chandni", "Akanksha", "Amruta", "Chandni", "Parthav", "Mayur",
				"Amruta", "Credits", "Amruta", "AparnaTiwari" };
		input = new ArrayList<String>(Arrays.asList(str3));
		Assignment_45.printNameStartsWithAAndLengthGreaterthan6Chars(input);
		
		
		
	}
}
