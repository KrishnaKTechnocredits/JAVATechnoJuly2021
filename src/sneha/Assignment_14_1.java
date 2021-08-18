// find maximum number from array

package sneha;

public class Assignment_14_1 {
	
	int getMaximum(int[] arr) {
		int maximum = 0;
		
		for(int index = 0; index<arr.length; index++) {
			if(arr[index] > maximum) {
				maximum = arr[index];
			}
		}
		
		return maximum;
	}
	
	public static void main(String[] a) {
		
		int ans = 0;
		int[] arr = {1,11,44,23,55,99,23};
		Assignment_14_1 assignment_14_1 = new Assignment_14_1();
		ans = assignment_14_1.getMaximum(arr);
		System.out.println("Maximum element from array is " + ans);
	}

}
