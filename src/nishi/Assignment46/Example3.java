/*Example 3 :
Write a program to remove duplicate from ArrayList (without using set).
*/
package nishi.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Example3 {
	public static void main(String[] args) {
		Integer[] arr = { 11, 12, 13, 44, 55,55 };		
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(arr));
		ArrayList<Integer> a1=new Example3().removeDuplicate(al);
		System.out.println(a1);
	}

	private ArrayList<Integer> removeDuplicate(ArrayList<Integer> al) {
		for(int index=0;index<al.size();index++)
		{			
			Integer num=al.get(index);
			if(al.indexOf(num)!=al.lastIndexOf(num))
			{
				al.remove(index);
			}
		}
		return al;
		
	}
}
