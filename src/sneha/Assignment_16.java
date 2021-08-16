package sneha;

public class Assignment_16 {

	int countOfVisible(int[] arr) {
		int count = 0,max = 0;
		for(int index = 0; index< arr.length; index++) {
			if(arr[index] > max) {
				max = arr[index];
				count++;
			}
			if((arr[index]> max) && (arr[index] > arr[index-1])) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] a) {
		
		int res = 0;
		int[] arr = {3,5,5,11,9,10,15,14};
		Assignment_16 assignment_16 = new Assignment_16();
		res = assignment_16.countOfVisible(arr);
		System.out.println("Count is " + res);
	}
}
