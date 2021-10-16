/*Programming Questions - Collections : 4th Oct'2021
Example 9 : 
Write a program to return Union of two ArrayList without duplicates.

input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10]

output : [10,19,33,44,12,99,110,11]
*/
package shraddha.Assignment46;

import java.util.ArrayList;

public class ArrayListUnionWithoutDuplicates {
public static void main(String[] args) {
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	list1.add(10);
	list1.add(19);
	list1.add(33);
	list1.add(44);
	list1.add(12);
	System.out.println("list1 :- "+list1);
	
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	list2.add(19);
	list2.add(99);
	list2.add(110);
	list2.add(11);
	list2.add(10);
	System.out.println("List2 :- "+list2);
	
	list2.removeAll(list1);
	list1.addAll(list2);
	System.out.println("List1 Union List2 without duplicates will be :- "+list1);
}
}
