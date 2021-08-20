//return count of positive numbers from given array

package sneha;

public class Assignment_13_1 {

	int getPositiveNumber(int[] arr) {
		int count = 0;
		
		for(int index = 0; index < arr.length; index++) {
			if(arr[index] >= 0) {
				count ++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] a) {
		
		int arr[] = {1, -11, -44, 23, 55, -99, -23, -22};
		int res = 0;
		
		Assignment_13_1 assignment_13_1 = new Assignment_13_1();
		res = assignment_13_1.getPositiveNumber(arr);
		System.out.println(res);
	}
}
