/*Example 7 : 
Return ArrayList of first 10 prime numbers in the range [100,500].*/

package ritabrata_Assignment_46;
import java.util.ArrayList;
public class Assignment_46_7 {
	boolean checkPrime(int number) {
		boolean isPrime = true;
		for (int index = 2; index <number; index++) {
			if (number % index == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
		}

	ArrayList<Integer> getPrimeNumbers(int start, int end) {
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		boolean flag = true;
		for (int index = start; index <= end; index++) {
			if (count < 10) {
				flag = checkPrime(index);
				if (flag) {
					list.add(index);
					count++;
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		Assignment_46_7 arrPrime = new Assignment_46_7();
		System.out.println("The list of prime number in the range : ");
		System.out.println(arrPrime.getPrimeNumbers(100,500));


	}

}
