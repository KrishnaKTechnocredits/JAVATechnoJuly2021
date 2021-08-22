//return count of zero from given array

package sneha;

public class Assignment_13_2 {

	int getZero(int[] arr) {
		int count = 0;
		
		for(int index = 0; index < arr.length; index++) {
			if(arr[index] == 0) {
				count ++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] a) {
		
		int arr[] = {1, 0, -11, -44, 0, 0, 23, 0, 55, -99, -23, -22,0};
		int res = 0;
		
		Assignment_13_2 assignment_13_2 = new Assignment_13_2();
		res = assignment_13_2.getZero(arr);
		System.out.println(res);
	}
}
