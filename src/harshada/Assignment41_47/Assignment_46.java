/* 
 * Assignment 46: Programming Questions - Collections : 4th Oct'2021
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

package harshada.Assignment41_47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Assignment_46 {

	void p1(int arr[]) {
		// Example 1 :
		// Write a program to find given number is present in the arrayList or not.

		ArrayList<Integer> list = new ArrayList<Integer>();

		int numSearch = 500;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}

		System.out.println("ArrayList elements are : " + list);
		for (int num : list) {
			if (num == numSearch) {
				flag = true;
				break;
			}

		}
		if (flag == true)
			System.out.println("Number " + numSearch + " is present in given Array List ");
		else
			System.out.println("Number " + numSearch + " is not present in given Array List ");
	}

	void p2(int arr[]) {

		// Example 2 :
		// Write a program to find given number is duplicate in arrayList.

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println("ArrayList elements are : " + list);
		// if index is not same, number is duplicate else unique
		int numcheck = 5;

		if (list.indexOf(numcheck) == list.lastIndexOf(numcheck)) {
			System.out.println("Number " + numcheck + " is not duplicate number");
		} else
			System.out.println("Number " + numcheck + " is a duplicate number");
	}

	void p3(ArrayList list) {

		// Example 3 :
		// Write a program to remove duplicate from ArrayList (without using set).
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			Integer num = (Integer) list.get(i);
			if (!newList.contains(num)) {
				newList.add((Integer) list.get(i));

			}
		}
		System.out.println("ArrayList after removing duplicate numbers are : " + newList);
	}

	void p4(ArrayList list) {

		// Example 4:
		// Write a program to remove duplicate from ArrayList (using set).
		// Make sure element order remain same.
		LinkedHashSet<Integer> numSet = new LinkedHashSet<Integer>(list);
		System.out.println("ArrayList after removing duplicate numbers are :(Using SET) " + numSet);
	}

	void p5(HashSet<String> set) {
		// Example 5 :
		// Remove the longest string from given Set.
		System.out.println("Given SET elements are : " + set);
		String maxstr = " ";
		int maxlen = 0;
		for (String temp : set) {

			if (temp.length() > maxlen) {
				maxlen = temp.length();
				maxstr = temp;
			}
		}
		System.out.println("Maximum Length String is = " + maxstr + " its length is = " + maxlen);
		set.remove(maxstr);
		System.out.println("SET after removing maximu letter string is " + set);
	}

	void p6(int arr[]) {

		// Example 6 :
		// Find the second largest number from Given Array.
		// Hint : Convert Array -> TreeSet -> ArrayList

		Set<Integer> intSet = new TreeSet<Integer>();
		// add elements of array using normal for loop
		for (int i = 0; i < arr.length; i++) {
			intSet.add(arr[i]); // all elemenst gets stored in natural order thereore max is at last
		}
		System.out.println("Treeset Contents are : " + intSet);
		// create arraylist and pass set in constructor
		ArrayList<Integer> list = new ArrayList<Integer>(intSet);
		int secondmaxindex = list.get(list.size() - 2);
		System.out.println("Second Max Number = " + secondmaxindex);

	}

	void p7() {

		// Example 7 :
		// Return ArrayList of first 10 prime numbers in the range [100,500].
		int start = 100;
		int end = 500;
		int count = 0;
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		for (int i = start; i <= end; i++) {
			if (count < 10) {
				if (isPrime(i)) {
					list2.add(i);
					count++;
				}
			}
		}
		System.out.println("Prime Numbers are " + list2);
	}

	boolean isPrime(int n) {

		for (int index = 2; index < n; index++) {

			if (n % index == 0) {
				return false;
			}
		}
		return true;
	}

	void p8(int arr[]) {
		// Example 8:
		// Return all negative numbers (remove duplicates if any and maintain insertion
		// order) from given array.
		// Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
		// Ouput : [-11, -19, -99]
		// Hint : parameter - Array, return type - LinkedList

		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int num : arr) {
			if (num < 0 && !list.contains(num)) {
				list.add(num);
			}
		}
		System.out.println(
				"all negative numbers (remove duplicates if any and maintain insertion order) from given array. : "
						+ list);
	}

	void p9() {

		// Example 9 :
		// Write a program to return Union of two ArrayList without duplicates.
		// input 1: [10, 19, 33, 44, 12]
		// input 2 : [19, 99, 110, 11,10]
		ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(10, 19, 33, 44, 12));
		ArrayList<Integer> l2 = new ArrayList<Integer>(Arrays.asList(19, 99, 110, 11, 10));

		l2.removeAll(l1); // get common and then add any one list to get unique numbers
		// System.out.println(l1);
		l1.addAll(l2);
		System.out.println(l1);

	}

	void p10() {
		// missing
	}

	void p11(Integer input[]) {

		// Example 11 :
		// Find missing number in a range [1-10] from given ArrayList.
		// input : [1,6,2,5,7,6,3,10]
		// output : [4,8,9]
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input)); // array must be of type Integer
		ArrayList<Integer> newList = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {

			if (!list.contains(i)) {
				newList.add(i);
			}

		}
		System.out.println("Elements missing in List from range  1 to 10 are :" + newList);
	}

	void p12(Integer input[]) {

		System.out.println("Array contains : " + Arrays.toString(input));

		// Example 12 :
		// Remove all zeros from given ArrayList.
		// input : [10,0,0,1,0,3,0,2,6]
		// output : [10,1,3,2,6]
		// ArrayList<Integer> list=new ArrayList <Integer> ();

		/*
		 * for(int i=0; i< input.length; i++){ if(input[i]!=0) { list.add(input[i]); } }
		 * 
		 * for(int num: input) {
		 * 
		 * if(num!=0) { list.add(num); } }
		 */

		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(input));

		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i) == 0) {
				list1.remove(i);
				i--;
			}

		}

		System.out.println("List after removing zeros are : " + list1);
	}

	void p13(Set set) {

		// Example 13:
		// Remove all non prime numbers from given Set.
		// input : [19,12,18,17,23,22]
		// output : [19,17,23]
		ArrayList<Integer> list1 = new ArrayList<Integer>(set);
		System.out.println("SET elements are : " + set);
		for (int num : list1) {
			if (checkPrime(num)) {
				set.remove(num); // remove will work
			}

		}

		/*
		 * for(int i=0; i<list1.size(); i++) { if(checkPrime(list1.get(i))) {
		 * set.remove(list1.get(i)); } }
		 */

		System.out.println("Set after removing non prime numbers: " + set);
	}

	boolean checkPrime(int num) {

		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				return true;
			}
		}
		return false;
	}

	void p14() {
		// Example 14:
		// Write a program to traverse (or iterate) ArrayList using enhanced for loop
		// and iterator.
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(70);
		list.add(100);
		System.out.println("List contents are iterated / Print using Enhanced for loop ");
		for (int num : list) {
			System.out.print(num + " ");
		}
		System.out.println("\nList contents are iterated / Print using Iterator: ");
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
	}

	void p15(String str[]) {

		//// Example 15:
		// Write a program to convert Array to List.
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(str));
		System.out.println("Array converted to List " + list);
	}

	void p16() {
		// Example 16:
		// Write a program to traverse(or iterate) HashSet.

		HashSet<Integer> hs = new HashSet();
		hs.add(10);
		hs.add(3);
		hs.add(8);
		hs.add(89);

		System.out.println("SET iteration Using Iterator: ");

		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("SET iteration Using Enhanced For Loop: ");

		for (int num : hs) {
			System.out.println(num);
		}
	}

	void p17() {

		// Example 17:
		// Write a program to add element at particular index of ArrayList?
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(70);
		list.add(100);
		list.add(3, 500);// index = 3 value=500
		System.out.println("Updated List");
		System.out.println(list);
	}

	void p18(Integer num) { // Integer or Object type will work here

		// Example 18:
		// Write a program to remove Object from ArrayList of Integer (using
		// remove(Object obj) method).
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(70);
		list.add(100);// 10 20 20 500 70 100
		list.add(3, 500);
		System.out.println("Original List : " + list);
		list.remove(num);
		System.out.println("List after removing object : " + list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 40, 5, 70, 30, 100, 30, 50, 20, 5 };
		Assignment_46 assignment_46 = new Assignment_46();
		System.out.println("Program 1 Output : ");
		assignment_46.p1(arr);
		System.out.println("\nProgram 2 Output :");
		assignment_46.p2(arr);
		System.out.println("\nProgram 3 Output :");
		// pass array contents to AL
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}

		assignment_46.p3(list);
		System.out.println("\nProgram 4 Output :");
		assignment_46.p4(list);

		System.out.println("\nProgram 5 Output :");
		HashSet<String> set = new HashSet<String>();
		set.add("Harshada");
		set.add("Amaira");
		set.add("siddhi");
		set.add("Riddhiman");
		set.add("Agashtya");
		assignment_46.p5(set);

		System.out.println("\nProgram 6 Output :");
		assignment_46.p6(arr);

		System.out.println("\nProgram 7 Output :");
		assignment_46.p7();

		System.out.println("\nProgram 8 Output :");
		int arr1[] = { 10, -11, 13, -11, 14, -19, -99, -11, -19, 33 };
		assignment_46.p8(arr1);

		System.out.println("\nProgram 9 Output :");
		assignment_46.p9();

		System.out.println("\nProgram 11 Output :");
		Integer input[] = { 1, 6, 2, 5, 7, 6, 3, 10 };
		assignment_46.p11(input);

		System.out.println("\nProgram 12 Output :");
		Integer input1[] = { 10, 0, 0, 1, 0, 3, 0, 2, 6 };
		assignment_46.p12(input1);

		System.out.println("\nProgram 13 Output :");
		Set<Integer> inputSet = new LinkedHashSet<Integer>(Arrays.asList(19, 12, 18, 17, 23, 22));
		assignment_46.p13(inputSet);

		System.out.println("\nProgram 14 Output :");
		assignment_46.p14();

		System.out.println("\nProgram 15 Output :");
		String str[] = { "JP Morgan", "delloit", "COGNIZANT", " AMAZON", "LINKEDIN" };
		assignment_46.p15(str);

		System.out.println("\nProgram 16 Output :");
		assignment_46.p16();

		System.out.println("\nProgram 17 Output :");
		assignment_46.p17();

		System.out.println("\nProgram 18 Output :");
		assignment_46.p18(100);
	}

}
