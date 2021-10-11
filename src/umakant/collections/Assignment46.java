/*
 Example 1 : 
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

Example 7 : 
Return ArrayList of first 10 prime numbers in the range [100,500].

Example 8:
Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList


Example 9 : 
Write a program to return Union of two ArrayList without duplicates.

input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10]

output : [10,19,33,44,12,99,110,11]

Example 11 :
Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]

Hint : Method Parameter should be ArrayList, return type should be ArrayList.

Example 12 :
Remove all zeros from given ArrayList.

input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]

Example 13:
Remove all non prime numbers from given Set.

input : [19,12,18,17,23,22]
output : [19,17,23]

Example 14:
Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.

Example 15:
Write a program to convert Array to List.

Example 16:
Write a program to traverse(or iterate) HashSet.

Example 17:
Write a program to add element at particular index of ArrayList?

Example 18:
Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method).
 */
package umakant.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment46 {
	// 1
	boolean isElementPresent(ArrayList<Integer> inputList, int element) {
		return inputList.contains(element);
	}

	// 2
	boolean checkElementIsDuplicate(ArrayList<Integer> inputList, int element) {
		return inputList.indexOf(element) != inputList.lastIndexOf(element);
	}

	// 3
	ArrayList<Integer> removeMultipleOccurance(ArrayList<Integer> inputList) {
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		for (int element : inputList) {
			if (!outputList.contains(element))
				outputList.add(element);
		}
		return outputList;
	}
	
	ArrayList<Integer> removeMultipleOccuranceUsingSet(ArrayList<Integer> inputList) {
		Set<Integer> set = new LinkedHashSet<Integer>(inputList);
		ArrayList<Integer> outputList = new ArrayList<Integer>(set);
		return outputList;
	}

	// 18
	ArrayList<Integer> removeElementFromIntegerList(ArrayList<Integer> inputList, int element) {
		Integer obj = element;
		inputList.remove(obj);
		return inputList;
	}

	public static void main(String[] args) {
		Assignment46 assignment = new Assignment46();
		ArrayList<Integer> inputList = new ArrayList<Integer>();
		inputList.add(10);
		inputList.add(20);
		inputList.add(1);
		inputList.add(40);
		inputList.add(30);
		inputList.add(1);
		inputList.add(10);
		int element = 1;
		int element1 = 5;
		// 1
		System.out.println("------------------------1-----------------------------------");
		System.out.println(
				inputList + " Is " + element + " present in list :" + assignment.isElementPresent(inputList, element));
		System.out.println(inputList + " Is " + element1 + " present in list :"
				+ assignment.isElementPresent(inputList, element1));
		// 1
		System.out.println("------------------------2-----------------------------------");
		System.out.println(inputList + " Is " + element + " duplicate in list :"
				+ assignment.checkElementIsDuplicate(inputList, element));
		System.out.println(inputList + " Is " + element1 + " duplicate in list :"
				+ assignment.checkElementIsDuplicate(inputList, element1));

		// 3
		System.out.println("------------------------3-----------------------------------");
		System.out.println(
				inputList + " :List after duplicates are removed" + assignment.removeMultipleOccurance(inputList));
		//4
		
		System.out.println("------------------------4(Using Set)-----------------------------------");
		System.out.println(
				inputList + " :List after duplicates are removed" + assignment.removeMultipleOccuranceUsingSet(inputList));
		// 18
		System.out.println("------------------------18-----------------------------------");
		System.out.print(inputList);
		assignment.removeElementFromIntegerList(inputList, element);
		System.out.println(":List After element " + element + " has been deleted:" + inputList);
	}

}
