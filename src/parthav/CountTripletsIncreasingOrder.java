//Test - 7 : 11th Sep
//Program 1: Count the number of triplets in increasing order. [expected time : 10 mins]
/*input : 10,9,11,6,23,25,22,66,34
ouput : 1
hint : 6,23,25 */

package parthav;

public class CountTripletsIncreasingOrder {

	int getTripletsCount(int[] inputArr) {
		int tripletsCount = 0;
		int lowerArrayIndex = inputArr[0];
		int increasingOrderCount = 0;

		for (int index = 1; index < inputArr.length; index++) {
			if (lowerArrayIndex < inputArr[index]) {
				increasingOrderCount++;

			} else {
				increasingOrderCount = 0;
				
			}
			if (increasingOrderCount == 2) {
				tripletsCount++;
				increasingOrderCount = 0;
			}
			lowerArrayIndex = inputArr[index];

		}
		return tripletsCount;
	}

	public static void main(String[] args) {
		CountTripletsIncreasingOrder newObject = new CountTripletsIncreasingOrder();
		int[] inputArr = {10,9,11,6,23,25,22,66,34};
		System.out.println("The total number of triplets count are: " + newObject.getTripletsCount(inputArr));
		
	}

}
