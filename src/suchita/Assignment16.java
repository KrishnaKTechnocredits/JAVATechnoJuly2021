package suchita;

class Assignment16 {

	int getCountOfVisibleTrees(int[] arr) {
		
		int count = 0,height=0;
		
		for(int index=0;index<arr.length;index++){
			if(arr[index] > height){
				
				height = arr[index];
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		int[] treeHeights = {3,5,5,11,10,15,14};
		Assignment16 assignment = new Assignment16();
		System.out.println(" Total number of visible trees in the given array :: " + assignment.getCountOfVisibleTrees(treeHeights));
		
	}
}