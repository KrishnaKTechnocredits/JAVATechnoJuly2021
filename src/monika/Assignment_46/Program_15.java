/*Example 15:
Write a program to convert Array to List.
 */
package monika.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_15 {
	
	public static void main(String[] args) {	
		
	
		Integer[] number= {65,58,74,2,36,96,20,15};
		System.out.println("Given Array:"+Arrays.toString(number));
		List<Integer> list1=Arrays.asList(number);
		System.out.println("Conversiton Of Integer Array to List: "+list1);
		
		String[] array= {"tecnho","credits","automation","java","selenium","manual"};
		System.out.println("Given Array: "+Arrays.toString(array));
		List<String> list2=new ArrayList<String>();
		list2.addAll(Arrays.asList(array));
		System.out.println("Conversiton Of String Array to List: "+list2);
		
	}
	
	
}
