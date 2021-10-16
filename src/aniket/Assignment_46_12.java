package aniket;

import java.util.ArrayList;
import java.util.Arrays;

//Remove all non prime numbers from given Set. input : [19,12,18,17,23,22] output : [19,17,23]
public class Assignment_46_12 {

	boolean isPrime(int num) {
		boolean flag = true;
		for (int index = 2; index <= num/2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}

		}
		return flag;
	}

	ArrayList<Integer> removeNonPrime(Integer[] input) {

		ArrayList<Integer> input1 = new ArrayList<Integer>(Arrays.asList(input));
		for (int index = 0; index < input1.size(); index++) {
			if (!isPrime(input1.get(index))) {
				input1.remove(input1.get(index));
				index--;

			}

		}
		return input1;

	}

	public static void main(String[] args) {
		Integer[] input = { 19, 12, 18, 17, 23, 22 };
		System.out.println("Non prime numbers are : " + new Assignment_46_12().removeNonPrime(input));
	}
}

