/*Test - 7 : 11th Sep
Program 1: Count the number of triplets in increasing order. [expected time : 10 mins]
input : 10,9,11,6,23,25,22,66,34
ouput : 1
hint : 6,23,25 */

package shraddha.CodingTest7;

import java.util.Arrays;

public class FindTripletInIncreasingOrder {
	public static void main(String[] args) {
		int[] input = { 10, 9, 11, 6, 23, 25, 22, 66, 34 };
		System.out.println("Input Array is :- " + Arrays.toString(input));
		int number1;
		int number2;
		int number3;
		int count = 0;

		for (int index = 0; index < input.length - 2; index++) {
			number1 = input[index];
			number2 = input[index + 1];
			number3 = input[index + 2];
			if (number2 > number1 && number3 > number2) {
				count++;
				System.out.println(number1 + " " + number2 + " " + number3);
			}
		}
		if (count != 0)
			System.out.println("there are " + count + " triplets in above array");
		else
			System.out.println("there are no triplets in above array");

	}
}
