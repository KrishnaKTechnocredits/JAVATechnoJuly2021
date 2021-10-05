package neha.assignment_46;

import java.util.ArrayList;

/*Example 7 : 
Return ArrayList of first 10 prime numbers in the range [100,500].*/
public class Program7 {
	ArrayList<Integer> findPrimeNumbersInRange(int startIndex, int endIndex) {
		ArrayList<Integer> primeNoList = new ArrayList<Integer>();
		for (int i = startIndex; i <= endIndex; i++) {
			if (IsNumPrime(i))
				primeNoList.add(i);
		}
		return primeNoList;
	}

	private boolean IsNumPrime(int num) {
		int cnt = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				cnt++;
				break;
			}
		}
		if (cnt == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Program7 program7 = new Program7();
		System.out.println(program7.findPrimeNumbersInRange(100, 500));
	}
}
