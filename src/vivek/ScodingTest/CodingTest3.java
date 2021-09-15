package vivek.ScodingTest;

import java.util.Arrays;
import java.util.Scanner;

public class CodingTest3 {

	void removeElementFromArray(int[] arr, int num) {
		int[] outputArray = new int[arr.length - 1];
		int cnt = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != num) {
				outputArray[cnt] = arr[index];
				cnt++;
			}
		}
		System.out.println(Arrays.toString(outputArray));
	}

	public static void main(String[] args) {
		CodingTest3 codingtest3 = new CodingTest3();
		int[] arr = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number which has to be removed from the array");
		int num = scanner.nextInt();
		codingtest3.removeElementFromArray(arr, num);
	}
}
