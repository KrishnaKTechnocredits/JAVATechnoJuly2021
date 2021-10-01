/*
Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99
*/

package amol_Vyas;

import java.util.ArrayList;

public class Assignment_44 {
	
	static int getMaxNumberFromArrayList(ArrayList<Integer> input) {
		int max=0;
		for(int index=0;index<input.size();index++) {
			if(input.get(index)>max)
				max=input.get(index);
		}
		return max;
		
	}

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(7);
		arrayList.add(99);
		arrayList.add(53);
		arrayList.add(74);
		System.out.println("Max number from an ArrayList is "+Assignment_44.getMaxNumberFromArrayList(arrayList));
	}
}
