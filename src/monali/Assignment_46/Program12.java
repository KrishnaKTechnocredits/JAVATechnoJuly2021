package monali.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*Example 13:
Remove all non prime numbers from given Set.

input : [19,12,18,17,23,22]
output : [19,17,23]
*/
public class Program12 {

	boolean isPrimeCheck(int num) {

		if (num % 2 == 0) {
			return false;
		}
		return true;
	}

	void removeNonPrimeNumbers(Integer[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			if (!(isPrimeCheck(itr.next())))
				itr.remove();
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		Integer arr[] = { 19, 12, 18, 17, 23, 22 };
		Program12 p12 = new Program12();
		p12.removeNonPrimeNumbers(arr);

	}
}
