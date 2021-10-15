/*Example 17:
Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method)*/

package elizabeth_Assignment_46;
import java.util.Arrays;
import java.util.ArrayList;

class Assignment46_17{
	
	void removeObject(Integer[] arr, int element){
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(arr));
		al.remove(new Integer(element));
		System.out.println(al);	
	}
	public static void main(String[] args){
		Integer[] arr={10,11,12,13,14,15,16,17,15};
		Assignment46_17 assignment46_17=new Assignment46_17();
		System.out.println("------------Example 17-----------");
		assignment46_17.removeObject(arr,10);
		assignment46_17.removeObject(arr,78);
		assignment46_17.removeObject(arr,15);
	}
}