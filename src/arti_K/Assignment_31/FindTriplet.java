/*	Program 3: Find Consecutive Numbers and its Count.
int[] arr = {10,23,24,25,26,61,62,64,65,66};
output : 3
Note : 23,24,25
       24,25,26
	   64,65,66
 */

package arti_K.Assignment_31;

public class FindTriplet {
	
	void findConsecutiveNumber(int[] arr) {
		int count = 0;
		
		for(int index = 0; index < arr.length-2; index++) {
			if(arr[index]+1 == arr[index+1] && arr[index+1]+1 == arr[index + 2]) {
				count++;
				System.out.println("Consecutive Numbers are : "+arr[index]+","+arr[index+1]+","+arr[index+2]);
			}	
		}
		System.out.println("Total count of Consecutive Number is : "+count);
	}
		
	public static void main(String[] args) {
		int[] arr = {10,23,24,25,26,61,62,64,65,66};
		new FindTriplet().findConsecutiveNumber(arr);
	}
}
