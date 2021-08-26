package atul_K.Assignments.Ass16;

public class Program1 {

	int visibletree(int[] arr) {
		int treeH =0;
		int visiblecnt =0;
		for(int index=0;index< arr.length;index++) {
			if (treeH < arr[index]) {
				visiblecnt++;
				treeH = arr[index];
			}
		}
		return visiblecnt;
	}
	
	public static void main(String[] args) {
		int[] arr = {3,5,5,11,9,10,15};
		Program1 program1 = new Program1();
		System.out.println(program1.visibletree(arr));
	}
}