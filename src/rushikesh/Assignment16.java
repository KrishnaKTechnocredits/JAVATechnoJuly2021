package rushikesh;

public class Assignment16 {
	int getVisibleTrees(int[] arr) {
			int count = 0;
			int treeheight=0;

			for(int index=0;index<arr.length;index++){
				if(arr[index] > treeheight){

				treeheight = arr[index];
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Assignment16 assignment16 = new Assignment16();
		int[] arr = {3,5,5,11,9,10,15,14};
		System.out.println("Total number of visible trees in the given array is " + 
		assignment16.getVisibleTrees(arr));
	}
}

