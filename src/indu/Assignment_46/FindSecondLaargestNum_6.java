/*Example 6 :
Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList*/
package indu.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class FindSecondLaargestNum_6 {
	
	public static void main(String[] args) {
		Integer[] arr = {1,66,88,97,4,56};
		FindSecondLaargestNum_6(arr);
	}

	 static void FindSecondLaargestNum_6(Integer[] arr) {
			TreeSet<Integer> treeNum = new TreeSet<>(Arrays.asList(arr));
			ArrayList<Integer> list = new ArrayList<>(treeNum);
			int SecMax=0;
			System.out.println("Set of Array is : "+treeNum);
			System.out.println("Second max num is "+list.get(list.size()-2));
		
	}
}
