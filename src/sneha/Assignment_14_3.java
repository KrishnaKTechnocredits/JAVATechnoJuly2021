// print differnece between maximum and minimum from array

package sneha;

public class Assignment_14_3 {
	
	int getMaximum(int[] arr) {
		int maximum = 0;
		
		for(int index = 0; index<arr.length; index++) {
			if(arr[index] > maximum) {
				maximum = arr[index];
			}
		}
		
		return maximum;
	}
	
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
		
		int ans1 = 0, ans2 = 0;
		int[] arr = {1,11,44,23,55,99,23};
		Assignment_14_3 assignment_14_3 = new Assignment_14_3();
		ans1 = assignment_14_3.getMaximum(arr);
		ans2 = assignment_14_3.getMinimum(arr);
		int ans = ans1 - ans2;
		System.out.println("Difference between maximum and minimum is " + ans);
	}

}
