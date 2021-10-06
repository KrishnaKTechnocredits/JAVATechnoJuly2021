/*Example 5 :
Remove the longest string from given Set.*/

package nishi.Assignment46;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example5 {
	public static void main(String[] args) {
		String[] arr= {"Amruta","Abhishek","Nishi","Rahul"};
		Set<String> set=new HashSet<String>(Arrays.asList(arr));
		System.out.println("input String is : "+set);
		Set<String> set1=new Example5().hasRemovedLongest(set);		
		System.out.println("After removing longest string set is "+set1);
	}

	private Set<String> hasRemovedLongest(Set<String> set) {
		int max=0;
		String name1="";
		for(String name:set)
		{
			if(name.length()>max)
			{
				max=name.length();
				name1=name;
			}
		}
		set.remove(name1);
		return set;
	}
}
