/*Example 9 : 
Write a program to return Union of two ArrayList without duplicates.

input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10] 33,44,12

output : [10,19,33,44,12,99,110,11]*/

package purshottamJoshi;
import java.util.*;

public class Assignment46_9 {
	
	void unionArrays(Integer[] input1,Integer[] input2) {
		
		ArrayList<Integer> al1= new ArrayList(Arrays.asList(input1));
		ArrayList<Integer> al2= new ArrayList(Arrays.asList(input2));
		ArrayList<Integer> al3 = new ArrayList<Integer>(al1);
		for(int index=0; index < al2.size(); index++) {
			if(!al3.contains(al2.get(index))) {
				al3.add(al2.get(index));
			}
		}
		System.out.println(al3);
	}
	
	public static void main(String[] args) {
		Integer[] input1= {10, 19, 33, 44, 12};
		Integer[] input2 = {19, 99, 110, 11,10};
		new Assignment46_9().unionArrays(input1, input2);
	}
}
