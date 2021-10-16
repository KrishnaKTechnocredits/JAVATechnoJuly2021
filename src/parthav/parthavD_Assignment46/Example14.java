/*Programming Questions - Collections : 4th Oct'2021
 * Example 14:
Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.*/

package parthav.parthavD_Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Example14 {

	void traverseUsingEnhancedForLoop(String inputStr) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList(inputStr.split(" ")));
		System.out.println("Traversing through ArrayList and printing individual elements using enhanced for loop");

		for (String str : list) {
			System.out.println(str);
		}
	}

	void traverseUsingIterator(String inputStr) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList(inputStr.split(" ")));
		System.out.println("Traversing through ArrayList and printing individual elements using Iterator");

		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		Example14 newObj = new Example14();
		String str = "Write a program to traverse ArrayList using enhanced for and iterator";
		newObj.traverseUsingEnhancedForLoop(str);
		newObj.traverseUsingIterator(str);

	}

}
