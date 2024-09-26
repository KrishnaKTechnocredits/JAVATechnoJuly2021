/*Assignment 34: program 1 : place 0 after the triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99}; // 11 + 3 = 14
output = [1,3,4,5,0,7,3,9,10,11,0,14,44,67,1,2,3,0,99];
*/

package parthav.parthavD_Assignment34;

public class PutZeroAfterTriple {

	int ZeroNums = 0;
	int tripleIndex = 0;
	int tripleCounts = 0;

	int getTripletsCount(int[] inputArr) {

		int tripletCount = 0;
		for (int index = 0; index < inputArr.length - 2; index++) {
			if ((inputArr[index] + 1 == inputArr[index + 1]) && (inputArr[index] + 2 == inputArr[index + 2])) {
				tripletCount++;
			}
		}

		return tripletCount;

	}

	void putZeroAfterTriple(int[] inputArr) {
		int length = inputArr.length + getTripletsCount(inputArr);
		int[] outputArr = new int[length];
		int outputArrIndex = 0;
		int inputArrayIndex = 0;

		for (; inputArrayIndex < inputArr.length;) {

			if (inputArrayIndex < inputArr.length - 2) {
				if ((inputArr[inputArrayIndex] + 1 == inputArr[inputArrayIndex + 1])
						&& (inputArr[inputArrayIndex] + 2 == inputArr[inputArrayIndex + 2])) {
					outputArr[outputArrIndex] = inputArr[inputArrayIndex];
					outputArr[outputArrIndex + 1] = inputArr[inputArrayIndex + 1];
					outputArr[outputArrIndex + 2] = inputArr[inputArrayIndex + 2];
					outputArr[outputArrIndex + 3] = 0;
					outputArrIndex += 4;
					inputArrayIndex += 3;
					continue;
				} else {
					outputArr[outputArrIndex] = inputArr[inputArrayIndex];
					outputArrIndex++;
					inputArrayIndex++;
					continue;
				}
			}
			outputArr[outputArrIndex] = inputArr[inputArrayIndex];
			outputArrIndex++;
			inputArrayIndex++;

			}

		for (int index = 0; index < outputArr.length; index++)
			System.out.print(outputArr[index] + " , ");
	}

	public static void main(String[] args) {
		int[] inputArr1 = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 14, 44, 67, 1, 2, 3, 99 };
		System.out.println("The transformed array is: ");
		new PutZeroAfterTriple().putZeroAfterTriple(inputArr1);

		/*String str = "nitin";
		char[] ch = str.toCharArray();
		System.out.println(str.length());*/

	}

}
