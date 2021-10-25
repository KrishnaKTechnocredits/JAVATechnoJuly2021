package rushikesh.assign46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Find missing number in a range [1-10] from given ArrayList.
//input : [1,6,2,5,7,6,3,10]
//output : [4,8,9]
//
//Hint : Method Parameter should be ArrayList, return type should be ArrayList.
public class Assign46_10 {
	static ArrayList<Integer>findMissingNumber(ArrayList<Integer>input){
	Collections.sort(input);
		
	ArrayList<Integer> al=new ArrayList<Integer>();
		for(int index=1;index<=input.size()+1;index++) {
			if(!(input.contains(index))) {
				al.add(index);
			}
		}
		return al;
		
	}
	public static void main(String[] args) {	
	Integer[] input = {1,6,2,5,7,6,3,10};
	ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(input));	
	System.out.println(findMissingNumber(arrayList));	
	}
}
