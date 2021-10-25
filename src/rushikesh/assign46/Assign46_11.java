package rushikesh.assign46;

import java.util.ArrayList;
import java.util.Arrays;
//Remove all zeros from given ArrayList.
//
//input : [10,0,0,1,0,3,0,2,6]
//output : [10,1,3,2,6]

public class Assign46_11 {
	static ArrayList<Integer>removeZeros(ArrayList<Integer>input){
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int index=0;index<input.size();index++) {
			if(input.get(index) != 0) {
				al.add(input.get(index));
			}
		}
		return al;		
	}
	public static void main(String[] args) {	
		Integer[] input = {10,0,0,1,0,3,0,2,6};
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(input));	
		System.out.println(removeZeros(arrayList));	
	}
}
