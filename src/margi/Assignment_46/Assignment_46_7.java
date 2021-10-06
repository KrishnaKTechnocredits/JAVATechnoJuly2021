package margi.Assignment_46;

import java.util.ArrayList;

//Return ArrayList of first 10 prime numbers in the range [100,500]

public class Assignment_46_7 {

	boolean isPrime(int num) {
		boolean flag = true;
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			} else
				flag = true;
		}
		return flag;
	}

	ArrayList<Integer> getPrimeNumbers(int start, int end) {
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		boolean flag = true;
		for (int index = start; index <= end; index++) {
			if (count < 10) {
				flag = isPrime(index);
				if (flag) {
					list.add(index);
					count++;
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		Assignment_46_7 assignment_46_7 = new Assignment_46_7();
		System.out.println("First 10 Prime numbers in a given range:");
		System.out.println(assignment_46_7.getPrimeNumbers(100, 500));
	}
}
