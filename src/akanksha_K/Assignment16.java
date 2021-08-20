package akanksha_K;

public class Assignment16 {
	
	int getvisibleTree(int[] arr) {
		int maxtreeheight = 0 ;
		int visibletrees = 0;
		for (int index= 0; index<arr.length; index++) {
			int current_tree_height = arr[index];
			if(maxtreeheight<current_tree_height) {
				maxtreeheight= current_tree_height;
				visibletrees++;
			}
		}
		return visibletrees;
	}
	
	public static void main(String[] args) {
		int[] treeheight= {3,5,5,11,9,10,15,14};
		Assignment16 assignment16 = new Assignment16();
		int visibletrees = assignment16.getvisibleTree(treeheight);
		System.out.println("visible tress: "+visibletrees);
	}
}
