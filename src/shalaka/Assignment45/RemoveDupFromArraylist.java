/*Assignment-45 : 2nd Oct

Program 1: remove duplicates from arraylist, it should have only single occurance
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]*/
package shalaka.Assignment45;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDupFromArraylist {
	void removeDuplicate(ArrayList<String> list) {
		System.out.println("Input: "+list);
		ArrayList<String> outputList=new ArrayList<String>();
			for(String name:list) {
				if(!outputList.contains(name)) {
					outputList.add(name);
				}
			}
			System.out.println("Output:"+outputList);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		RemoveDupFromArraylist removeDupFromArraylist = new RemoveDupFromArraylist();
		ArrayList<String> list=new ArrayList<String>(Arrays.asList(input));
		removeDupFromArraylist.removeDuplicate(list);
	}

}
