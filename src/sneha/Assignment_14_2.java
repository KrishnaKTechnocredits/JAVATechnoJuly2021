// find minimum number from array

package sneha;

public class Assignment_14_2 {
	
	int getMinimum(int[] arr) {
		int minimum = 0;
		minimum = arr[0];
		for(int index = 1; index<arr.length; index++) {
			if(arr[index] < minimum) {
				minimum = arr[index];
			}
		}
		
		return minimum;
	}
	
	public static void main(String[] a) {
		
		int ans = 0;
		int[] arr = {1,11,44,23,55,99,23,0};
		Assignment_14_2 assignment_14_2 = new Assignment_14_2();
		ans = assignment_14_2.getMinimum(arr);
		System.out.println("Minimum element from array is " + ans);
	}

}
