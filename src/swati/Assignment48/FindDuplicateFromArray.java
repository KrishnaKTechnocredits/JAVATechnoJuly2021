package swati.Assignment48;

import java.util.*;

/*
 * program 11 : find duplicate from array.
Option 1 : without Collection -> Array & loop inside loop
Option 2 : ArrayList : boolean contains()
Option 3 : Set : boolean add()
Option 4 : Map : value gr8 than 1.
 */
public class FindDuplicateFromArray {
	
	void usingArrayAndLoop(Integer[] input) {
		for(int index=0;index<input.length;index++) {
			for(int index2=index+1;index2<input.length;index2++) {
				if(input[index]==input[index2]) {
					System.out.println(input[index]);
					break;
				}
			}
		}		
	}
	
	void usingArrayList(Integer[] input) {
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(input));
		ArrayList<Integer> output=new ArrayList<Integer>();
		for(int num:list){
			if(output.contains(num)) {
				System.out.println(num);
			}else
				output.add(num);
		}
	}
	
	void usingSet(Integer[] input) {
		Set<Integer> list=new HashSet<Integer>();
		for(int num:input) {
			if(!list.add(num)){
			System.out.println(num);
			}else
				list.add(num);
		}				
	}
	
	void usingMap(Integer[] input) {
		Map<Integer,Integer> list=new HashMap<Integer,Integer>();
		for(int num:input) {
			if(list.containsKey(num)){
				list.put(num,list.get(num)+1);
			}else
				list.put(num,1);
		}
		
		for(int num :list.keySet()) {
			if(list.get(num)>1) {
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] a) {
		FindDuplicateFromArray f1=new FindDuplicateFromArray();
		Integer[] input= {1,11,33,22,22,11,1,9,7,7};
		System.out.println("UsingArray:");
		f1.usingArrayAndLoop(input);
		System.out.println("UsingArrayList:");
		f1.usingArrayList(input);
		System.out.println("UsingSet:");
		f1.usingSet(input);
		System.out.println("UsingMap:");
		f1.usingMap(input);
	}
}
