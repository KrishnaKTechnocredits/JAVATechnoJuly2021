/*program 2 : place sum of triple after each triple which in sequence.

input = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 14, 44, 67, 11, 2, 3, 4 };
output = [1,3,4,5,12,7,3,9,10,11,30,14,44,67,1,2,3,6,99];
*/

package parthav.parthavD_Assignment34;

public class Program2 {

	int gettripletCounts(int[] inputArr) {
		int countOfTriplets = 0;
		for (int index = 0; index < inputArr.length;) {
			if (index < inputArr.length - 2) {
				if ((inputArr[index + 1] == inputArr[index] + 1) && (inputArr[index + 2] == inputArr[index] + 2)) {
					countOfTriplets++;
					index += 3;
					continue;
				}
					
			}
			else if (index >= inputArr.length - 2) {
				if ((inputArr[index - 1] == inputArr[index] - 1) && (inputArr[index + 1] == inputArr[index] + 1)) {
					countOfTriplets++;
					index += 2;
					continue;
				}
			}
			index++;

		}
		return countOfTriplets;
	}

	void printArraywithTripletSum(int[] inputArr) {
		int length = inputArr.length + gettripletCounts(inputArr);
		int[] outputArr = new int[length];
		int sum = 0;
		int inputIndex = 0;
		int outputIndex = 0;

		for (; inputIndex < inputArr.length;) {
			if (inputIndex < inputArr.length - 2) {
				if ((inputArr[inputIndex + 1] == inputArr[inputIndex] + 1)
						&& (inputArr[inputIndex + 2] == inputArr[inputIndex] + 2)) {
					outputArr[outputIndex] = inputArr[inputIndex];
					outputArr[outputIndex + 1] = inputArr[inputIndex + 1];
					outputArr[outputIndex + 2] = inputArr[inputIndex + 2];
					sum = inputArr[inputIndex] + inputArr[inputIndex + 1] + inputArr[inputIndex + 2];
					outputArr[outputIndex + 3] = sum;
					outputIndex += 4;
					inputIndex += 3;
					continue;
				}

				else {
					outputArr[outputIndex] = inputArr[inputIndex];
					outputIndex++;
					inputIndex++;
					continue;
				}

			}
			if (inputIndex > inputArr.length - 2) {
				if ((inputArr[inputIndex - 1] == inputArr[inputIndex] - 1)
						&& (inputArr[inputIndex + 1] == inputArr[inputIndex] + 1)) {
					outputArr[outputIndex] = inputArr[inputIndex];
					outputArr[outputIndex + 1] = inputArr[inputIndex + 1];
					sum = inputArr[inputIndex] + inputArr[inputIndex + 1] + inputArr[inputIndex - 1];
					outputArr[outputIndex + 2] = sum;
					inputIndex += 2;
				} else {
					outputArr[outputIndex] = inputArr[inputIndex];
					outputIndex++;
					inputIndex++;
				}
			}

		}
		
		for (int index = 0; index < outputArr.length;index++) {
			System.out.print(outputArr[index] + ",");
		}

	}

	public static void main(String[] args) {
		int[] inputArr = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 14, 44, 67, 11, 2, 3, 4 };
		new Program2().printArraywithTripletSum(inputArr);

	}

}
