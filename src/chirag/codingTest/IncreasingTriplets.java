package chirag.codingTest;
/*Program 1: Count the number of triplets in increasing order. [expected time : 10 mins]
input : 10,9,11,6,23,25,22,66,34
ouput : 1
hint : 6,23,25 */

public class IncreasingTriplets {
	
	void getIncreasingTriplets(int [] input) {
		int num;
		int count=0;
		for(int index=0;index<input.length-2;index++) {
			num = input[index];
			if(num < input[index+1]) {
				if(input[index+1] < input[index+2]) {
					count++;
					System.out.println("Triplet numbers in increasing order in the given array is : " + input[index] + ","
							+ input[index +1] + "," + input[index + 2]);
				}
			}
		}
		System.out.println("Count of increasing order triplets " + count);
	}
	
	public static void main(String[] args) {
		IncreasingTriplets increasingTriplets = new IncreasingTriplets();
		int [] input = {10,9,11,6,23,25,22,66,34};
		increasingTriplets.getIncreasingTriplets(input);
	}

}
