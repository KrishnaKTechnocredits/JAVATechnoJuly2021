package chandani;

class Assignment16{
	
	int getCountOfVisibleTrees(int[] arr) {

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

		int[] arr = {3,5,5,11,9,10,15,14};
		Assignment16 assignment16 = new Assignment16();
		System.out.println("Total number of visible trees in the given array is " + assignment16.getCountOfVisibleTrees(arr));

	}
} 