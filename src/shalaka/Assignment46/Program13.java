/*
Example 13:
Remove all non prime numbers from given Set.
input : [19,12,18,17,23,22]
output : [19,17,23]*/
package shalaka.Assignment46;

import java.util.ArrayList;

public class Program13 {
	boolean isPrimeNum(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	void removeNonPrimeNum(ArrayList<Integer> list) {
		System.out.println("Input list: " + list);
		for (int index = 0; index < list.size(); index++) {
			if (!isPrimeNum(list.get(index))) {
				list.remove(list.get(index));
				index--;
			}
		}
		System.out.println("After Removing all non prime numbers:" + list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(19);
		list.add(12);
		list.add(18);
		list.add(17);
		list.add(23);
		list.add(22);
		Program13 program13 = new Program13();
		program13.removeNonPrimeNum(list);
	}

}
