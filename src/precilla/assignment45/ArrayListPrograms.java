package precilla.assignment45;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPrograms {
	
	void removeDuplicatesinarraylist(String[] names){
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(names));
		ArrayList<String> al1=new ArrayList<String>();
		for(int index=0;index<al.size();index++) {
				if(!al1.contains(al.get(index))) {
					al1.add(al.get(index));
				}
			}
		System.out.print(al1);	
	}
	void printDuplicatesinarraylist(String[] names){
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(names));
		ArrayList<String> al1=new ArrayList<String>();
		for(int index=0;index<al.size();index++) {
			if(al.indexOf(al.get(index))!=al.lastIndexOf(al.get(index))) {
				if(!al1.contains(al.get(index)))
					al1.add(al.get(index));
			}	
		}
		System.out.println(al1);
	}
	
	void printNameIndex(String[] names) {
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(names));
		
		for(int index=0;index<al.size();index++) {
			if(al.get(index).contains("Akanksha"))
				System.out.println(index);
		}
	}
	void printLength(String[] names) {
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(names));
		ArrayList<String> al1=new ArrayList<String>();
		for(int index=0;index<al.size();index++) {
			if(al.get(index).contains("A")&&al.get(index).length()>6) {
				if(!al1.contains(al.get(index))) {
					al1.add(al.get(index));
				}
			}
				
		}
		System.out.println(al1);
	}
	public static void main(String[] args) {
		
		String arr[]= {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		ArrayListPrograms p=new ArrayListPrograms();
		System.out.println("Program 1: remove duplicates from arraylist, it should have only single occurance");
		System.out.println("Input:" +Arrays.toString(arr));
		System.out.print("Output:");
		p.removeDuplicatesinarraylist(arr);
		System.out.println("\n\nProgram 2: print duplicates in arraylist [print all the elements having freq more than 1");
		System.out.println("Input:" +Arrays.toString(arr));
		System.out.print("Output :");
		p.printDuplicatesinarraylist(arr);
		String ar1[]= {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta","AparnaTiwari"};
		System.out.println("\nprogram 3: print index of all occurances of Akanksha");
		System.out.println("Input:" +Arrays.toString(ar1));
		System.out.println("Output :");
		p.printNameIndex(ar1);
		System.out.println("\nprogram 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.");
		System.out.println("Input:" +Arrays.toString(ar1));
		System.out.print("Output :");
		p.printLength(ar1);
	}

}
