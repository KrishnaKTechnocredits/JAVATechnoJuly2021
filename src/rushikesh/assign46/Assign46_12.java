package rushikesh.assign46;

import java.util.ArrayList;
import java.util.Arrays;

//Remove all non prime numbers from given Set.
//
//input : [19,12,18,17,23,22]
//output : [19,17,23]


	
public class Assign46_12 {
	static ArrayList<Integer>removePrimeNos(ArrayList<Integer>input){
		ArrayList<Integer> al=new ArrayList<Integer>();
		int size = input.size();
		for(int index=0;index<size;index++) {
			int prime = input.get(index);
				if(prime%2!=0 && prime%3!=0 && prime%5!=0 && prime%7!=0) {
					al.add(input.get(index));
				}
			}
		
		return al;
	}
	
public static void main(String[] args) {	
		Integer[] input = {19,12,18,17,23,22};
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(input));	
		System.out.println(removePrimeNos(arrayList));	
	}
}
