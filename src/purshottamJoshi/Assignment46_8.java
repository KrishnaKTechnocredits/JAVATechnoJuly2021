/*Example 8:
Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList
*/

package purshottamJoshi;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Assignment46_8 {

	void getNegatives(Integer[] input) {
		Integer a=0;
		List list1 = Arrays.asList(input);
		List list2 = new LinkedList<>();
		List list3 = new LinkedList<>();

		for(int index=0; index < input.length; index++) {
			
			if(input[index] < 0 ) {
				list2.add(input[index]);
			}
		}
		
		for(int i=0; i < list2.size(); i++) {
			for(int j=i+1; j < list2.size(); j++) {
				if(list2.get(i)==list2.get(j)) {
					list2.remove(j);
					j--;
				}
			}
		}
		
		System.out.println(list2);
	}
	
	public static void main(String[] args) {
		
		Integer[] input = {10, -11, 13, -11, 14, -19, -99, -11, -19, 33};
		new Assignment46_8().getNegatives(input);
		
	}
}
