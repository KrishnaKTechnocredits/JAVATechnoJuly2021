package arti_G_Assignment46;

import java.util.ArrayList;

/*Example 7 : 
Return ArrayList of first 10 prime numbers in the range [100,500].*/
public class PrimeNumber {

	void getPrimeNumber(int startRange, int endRange) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int index = startRange; index <= endRange; index++) {
			if (isPrimeNum(index)) {
				list.add(index);
			}
		}
		System.out.println("List of prime number b/w 100 to 500 is : " + list);
	}

	boolean isPrimeNum(int num) {
		for (int index = 2; index < num; index++) {
			if (num % index == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		PrimeNumber p1 = new PrimeNumber();
		p1.getPrimeNumber(100, 500);
	}

}
