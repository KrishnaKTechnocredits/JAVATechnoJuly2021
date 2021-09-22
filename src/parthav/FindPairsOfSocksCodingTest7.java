/*Test - 8 : 11th Sep'2021
How many pairs can be created from below sock size array. [30]
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5 */

package parthav;

public class FindPairsOfSocksCodingTest7 {
	int sockSizeCount = 0;
	int pairCount = 0;

	int getPairs(int[] inputArr) {
		for (int index = 0; index < inputArr.length; index++) {
			for (int innerIndex = 0; innerIndex < inputArr.length; innerIndex++) {
				if (inputArr[index] != 0 || inputArr[innerIndex] != 0) {
					if ((inputArr[index] == inputArr[innerIndex]) && sockSizeCount < 2) {
						sockSizeCount++;
					}

				}

				if (sockSizeCount == 2) {
					inputArr[innerIndex] = 0;
					inputArr[index] = 0;
					pairCount++;
					break;
				}
			}
			sockSizeCount = 0;
		}

		return pairCount;
	}

	public static void main(String[] args) {
		FindPairsOfSocksCodingTest7 newObject = new FindPairsOfSocksCodingTest7();
		int[] input = { 3, 5, 6, 3, 5, 3, 7, 7, 8, 3, 3, 5, 8, 8 };
		System.out.println("The number of sock size pairs in the array are:  " + newObject.getPairs(input));

	}

}
