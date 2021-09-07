package aniket;

public class Assignment_28_2 {
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

	void getGivenHighestNum(int input[],int nthNumber) {
		int num=nthNumber-1;
		while (num > 0) {
			int index = getMaxNum(input);
			input[index] = 0;
			num--;
		}
		int index = getMaxNum(input);
		System.out.println(nthNumber+"rd highest number in given array is : "+input[index]);
	}

	public static void main(String[] args) {
		Assignment_28_2 assignment_28_2 = new Assignment_28_2();

		int[] arr = { 10, 23, 2, 11, 55, 43, 99 };
		assignment_28_2.getGivenHighestNum(arr,3);
	}
}
