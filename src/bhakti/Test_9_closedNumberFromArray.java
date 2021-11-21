/*Test - 9 : 21st Nov'2021
find closest negative number with respect to 8 
int[] arr = {-3,11,123,-11,-9,-55,33,44};
output : -3*/

package bhakti;

public class Test_9_closedNumberFromArray {

	static void getclosestNegativeNumberof8(int[] arr) {
		int diff = 100;
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				int temp = 8 - arr[i];
				if (diff > temp) {
					diff = temp;
					n = arr[i];
				}
			}
		}
		System.out.println(n);
	}

	static void getclosestNegatiVeNumberOfZero(int[] arr) {
		int closestNum=arr[0]; 

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0 && closestNum< arr[i] ) {
				closestNum=arr[i];

			}
		}
		System.out.println("Closed negative number to zero is :"+closestNum);
	}

	public static void main(String[] args) {
		int[] arr = { -3, 11,-2, 123, -11, -9, -55, 33, 44 };
		getclosestNegatiVeNumberOfZero(arr);
		getclosestNegativeNumberof8(arr);
		

	}
}
