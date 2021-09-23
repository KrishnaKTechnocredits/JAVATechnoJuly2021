/*program 4 : find the triple which in sequence and having maximum sum 
input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
iteration : 3,4,5
         9,10,11
		 10,11,12
         1,2,3
output : 10,11,12*/

package vivek.Assignment33;

public class Assignment33_4 {

	void getMaxSumTriplet(int[] arr) {
		int sum = 0;
		int sumMax = 0;
		int cnt = 0;
		for (int index = 0; index < arr.length - 2; index++) {
			if (arr[index] + 1 == arr[index + 1] && arr[index] + 2 == arr[index + 2]) {
				sum = arr[index] + arr[index + 1] + arr[index + 2];
			}
			if (sumMax < sum) {
				sumMax = sum;
				cnt = index;
			}
		}
		System.out.println("Triplet having maximum sum is " + arr[cnt] + " " + arr[cnt + 1] + " " + arr[cnt + 2]);
	}

	public static void main(String[] args) {
		Assignment33_4 assignment33_4 = new Assignment33_4();
		int[] arr = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 12, 44, 67, 1, 2, 3, 99 };
		assignment33_4.getMaxSumTriplet(arr);
	}
}
