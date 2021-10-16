/*Example 15:
	Write a program to convert Array to List.*/
package chandani.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment46n {
	
	public static void main(String[] args) {
		
		Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println(list);
	}	
		

}
