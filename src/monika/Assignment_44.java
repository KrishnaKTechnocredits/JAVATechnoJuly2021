/*
Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99
*/
package monika;

import java.util.ArrayList;

public class Assignment_44 {

	static int getMaximumNumberFromArrayList(ArrayList<Integer> input) {
		
		int max=0;
		for(int index=0; index<input.size();index++) {
			if(input.get(index)>max)
				max=input.get(index);
		}
		return max;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arraylist= new ArrayList<Integer>();
		arraylist.add(10);
		arraylist.add(7);
		arraylist.add(99);
		arraylist.add(53);
		arraylist.add(74);
		System.out.println("Max Number from ArrayList is: "+Assignment_44.getMaximumNumberFromArrayList(arraylist));
	}
}

