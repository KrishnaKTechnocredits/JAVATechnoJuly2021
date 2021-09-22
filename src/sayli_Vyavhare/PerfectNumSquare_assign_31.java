/*Program 1: verify given number is a perfect number or not.
input : 6
output : 6 is a perfect number
input : 50
output : 50 is not a perfect number

*Program 2 : verify given number is a perfect square.
input : 25
output : 25 is perfect square.
input : 20
output : 20 is not a perfect square.
 
Program 3:
int[] arr = {10,23,24,25,26,61,62,64,65,66};
output : 3
Note : 23,24,25             	 24,25,26         	64,65,66
 
Program 4: 
In a user given range find all perfect numbers.
input : start range -> 40 , end range -> 170
output : ------

*/
package sayli_Vyavhare;

public class PerfectNumSquare_assign_31 {

	boolean getPerfectNumber(int number) {

		int sum = 0;
		for (int index = 1; index < number; index++) {

			if (number % index == 0)
				sum += index;

		}
		if (sum == number)
			return true;

		else
			return false;
	}

	void printPerfectNum(int number) {
		if (getPerfectNumber(number))
			System.out.println(number + " is a perfect number");
		else
			System.out.println(number + " is not a perfect number");

	}

	void getPerfectNumInRange(int startIndex, int endIndex) {
		boolean temp = false;
		System.out.println("Perfect number in " + startIndex + " and " + endIndex + " range are :");

		for (int index = startIndex; index < endIndex; index++) {
			if (getPerfectNumber(index)) {
				temp = true;
				System.out.println(index);
			}

		}
		if (!temp)
			System.out.println("No numbers are perfect in given range");
	}

	boolean getPerfectSquare(int number) {

		for (int index = 1; index < number; index++) {

			if (index * index == number)
				return true;

			else
				continue;

		}
		return false;
	}

	void printPerfectSquare(int number) {

		if (getPerfectSquare(number))
			System.out.println(number + " is a perfect square");
		else
			System.out.println(number + " is not a perfect square");

	}

	void getTriplets(int[] input) {
		int count = 0;
		for (int index = 0; index < input.length - 2; index++) {
			if (input[index] == (input[index + 1] - 1) && input[index + 1] == input[index + 2] - 1) {
				count++;
			}
		}
		System.out.println("Number of triplets in array :" + count);
	}

	public static void main(String[] args) {
		PerfectNumSquare_assign_31 perfect = new PerfectNumSquare_assign_31();

		perfect.printPerfectNum(6);
		perfect.printPerfectNum(5);
		System.out.println("---------------------------------------------------------");

		perfect.getPerfectNumInRange(40, 170);
		System.out.println("---------------------------------------------------------");

		int[] arr = { 10, 23, 24, 25, 26, 61, 62, 64, 65, 66 };
		perfect.getTriplets(arr);
		System.out.println("---------------------------------------------------------");

		perfect.printPerfectSquare(25);
		perfect.printPerfectSquare(20);

	}

}
