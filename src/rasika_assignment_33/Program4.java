package rasika_assignment_33;
/*find the triple which in sequence and having maximum sum
input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
output : 10,11,12*/
public class Program4 {

	int getMaxSumTriplets(int[] input) {
		int sum = 0, maxSum = 0, outputIndex = 0;

		for (int index = 0; index < input.length - 2; index++) {
			if (input[index] == (input[index + 1] - 1) && input[index + 1] == input[index + 2] - 1) {

				sum = input[index] + input[index + 1] + input[index + 2];
			}
			if (maxSum < sum) {
				maxSum = sum;
				outputIndex = index;
			}
		}
		System.out.println("Triplet in sequence with maximum sum are: ");

		for (int index1 = outputIndex; index1 < outputIndex + 3; index1++) {
			System.out.print(input[index1] + " ");
		}
		return maxSum;
	}
	public static void main(String[] args) {
		Program4 pgm = new Program4();
		int[] array = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
		System.out.println("\nWith Max Sum "+pgm.getMaxSumTriplets(array));
	}
}
