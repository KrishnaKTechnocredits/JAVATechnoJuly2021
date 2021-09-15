/*Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25
       24,25,26
	   64,65,66 -> having max sum*/

package vivek;

public class Assignment32 {

	void getTriplets(int[] arr) {
		int sum = 0;
		int sumMax = 0;
		int maxArrayindex = 0;
		for (int index = 0; index < arr.length - 2; index++) {
			if (arr[index] + 1 == arr[index + 1] && arr[index] + 2 == arr[index + 2]) {
				sum = arr[index] + arr[index + 1] + arr[index + 2];
			}
			if (sum > sumMax) {
				sumMax = sum;
				maxArrayindex = index;
			}
		}
		System.out.println(arr[maxArrayindex] + " " + arr[maxArrayindex + 1] + " " + arr[maxArrayindex + 2]
				+ " is a triplet having maximum sum");
	}

	public static void main(String[] args) {
		Assignment32 assignment32 = new Assignment32();
		int[] arr = { 10, 64, 65, 66, 23, 24, 25, 26, 61, 62 };
		assignment32.getTriplets(arr);
	}
}
