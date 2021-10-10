/*Example 14:
Write a program to convert Array to List.*/

package elizabeth_Assignment_46;
import java.util.Arrays;
import java.util.List;

class Assignment46_14{
	
	static void convertArrayToList(String[] arr){
		List<String> list=Arrays.asList(arr);
		System.out.println(list);	
	}
	
	public static void main(String[] args){
		String[] arr={"Eliza","Mary","Techno","Credits"};
		System.out.println("------------Example 14-----------");
		Assignment46_14.convertArrayToList(arr);
	}
}
