package gauravk.Assignment_46;
/*
Programming Questions - Collections : 4th Oct'2021

Example 1 : DONE
Write a program to find given number is present in the arrayList or not.

Example 2 : DONE
Write a program to find given number is duplicate in arrayList.

Example 3 : DONE
Write a program to remove duplicate from ArrayList (without using set).

Example 4:  DONE
Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.

Example 5 : DONE
Remove the longest string from given Set.

Example 6 : DONE
Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList

Example 7 : DONE
Return ArrayList of first 10 prime numbers in the range [100,500].

Example 8: DONE
Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList


Example 9 : DONE
Write a program to return Union of two ArrayList without duplicates.

input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10]

output : [10,19,33,44,12,99,110,11]

Example 11 : DONE
Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]

Hint : Method Parameter should be ArrayList, return type should be ArrayList.

Example 12 : DONE
Remove all zeros from given ArrayList.

input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]

Example 13: DONE
Remove all non prime numbers from given Set.

input : [19,12,18,17,23,22]
output : [19,17,23]

Example 14: DONE
Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.

Example 15: DONE
Write a program to convert Array to List.

Example 16: DONE
Write a program to traverse(or iterate) HashSet.

Example 17: DONE
Write a program to add element at particular index of ArrayList?

Example 18:
Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method).

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CheckingPresenceOfNumInArrayList {
	
	void checkingPresenceOfNum(Integer[] arr, int num) {
		List<Integer> list = Arrays.asList(arr);
		ArrayList<Integer> arl = new ArrayList<Integer>(list);
		boolean flag=true;
		for(int x : arl) {
			if(x==num){
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println(num+" is NOT present in number set.");
		else
			System.out.println(num+" is present in number set.");
	}
	
	public static void main(String[] args) {
		Integer[] a = {12,15,88,46,79,99,1000,588,49,344,167,97,22,5,14,6,3,77,11,99,100};
		System.out.println("Number set : "+Arrays.toString(a));
		//System.out.println("Enter any number to check if it is present in above number set.");
		//Scanner sc = new Scanner(System.in);
		//int input = sc.nextInt();
		//new CheckingPresenceOfNumInArrayList().checkingPresenceOfNum(a, input);
		new CheckingPresenceOfNumInArrayList().checkingPresenceOfNum(a, 22);
	}
}