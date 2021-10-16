/*Programming Questions - Collections : 4th Oct'2021
Example 6 :
Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList
*/
package shraddha.Assignment46;

import java.util.Arrays;
import java.util.TreeSet;

public class FindSecondLargestNumberFromArray {
	public static void main(String[] args) {
		TreeSet<Integer> tSet = new TreeSet<>(Arrays.asList(1, 6, 2, 5, 7, 3, 6, 3, 10));
		System.out.println(tSet);
		int maxNum = 0;
		int secondMax = 0;
		for (Integer num : tSet) {
			if (num > maxNum) {
				secondMax = maxNum;
				maxNum = num;
			}
		}
		System.out.println("Maxnumber  is :- " + maxNum);
		System.out.println("Second max number is :- " + secondMax);
	}
}
