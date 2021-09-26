package monali.Assignment_31;
/*Program 3: 
int[] arr = {10,23,24,25,26,61,62,64,65,66};
output : 3
Note : 23,24,25
       24,25,26
	   64,65,66*/

public class ConsecutiveSeries {

	static void getConsecutiveSeries(int[] arr) {

		for (int index = 0; index < arr.length - 2; index++) {

			if (arr[index + 1] == arr[index] + 1 && arr[index + 2] == arr[index] + 2) {
				System.out.println(arr[index] + " " + arr[index + 1] + " " + arr[index + 2]);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 23, 24, 25, 26, 61, 62, 64, 65, 66 };

		getConsecutiveSeries(arr);
	}
}
