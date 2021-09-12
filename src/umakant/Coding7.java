/*
 Test - 7 : 11th Sep
Program 1: Count the number of triplets in increasing order. [expected time : 10 mins]
input : 10,9,11,6,23,25,22,66,34
ouput : 1
hint : 6,23,25 
 */
package umakant;

public class Coding7 {

	int getIncreasingTripletCount(int[] input) {
		int count = 0;
		for (int index = 0; index < input.length - 2; index++) {
			if (input[index + 1] > input[index] && input[index + 1] < input[index + 2]) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] input = { 10, 9, 11, 6, 23, 25, 22, 66, 34 };
		System.out.println(new Coding7().getIncreasingTripletCount(input));
	}
}
