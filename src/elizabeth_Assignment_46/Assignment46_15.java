/*Example 15:
Write a program to traverse(or iterate) HashSet.*/

package elizabeth_Assignment_46;
import java.util.Arrays;
import java.util.HashSet;

class Assignment46_15{
	
	void traverseHashSet(String[] arr){
		HashSet<String> hs=new HashSet<String>(Arrays.asList(arr));
		for(String names:hs){
			System.out.println(names);	
		}
	}
	public static void main(String[] args){
		String[] arr={"Eliza","Mary","Techno","Credits"};
		Assignment46_15 assignment46_15=new Assignment46_15();
		System.out.println("------------Example 15-----------");
		assignment46_15.traverseHashSet(arr);
	}
}