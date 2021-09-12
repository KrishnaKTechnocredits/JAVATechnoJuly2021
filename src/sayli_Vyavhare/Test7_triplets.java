/*Test - 7 : 11th Sep
Program 1: Count the number of triplets in increasing order. [expected time : 10 mins]
input : 10,9,11,6,23,25,22,66,34
ouput : 1
hint : 6,23,25 */
package sayli_Vyavhare;

public class Test7_triplets {

	int getTriplets(int[] arr) {
		int count = 0;
		for (int index = 0; index < arr.length - 2; index++) {

			if (arr[index] < arr[index + 1] && arr[index + 1] < arr[index + 2])
				count++;
		}
		return count;
	}

	public static void main(String[] args) {

		int[] input = { 10, 9, 11, 6, 23, 25, 22, 66, 34 };
		Test7_triplets triplets = new Test7_triplets();

		System.out.println("Number of triplets in increasing order is: " + triplets.getTriplets(input));
	}

}
