/*Example 16:
Write a program to traverse(or iterate) HashSet.*/

package nishi.Assignment46;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;


public class Example16 {
	public static void main(String[] args) {	
	String[] arr= {"Ankita","Ram","Priya","Nandini"};
	HashSet<String> set=new HashSet<String>(Arrays.asList(arr));
	Iterator<String> itr=set.iterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next() +",");
	}
}
}
