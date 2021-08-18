/*program 4 : print difference between max odd number and max even number from given array. difference should be positive
int[] input = {1,11,44,23,55,99,23,22};
hint : 99 - 44
output : 55
*/

package arti_K.Assignment_14;

public class DiffMinOddMaxOdd {
	
	int differencebetMinOddMaxOddnum(int[] arr) {
		int difference = 0;
		int maxodd = arr[0];
		int maxeven = arr[0];
		
		for(int index = 0; index < arr.length; index++) {
			if(arr[index] % 2 == 0) {
				if(arr[index] > maxodd)
					maxeven = arr[index];
			}else
				if(arr[index] > maxodd)
					maxodd = arr[index];
				
		}
		difference = maxeven - maxodd;
		return difference;
	}
	public static void main(String[] args) {
		int[] input = {1,11,44,23,65,100,23};
		DiffMinOddMaxOdd diff = new DiffMinOddMaxOdd();
		System.out.println("Difference between Maximum and Minimum number is "+diff.differencebetMinOddMaxOddnum(input));
	}
}
