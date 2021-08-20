package deven_dc.assign;

public class Assignment16_Array {
	int getCountOfVisibleTrees(int[] arr) {
		int height = 0;
		int count = 0;
		for(int index = 0; index < arr.length; index++){
			if(arr[index] > height){
				height = arr[index];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] treeHeights = {3,5,5,11,10,15,14};
		Assignment16_Array a16_array = new Assignment16_Array();
		System.out.println("Total Number of Visible Trees in Given Array : " +a16_array.getCountOfVisibleTrees(treeHeights));
	}
}
