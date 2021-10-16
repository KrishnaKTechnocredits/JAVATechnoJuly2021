
/*Example 11 :
Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]

Hint : Method Parameter should be ArrayList, return type should be ArrayList.*/

package shreya_assignment_46_Collections_program;

import java.util.ArrayList;
import java.util.Arrays;

public class Program11 {
	
	public static void main(String[] args) {
			ArrayList<Integer> list1=new ArrayList<Integer>(Arrays.asList(1,6,2,5,7,6,3,10));
			ArrayList<Integer> list2=new ArrayList<Integer>();
			for(int index=1;index<=10;index++) {
				if(!list1.contains(index))
					list2.add(index);
			}
			System.out.println("Missing number in a range [1-10] from given ArrayList : "+list2);
    }

}

