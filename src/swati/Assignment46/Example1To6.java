package swati.Assignment46;
/*
 * Example 1 : 
Write a program to find given number is present in the arrayList or not.

Example 2 :
Write a program to find given number is duplicate in arrayList.

Example 3 :
Write a program to remove duplicate from ArrayList (without using set).

Example 4:  
Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.

Example 5 :
Remove the longest string from given Set.

Example 6 :
Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList
 */

import java.util.*;

public class Example1To6 {
	
	void isPresent(Integer[] input,int num) {
		ArrayList<Integer> list1=new ArrayList(Arrays.asList(input));
		//System.out.println(list1);
		if(list1.contains(num)) {
			System.out.println(num + " Number is present in ArrayList");	
		}else
			System.out.println(num + " Number is not present in ArrayList");				
	}
	
	void findIsDuplicate(Integer[] input,int num) {
		List<Integer> list1=new ArrayList<Integer>(Arrays.asList(input));
		//System.out.println(list1);
		if(list1.contains(num)) {
			if(list1.indexOf(num)!=list1.lastIndexOf(num)) {
				System.out.println(num+" is duplicate number");
			}
		}			
 	}

	void removeDuplicate(Integer[] input) {
		List<Integer> list1=new ArrayList<Integer>(Arrays.asList(input));
		List<Integer> list2=new ArrayList();
		for(int num:list1) {
			if(!list2.contains(num)) {
				list2.add(num);	
			}
		}		
		System.out.println(list2);
	}
	
	void removeDuplicateUsingSet(Integer[] input) {
		List<Integer>list1=new ArrayList(Arrays.asList(input));
		Set<Integer>list2=new LinkedHashSet(list1);
		System.out.println(list2);
	}
	
	void removeLongestString() {
		Set<String>list1=new LinkedHashSet();
		list1.add("Swati");
		list1.add("Technocredits");
		list1.add("Harsh");
		list1.add("Maulik");
		int max=0;
		String longestString="";
		for(String temp:list1) {
			if(max<temp.length()) {
				max=temp.length();
				longestString=temp;
			}
		}
		System.out.println(longestString);	
	}
	
	void secondLargestNum(Integer[] input) {
		Set<Integer>list1=new TreeSet(Arrays.asList(input));
		System.out.println("Example 6 Output:\n"+list1);
		List<Integer>list2=new ArrayList(list1);
		System.out.println(list2.get(list2.size()-2));		
	}
	
	public static void main(String[] a) {
		Example1To6 a1=new Example1To6();
		Integer[] input= {90,70,10,20,30,20,40,50,60,50};
		System.out.println("Example1 Output:");
		a1.isPresent(input,60);
		System.out.println("Example2 Output:");
		a1.findIsDuplicate(input, 20);
		System.out.println("Example3 Output:");
		a1.removeDuplicate(input);
		System.out.println("Example4 Output:");
		a1.removeDuplicateUsingSet(input);
		System.out.println("Example5 Output:");
		a1.removeLongestString();
		a1.secondLargestNum(input);
		
	}
	

}
