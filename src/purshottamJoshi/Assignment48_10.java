/*program 10 : append 0 after 3 consecutive number.
input : [1,2,3,5,4,7];
ouput : [1,2,3,0,5,4,7];
Hint : ArrayList*/

package purshottamJoshi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment48_10 {

	void appendZeroAfter3ConsecutiveNo(Integer[] input) {
		
		List<Integer> al = new ArrayList(Arrays.asList(input));
		for (int index = 0; index < al.size() - 2; index++) {
			if (al.get(index) == al.get(index + 1) - 1 && al.get(index) == al.get(index + 2) - 2) {
				al.add(index + 3, 0);
			}
		}
		
		System.out.println(al);
	}
	
	public static void main(String[] args) {
		Integer[] input = {1,2,3,5,4,7};
		new Assignment48_10().appendZeroAfter3ConsecutiveNo(input);
	}
}
