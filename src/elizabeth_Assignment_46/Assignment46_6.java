/*Example 6 :
Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList*/

package elizabeth_Assignment_46;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

class Assignment46_6{
	
	void getSecondMaxNum(Integer[] arr){
		TreeSet<Integer> treeSet= new TreeSet<Integer>(Arrays.asList(arr));
		ArrayList<Integer> arrayList= new ArrayList<Integer>(treeSet);
		
		System.out.println(arrayList.get(arrayList.size()-2));
	}
	
	public static void main(String[] args){
		Assignment46_6 assignment46_6=new Assignment46_6();
		Integer[] input={12,56,67,78,90,100,23,45};
		System.out.println("------------Example 6-----------");
		assignment46_6.getSecondMaxNum(input);
	}
}