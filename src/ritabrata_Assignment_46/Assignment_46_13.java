/*Example 13:
Remove all non prime numbers from given Set.

input : [19,12,18,17,23,22]
output : [19,17,23]
*/

package ritabrata_Assignment_46;
import java.util.ArrayList;
import java.util.Iterator;

public class Assignment_46_13 {
	
	ArrayList<Integer> removeNonPrime(ArrayList<Integer> input) {
		Iterator<Integer> iterator = input.iterator();
		Assignment_46_7 assignment = new Assignment_46_7();
		while (iterator.hasNext()) {
			if (!assignment.checkPrime(iterator.next()))
				iterator.remove();
		}
		return input;
	}

	public static void main(String[] args) {
		Assignment_46_13 nonPrime = new Assignment_46_13();
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(19);
		input.add(12);
		input.add(18);
		input.add(17);
		input.add(23);
		input.add(22);
		System.out.println("The non prime numbers are: "+nonPrime.removeNonPrime(input));
	}

}
