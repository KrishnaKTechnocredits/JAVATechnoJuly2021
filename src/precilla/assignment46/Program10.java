package precilla.assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*Example 11 :
Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]*/
public class Program10 {
	public static void main(String[] args) {
		Integer arr[]= {1,6,2,5,7,6,3,10};
		ArrayList<Integer> vec=new ArrayList<Integer>(Arrays.asList(arr));
		Collections.sort(vec);
		System.out.println("input : "+vec);
		ArrayList<Integer> output=new ArrayList<Integer>();
		for(int index=1;index<=10;index++) {
		if(!vec.contains(index))
			output.add(index);
		}
		System.out.println("Output : "+output);
	}
	
}
