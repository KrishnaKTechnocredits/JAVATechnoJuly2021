//Assignment 13 [Program 1]-[Count of Positive Numbers in Array] DATE: 08/15
package deepak.Assignment_13;

public class PositiveNumbersCount{
	int positiveCnt;
	
	int getPositiveNumbersCnt(int[] array1) {
		for(int i = 0 ; i < array1.length ; i++) {
			if(array1[i] >= 0) {
				positiveCnt++;
			}
		}System.out.print("Count of positive numbers in the array is: ");
		return positiveCnt;
	}
	
	public static void main(String[] args) {
		PositiveNumbersCount positiveNumbersCount = new PositiveNumbersCount();
		int[] input = {1,-11,-44,23,55,-99,-23,-22};
		System.out.println(positiveNumbersCount.getPositiveNumbersCnt(input));
	}
}
