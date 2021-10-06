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

package ritabrata2;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment_45 {
	void removeDuplicateInArrayList(ArrayList<String> input) {
		ArrayList<String> output= new ArrayList<String>();
		for(int index=0; index<input.size(); index++) {
			if(input.indexOf(input.get(index))==index) 
				output.add(input.get(index));
		}
		System.out.println("The output is: "+output);
		System.out.println("-----------------------------------------");
	}
	
	void printDuplicate(ArrayList<String> input) {
		ArrayList<String> output= new ArrayList<String>();
		for(int index=0; index<input.size(); index++) {
			if(input.indexOf(input.get(index))==index) {
				String name= input.get(index);
				if(input.indexOf(name)!=input.lastIndexOf(name))
					if(input.indexOf(name)==index) 
						output.add(name);
			}
		}
		System.out.println("The output is: "+output);
		System.out.println("-----------------------------------------");
	}
	
	void printOccurance(ArrayList<String> input, String name) {
		for(int index=0; index<input.size(); index++) {
			if(input.get(index)==name) 
				System.out.println("The imdex is: "+index);
		}
		System.out.println("-----------------------------------------");
	}
	
	void nameStartsWithAHavingSixChars(ArrayList<String> input) {
		ArrayList<String> output= new ArrayList<String>();
		for(int index=0; index<input.size(); index++) {
			if(input.get(index).startsWith("A") && input.get(index).length()>6) {
				if(index== input.indexOf(input.get(index)))
					output.add(input.get(index));
			}
		}
		System.out.println("The output is: "+output);
	}
	

	public static void main(String[] args) {
		Assignment_45 arrayProg = new Assignment_45();
		ArrayList<String> input=new ArrayList<>();
		String[] input1 = {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		String[] input2 = {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"}; 
		String[] input3 = {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"};
		input=new ArrayList<String>(Arrays.asList(input1));
		arrayProg.removeDuplicateInArrayList(input);
		arrayProg.printDuplicate(input);
		input=new ArrayList<String>(Arrays.asList(input2));
		arrayProg.printOccurance(input, "Akanksha");
		input=new ArrayList<String>(Arrays.asList(input3));
		arrayProg.nameStartsWithAHavingSixChars(input);
		
	}

}
