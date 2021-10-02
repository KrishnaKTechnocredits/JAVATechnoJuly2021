package swati.Assignment45;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45 {
	
	void removeDuplicates(String[] input) {
		ArrayList<String> list1=new ArrayList<String>(Arrays.asList(input));
		ArrayList<String> output=new ArrayList<String>();
		for(String e1:list1) {
			if(!output.contains(e1)) {
				output.add(e1);
			}			
		}		
		System.out.println("Program1 Output :"+output);
	}
	
	void printDuplicates(String[] input) {
		ArrayList<String> list1=new ArrayList<String>(Arrays.asList(input));
		ArrayList<String> output=new ArrayList<String>();
		for(int index=0;index<input.length;index++) {
			if(list1.indexOf(list1.get(index))==index && list1.lastIndexOf(list1.get(index))!=index){
				output.add(list1.get(index));
			}
		}
		System.out.println("Program2 Output :"+output);
	}
	 
	void printIndexOfAllOccurances(String[] input) {
		ArrayList<String> list1=new ArrayList<String>(Arrays.asList(input));
		System.out.println("Program3 Output :");
		for(int index=0;index<list1.size();index++) {
			if(list1.get(index)=="Akanksha") {
				System.out.println(index);
			}
		}
		
	}
	
	void startWithAAndGt6(String[] input) {
		ArrayList<String> list1=new ArrayList<String>(Arrays.asList(input));
		ArrayList<String> output=new ArrayList<String>();
		for(String e1:list1) {
			if(e1.startsWith("A") && e1.length()>6) {
				if(!output.contains(e1))
					output.add(e1);
			}
		}
		System.out.println("Program4 Output:"+output);	
	}
	
	public static void main(String[] a) {
		Assignment45 a1 =new Assignment45();
		String[] input1= {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		a1.removeDuplicates(input1);
		a1.printDuplicates(input1);
		String[] input2= {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		a1.printIndexOfAllOccurances(input2);
		String[] input3= {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"};
		a1.startWithAAndGt6(input3);
	}

}

