package akshay;

public class NthHighestNum {
	int getMaxNum(int input[]) {
		int maxNum = input[0];
		int maxIndexPosition = 0;
		for (int index=0; index < input.length; index++) {

			if (maxNum < input[index]) {
				maxNum = input[index];
				maxIndexPosition = index;
			}
		}
		return maxIndexPosition;
	}

	void findHighestNum(int input[],int nthNumber) {
		for(int num = nthNumber-1; num>0; num--) {
			int index = getMaxNum(input);
			input[index] = 0;
		}
		int index = getMaxNum(input);
		System.out.println(nthNumber+"rd highest number in given array is : " +input[index]);
	}

	public static void main(String[] args) {
		NthHighestNum nthHighest = new NthHighestNum();

		int[] arr = { 10, 23, 2, 11, 55, 43, 99 };
		nthHighest.findHighestNum(arr,4);
	}
}
