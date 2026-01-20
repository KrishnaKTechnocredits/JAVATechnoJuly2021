/*Assignment - 48 : 9th Oct'2021
program 11 : find duplicate from array.
Option 1 : without Collection -> Array & loop inside loop
Option 2 : ArrayList : boolean contains()
Option 3 : Set : boolean add()
Option 4 : Map : value gr8 than 1.*/


package ritabrata.assignment48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class Assignment_48_11 {
	static void findDuplicateNum(Integer[] input){
		for (int i=0; i< input.length; i++) {
			int count=0;
			for (int j=i+1; j< input.length; j++) {
				if (input[i]==input[j]) {
					count++;
					input[j]=-100;
				}
			}
			if (count!=0 && input[i]!=-100) {
				System.out.print(input[i]+" ");
			}
		}
	}
	
	static void findDuplicateNumber_2(Integer[] input) {
		ArrayList<Integer> ar1= new ArrayList<Integer>(Arrays.asList(input));
		for (int i=0; i< ar1.size(); i++) {
			if (ar1.lastIndexOf(ar1.get(i))!= ar1.indexOf(ar1.get(i))) {
				System.out.println(ar1.get(i)+" ");
				ar1.remove(ar1.get(i));
			}
		}
	}
	
	static void findDuplicateNumber_3(Integer[] input) {
		HashSet<Integer> hs= new HashSet<Integer>();
		HashSet<Integer> hs1= new HashSet<Integer>();
		for (int n: input) {
			if (!hs.add(n)) {
				hs1.add(n);
			}
		}
		System.out.print(hs1+" ");
	}
	
	static void findDuplicateNumber_4(Integer[] input) {
		HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>();
		
		for (int n: input) {
			if (hm.containsKey(n)) {
				int count= hm.get(n);
				hm.put(n, ++count);
			}else {
				hm.put(n, 1);
			}
		}
		for (Entry<Integer, Integer> num: hm.entrySet()) {
			System.out.println(num);
			if (num.getValue()>1)
				System.out.println(num.getValue());
		}
	}
	
	public static void main(String[] args) {
		Integer[] input = { 1, 11, 33, 22, 22, 11, 11,1, 9, 7, 7 };
		findDuplicateNum(input);
	}

}
