/*Example 7 : 
Return ArrayList of first 10 prime numbers in the range [100,500].*/

package vivek.Assignment46;

import java.util.ArrayList;

public class Assignment46_7 {

	static void ArrayListPrimenumbers() {
		int cnt = 1;
		int num = 100;
		ArrayList<Integer> al = new ArrayList<Integer>();
		while (cnt <= 10 && num <=500) {
			if (isPrimeNumber(num)) {
				al.add(num);
				cnt++;
			}
			num++;
		}
		System.out.println(al);
	}

	static boolean isPrimeNumber(int num) {
		boolean flag = true;
		for (int index = 2; index < num; index++)
			if (num % index == 0) {
				flag = false;
				break;
			}
		if (flag)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Assignment46_7.ArrayListPrimenumbers();
	}
}
