/* program 2 : find minimum number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 11 */

package arti_K.Assignment_14;

public class MinNumber {
	
	int findMinnumber(int[] arr) {
		int min = arr[0];
		for(int index = 0; index < arr.length; index++) {
			if(arr[index] < min) {
				min = arr[index];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int[] input = {94,11,44,23,55,99,23};
		MinNumber maxnum = new MinNumber();
		int minimumnumber = maxnum.findMinnumber(input);
		
		System.out.println("Minimum number from array is : "+minimumnumber);
	}
}
