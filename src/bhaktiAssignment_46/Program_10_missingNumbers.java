
/*Example 10 :
Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]
Hint : Method Parameter should be ArrayList, return type should be ArrayList.*/


package bhaktiAssignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_10_missingNumbers {
	
	static ArrayList findMissingNumbers(int start, int end, Integer input[]) {
		ArrayList<Integer> num= new ArrayList(Arrays.asList(input));
		ArrayList<Integer> missingNum= new ArrayList();
		for (int i= start; i<= end; i++) {
			if (!num.contains(i))
				missingNum.add(i);
		}
		return missingNum;
	}
	public static void main(String[] args) {
		Integer[] input= {1,6,2,5,7,6,3,10, 16, 19};
		System.out.println(findMissingNumbers(1, 20, input));
	}

}