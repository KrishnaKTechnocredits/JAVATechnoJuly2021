package neha.assignment_28;

import java.util.Arrays;

/*Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43*/
public class NthHighestNo {
	int[] inpArr = { 10, 23, 2, 11, 55, 43, 99 };

	int findMaxNo(int maxNo) {
		int maxIndex = 0;
		for (int index = 0; index < inpArr.length; index++) {
			if (maxNo < inpArr[index]) {
				maxNo = inpArr[index];
				maxIndex = index;
			}
		}
		inpArr[maxIndex] = 0;
		return maxNo;
	}

	int findNthHighestNo(int n) {
		int maxNthNo = 0;
		for (int index = 1; index < n + 1; index++) {
			maxNthNo = 0; // reset previous max number to 0
			maxNthNo = findMaxNo(maxNthNo);
		}
		return maxNthNo;
	}

	public static void main(String[] args) {
		NthHighestNo nthHighestNo = new NthHighestNo();
		int n = 3;
		System.out.println("Nth highest No in given array " + Arrays.toString(nthHighestNo.inpArr) + " --> "
				+ nthHighestNo.findNthHighestNo(n) + " where n=" + n);
	}

}
