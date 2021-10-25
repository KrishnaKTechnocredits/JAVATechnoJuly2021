package rushikesh.assign40_45;
import java.util.ArrayList;
import java.util.Arrays;
//Assignment-45 : 2nd Oct
//Program 1: remove duplicates from arraylist, it should have only single occurance
//input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
//output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]


public class Assign45_1 {
	public static void main(String[] args) {
		String[] input = {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(input));
		Assign45_1 assign45_1 = new Assign45_1();
		assign45_1.removeAllDuplicates(list);	
	}
	void removeAllDuplicates(ArrayList<String> list) {
		System.out.println("input:" +list);
		ArrayList<String> outputList=new ArrayList<String>();
		for(String name: list) {
			if(!outputList.contains(name)) {
				outputList.add(name);
			}
		}
		System.out.println("Output- " + outputList);
	}
	
	
	
	
}
