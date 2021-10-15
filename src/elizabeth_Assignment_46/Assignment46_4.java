/*Example 4:  
Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same*/

package elizabeth_Assignment_46;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedHashSet;

class Assignment46_4{
	
	void removeDuplicatesUsingSet(ArrayList<Integer> arrayList){
		LinkedHashSet<Integer> set= new LinkedHashSet<Integer>(arrayList);
		System.out.println(set);
		
	}
	
	public static void main(String[] args){
		Assignment46_4 assignment46_4=new Assignment46_4();
		List<Integer> list=Arrays.asList(2,4,6,8,10,2,4,7,8,9);
		ArrayList<Integer> arrayList=new ArrayList<Integer>(list);
		System.out.println("------------Example 4-----------");
		assignment46_4.removeDuplicatesUsingSet(arrayList);
	}
}