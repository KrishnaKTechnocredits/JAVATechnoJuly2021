/*Example 9 : 
Write a program to return Union of two ArrayList without duplicates.

input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10]

output : [10,19,33,44,12,99,110,11]*/

package nishi.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Example9 {
	public static void main(String[] args) {
		Integer[] a1= {10, 19, 33, 44, 12};
		Integer[] a2= {19, 99, 110, 11,10};
		ArrayList<Integer> al1=new ArrayList<Integer>(Arrays.asList(a1));
		ArrayList<Integer> al2=new ArrayList<Integer>(Arrays.asList(a2));
		boolean flag=al2.addAll(al1);		
		boolean flag1=al2.removeAll(al1);
		boolean flag3=al1.addAll(al2);
		if(flag && flag1 && flag3)
			System.out.println(al1);
		
	}
}
