
		/*Program 1: Count the number of triplets in increasing order.
					 input : 10,9,11,6,23,25,22,66,34
					 ouput : 1
					*/
package somnath_CodingTest;
public class CodingTest_7 {
	void getIncreasingTriplets(int[] input) {
		int count = 0;
		int num;
		for(int index = 0; index < input.length - 2; index++) {
			num = input[index]; 
			if(num < input[index+1]) {
				if(input[index+1] < input[index+2]) {
					count++;
					System.out.println("Triplet numbers in increasing order in the given array are : " + input[index] + ","
							+ input[index +1] + "," + input[index + 2]);
				}
			}
		}
		System.out.println("triplets Count of increasing order are : " + count);
	}
	public static void main(String[] args) {
		CodingTest_7 codingTest_7 = new CodingTest_7();
		int [] arr = {10,9,11,6,23,25,22,66,34};
		codingTest_7.getIncreasingTriplets(arr);
	}
}
