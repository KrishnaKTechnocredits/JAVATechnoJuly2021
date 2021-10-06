package astha.Assignment46;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment13 {

	ArrayList<Integer> removeNonPrimeNumbers(ArrayList<Integer> input) {
		Iterator<Integer> iterator = input.iterator();
		Assignment7 assignment = new Assignment7();
		while (iterator.hasNext()) {
			if (!assignment.checkNumberIsPrime(iterator.next()))
				iterator.remove();
		}
		return input;
	}
	
	public static void main(String[] args) {
		Assignment13 assignment13 = new Assignment13();
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(19);
		input.add(12);
		input.add(18);
		input.add(17);
		input.add(23);
		input.add(22);
		System.out.println(assignment13.removeNonPrimeNumbers(input));
	}
}