/*Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  

Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}

Program : 3 
swap 2 numbers with using 3rd variable

Program : 4 
swap 2 numbers without using 3rd variable*/

package sushant;

import java.util.Arrays;

public class Assignment26_3 {
	public static void main(String[] args) {
		String[] inputArray = { "Credits", "Techno", "From", "Diwali", "Happy" };
		String[] reverseArray = new String[inputArray.length];
		System.out.println("Input Array is:- " + Arrays.toString(inputArray));
		int count = 0;
		for (int index = inputArray.length - 1; index >= 0; index--) {
			reverseArray[count] = inputArray[index];
			count++;
		}
		System.out.print("Reverse String Array will be :- " + Arrays.toString(reverseArray));
	}
}
