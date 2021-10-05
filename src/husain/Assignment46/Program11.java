/*
 *Example 11 :
Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]

 */
package husain.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Program11 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,6,2,5,7,6,3,10));
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		System.out.println("List 1" + list1);
		for(int index = 1; index <=10; index++)
			if(!list1.contains(index))
				list2.add(index);
		System.out.println("Output list containing numbers missing betwen 1 to 10 in list1 " + list2);
		
	}

}
