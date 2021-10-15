/*Example 4:  
Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.
*/
package monika.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Program_4 {
public static void main(String[] args) {
	List<Integer> numbers=Arrays.asList(1,2,1,5,2,4,1,2,5,6);
	System.out.println(numbers);
	Set<Integer> hashset=new LinkedHashSet<>(numbers);
	ArrayList<Integer> removeDuplicates=new ArrayList<>(hashset);
	System.out.println("After Removing Duplicates From ArrayList: "+removeDuplicates);
}
public static <T> List<T> removeDuplicates(List<T> list){
	  Set<T> set = new LinkedHashSet<>(list);
	  return new ArrayList<T>(set);
	}
}
