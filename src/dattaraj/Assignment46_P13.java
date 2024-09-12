package dattaraj;

import java.util.ArrayList;
import java.util.Iterator;

import astha.Assignment46.Assignment7;

public class Assignment46_P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment46_P13 pgm13 = new Assignment46_P13();
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(19);
		input.add(12);
		input.add(18);
		input.add(17);
		input.add(23);
		input.add(22);
		System.out.println(pgm13.removeNonPrimeNumbers(input));
	}
	
	ArrayList<Integer> removeNonPrimeNumbers(ArrayList<Integer> input) {
		Iterator<Integer> iterator = input.iterator();
		Assignment7 assignment = new Assignment7();
		while (iterator.hasNext()) {
			if (!assignment.checkNumberIsPrime(iterator.next()))
				iterator.remove();
		}
		return input;
	}

}
