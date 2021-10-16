/*Programming Questions - Collections : 4th Oct'2021
 * Example 16:
Write a program to traverse(or iterate) HashSet.*/

package parthav.parthavD_Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example16 {

	void traverseHashSetUsingEnhancedFor(Integer[] inputArr) {
		Set<Integer> set = new HashSet<>(Arrays.asList(inputArr));
		System.out.println("Traversing through Set using Enhanced For loop");

		for (Integer num : set) {
			System.out.println(num);

		}

	}

	public static void main(String[] args) {
		Integer[] inputArr = { 23, 56, 67, 34, 12, 89 };
		Example16 newObj = new Example16();
		newObj.traverseHashSetUsingEnhancedFor(inputArr);

	}

}
