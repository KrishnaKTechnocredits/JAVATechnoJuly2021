/*Example 8:
Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList*/

package elizabeth_Assignment_46;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.LinkedHashSet;

class Assignment46_8{
	
	LinkedList<Integer> getNegativeNumbers(Integer[] arr){
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>(Arrays.asList(arr));
		ArrayList<Integer> al= new ArrayList<Integer>(set);
		LinkedList<Integer> list= new LinkedList<Integer>();
		
		for(int index=0;index<al.size();index++){
			int temp=al.get(index);
			if(temp<0){
				list.add(temp);
			}
		}
		return list;
	}
	
	public static void main(String[] args){
		Assignment46_8 assignment46_8=new Assignment46_8();
		Integer[] input={10, -11, 13, -11, 14, -19, -99, -11, -19, 33};
		System.out.println("------------Example 8-----------");
		System.out.println(assignment46_8.getNegativeNumbers(input));
	}
}