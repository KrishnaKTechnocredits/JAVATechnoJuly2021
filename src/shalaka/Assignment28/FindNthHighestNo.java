package shalaka.Assignment28;

public class FindNthHighestNo {
	int maxNum = 0;

	int getNthHighestNo(int[] arr, int input) {
		int temp = 0;
		for (int innerIndex = input; innerIndex > 0; innerIndex--) {
			maxNum = 0;
			for (int index = 0; index < arr.length; index++) {
				if (arr[index] > maxNum) {
					maxNum = arr[index];
					temp = index;
				}
			}
			arr[temp] = 0;
		}
		return maxNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 23, 2, 11, 55, 43, 99 };
		int input = 3;
		FindNthHighestNo findNthHighestNo = new FindNthHighestNo();
		int secMaxNo = findNthHighestNo.getNthHighestNo(arr, input);
		System.out.println("The Nth Highest Number of given Array is: "+secMaxNo);
	}
}
