/* program 3 : print difference between max and min number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 98  */

package arti_K.Assignment_14;

public class DiffMinMax {
	
	int differencebetMinMaxnum(int[] arr) {
		int difference = 0;
		int min = arr[0];
		int max = arr[0];
		
		for(int index = 0; index < arr.length; index++) {
			if(arr[index]>max)
				max = arr[index];
			if(arr[index]<min)
				min = arr[index];
		}
		difference = max - min;
		return difference;
	}
	public static void main(String[] args) {
		int[] input = {1,11,44,23,55,99,23};
		DiffMinMax diff = new DiffMinMax();
		System.out.println("Difference between Maximum and Minimum number is "+diff.differencebetMinMaxnum(input));
	}
}
