package chandni_bhoj;

public class Assignment_16 {

	int getVisibleTrees (int [] arr) {
		int maxHeight = 0;
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > maxHeight) {
				maxHeight = arr[index];
				count++;
			}
		}
		
		
		return count;
	}

	
	public static void main(String[] args) {
		Assignment_16 assignment_16 = new Assignment_16 ();
		int [] arrs = new int [] {3,5,5,11,9,10,15,14};
		assignment_16.getVisibleTrees(arrs);
		System.out.println (assignment_16.getVisibleTrees(arrs));
	
}

}