package gauravk.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Programming Questions - Collections : 4th Oct'2021

Example 17:
Write a program to add element at particular index of ArrayList?

 */
public class AddElementAtIndex {
	public static void main(String[] args) {
		Integer[] numbers = {400,20,54,15,27,99,12,15,62,67,37,19,20,100,99};
		String[] strArray = {"Hi","Hello","Hi","Techno","Credits","Hi","Credits"};
		
		ArrayList<Integer> arl = new ArrayList<>(Arrays.asList(numbers));
		System.out.println("Original list: \n"+arl);
		System.out.println("Adding 55 before 99 in the list.");
		for(int x=0; x<arl.size(); x++) {
			if(arl.get(x)==99) {
				arl.add(x, 55);
				x++;
			}
		}
		System.out.println(arl);
	}
}